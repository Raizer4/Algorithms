package practice.leetcode;

// Text Justification
// https://leetcode.com/problems/text-justification/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

public class Leetcode_68 {

    public static void main(String[] args) {
        System.out.println(fullJustify(new String[]{
                "ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"
        }, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        int i = 0;
        int num = 0;
        int count = 0;

        while (i < words.length) {
            int length = words[i].length();

            if (length + num + count > maxWidth) {
                int availableSpaces = maxWidth - num;


                if (count == 1){
                    builder.append(words[i - 1]);
                    for (int j = 0; j < availableSpaces; j++) {
                        builder.append(" ");
                    }
                }else {
                    int base = availableSpaces / (count - 1);
                    int remainder = availableSpaces % (count -1);

                    int[] spaces = new int[count];

                    for (int j = 0; j < count; j++) {
                        spaces[j] = base;
                        if (j < remainder){
                            spaces[j]++;
                        }
                    }

                    for (int j = i - count, k = 0; j < i; j++, k++) {
                        builder.append(words[j]);

                        if (j == i - 1){
                            break;
                        }

                        for (int d = 0; d < spaces[k]; d++){
                            builder.append(" ");
                        }
                    }
                }

                list.add(builder.toString());
                count = 0;
                num = 0;
                builder.delete(0, builder.length());
                continue;
            }

            num += length;
            count++;
            i++;

            if (i == words.length){
                for (int j = i - (count) ; j < i ; j++) {
                    builder.append(words[j]);
                    if (j == i - 1){
                        for (int k = 0; k < maxWidth - (num + (count - 1)); k++) {
                            builder.append(" ");
                        }
                        break;
                    }
                    builder.append(" ");
                }
                list.add(builder.toString());
            }
        }

        return list;
    }

}
