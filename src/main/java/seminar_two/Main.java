package seminar_two;

public class Main {
    public static void main(String[] args) {
//        System.out.println(buildString('x', 'o', 21));
        System.out.println(archString("sssdfffgghhjjj"));

    }

    private static String archString(String str) {
        if (str.trim().length() == 0) {
            return "";
        }
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        char curr = str.charAt(0);
        char prev = str.charAt(0);

        for (int i = 1; i < str.length() ; i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr != prev) {
                sb.append(prev);
                sb.append((counter > 1) ? counter : "");
                counter = 0;
            }
            counter ++;
        }
        if (counter != 0) {
            sb.append(curr);
            sb.append((counter > 1) ? counter : "");
            counter = 0;
        }

        return sb.toString();
    }

    private static String buildString(char c1, char c2, int lenght) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            if (i % 2 == 0) {
                sb = sb.append(c1);
            }else sb = sb.append(c2);
        }
        return sb.toString();
    }
}
