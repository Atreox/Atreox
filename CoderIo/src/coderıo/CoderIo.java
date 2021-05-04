package coderıo;
public class CoderIo {
    public static void main(String[] args) {
        
        UserManager usermanager = new UserManager();
        Instructor Ins1= new Instructor("123","Çılgın Şakir","Şakir Çılgın","mail", "Matematik");
        usermanager.addUserList(Ins1);
        InstructorManager instructormanager =new InstructorManager();
        instructormanager.addGivenLectures(Ins1, "Matematik");
        instructormanager.addGivenLectures(Ins1, "Geometri");
        instructormanager.addGivenLectures(Ins1, "Fizik");
        instructormanager.removeGivenLectures(Ins1, "Fizik");
        instructormanager.showGivenLectures(Ins1);
        
        
        Student Stu1=new Student("001","Berks","Berkeser Canalan","mail","Matematik Mühendisliği");
        usermanager.addUserList(Stu1);
        StudentManager studentmanager =new StudentManager();
        studentmanager.addTakenLectures("Geometri", Stu1);
        studentmanager.addTakenLectures("Biyoloji", Stu1);
        studentmanager.addTakenLectures("Matematik", Stu1);
        studentmanager.removeTakenLectures("Biyoloji", Stu1);
        studentmanager.showTakenLectures(Stu1);
                    
        Student Stu2=new Student("001","Kamil","Kamil Koç","mail","Matematik Mühendisliği");
        usermanager.addUserList(Stu2);
        usermanager.showUsers();
        usermanager.removeUserList(Stu2);
        usermanager.showUsers();
    }

}
