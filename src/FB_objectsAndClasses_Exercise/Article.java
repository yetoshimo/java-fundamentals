package FB_objectsAndClasses_Exercise;

import java.util.Scanner;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] articleDetails = scan.nextLine().split(", ");

        Article givenArticle = new Article(articleDetails[0], articleDetails[1], articleDetails[2]);

        int numberOfCommands = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String newCommand = scan.nextLine();

            String command = newCommand.split(": ")[0];
            String nextPart = newCommand.split(": ")[1];

            switch (command) {
                case "Edit":
                    givenArticle.setContent(nextPart);
                    break;
                case "ChangeAuthor":
                    givenArticle.setAuthor(nextPart);
                    break;
                case "Rename":
                    givenArticle.setTitle(nextPart);
                    break;
            }
        }

        System.out.println(givenArticle);
    }
}
