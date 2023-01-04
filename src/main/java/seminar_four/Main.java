package seminar_four;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task_00();
        task_01();
    }

    private static void task_01() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, "apple", "orange", "banana", "strawberry", "tomato", "melon");
        int num = 0;

        while (true){
            System.out.println();
            System.out.print("Enter string: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0){
                System.out.println("String can't be null");
                continue;
            }

            if (inputString.equals("print~all")){
                for (int i = 0; i < wordList.size(); i++) {
                    System.out.printf("%d) %s%n", i + 1, wordList.get(i));
                }
            } else if (inputString.equals("stop")) {
                System.exit(0);
            }

            if (inputString.contains("\\~")){
                System.out.println("String mast have ~");
                continue;
            }

            String [] parts = inputString.split("\\~");
            String word = parts[0];
            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("String don't have number");
                continue;
            }

            if (num <= 0 || num > wordList.size() + 1){
                System.out.println("The number must be from 1 to " + wordList.size() + 1);
                continue;
            }

            if (word.equals("print")){
                System.out.printf("on position %d stay word %s%n", num, wordList.get(num - 1));
            }else if (num == wordList.size() + 1){
                wordList.add(word);
                System.out.printf("Word %s add to position %d%n", word, num);
            } else {
                String oldWord = wordList.get(num - 1);
                wordList.set(num - 1, word);
                System.out.printf("Word %s change word %s on position %d%n", word, oldWord, num);
            }
        }



    }

    private static void task_00() {
        long start = System.currentTimeMillis();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            array.add(0, 10);
        }

        System.out.println(System.currentTimeMillis() - start);
        long startList = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(0, 10);
        }

        System.out.println(System.currentTimeMillis() - startList);
    }
}
