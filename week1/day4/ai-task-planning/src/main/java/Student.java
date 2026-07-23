public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        setScore(score); // Use setter to enforce boundary validation
    }

    public String getName() { return this.name; }
    public double getScore() { return this.score; }

    public void setScore(double score) {
        this.score = (score >= 0.0 && score <= 100.0) ? score : 0.0;
    }
}