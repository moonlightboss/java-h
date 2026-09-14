package practice_2;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner(){
        return this.owner;
    }
    int getBalance(){
        return this.balance;
    }

    void setOwner(String owner){
        this.owner = owner;
    }

    public void deposit(int amount){
        balance = amount + balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public void printBalance(){
        System.out.println("Владелец "+ owner + ", Баланс " + balance);
    }
}
