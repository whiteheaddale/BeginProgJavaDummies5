import java.util.Scanner;

class ComputeTotal {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double unitPrice, total;
        int quantity;

        unitPrice = keyboard.nextDouble();
        quantity = keyboard.nextInt();

        total = unitPrice * quantity;

        System.out.println(total);

        keyboard.close();
    }
}
