package practice.yandex.training_1_0.B_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));


        String phoneNum = formatPhoneNumber(reader.readLine());


        List<String> results = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            String bookNum = formatPhoneNumber(reader.readLine());
            if (phoneNum.equals(bookNum)) {
                results.add("YES");
            } else {
                results.add("NO");
            }
        }


        try (FileWriter writer = new FileWriter("output.txt")) {
            for (String result : results) {
                writer.write(result + "\n");
            }
        }
    }


    private static String formatPhoneNumber(String number) {
        StringBuilder builder = new StringBuilder();

        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }

        String digits = builder.toString();

        if (digits.length() == 11 && digits.startsWith("8")) {
            digits = "7" + digits.substring(1);
        } else if (digits.length() == 7) {
            digits = "7495" + digits;
        }

        return digits;
    }
}