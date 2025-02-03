package practice.leetcode.tries.medium;

// Implement Trie (Prefix Tree)
// https://neetcode.io/problems/implement-prefix-tree

import java.util.HashMap;

public class Leetcode_208 {

    public static void main(String[] args) {
        PrefixTree tree = new PrefixTree();
        tree.insert("negr");
        System.out.println(tree.search("nergri"));
        System.out.println(tree.startsWith("neg"));
    }

    public static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean endOfWord = false;
    }

    public static class PrefixTree {
        private TrieNode root;

        public PrefixTree() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode cur = root;
            for (char c : word.toCharArray()){
                cur.children.putIfAbsent(c, new TrieNode());
                cur = cur.children.get(c);
            }
            cur.endOfWord = true;
        }

        public boolean search(String word) {
            TrieNode cur = root;
            for (char c : word.toCharArray()){
                if (!cur.children.containsKey(c)){
                    return false;
                }
                cur = cur.children.get(c);
            }
            return cur.endOfWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for (char c : prefix.toCharArray()){
                if (!cur.children.containsKey(c)){
                    return false;
                }
                cur = cur.children.get(c);
            }
            return true;
        }

    }

}
