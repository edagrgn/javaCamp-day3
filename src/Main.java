public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setUserName("MariaJ.");
        student.setFirstName("Maria");
        student.setLastName("Jones");
        student.setEmail("@mariaj*");
        student.setPassword("87abc");
        student.setMyCourses("JAVA+REACT");
        student.setCardInfo("98786545321964356");
        student.setAttendance("21");
        student.setDateOfRegistration("01/11/2020");


        Student student2 = new Student();
        student2.setId(2);
        student2.setUserName("MertE.");
        student2.setFirstName("Mert");
        student2.setLastName("Erdem");
        student2.setEmail("@erdem*");
        student2.setPassword("rdpw88");
        student2.setMyCourses("C#+ANGULAR");
        student2.setCardInfo("1132554981765842");
        student2.setAttendance("13");
        student2.setDateOfRegistration("14/05/2021");



        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setUserName("EnginDemirog");
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("@engindemirog");
        instructor.setPassword("engndmrg00");
        instructor.setDetail("Danışmanlık veya eğitim verdiğim kurum sayısı son 10 yılda 300'ü geçmiştir.");




        Courses course  = new Courses();
        course.setCourseId(1);
        course.setCourseName("JAVA + REACT");

        Courses course2 = new Courses();
        course2.setCourseId(2);
        course2.setCourseName("C# + ANGULAR");

        Courses course3 = new Courses();
        course3.setCourseId(3);
        course3.setCourseName("Programlamaya Giriş İçin Temel Kurs");


        UserManager userManager = new UserManager();
        userManager.logIn(student);
        userManager.logIn(student2);
        userManager.logOut(student);
        userManager.logOut(student2);
        userManager.addUser(student);
        userManager.addUser(student2);




        StudentManager studentManager = new StudentManager();
        studentManager.addMyCourse(course);
        studentManager.addMyCourse(course2);
        studentManager.addMyCourse(course3);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addMoreDetail();
        instructorManager.addNewAssignment(course2);
        instructorManager.updateCourse(course);
        instructorManager.createCourse();











    }
}
