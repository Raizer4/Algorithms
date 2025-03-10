package practice.leetcode.graphs.hard;

// Word Ladder
// https://leetcode.com/problems/word-ladder/description/

import java.util.*;

public class Leetcode_127 {

    public static void main(String[] args) {
        System.out.println(ladderLength("hit","cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++){
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)){
                    return level;
                }

                char[] wordChars = currentWord.toCharArray();

                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];

                    for (char c = 'a'; c <= 'z'; c++){
                        if (c == originalChar){continue;}
                        wordChars[j] = c;

                        String newWord = new String(wordChars);

                        if (wordSet.contains(newWord)){
                            queue.offer(newWord);
                            wordSet.remove(newWord);
                        }

                    }

                    wordChars[j] = originalChar;
                }


            }

            level++;
        }

        return 0;
    }


}
