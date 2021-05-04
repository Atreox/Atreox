package cdıo;

import java.util.ArrayList;

public class Course {
        public int courseNumber;
        public String courseName;
        public String courseInstructor;
        
        
        public Course(int courseNumber, String courseName, String courseInstructor){
        this.courseNumber=courseNumber;
        this.courseName=courseName;
        this.courseInstructor=courseInstructor;      
    }
        public int getcourseNumber(){
            return this.courseNumber;
        }
        public String getcourseName(){
            return this.courseName;
        }
        public String getcourseInstructor(){
            return this.courseInstructor;
        }
        public void setcourseNumber(int courseNumber){
            this.courseNumber=courseNumber;
        }
        public void setcourseName(String courseName){
            this.courseName=courseName;
        }
        public void setcourseInstructor(String courseInstructor){
            this.courseInstructor=courseInstructor;
            
        }
}
