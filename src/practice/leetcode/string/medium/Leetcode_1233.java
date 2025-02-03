package practice.leetcode.string.medium;

// Remove Sub-Folders from the Filesystem
// https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1233 {

    public static void main(String[] args) {
        System.out.println(removeSubfolders(new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"}));
    }

    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> list = new ArrayList<>();
        list.add(folder[0]);

        for (int i = 1; i < folder.length; i++) {
            String lastFolder = list.get(list.size()- 1) + "/";

            if (!folder[i].startsWith(lastFolder)){
                list.add(folder[i]);
            }
        }

        return list;
    }

}
