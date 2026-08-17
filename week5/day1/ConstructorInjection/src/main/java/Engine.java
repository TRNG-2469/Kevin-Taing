public class Engine {
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine: " + type +
                "\nHorse Power: " + horsePower;
    }
}
