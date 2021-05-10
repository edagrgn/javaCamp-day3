public class UserManager {

    public void logIn(User user){
        System.out.println("Login successful : "+ user.getUserName());
    }
    public void logOut(User user){
        System.out.println("Logged out : "+user.getUserName());
    }
    public void addUser(User user){
        System.out.println("User Added Successfully : "+ user.getFirstName() + " " +user.getLastName());
    }
}
