package cdıo;

import java.util.ArrayList;

public class CourseManager {        
   public ArrayList<Course>coursess=new ArrayList<>();
    public  void courseadd(Course course){
        coursess.add(course);
        System.out.println("Kurs eklendi");
    }
    
    public  void showcourse(Course course){
        System.out.println("Kurs numarası "+course.getcourseNumber());
        System.out.println("Kurs adı "+course.getcourseName());
        System.out.println("Kurs eğitmeni "+course.getcourseInstructor());
        
    }
    
    public  void showcourselist(){
        for(int i=0; i<=this.coursess.size()-1; i++){
            System.out.println("Kurs numarası "+this.coursess.get(i).getcourseNumber());
            System.out.println("Kurs adı "+this.coursess.get(i).getcourseName());
            System.out.println("Kurs eğitmeni "+this.coursess.get(i).getcourseInstructor());
        }
        
    }
}
