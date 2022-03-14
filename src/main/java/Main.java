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
            tableOfNewAccounts[i].showAcoount();
        }
        int inputNumber;
        do {
            System.out.println("1 search.2.3.4.5.exit");
            System.out.println("Co chcesz zrobic, wprowadz cyfre: ");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    System.out.println("Podaj accountNo: ");
                    int accountToSearch = scanner.nextInt();
                    boolean found = false;

                    for (int j = 0; j < tableOfNewAccounts.length; j++) {
                        found = tableOfNewAccounts[j].search(accountToSearch);
                        tableOfNewAccounts[j].showAcoount();

                        if (found) {
                            break;

                        }


                    }
                case 5:
                    break;

            }
        } while (inputNumber != 5);


    }
}
