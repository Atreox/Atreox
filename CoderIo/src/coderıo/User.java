package coderıo;
public class User {
    
    String userId;
    String userName;
    String nameSurname;
    String email;
    
    public User(String userId, String userName, String nameSurname, String email){
        this.userId=userId;
        this.userName=userName;
        this.nameSurname=nameSurname;
        this.email=email;
    }
    public String getuserName(){
       return this.userName;
    }
}
