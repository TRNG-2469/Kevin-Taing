public class Restaurant {
    String name;
    String address;
    Chef chef;

    public Restaurant(String name, String address, Chef chef) {
        this.name = name;
        this.address = address;
        this.chef = chef;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", chef=" + chef +
                '}';
    }
}
