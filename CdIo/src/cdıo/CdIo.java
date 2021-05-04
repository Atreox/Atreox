package cdıo;
public class CdIo {
    public static void main(String[] args) {
      
    Course myCourse = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı(Java+REACT)","Engin Demiroğ");
    Course myCourse1= new Course(2, "Yazılım Geliştirici Yetiştirme Kampı(C+Angular)","Engin Demiroğ");   
    CourseManager coursemanager = new CourseManager();  
    
    coursemanager.courseadd(myCourse);
    coursemanager.courseadd(myCourse1);
    
    coursemanager.showcourse(myCourse);
        System.out.println("--------------------------");
    coursemanager.showcourselist();
      
      
    }
    
}
