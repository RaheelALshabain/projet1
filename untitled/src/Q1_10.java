public class Q1_10 {

    private String name;
    private int petals;
    private float price;

    public Q1_10(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Q1_10 Q = new Q1_10("Rose", 5, 10.99f);
        System.out.println("Flower Name: " + Q.getName());
        System.out.println("Number of Petals: " + Q.getPetals());
        System.out.println("Price: $" + Q.getPrice());

    }
}

