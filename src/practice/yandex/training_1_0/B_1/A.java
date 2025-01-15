package practice.yandex.training_1_0.B_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        String[] s = reader.readLine().split(" ");
        String mode = reader.readLine();

        int t =  Integer.parseInt(s[0]);
        int c =  Integer.parseInt(s[1]);

        int res = 0;

        if (t < c){
            if (mode.equals("heat") || mode.equals("auto")){
                res = c;
            }else {
                res = t;
            }
        }else if (t > c){
            if (mode.equals("freeze") || mode.equals("auto")){
                res = c;
            }else {
                res = t;
            }
        }else {
            res = t;
        }

        FileWriter writer = new FileWriter("output.txt");
        writer.write(String.valueOf(res));
        writer.flush();
    }

}
