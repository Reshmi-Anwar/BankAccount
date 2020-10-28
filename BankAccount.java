public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount (int accountID, String password){
    balance = 0;
  }
  public String toString(){
    return String.valueOf(accountID) + "\t" + String.valueOf(balance);
  }
}
