package ZZ_PF_FinalExam_Practice_03;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String secretMessage = scan.nextLine();

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Reveal")) {
            String command = nextCommand.split(":\\|:")[0];

            switch (command) {
                case "InsertSpace":
                    int givenIndex = Integer.parseInt(nextCommand.split(":\\|:")[1]);
                    String firstPart = secretMessage.substring(0, givenIndex);
                    String secondPart = secretMessage.substring(givenIndex);
                    secretMessage = firstPart.concat(" ").concat(secondPart);
                    System.out.println(secretMessage);
                    break;
                case "Reverse":
                    String givenText = nextCommand.split(":\\|:")[1];
                    if (secretMessage.contains(givenText)) {
                        secretMessage = secretMessage.replaceFirst(givenText, "");
                        StringBuilder tempString = new StringBuilder(givenText);
                        tempString.reverse();
                        secretMessage = secretMessage.concat(tempString.toString());
                        System.out.println(secretMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String selectedText = nextCommand.split(":\\|:")[1];
                    String replacement = nextCommand.split(":\\|:")[2];
                    secretMessage = secretMessage.replace(selectedText, replacement);
                    System.out.println(secretMessage);
                    break;
            }

            nextCommand = scan.nextLine();
        }
        System.out.printf("You have a new text message: %s", secretMessage);
    }
}
