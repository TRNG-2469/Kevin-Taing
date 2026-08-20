public class Chef {
    String name;
    String speciality;

    public Chef(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
