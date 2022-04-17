package ZZ_PF_20211205_FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class messageTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scan.nextLine());

        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numberOfMessages; i++) {
            String nextMessage = scan.nextLine();

            Matcher matcher = pattern.matcher(nextMessage);

            if (matcher.find()) {
                String command = matcher.group("command");
                char[] text = matcher.group("message").toCharArray();
                StringBuilder encodedMessage = new StringBuilder(command + ": ");
                for (char j: text) {
                    encodedMessage.append((int) j);
                    encodedMessage.append(" ");
                }
                System.out.println(encodedMessage);
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
