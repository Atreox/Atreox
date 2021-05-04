package coderıo;

import java.util.ArrayList;

public class StudentManager {
    
    
   
    public void addTakenLectures(String lectures,Student student){
        student.takenLectures.add(lectures);
        System.out.println("Ders eklendi.");
    }
    
    public void removeTakenLectures(String lectures, Student student){
        student.takenLectures.remove(lectures);
        System.out.println(lectures + " dersi çıkarıldı.");
    }
    public void showTakenLectures(Student student){
        System.out.println("Dersleriniz");
        for(int i=0; i<=student.takenLectures.size()-1; i++){
            System.out.println(student.takenLectures.get(i));
        }
    }
}
