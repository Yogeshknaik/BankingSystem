package Operations;

import java.util.Scanner;

public class deposite {
    public double depositeMoney(double ammount) {

        Scanner sc = new Scanner(System.in);
        showBalance sb =new showBalance();
        try {
            System.out.print("Enter the ammount to be Deposite Rs.");
            double deposite = sc.nextDouble();
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

            System.out.println("Rs." + deposite + " is deopisted in your account");
            ammount += deposite;
            System.out.println("Avelable balence is  " + ammount);

            showBalance.ammount=ammount;
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

        } catch (Exception e) {
            System.out.println("Enter the valid ammout");
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

        }
        return ammount;
    }

}
