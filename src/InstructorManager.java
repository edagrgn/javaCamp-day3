public class InstructorManager extends Courses{

    public InstructorManager(){


    }
    public void addMoreDetail(){
        System.out.println("okay");
    }

    public void addNewAssignment(Courses courses){
        System.out.println("added new assignment for: "+ courses.getCourseName()+ " ("+courses.getCourseId()+")");
    }
    public void updateCourse(Courses courses){
        System.out.println("updated the course: "+courses.getCourseName());
    }
    public void createCourse(){
        System.out.println("there is the new Course!!");
    }
}
