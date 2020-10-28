public class Tester {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(123456, "password");
    System.out.println(bank.getAccountID()); //return 123456
		System.out.println(bank.getBalance()); //0.0 output
		System.out.println(bank.withdraw(100)); //return false
		System.out.println(bank.deposit(100)); //return true
		System.out.println(bank.deposit(50)); //return true
		System.out.println(bank.getBalance()); //return 150
		System.out.println(bank.withdraw(50)); //return true
		System.out.println(bank.toString());//return 12345\t25.0
	}
}
