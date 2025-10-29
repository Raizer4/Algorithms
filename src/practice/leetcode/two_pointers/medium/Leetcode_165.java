package practice.leetcode.two_pointers.medium;

// Compare Version Numbers
// https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2025-09-23

public class Leetcode_165 {

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0","1"));
    }

    public static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;

        while (i < version1.length() || j < version2.length()){
            while (i < version1.length() && version1.charAt(i) == '0'){
                i++;
            }

            while (j < version2.length() && version2.charAt(j) == '0'){
                j++;
            }

            if (i >= version1.length() && j >= version2.length()){
                return 0;
            }

            if (i >= version1.length()){
                if (version2.charAt(j) != '.'){
                    return -1;
                }else {
                    j++;
                    continue;
                }
            }

            if (j >= version2.length()){
                if (version1.charAt(i) != '.'){
                    return 1;
                }else {
                    i++;
                    continue;
                }
            }


            if (version1.charAt(i) == '.'){
                if (version2.charAt(j) != '.'){
                    return -1;
                }else {
                    i++;
                    j++;
                    continue;
                }
            }


            if (version2.charAt(j) == '.'){
                if (version1.charAt(i) != '.'){
                    return 1;
                }else {
                    j++;
                    i++;
                    continue;
                }
            }

            StringBuilder builder_1 = new StringBuilder();
            StringBuilder builder_2 = new StringBuilder();

            while (i < version1.length() && version1.charAt(i) != '.'){
                builder_1.append(version1.charAt(i));
                i++;
            }

            while (j < version2.length() && version2.charAt(j) != '.'){
                builder_2.append(version2.charAt(j));
                j++;
            }

            if (Integer.parseInt(builder_1.toString()) > Integer.parseInt(builder_2.toString()) ){
                return 1;
            } else if (Integer.parseInt(builder_1.toString()) < Integer.parseInt(builder_2.toString())) {
                return -1;
            }else {
                i++;
                j++;
            }

        }

        return 0;
    }

}
