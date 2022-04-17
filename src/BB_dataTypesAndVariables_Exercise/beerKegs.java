package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());

        double maxVolume = 0;
        String maxModel = "";

        for (int i = 0; i < numberOfLines; i++) {
            String kegModel = scan.nextLine();
            double kegRadius = Double.parseDouble(scan.nextLine());
            int kegHeight = Integer.parseInt(scan.nextLine());
            double kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            if (kegVolume > maxVolume) {
                maxModel = kegModel;
                maxVolume = kegVolume;
            }
        }
        System.out.println(maxModel);
    }
}
