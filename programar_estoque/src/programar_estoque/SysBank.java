package programar_estoque;

import java.util.Locale;
import java.util.Scanner;

import entities.DigBank;

public class SysBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double value = 0.0;
		char opcao = 'y';
		char novamente = 'y';
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit?(y/n)");
		opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			DigBank digbank = new DigBank(accountNumber, holder, value);
			System.out.println("Account data: ");
			System.out.println("Account: " + digbank.getAccountNumber() + " Holder: " + digbank.getHolder()
					+ " Balance: " + digbank.getBalance());
		} else {
			DigBank digbank = new DigBank(accountNumber, holder, value);
			System.out.println("Account: " + digbank.getAccountNumber() + " Holder: " + digbank.getHolder()
					+ " Balance: " + digbank.getBalance());
		}
		System.out.println();
		DigBank digbank = new DigBank(accountNumber, holder, value);
		while (novamente == 'y') {
			System.out.println("1- Deposit");
			System.out.println("2- withdraw");
			System.out.println("3 - Change your holder");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("Enter a deposit value: ");
				value = sc.nextDouble();
				digbank.setBalance(value);
				break;
			case 2:
				System.out.print("Enter a withdraw value: ");
				value = sc.nextDouble();
				digbank.setWithdraw(value);
				break;
			case 3:
				System.out.print("Enter the new holder: ");
				sc.nextLine();
				holder = sc.nextLine();
				digbank.setHolder(holder);
			}
			System.out.println("Update account data: ");
			System.out.println("Account: " + digbank.getAccountNumber() + " Holder: " + digbank.getHolder()
			+ " Balance: " + digbank.getBalance());
			System.out.println();
			System.out.print("Do you want realize another operation? (y/n)");
			novamente = sc.next().charAt(0);
		}
		sc.close();
	}

}
