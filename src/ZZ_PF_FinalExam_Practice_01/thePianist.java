package ZZ_PF_FinalExam_Practice_01;

import java.util.*;

public class thePianist {
    String pieceName;
    String composerName;
    String key;

    public thePianist(String pieceName, String composerName, String key) {
        this.pieceName = pieceName;
        this.composerName = composerName;
        this.key = key;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scan.nextLine());

        Map<String, thePianist> allItems = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String nextLine = scan.nextLine();
            allItems.put(nextLine.split("\\|")[0],
                    new thePianist(nextLine.split("\\|")[0],
                    nextLine.split("\\|")[1],
                    nextLine.split("\\|")[2]));
        }

        String nextCommand = scan.nextLine();

        while (!nextCommand.equals("Stop")) {
            String command = nextCommand.split("\\|")[0];

            switch (command) {
                case "Add":
                    String newPiece = nextCommand.split("\\|")[1];
                    String newComposer = nextCommand.split("\\|")[2];
                    String newKey = nextCommand.split("\\|")[3];
                    if (!allItems.containsKey(newPiece)) {
                        allItems.put(newPiece, new thePianist(newPiece, newComposer, newKey));
                        System.out.printf("%s by %s in %s added to the collection!%n",
                                newPiece, newComposer, newKey);
                    } else {
                        System.out.printf("%s is already in the collection!%n", newPiece);
                    }
                    break;
                case "Remove":
                    newPiece = nextCommand.split("\\|")[1];
                    if (allItems.containsKey(newPiece)) {
                        allItems.remove(newPiece);
                        System.out.printf("Successfully removed %s!%n", newPiece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", newPiece);
                    }
                    break;
                case "ChangeKey":
                    newPiece = nextCommand.split("\\|")[1];
                    newKey = nextCommand.split("\\|")[2];
                    if (allItems.containsKey(newPiece)) {
                        allItems.get(newPiece).key = newKey;
                        System.out.printf("Changed the key of %s to %s!%n", newPiece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", newPiece);
                    }
                    break;
            }

            nextCommand = scan.nextLine();
        }
        List<thePianist> allPieces = new ArrayList<>();
        allItems.forEach((key1, value) -> allPieces.add(value));
        allPieces.stream()
                .sorted((p1, p2) -> {
                    if (p1.pieceName.equals(p2.pieceName)) {
                        return p1.composerName.compareTo(p2.composerName);
                    } else {
                        return p1.pieceName.compareTo(p2.pieceName);
                    }
                })
                .forEach(e -> {
                    System.out.printf("%s -> Composer: %s, Key: %s%n",
                            e.pieceName, e.composerName, e.key);
                });
    }
}
