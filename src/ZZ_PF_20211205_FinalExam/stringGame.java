package ZZ_PF_20211205_FinalExam;

import java.util.Scanner;

public class stringGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenString = scan.nextLine();

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Done")) {
            String command = nextCommand.split(" ")[0];

            switch (command) {
                case "Change":
                    String charReplace = nextCommand.split(" ")[1];
                    String replacement = nextCommand.split(" ")[2];
                    givenString = givenString.replaceAll(charReplace, replacement);
                    System.out.println(givenString);
                    break;
                case "Includes":
                    String subString = nextCommand.split(" ")[1];
                    if (givenString.contains(subString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String[] splitGivenText = givenString.split("\\s");
                    String endSubString = nextCommand.split(" ")[1];
                    if (splitGivenText[splitGivenText.length - 1].equals(endSubString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    givenString = givenString.toUpperCase();
                    System.out.println(givenString);
                    break;
                case "FindIndex":
                    char[] givenText = givenString.toCharArray();
                    char findChar = nextCommand.split(" ")[1].toCharArray()[0];
                    for (int i = 0; i < givenText.length; i ++) {
                        if (givenText[i] == findChar) {
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(nextCommand.split(" ")[1]);
                    int count = Integer.parseInt(nextCommand.split(" ")[2]);
                    givenString = givenString.substring(startIndex, startIndex + count);
                    System.out.println(givenString);
                    break;
            }

            nextCommand = scan.nextLine();
        }
    }
}
