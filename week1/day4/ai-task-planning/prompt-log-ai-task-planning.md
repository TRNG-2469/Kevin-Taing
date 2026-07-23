# AI Prompt Log: Roster System Task Plan

## Interaction
- **Context**: We need a student roster system that can manage students and their scores within courses. The system should allow adding students to a course and calculating the average score of the course.
- **Prompt**: "Build a student roster system. Define a Student class (name, score). Define a Course class containing an array of Students, a method to add students, and a method to calculate course averages."
- **The AI-Generated Task PLan (Verified & Audited)**:
```
Step 1: Declare the Student class.
    Needs private variables (name, score), getters/setters, validation checks for negative scores, and a parameterized constructor.
Step 2: Declare the Course class.
    Needs private array field Student[] roster, tracking variable count, addStudent method with array bounds guard check, and a calculateAverage method.
Step 3: Create the execution runner RosterApp.
    Instantiates Course, populates with Student objects, and prints status.
```
- **Generated Code: Student.java**:
```java
// File: Student.java
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
```
- **Generated Code: Course.java**:
```java
// File: Course.java
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
```
- **Conclusion**: Compiled Course.java alongside Student.java. Verification successful.