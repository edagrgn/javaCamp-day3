public class Instructor extends User{

    private String detail;

    public Instructor(){

    }
    public Instructor(String detail){
        this.setDetail(detail);
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
