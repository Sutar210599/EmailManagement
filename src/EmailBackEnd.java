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
        switch (dep){
            case 1:
                return "Sales";
                break;
            case 2:
                return "DevOps";
                break;
            case 3:
                return "Management";
                break;
        }



    }

    private String setPass(){
        String passSelect="abcdefghijklmnopqrstuvwxyz#@!$%^&*1234567890";//Generate a password from this set
        String genPass="";
        for (int i=0;i<10;i++){
            int rand=(int)(Math.random()*passSelect.length());
            genPass+=passSelect.charAt(rand);
        }
        return genPass;

    }
    private String createEmail(){

    }

}
