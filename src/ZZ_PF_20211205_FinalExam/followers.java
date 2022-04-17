package ZZ_PF_20211205_FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class followers {
    String username;
    int likes;
    int comments;

    public followers(String username, int likes, int comments) {
        this.username = username;
        this.likes = likes;
        this.comments = comments;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, followers> allFollowers = new LinkedHashMap<>();

        String nextLine = scan.nextLine();

        while (!nextLine.equals("Log out")) {
            String command = nextLine.split(": ")[0];

            switch (command) {
                case "New follower":
                    String newFollower = nextLine.split(": ")[1];
                    if (!allFollowers.containsKey(newFollower)) {
                        allFollowers.put(newFollower, new followers(newFollower, 0, 0));
                    }
                    break;
                case "Like":
                    String likeUsername = nextLine.split(": ")[1];
                    int likeCount = Integer.parseInt(nextLine.split(": ")[2]);
                    if (!allFollowers.containsKey(likeUsername)) {
                        allFollowers.put(likeUsername, new followers(likeUsername, likeCount, 0));
                    } else {
                        allFollowers.get(likeUsername).likes += likeCount;
                    }
                    break;
                case "Comment":
                    String commentUsername = nextLine.split(": ")[1];
                    if (!allFollowers.containsKey(commentUsername)) {
                        allFollowers.put(commentUsername, new followers(commentUsername, 0, 1));
                    } else {
                        allFollowers.get(commentUsername).comments++;
                    }
                    break;
                case "Blocked":
                    String blockedUsername = nextLine.split(": ")[1];
                    if (!allFollowers.containsKey(blockedUsername)) {
                        System.out.printf("%s doesn't exist.%n", blockedUsername);
                    } else {
                        allFollowers.remove(blockedUsername);
                    }
                    break;
            }
            nextLine = scan.nextLine();
        }
        System.out.printf("%d followers%n", allFollowers.size());
        allFollowers.entrySet().stream()
                .sorted((u1, u2) -> {
                    if (u2.getValue().comments + u2.getValue().likes == u1.getValue().comments + u1.getValue().likes) {
                        return u1.getValue().username.compareTo(u2.getValue().username);
                    } else {
                        return Integer.compare(u2.getValue().comments + u2.getValue().likes,
                                u1.getValue().comments + u1.getValue().likes);
                    }
                })
                .forEach(e -> {
                    System.out.printf("%s: %d%n", e.getValue().username, e.getValue().comments + e.getValue().likes);
                });
    }
}
