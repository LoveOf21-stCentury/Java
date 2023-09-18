package home_work5;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Melissa", 325669, phoneBook);
        addNumber("Abraham", 169485, phoneBook);
        addNumber("Stewart", 921564, phoneBook);
        addNumber("Stewart", 894532, phoneBook);
        addNumber("Carolina", 758692, phoneBook);
        addNumber("Carolina", 892349, phoneBook);

        System.out.println(phoneBook);
    }

    private static void addNumber(String name, int number, Map<String, ArrayList<Integer>> map) {
        if(map.containsKey(name)){
            map.get(name).add(number);
        }else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(number);
            map.put(name, list);
        }
    }


}
