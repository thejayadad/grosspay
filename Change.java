import java.util.Scanner;

public class Change {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPennies;
        int totalNickles;
        int totalDimes;
        int totalQuarters;
        int dollar = 1;
        double penny = .01;
        double nickle = .05;
        double dime = .10;
        double quarter = .25;
        System.out.println("How many pennies: ");
        totalPennies = scan.nextInt();
        System.out.println("How many nickles: ");
        totalNickles = scan.nextInt();
        System.out.println("How many dimes: ");
        totalDimes = scan.nextInt();
        System.out.println("How many quarters: ");
        totalQuarters = scan.nextInt();
        scan.close();
        double total = (totalPennies * penny) + (totalNickles * nickle) + (totalDimes * dime) + (totalQuarters * quarter);
        if(total < dollar){
            double amountshort = dollar - total;
            System.out.println("Sorry but you were short " + String.format("%.2f",amountshort));

        } else if(total > dollar){
            double amountOver = total - dollar;
            System.out.println("Sorry but you were over by " + String.format("%.2f",amountOver));

        } else{
            System.out.println("Great job, your total hit $1.00.");
        }

    }
}
