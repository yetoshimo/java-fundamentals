package ZZ_PF_FinalExam_Practice_05;

import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String activationKey = scan.nextLine();

        String nextLine = scan.nextLine();

        while (!nextLine.equals("Generate")) {
            String command = nextLine.split(">>>")[0];

            switch (command) {
                case "Contains":
                    String subString = nextLine.split(">>>")[1];

                    if (activationKey.contains(subString)) {
                        System.out.printf("%s contains %s%n", activationKey, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String toState = nextLine.split(">>>")[1];
                    int startIndex = Integer.parseInt(nextLine.split(">>>")[2]);
                    int endIndex = Integer.parseInt(nextLine.split(">>>")[3]);

                    String subStringToReplace = activationKey.substring(startIndex, endIndex);

                    if (toState.equals("Upper")) {
                        activationKey = activationKey.replace(subStringToReplace, subStringToReplace.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(subStringToReplace, subStringToReplace.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(nextLine.split(">>>")[1]);
                    endIndex = Integer.parseInt(nextLine.split(">>>")[2]);

                    activationKey = activationKey.replace(activationKey.substring(startIndex, endIndex), "");
                    System.out.println(activationKey);
                    break;
            }

            nextLine = scan.nextLine();

        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
