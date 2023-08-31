package Operations;

import java.util.Scanner;

public class withdrow {
    
    public double withdrowMoney(double ammount) {

        Scanner sc = new Scanner(System.in);
        showBalance sb =new showBalance();
        try {
            System.out.print("Enter the ammount to be withdraw Rs.");
            double withdraw = sc.nextDouble();
            if(withdraw<=showBalance.ammount){
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

            System.out.println("Rs." + withdraw + " is withdrawd from your account");
            ammount -= withdraw;
            System.out.println("Avelable balence is  " + ammount);

            showBalance.ammount=ammount;
            System.out.println("```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
            }
            else{
                System.out.println("you dont have enough cash to withdraw");
            System.out.println("```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

            }
        } catch (Exception e) {
            System.out.println("Enter the valid ammout");
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

        }
        return ammount;
    }

}

