package coderıo;

import java.util.ArrayList;

public class Student extends User {
    String department;
    public ArrayList<String>takenLectures=new ArrayList<>();
   
    public Student(String userId,String userName, String nameSurname, String email,String department){
        super(userId,userName,nameSurname,email);
        this.department=department;
    }
    
    
}
