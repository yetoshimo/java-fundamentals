package ZZ_PF_FinalExam_Practice_01;

import java.util.Scanner;

public class theImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String encryptedMessage = scan.nextLine();

        String nextLine = scan.nextLine();

        while (!nextLine.equals("Decode")) {

            String command = nextLine.split("\\|")[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(nextLine.split("\\|")[1]);
                    String firstPart = encryptedMessage.substring(0, numberOfLetters);
                    String secondPart = encryptedMessage.substring(numberOfLetters);
                    encryptedMessage = secondPart.concat(firstPart);
                    break;
                case "Insert":
                    int index = Integer.parseInt(nextLine.split("\\|")[1]);
                    String toInsert = nextLine.split("\\|")[2];
                    firstPart = encryptedMessage.substring(0, index);
                    secondPart = encryptedMessage.substring(index);
                    encryptedMessage = firstPart.concat(toInsert).concat(secondPart);
                    break;
                case "ChangeAll":
                    encryptedMessage = encryptedMessage.replace(nextLine.split("\\|")[1], nextLine.split("\\|")[2]);
                    break;
            }


            nextLine = scan.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}
