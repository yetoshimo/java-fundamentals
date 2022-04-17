package FB_objectsAndClasses_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArticleTwo {
    private String title;
    private String content;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArticleTwo (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scan.nextLine());

        List<ArticleTwo> allArticles = new ArrayList<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] nextLine = scan.nextLine().split(", ");
            allArticles.add(new ArticleTwo(nextLine[0], nextLine[1], nextLine[2]));
        }

        switch (scan.nextLine()) {
            case "title":
                allArticles.sort(Comparator.comparing(ArticleTwo::getTitle));
                break;
            case "content":
                allArticles.sort(Comparator.comparing(ArticleTwo::getContent));
                break;
            case "author":
                allArticles.sort(Comparator.comparing(ArticleTwo::getAuthor));
        }

        for (ArticleTwo a: allArticles) {
            System.out.println(a);
        }
    }
}
