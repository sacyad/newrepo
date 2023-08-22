package advance;

import java.util.*;

public class hashmapSorting {

    public static void main(String[] args) {

//  Write a Java program that sorts HashMap by value.
        Map <String,  Integer> scores =  new HashMap<>();

        scores.put("sachin" , 78);
        scores.put("test" , 88);
        scores.put("east" , 99);
        scores.put("west" , 66);
         scores.put("south" , 22);

//          unsorted values pairs
        System.out.println(scores);
         scores =  sortbyvalue(scores);
// sorted values pairs
        System.out.println(scores);
    }

    private static Map<String ,  Integer> sortbyvalue (Map<String ,Integer> score){

        Map<String,  Integer> sortedbyvalue= new LinkedHashMap<>();

//         get entry set
        Set<Map.Entry<String, Integer>> entrySet =  score.entrySet();
//        System.out.println("Entry set "+entrySet);

        // create a list since the set is unordered
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
//        System.out.println("entry list "+entryList);

        // sort the list by value
        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
//        System.out.println("second entry list "+ entryList);

        // populate the new hash map
        for (Map.Entry<String, Integer> e : entryList)
            sortedbyvalue.put(e.getKey(), e.getValue());
        return sortedbyvalue;
    }
}
