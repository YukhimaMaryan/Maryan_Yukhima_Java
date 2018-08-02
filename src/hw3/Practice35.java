package hw3;

import java.util.*;

//Create some empty collection, try to check if collection is empty (using "if()"
//statement) and when collection would be empty - throw "NullPointerException" with
//comment: "Current collection is empty !!!"
public class Practice35 {

    public static void main(String[] args) {
        List list = Collections.EMPTY_LIST;
        list.size();
        Set set = Collections.EMPTY_SET;
        set.size();
        Map map = Collections.EMPTY_MAP;
        map.size();
        List<String> strings = Collections.emptyList();
        strings.size();
        Set<Long> longs = Collections.emptySet();
        longs.size();
        Map<String, Date> dates = Collections.emptyMap();
        dates.size();

        if (list == null || list.isEmpty()) {
            throw new NullPointerException ("<Current collection is empty !!!>");

        }

    }
}







