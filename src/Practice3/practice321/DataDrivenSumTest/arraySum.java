package Practice3.practice321.DataDrivenSumTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.Assert.*;
public class arraySum {

//5. Create data driven test: function sum(int a, int b) which reads input
////data from an array

        private Calc calc = new Calc();

        @DataProvider
        public Object[][] summLocalData() {
            return new Object[][]{
                    {4, calc.add(1, 3)},
                    {0, calc.add(0, 0)},
                    {0, calc.add(-2, 2)},

                    {-33, calc.add(-15, -10)},
                    {76, calc.add(40, 30)},
                    {45, calc.add(20, 0)},
            };
        }

        @Test(dataProvider = "summLocalData")
        public void sum(int rezult, int sumDigit) {
            assertEquals(rezult, sumDigit);
        }
    }

