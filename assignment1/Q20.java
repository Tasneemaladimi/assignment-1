public class Q20 {
    private String cardnumber;
    private String cardholder;
    private double limit;
    private double balance;

    public Q20(  String cardholder, String cardnumber, double limit) {
        this.balance = 0.0;
        this.cardholder = cardholder;
        this.cardnumber = cardnumber;
        this.limit = limit;
    }
    public void charge(double amount){
        if(balance + amount > limit){
            System.out.println("charge denied for" +cardholder + ":exceeds credit limit.");
        }
        else {
            balance += amount;
            System.out.printf("charged $%.2f to %s. new balance: $%.2f%n",amount, cardholder, balance);
        }
    }

    public static void main(String[] args) {
        Q20[] cards = {new Q20("1235-6668-8888", "ali", 500),new Q20("3333-888-7777", "ahmed", 300),new Q20("333-777-000", "omar", 400)};
        double[]charges = {200,150,600};
        for (int i = 0; i < cards.length; i++) {
            cards[i].charge(charges[i]);

        }
    }
}
