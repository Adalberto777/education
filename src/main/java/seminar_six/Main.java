package seminar_six;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task_00();
        task_01();

    }

    private static void task_01() {
        Random random = new Random();
        int[] numSours = new int[105];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 105; i++) {
            int num = random.nextInt(25);
            numSours[i] = num;
        }

        for (int i = 0; i < numSours.length - 1; i++) {
            set.add(numSours[i]);
        }

        double unicumPersent = 1.0 * (set.size() * 100)/ numSours.length;

        System.out.println(Arrays.toString(numSours));
        System.out.println(set);
        System.out.printf("%.2f%n", unicumPersent);


    }

    private static void task_00() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 2, 7, 8, 9));
        System.out.println(set);
        var a = new LinkedHashSet<>(Arrays.asList(2, 2, 3, 4, 2, 7, 8, 9));
        System.out.println(a);
        var b = new TreeSet<>(Arrays.asList(3, 2, 3, 4, 2, 7, 8, 9));
        System.out.println(b);

        List<Integer> list = List.of(1, 2, 3, 2, 7, 4, 5, 6, 3);
//        хранит все хаотично, все зависит от хэша (самый быстрый)
        System.out.println(new HashSet<>(list));
//        хранит все в порядке добавления (самый медленный)
        System.out.println(new LinkedHashSet<>(list));
//        хранит все в упорядченно (допустим по возрастанию значения)
        System.out.println(new TreeSet<>(list));

        List<String> frutList = List.of("apple", "orange", "banana", "strawberry", "tomato", "melon");
        System.out.println(new HashSet<>(frutList));
        System.out.println(new LinkedHashSet<>(frutList));
        System.out.println(new TreeSet<>(frutList));
//        compareTo используется для сравнения строк или слов (- говорит о том что второе слово больше первого)
        System.out.println("apple".compareTo("orange"));

    }
}
