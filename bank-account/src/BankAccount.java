import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        RequestsAccount requestsAccount = new RequestsAccount();

        System.out.println("Type your branch");
        int branch = scanner.nextInt();
        System.out.println("Type your account");
        int account = scanner.nextInt();

        if (branch == 1020 & account == 1234){
            System.out.println("Hello Astholpho, thankyou for having a account with us, here it´s your balance is " + requestsAccount.viewBalance());
        }else{
            System.out.println("Account not finded");
        }
    }
}
