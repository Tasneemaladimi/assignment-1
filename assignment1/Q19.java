class Q19{
    private String cardnumber;
    private String cardholder;
    private String expirationdate;
    private double balance;

    public Q19( String cardholder, String cardnumber, String expirationdate) {
        this.balance = 0.0;
        this.cardholder = cardholder;
        this.cardnumber = cardnumber;
        this.expirationdate = expirationdate;
    }
    public void payment(double amount){
        if(amount < 0){
            System.out.println("payment amount cannot be negative. Ignoring request.");
            return;
        }
        balance -= amount;
        System.out.printf("processed payment of $%.2f . New balance: $%.2f%n", amount,balance);
    }
    public void charge(double amount){
        if(amount < 0){
            System.out.println("charge amount cannot be ngative. Ignoring request.");
            return;
        }
        balance += amount;
        System.out.printf("charged $%.2f. New balance: $%.2f%n", amount,balance);
    }

    public double getBalance() {
        return balance;
    }
    public String toString(){
        return String.format("creditcard{cardnumber='%s' cardholder='%s' balance=%.2f}", cardnumber , cardholder , balance);
    }

    public static void main(String[] args) {
        Q19 card = new Q19("1234-5678-9012-3456" , "Ahmed", "12/25");
        card.payment(-50);
        card.charge(-20);
        card.payment(100);
        System.out.printf("final balance: $%.2f%n", card.getBalance());
    }
}