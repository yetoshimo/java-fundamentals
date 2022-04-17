package GB_mapsLambdaStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    private double price;
    private int quantity;

    public orders(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();

        Map<String, orders> allOrders = new LinkedHashMap<>();

        while (!nextLine.equals("buy")) {

            String[] currentOrder = nextLine.split(" ");
            String nameOfOrder = currentOrder[0];
            double priceOfOrder = Double.parseDouble(currentOrder[1]);
            int quantityOfOrder = Integer.parseInt(currentOrder[2]);

            if (!allOrders.containsKey(nameOfOrder)) {
                allOrders.put(nameOfOrder, new orders(priceOfOrder, quantityOfOrder));
            } else {
                allOrders.get(nameOfOrder).setPrice(priceOfOrder);
                allOrders.get(nameOfOrder).setQuantity(allOrders.get(nameOfOrder).getQuantity() + quantityOfOrder);
            }
            nextLine = scan.nextLine();
        }
        allOrders.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value.getPrice() * value.getQuantity()));
    }
}
