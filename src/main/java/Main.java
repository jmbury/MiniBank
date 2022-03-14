import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Account user1 = new Account(101, "Jan", "Kowalski", 10000);
//        Account user2 = new Account();

//        System.out.println(user1.getAccountNo());
//        user2.openAccount();
//        user2.showAccount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilu uzytkownikow chcesz dodac?");
        int numberOfNewAccounts = scanner.nextInt();

        Account tableOfNewAccounts[] = new Account[numberOfNewAccounts];

        for (int i = 0; i < tableOfNewAccounts.length; i++) {
            tableOfNewAccounts[i] = new Account();
            tableOfNewAccounts[i].openAccount();
        }


    }
}
