package test.OOP;

public class CreditCard {
    
    //instance variables
    private double balance;
    // public double amount;


    public static void main(String[] args) {
        // Creates a new card with 10 dollars to start
        CreditCard card = new CreditCard(10);
    
        // Prints the starting value of the card
        System.out.println("Money in Card:" + card.getBalance());
    
       // Removes 5 dollars from the card
        card.removeMoney(5);
        System.out.println("Money in Card after Removal:" + card.getBalance());
    
        // Adds 20 dollars to the card
        card.addMoney(20);
        System.out.println("Money in Card after Adding:" + card.getBalance());
    }

    //Constructor!
    public CreditCard(double balance){
    this.balance = balance;
    // this.amount = amount;

}

//Class methods

public double getBalance() {
    return this.balance;
}

public double removeMoney(double amount) {
    balance = this.balance - amount;
    return balance;
}

public double addMoney(double amount) {
    balance = this.balance + amount;
    return balance;
}

}