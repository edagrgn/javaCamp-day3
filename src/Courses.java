public class Courses {
    private String courseName;
    private int courseId;

    public Courses(){

    }
    public Courses(String courseName,int courseId){
        super();
        this.courseName = courseName;
        this.courseId = courseId;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}

