public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount (int accountID, String password){
    balance = 0;
    this.password = password;
    this.accountID = accountID;
  }
  public String toString(){
    return String.valueOf(accountID) + "\t" + String.valueOf(balance);
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if(amount>0){
      balance = balance + amount;
      return true;
    }
    else{
      return false;
    }
  }
}
