package coderıo;

import java.util.ArrayList;

public class UserManager {
    
    ArrayList<User>userList= new ArrayList<>();
    
    public void addUserList(User user){
        userList.add(user);
    }
    public void removeUserList(User user){
        userList.remove(user);
    }
    public void showUsers(){
        for(int i=0; i<=userList.size()-1;i++){
            System.out.println(userList.get(i).getuserName());
        }
    }
}
