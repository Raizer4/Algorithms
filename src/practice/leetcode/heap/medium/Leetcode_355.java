package practice.leetcode.heap.medium;

// Design Twitter
// https://leetcode.com/problems/design-twitter/description/

import java.util.*;

public class Leetcode_355 {

    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5); // Пользователь 1 публикует новый твит (идентификатор = 5).
        System.out.println(twitter.getNewsFeed(1)); // Лента новостей пользователя 1 должна возвращать список с 1 твитом идентификатор -> [5]. вернуть [5]
        twitter.follow(1, 2); // Пользователь 1 подписывается на пользователя 2.
        twitter.postTweet(2, 6); // Пользователь 2 публикует новый твит (идентификатор = 6).
        System.out.println(twitter.getNewsFeed(1)); // Лента новостей пользователя 1 должна возвращать список с 2 идентификаторами твитов -> [6, 5]. Идентификатор 6 должен предшествовать идентификатору 5, потому что он опубликован после идентификатора 5.
        twitter.unfollow(1, 2); // Пользователь 1 отписывается от пользователя 2.
        System.out.println(twitter.getNewsFeed(1)); // Лента новостей пользователя 1 должна возвращать список с 1 идентификатором твита -> [5], так как пользователь 1 больше не подписан на пользователя 2.
    }

    static class Twitter {
        private Map<Integer, List<Tweet>> userTweets;
        private Map<Integer, Set<Integer>> followers;

        private int timestamp;

        public Twitter() {
            userTweets = new HashMap<>();
            followers = new HashMap<>();
            timestamp = 0;
        }

        private static class Tweet {
            int tweetId;
            int time;

            public Tweet(int content, int time){
                this.tweetId = content;
                this.time = time;
            }
        }

        public void postTweet(int userId, int tweetId) {
            Tweet tweet = new Tweet(tweetId, timestamp++);
            userTweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(tweet);
        }

        public List<Integer> getNewsFeed(int userId) {
            PriorityQueue<Tweet> priorityQueue = new PriorityQueue<>((a, b) -> a.time - b.time);

            if (userTweets.containsKey(userId)){
                for (Tweet tweet : userTweets.get(userId)) {
                    priorityQueue.add(tweet);
                    if (priorityQueue.size() > 10){
                        priorityQueue.poll();
                    }
                }
            }

            if (followers.containsKey(userId)){
                for (Integer followeeId : followers.get(userId)){
                    if (userTweets.containsKey(followeeId )){
                        for (Tweet tweet : userTweets.get(followeeId)) {
                            priorityQueue.add(tweet);
                            if (priorityQueue.size() > 10){
                                priorityQueue.poll();
                            }
                        }
                    }
                }
            }

            List<Integer> res = new ArrayList<>();

            while (!priorityQueue.isEmpty()) {
                res.add(0, priorityQueue.poll().tweetId);
            }

            return res;
        }


        public void follow(int followerId, int followeeId) {
            followers.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if (followers.containsKey(followerId)) {
                followers.get(followerId).remove(followeeId);
            }
        }
    }

}
