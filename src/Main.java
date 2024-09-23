import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        System.out.println("Task 1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println("Task 2");
        Collections.sort(nums);

        int number = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && i != number) {
                System.out.println(nums.get(i));
                number = i;
            }
        }

        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("кошка", "собака", "енот", "кенгуру", "собака", "попугай", "олень", "кошка"));
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        System.out.println("Task 4");
        Map<String, Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values());
    }

}