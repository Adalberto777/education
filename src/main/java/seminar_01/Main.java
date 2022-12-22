package seminar_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task_01();
        task_02();

    }

    private static void task_02() {
        int [] arr = {1,1,0,1,1,1,1,1,0,1,1};
        int count = 0;
        int result = 0;
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
