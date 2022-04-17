package AC_basicSyntaxConditionalStatementsAndLoops_moreExercise;

import java.util.Map;
import java.util.Scanner;

public class messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, Map<Integer, String>> numPad = Map.of(
                2, Map.of(
                        1, "a",
                        2, "b",
                        3, "c"
                ),
                3, Map.of(
                        1, "d",
                        2, "e",
                        3, "f"
                ),
                4, Map.of(
                        1, "g",
                        2, "h",
                        3, "i"
                ),
                5, Map.of(
                        1, "j",
                        2, "k",
                        3, "l"
                ),
                6, Map.of(
                        1, "m",
                        2, "n",
                        3, "o"
                ),
                7, Map.of(
                        1, "p",
                        2, "q",
                        3, "r",
                        4, "s"
                ),
                8, Map.of(
                        1, "t",
                        2, "u",
                        3, "v"
                ),
                9, Map.of(
                        1, "w",
                        2, "x",
                        3, "y",
                        4, "z"
                )

        );

        String message = "";

        int totalLength = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < totalLength; i++) {
            String nextCharacter = scan.nextLine();
            if (nextCharacter.equals("0")) {
                message += " ";
            } else {
                message += numPad.get(Integer.parseInt(nextCharacter) % 10).get(nextCharacter.length());
            }
        }

        System.out.println(message);
    }
}
