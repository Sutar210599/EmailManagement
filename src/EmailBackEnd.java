import java.util.*;
public class EmailBackEnd {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailid;
    private HashMap<String, String> email_pass=new HashMap<>();//Maintain a record of Employee credentials

    EmailBackEnd(String firstName, String LastName){
        this.firstName=firstName;
        this.lastName=LastName;
        this.department=setDepartment();
        this.password=setPass();
        this.emailid=createEmail();

    }

    private String setDepartment(){
        System.out.println("Choose your Department :\n1.Sales\n2.DevOps\n3.Management\n ");
        Scanner input=new Scanner(System.in);
        int dep=input.nextInt();
        System.out.println("You have chosen the department : "+dep);
        case dep:
            


    }

    private String setPass(){

    }
    private String createEmail(){

    }

}
