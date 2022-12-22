import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Gross_Calculator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Gross Pay Calculator***");
        System.out.println("Please Enter Hours for the week: ");
        Double hours = scan.nextDouble();
        System.out.println("Please Enter your Hourly Rate: ");
        Double rate = scan.nextDouble();
        Double grossPay = hours * rate;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Your weekly pay before any deductions is: " + "$" + df.format(grossPay));
    }
}
