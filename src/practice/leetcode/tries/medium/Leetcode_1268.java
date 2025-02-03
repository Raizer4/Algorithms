package practice.leetcode.tries.medium;

// Search Suggestions System
// https://leetcode.com/problems/search-suggestions-system/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_1268 {

    public static void main(String[] args) {
        System.out.println(suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"}, "mouse"));
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieTree trieTree = new TrieTree();

        for (String temp : products) {
            trieTree.insert(temp);
        }

        List<List<String>> list = new ArrayList<>();
        String prefix = "";

        for (char temp : searchWord.toCharArray()){
            prefix += temp;
            List<String> templist = trieTree.get(prefix);
            Collections.sort(templist);

            if (templist.size() > 3){
                list.add(templist.subList(0,3));
            }else {
                list.add(templist.subList(0,templist.size()));
            }

        }


        return list;
    }

    public static class TrieNode {
        HashMap<Character,TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }

    public static class TrieTree {
        private TrieNode root;

        public TrieTree(){
            root = new TrieNode();
        }

        public void insert(String word){
            TrieNode cur = root;

            for (char c : word.toCharArray()){
                cur.children.putIfAbsent(c, new TrieNode());
                cur = cur.children.get(c);
            }
            cur.isEnd = true;
        }


        public List<String> get(String word){
            TrieNode cur = root;

            for (char temp : word.toCharArray()){
                if (!cur.children.containsKey(temp)) {
                    return new ArrayList<>();
                }
                cur = cur.children.get(temp);
            }

            List<String> list = new ArrayList<>();
            dfs(cur,list,word);
            return list;
        }

        private void dfs(TrieNode node, List<String> list, String str) {

            if (node.isEnd){
                list.add(str);
            }

            for (Map.Entry entry : node.children.entrySet()){
               dfs((TrieNode) entry.getValue(), list, str + (char) entry.getKey());
            }

        }

    }


}
