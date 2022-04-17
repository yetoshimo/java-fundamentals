package FB_objectsAndClasses_Exercise;

import java.util.Random;
import java.util.Scanner;

public class advertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scan.nextLine());

        String[] phrases = new String[]{"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};

        String[] events = new String[]{"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random randomNumber = new Random();

        for (int i = 0; i < numberOfMessages; i++) {
            int phraseIndex = randomNumber.nextInt(phrases.length);
            int eventsIndex = randomNumber.nextInt(events.length);
            int authorsIndex = randomNumber.nextInt(authors.length);
            int citiesIndex = randomNumber.nextInt(cities.length);
            System.out.printf("%s %s %s – %s%n", phrases[phraseIndex],
                    events[eventsIndex],
                    authors[authorsIndex],
                    cities[citiesIndex]);
        }
    }
}
