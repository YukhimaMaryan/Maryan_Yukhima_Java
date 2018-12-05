//1.	підготовка:
//{yourKey} = 06aacd672653757cb826c81e4605ab02
//{yourToken} = 53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e
//
//сценарій:
//2. створити борду засобами API з будь - яким іменем {name}(використовуючи токени свого акаунту)
//	POST https://api.trello.com/1/boards/?name={name}&key={yourKey}&token={yourToken}
//3. перевірити в тесті чи борда створена (отримати респонс і написати асерт для перевірки наявності новоствоерної борди) значення {id} треба випарсити з попереднього кроку
//	GET https://api.trello.com/1/members/me/boards/{id}?key={yourKey}&token={yourToken}
//4. видалити борду
//	DELETE https://api.trello.com/1/members/me/boards/{id}?key={yourKey}&token={yourToken}
//5. перевірити чи видалена (провести щераз запит з кроку 3 і переконатись що баді="{"_value": null
//}")
//	GET https://api.trello.com/1/members/me/boards?key={yourKey}&token={yourToken}
//
//як реалізувати:
//1. оформити все в фреймворку TestNG
//2. для посилання реквестів і отримання респонсів використовувати будьякий HTTP клієнт (org.apache.http або RestAssured або ще щось)
//3. при реалізації рекомендовано для сутностей реквесту і респонсу створити модельки які міститимуть всі артефакти цих сутностей
//4. для парсання джейсонів можна використати будь-яку бібліотеку, або RegularExplession
//5. для візуалізації реквест-респонсів і мануальної перевірки сценарію рекомендую використовувати Postman
//6. для білдання використати maven і всі додаткові бібліотеки підтягувати через нього





import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class webServices {

    final static String ROOT_URI = "https://api.trello.com";

    @Test(description = "POST")
    public void postTest( ) {
        Response response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"name\": \"Marian\",\"key\": \"06aacd672653757cb826c81e4605ab02\",\"token\": \"53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e\"}")
                .when()
                .post(ROOT_URI + "/1/boards/");
        System.out.println("POST Response\n" + response.asString());
    }

   @Test(description = "Get")
   public void getTest() {
       Response response = given().
               contentType(ContentType.JSON)
               .accept(ContentType.JSON)
               .body("{\"id\": \"5c06f05e397179877c95b33c\", \"key\": \"06aacd672653757cb826c81e4605ab02\",\"token\": \"53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e\"}")
               .when()
               .get(ROOT_URI + "/1/members/me/boards/");
       System.out.println("GET Response\n" + response.asString());
//       assertThat(response.asString().jsonPath()
   }

    @Test(description = "DELETE")
    public void deleteTest() {
        Response response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"id\": \"5c06f05e397179877c95b33c\", \"key\": \"06aacd672653757cb826c81e4605ab02\",\"token\": \"53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e\"}")
                .when()
                .delete(ROOT_URI + "/1/members/me/boards/");
        System.out.println("DELETE Response\n" + response.asString());
    }
}
