package coderıo;


public class InstructorManager {
    
    
    public void addGivenLectures(Instructor teacher,String lectures){
        teacher.givenLectures.add(lectures);
    }

    public void removeGivenLectures(Instructor teacher,String lectures){
        teacher.givenLectures.remove(lectures);
        System.out.println(lectures + " dersi çıkarıldı.");
    }
    public void showGivenLectures(Instructor teacher){
        System.out.println("Girmeniz gereken dersleriniz");
        for(int i=0; i<=teacher.givenLectures.size()-1; i++){
            System.out.println(teacher.givenLectures.get(i));
        }
    }
}
