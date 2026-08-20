public class Course {
    int courseId;
    String courseName;
    String duration;

    public Course(int courseId, String courseName, String duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
