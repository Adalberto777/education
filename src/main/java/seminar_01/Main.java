package seminar_01;

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
        int val = 3;
        int temp = 0;
        int [] arr = {3, 2, 2, 3, 1, 2, 3};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            if (arr[left] == val) {
                if (arr[left] != arr[right]){
                    arr[left] = arr[right];
                    arr[right] = val;
                } else {
                    right -= 1;
                }
            right -= 1;
            left += 1;
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

    private static void task_01() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
//        System.out.println("Hi, " + name);
        System.out.printf("Hi, %s%s%n", name, "!");
    }
}
