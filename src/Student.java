public class Student extends User{

    private String myCourses;
    private String cardInfo;
    private String attendance;
    private String dateOfRegistration;

    public Student(){

    }

    public Student(String myCourses,String cardInfo,String attendance, String dateOfRegistration){
        this.setMyCourses(myCourses);
        this.setCardInfo(cardInfo);
        this.setAttendance(attendance);
        this.setDateOfRegistration(dateOfRegistration);
    }

    public String getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String myCourses) {
        this.myCourses = myCourses;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
