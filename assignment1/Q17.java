public class Q17 {
    private String name;
    private int numberofpetals;
    private float price;
    public Q17(String name, int numberofpetals, float price){
        this.name = name;
        this.numberofpetals = numberofpetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberofpetals() {
        return numberofpetals;
    }

    public float getPrice() {
        return price;
    }

    public void setNumberofpetals(int numberofpetals) {
        this.numberofpetals = numberofpetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return "Flower{"+ "name='"+name + '\'' + "number of petals="+numberofpetals + "price="+price + '}';
    }

    public static void main(String[] args) {
        Q17 flower = new Q17("Rose", 5, 2.99f);
        flower.setName("Tulip");
        flower.setNumberofpetals(6);
        flower.setPrice(3.49f);
        System.out.println(flower);
    }
}
