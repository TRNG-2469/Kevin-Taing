public class Course {
    private String courseName;
    private Student[] roster;
    private int studentCount;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.roster = new Student[capacity];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        // Guard check: prevent array bounds crash
        if (studentCount < roster.length) {
            roster[studentCount] = student;
            studentCount++;
            System.out.println("[COURSE] Added " + student.getName() + " to " + courseName);
        } else {
            System.out.println("Error: Course roster is full!");
        }
    }

    public double calculateAverage() {
        if (studentCount == 0) return 0.0;
        double sum = 0.0;
        for (int i = 0; i < studentCount; i++) {
            sum += roster[i].getScore();
        }
        return sum / studentCount;
    }
}