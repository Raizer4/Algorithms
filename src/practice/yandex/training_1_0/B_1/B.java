package practice.yandex.training_1_0.B_1;

import java.io.*;

public class B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        StringBuilder res = new StringBuilder();

        if (a + b > c && a + c > b && b + c > a){
            res.append("YES");
        }else {
            res.append("NO");
        }

        FileWriter writer = new FileWriter("output.txt");
        writer.write(res.toString());
        writer.flush();
    }

}
