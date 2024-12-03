public class Q18 {
    private String cardname;
    private String cardnumber;
    private double creditlimit;
    private double balance;

    public Q18(String cardname, String cardnumber, double creditlimit){
        this.cardname = cardname;
        this.cardnumber = cardnumber;
        this.creditlimit = creditlimit;
        this.balance = 0;
    }
    public boolean charge(double amount){
        if(amount + balance > creditlimit){
            return false;
        }
        balance+= amount;
        return true;
    }
    public void payment(double amount){
        balance -= amount;
    }
    public double getCreditlimit(){
        return creditlimit;
    }
    public void update(double newlimit){
        if(newlimit >= 0){
            this.creditlimit = newlimit;
        }
        else {
            System.out.println("credit limit cannot be negative.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String toString(){
        return "credit card{" + "card name=" +cardname + '\'' + "card number=" +cardnumber + '\'' + "credit limit=" +creditlimit + "balance" +balance + '}';
    }

    public static void main(String[] args) {
        Q18 mycard = new Q18("Alice Smith","1234-5678-9012-3456", 5000);
        System.out.println(mycard);
        mycard.update(6000);
        System.out.println("Updated Credit Limit: "+mycard.getCreditlimit());
        mycard.update(-1000);
    }
}
