package practice.leetcode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int method = method(str);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(method));
        writer.flush();
    }

    public static int method(String str){
        boolean flag = false;

        int temp = 0;
        int index = Integer.MAX_VALUE;

        List<String> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                temp++;
                index = Math.min(index, i);
                flag = true;
                continue;
            }
            if (str.charAt(i) == ')'){
                temp--;

            }

            if (flag && temp > 0){
                continue;
            }

            if (flag && temp == 0){
                list.add(String.valueOf(method(str.substring(index, i))));
                flag = false;
                continue;
            }

            if (str.charAt(i)  == ' '){
                list.add(builder.toString());
                builder.setLength(0);
                continue;
            }

            if (str.charAt(i) == '+'){
                list.add("+");
            } else if (str.charAt(i) == '-') {
                list.add("-");
            }else {
                builder.append(str.charAt(i));
            }


        }

        if (!builder.isEmpty()){
            list.add(builder.toString());
        }

        String plis = "";
        int sum = 0;

        for (String c :  list){
            if (c == ""){
                continue;
            }

            if (c.equals("-")){
                if (plis == ""){
                    plis = "-";
                }else {
                    plis = "+";
                }
                continue;
            } else if (c.equals("+")) {
                plis = "+";
                continue;
            }

            if (plis.equals("+")){
                sum += Integer.parseInt(c);
            }else {
                sum -= Integer.parseInt(c);
            }

        }

        return sum;
    }


}
