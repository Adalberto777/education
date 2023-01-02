package seminar_one;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task_01();
//        task_02();
        task_03();

    }

    private static void task_03() {
        final int VAL = 3;
        int [] arr = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[end] == VAL) {
                end --;
            }else if (arr[start] == VAL) {
                arr[start] = arr[end];
                arr[end] = VAL;

                end --;
                start ++;
            } else if (arr[start] != arr[end]) {
                start ++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void task_02() {
        int count = 0;
        int result = 0;
        int [] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int item: arr) {
            if (item == 1) {
                count += 1;
            }
            else {
                result = Math.max(result,count);
                count = 0;
            }
        }
        System.out.printf("max series 1  -  %s%n", result);
    }

    public static void task_01() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
//        System.out.println("Hi, " + name);
        System.out.printf("Hi, %s%s%n", name, "!");
    }
}
