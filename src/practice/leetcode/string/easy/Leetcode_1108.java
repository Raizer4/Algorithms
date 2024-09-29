package practice.leetcode.string.easy;

// Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/description/

public class Leetcode_1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                builder.append('[');
                builder.append(address.charAt(i));
                builder.append(']');
            }else {
                builder.append(address.charAt(i));
            }
        }

        return builder.toString();
    }

}
