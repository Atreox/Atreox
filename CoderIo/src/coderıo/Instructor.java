package coderıo;

import java.util.ArrayList;

public class Instructor extends User{
    public ArrayList<String> givenLectures= new ArrayList<>();
    String branch;
    public Instructor(String userId, String userName, String nameSurname, String email,String branch) {
        super(userId, userName, nameSurname, email);
        
        
        this.branch=branch;
    }
   
    public String getBrach(){
        return this.branch;
    }
    
    public void setBrach(String branch){
        this.branch=branch;
    }
}
