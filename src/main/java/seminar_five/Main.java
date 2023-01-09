package seminar_five;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        task_00();
        task_01("MMXXII");
    }

    private static void task_01(String romanNum) {
        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I',1,
                'V',5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int lastIndex = romanNum.length() - 1;
        char lastRomanChar = romanNum.charAt(lastIndex);
        int decimalNum = romanToDecimalMap.get(lastRomanChar);
        int prevNum = decimalNum;

        for (int i = 0; i < lastIndex; i++) {
            int currentIndex = lastIndex - 1 - i;
            char currentRomanChar = romanNum.charAt(currentIndex);
            int currentNum = romanToDecimalMap.get(currentRomanChar);

//            int prevIndex = currentIndex + 1;
//            char prevRomanChar = romanNum.charAt(prevIndex);
//            int prevNum = romanToDecimalMap.get(prevRomanChar);

            if (currentNum < prevNum) {
                currentNum += -1;
            }
            prevNum = currentNum;
            decimalNum += currentNum;
        }
        System.out.println(decimalNum);
    }

    private static void task_00() {
        String userName = "Ivanov";
        Map<String, String> passports = new HashMap<>();
        passports.put("12345", "Ivanov");
        passports.put("321456", "Vasilev");
        passports.put("234561", "Petrova");
        passports.put("234432", "Ivanov");
        passports.put("654321", "Petrova");
        passports.put("345678", "Ivanov");

        for (String key : passports.keySet()){
            if (userName.equals(passports.get(key))) {
                System.out.printf("%s - %s%n", key, passports.get(key));
            }
        }
        for (Map.Entry<String, String> entry : passports.entrySet()) {
            if (entry.getValue().equals(userName)) {
                System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

}
