import java.util.*;
public class EmailBackEnd {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailid;
    private String companyName="Sutar";
    private HashMap<String, String> email_pass=new HashMap<>();//Maintain a record of Employee credentials

    EmailBackEnd(String firstName, String LastName){
        this.firstName=firstName;
        this.lastName=LastName;
        this.department=setDepartment();
        this.password=setPass();
        System.out.println("Your randomly generated password is :"+this.password);
        this.emailid=createEmail();
        System.out.println("Your generated email id is :"+this.emailid);

    }

    private String setDepartment(){
        System.out.println("Choose your Department :\n1.Sales\n2.DevOps\n3.Management\n ");
        Scanner input=new Scanner(System.in);
        int dep=input.nextInt();
        System.out.println("You have chosen the department : "+dep);
        String depa;
        switch (dep){
            case 1:
                depa="Sales";
                break;
            case 2:
                depa="DevOps";
                break;
            case 3:
                depa="Management";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + dep);
        }
        return depa;



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
        String email=this.firstName+"."+this.lastName+"@"+companyName+"-"+this.department+".com";
        return email;

    }

}
