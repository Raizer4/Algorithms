package practice.leetcode.tries.medium;

// Design Add and Search Words Data Structure
// https://leetcode.com/problems/design-add-and-search-words-data-structure/description/

import java.util.HashMap;


public class Leetcode_211 {

    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad")); // return False
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println( wordDictionary.search(".ad")); // return True
        System.out.println(wordDictionary.search("b.."));  // return True
    }

    public static class TrieNode {
        HashMap<Character, TrieNode> clildren = new HashMap<>();
        boolean endOfWord = false;
    }

    static class WordDictionary {
        TrieNode root;

        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode cur = root;
            for (char c : word.toCharArray()){
                cur.clildren.putIfAbsent(c, new TrieNode());
                cur = cur.clildren.get(c);
            }
            cur.endOfWord = true;
        }

        public boolean search(String word) {
            return dfs(word,0,root);
        }

        private boolean dfs(String word, int j, TrieNode root){
            TrieNode cur = root;

            for (int i = j; i < word.length(); i++){
                char c = word.charAt(i);

                if (c == '.'){
                    for (TrieNode node : cur.clildren.values()){
                        if (dfs(word, i + 1, node)){
                            return true;
                        }
                    }
                    return false;
                }else {
                    if (!cur.clildren.containsKey(c)){
                        return false;
                    }
                    cur = cur.clildren.get(c);
                }

            }

            return cur.endOfWord;
        }

    }

}
