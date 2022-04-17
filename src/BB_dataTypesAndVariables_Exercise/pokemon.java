package BB_dataTypesAndVariables_Exercise;

import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine());
        int targetDistance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());

        int pokePowerOriginalHalf = pokePower / 2;

        int pokedTargets = 0;

        while (pokePower >= targetDistance) {
            pokePower -= targetDistance;
            pokedTargets++;
            if (pokePower == pokePowerOriginalHalf) {
                if (exhaustionFactor != 0){
                    pokePower /= exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
