package home_work5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String[] names = {"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"};

        for (String fullName : names) {
            String name = fullName.split(" ")[0];
            if (map.containsKey(name)) {
                int count = map.get(name);
                map.put(name, count + 1);
            } else {
                map.put(name, 1);
            }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new ValueCompare());
        System.out.println(entries);
    }

     static class ValueCompare implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
            return o2.getValue().compareTo(o1.getValue());
        }
    }
}
