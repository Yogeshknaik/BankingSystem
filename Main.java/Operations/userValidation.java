package Operations;

import java.util.Scanner;

public class userValidation {
    static Scanner sc = new Scanner(System.in);
    public final String UserName = "admin@123";
    public final String AccountNo = "123456";
    public final String Password = "123456";
    public boolean flag = false;
    String uid;
    String uacc;
    String upass;

    public void verifyUser() {
        try {
            System.out.print("Please enter your coustomer'UserName'");
            uid = sc.next();
            System.out.print("enter your coustomer'Account number'");
            uacc = sc.next();
            System.out.print("enter your coustomer'Password'");
            upass = sc.next();

        } catch (Exception e) {
            System.out.println("\t\t\tInvalid Username,password or accountnumber");
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

        }

        if (UserName.equals(uid) && AccountNo.equals(uacc) && Password.equals(upass))

        {
            System.out.println("\t\t\t\t\t\tAccount founded Thanks for  verificatiom");
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
            flag = true;
        } else {
            System.out.println("\t\t\tInvalid Username,password or accountnumber");
            System.out.println(
                    "```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");

        }
    }

}
