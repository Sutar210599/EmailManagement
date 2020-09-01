import java.util.*;
public class EmailApp {
    public static void main(String[] args){
        Scanner j=new Scanner(System.in);
        System.out.println("Enter the admin id");
        String adminid=j.next();
        System.out.println("Enter the admin password");
        String pass=j.next();
        EmailBackEnd emp=new EmailBackEnd(adminid,pass);



    }
}
