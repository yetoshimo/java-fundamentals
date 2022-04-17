package ZZ_PF_20211024_MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> bookShelf = new ArrayList<>(Arrays.asList(scan.nextLine().split("&")));

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Done")) {
            String command = nextCommand.split(" \\| ")[0];

            String item = nextCommand.split(" \\| ")[1];

            switch (command) {
                case "Add Book":
                    if (!bookShelf.contains(item)) {
                        bookShelf.add(0, item);
                    }
                    break;
                case "Take Book":
                    bookShelf.remove(item);
                    break;
                case "Swap Books":
                    String itemTwo = nextCommand.split(" \\| ")[2];
                    if (bookShelf.contains(item) && bookShelf.contains(itemTwo)) {
                        int tempFirstIndex = bookShelf.indexOf(item);
                        int tempSecondIndex = bookShelf.indexOf(itemTwo);
                        bookShelf.set(tempFirstIndex, itemTwo);
                        bookShelf.set(tempSecondIndex, item);
                    }
                    break;
                case "Insert Book":
                    if (!bookShelf.contains(item)) {
                        bookShelf.add(bookShelf.size(), item);
                    }
                    break;
                case "Check Book":
                    int tempIndex = Integer.parseInt(item);
                    if (tempIndex >= 0 && tempIndex < bookShelf.size()) {
                        System.out.println(bookShelf.get(tempIndex));
                    }
                    break;
            }

            nextCommand = scan.nextLine();
        }

        System.out.println(String.join(", ", bookShelf));
    }
}
