package HB_textProcessing_Exercise;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] filePath = scan.nextLine().split("\\\\");

        System.out.printf("File name: %s%n", filePath[filePath.length - 1].split("\\.")[0]);
        System.out.printf("File extension: %s", filePath[filePath.length - 1].split("\\.")[1]);
    }
}
