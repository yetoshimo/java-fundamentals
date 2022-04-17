package DB_methods_Exercise;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstCharacter = scan.nextLine().charAt(0);

        char secondCharacter = scan.nextLine().charAt(0);

        System.out.println(getCharacters(firstCharacter, secondCharacter));
    }
    private static String getCharacters (char firstCharacter, char secondCharacter) {
        String listedCharacters = "";
        int firstIndex = (int) firstCharacter;
        int secondIndex = (int) secondCharacter;
        for (int i = Math.min(firstIndex, secondIndex) + 1; i < Math.max(firstIndex, secondIndex); i++) {
            listedCharacters += (char) i + " ";
        }
        return listedCharacters;
    }
}
