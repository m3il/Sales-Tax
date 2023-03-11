import java.util.Scanner;

public class Tax{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Retail price of the item: ");
        double price = in.nextDouble();

        System.out.println("Sales tax rate (%) of the item: ");
        double tax = in.nextDouble();

        tax = tax / 100;
        
        double fullPrice = tax + price;

        System.out.println("The sales tax is: " + tax + " And the full price is: " + fullPrice);
    }
}
    
