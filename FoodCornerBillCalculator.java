import java.util.Scanner;

class FoodCornerBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter type of food (V for vegetarian, N for non-vegetarian):");
        char foodType = scanner.next().charAt(0);

        System.out.println("Enter quantity (number of plates ordered):");
        int quantity = scanner.nextInt();

        System.out.println("Enter distance in kms from the restaurant to the delivery point:");
        double distance = scanner.nextDouble();

        double billAmount = calculateBill(foodType, quantity, distance);

        if (billAmount == -1) {
            System.out.println("Invalid input. Bill amount: -1");
        } else {
            System.out.println("Final bill amount: $" + billAmount);
        }

        scanner.close();
    }

    static double calculateBill(char foodType, int quantity, double distance) {
        if ((foodType == 'V' || foodType == 'N') && quantity > 0 && distance > 0) {
            double costPerPlate = (foodType == 'V') ? 12/2 : 15/2;
            double deliveryCharge = 0;

            if (distance <= 3) {
                deliveryCharge = 0;
            } else if (distance <= 6) {
                deliveryCharge = (distance - 3) * 1;
            } else {
                deliveryCharge = 3 + (distance - 6) * 2;
            }

            return (costPerPlate * quantity) + deliveryCharge;
        } else {
            return -1; // Invalid input
        }
    }
}
