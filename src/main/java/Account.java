import java.util.Scanner;

public class Account {

    private int accountNo;
    private String accountName;
    private String accountSurname;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public Account(int accountNo, String accountName, String accountSurname, long balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountSurname = accountSurname;
        this.balance = balance;


    }

    public Account() {
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void openAccount() {
        System.out.println("Podaj numer ID: ");
        accountNo = scanner.nextInt();
        System.out.println("Podaj imie: ");
        accountName = scanner.next();
        System.out.println("Podaj nazwisko: ");
        accountSurname = scanner.next();
        System.out.println("Podaj stan konta: ");
        balance = scanner.nextInt();

    }

    public void showAcoount(){
        System.out.println("ID: " + accountNo + " Imie: " + accountName + " Nazwisko: "+ accountSurname + " Stan konta: " + balance);

    }
}
