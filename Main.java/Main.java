import java.util.Scanner;

import Operations.deposite;
import Operations.showBalance;
import Operations.userValidation;
import Operations.withdrow;

class Main {
    public static void main(String[] args) {
        System.out.println(
                "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
        System.out.println("\t\t\t\t\t\t\t\t\tWELCOME BACK TO OUR BANK");
        System.out.println("\t\t\t\t\t\t\t\t\t------------------------");
        System.out.println(
                "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
        userValidation UserValidation = new userValidation();
        UserValidation.verifyUser();
        if (UserValidation.flag == true) {
            Scanner sc = new Scanner(System.in);
            showBalance sb = new showBalance();
            deposite dp = new deposite();
            withdrow wt = new withdrow();
            boolean key = true;

            do {
                System.out.println("1 for check balence");
                System.out.println("2 for deposit money");
                System.out.println("3 for withdraw money");
                System.out.println("press any key for exit");
                String option = sc.nextLine();
                switch (option) {
                    case "1" -> {

                        sb.getAmmount();
                    }
                    case "2" -> {
                        dp.depositeMoney(sb.getAmmount());
                    }
                    case "3" -> {
                        wt.withdrowMoney(sb.getAmmount());
                    }
                    default -> {
                        System.out.println("your session ended");
                        key = !key;

                    }
                }
            } while (key);
        }

    }
}