public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  public BankAccount (int accountID, String password){
    balance = 0;
    this.password = password;
    this.accountID = accountID;
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

  public boolean withdraw(double amount){
    if ((amount > 0) && (amount <= balance)) {
      balance = balance - amount;
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return "#" + String.valueOf(accountID) + "\t" + "$" + String.valueOf(balance);
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }
}
