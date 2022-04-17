package ZZ_PF_MidExam_Practice_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> itemList = new ArrayList<String>(Arrays.asList(scan.nextLine().split(", ")));

        String nextItem = scan.nextLine();

        while (!nextItem.equals("Craft!")) {
            String action = nextItem.split(" - ")[0];
            String item = nextItem.split(" - ")[1];
            switch (action) {
                case "Collect":
                    if (!itemList.contains(item)) {
                        itemList.add(item);
                    }
                    break;
                case "Drop":
                    if (itemList.contains(item)) {
                        itemList.remove(item);
                    }
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (itemList.contains(oldItem)) {
                        itemList.add(itemList.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (itemList.contains(item)) {
                        String tempItem = item;
                        itemList.remove(item);
                        itemList.add(tempItem);
                    }
                    break;
            }
            nextItem = scan.nextLine();
        }
        System.out.println(String.join(", ", itemList));
    }
}
