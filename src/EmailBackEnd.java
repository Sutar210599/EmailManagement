import java.util.*;
public class EmailBackEnd {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailid;
    private String admin="Sutar";
    private String admin_password="sutar#210599";
    private HashMap<String, String> email_pass=new HashMap<>();//Maintain a record of Employee credentials

    EmailBackEnd(String adminID, String adminPass){
        if validateAdmin(){
            this.firstName=firstName;
            this.lastName=LastName;
            this.department=setDepartment();
            this.password=setPass();
            System.out.println("Your randomly generated password is :"+this.password);
            this.emailid=createEmail();
            System.out.println("Your generated email id is :"+this.emailid);
            email_pass.put(emailid,password);

        }
        else{

        }

    }
    private  void setemp(String firstName, String lastName){

    }
    private boolean validateAdmin(String id, String pass){
        if (id.equals(this.admin) && pass.equals(this.admin_password)){
            return true;
        }
        else{
            return false;
        }

    }

    private String setDepartment(){
        System.out.println("Choose your Department :\n1.Sales\n2.DevOps\n3.Management\n ");
        Scanner input=new Scanner(System.in);
        int dep=input.nextInt();
        System.out.println("You have chosen the department : "+dep);
        String depa = switch (dep) {
            case 1 -> "Sales";
            case 2 -> "DevOps";
            case 3 -> "Management";
            default -> throw new IllegalStateException("Unexpected value: " + dep);
        };
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
        String email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+companyName.toLowerCase()+"-"+this.department.toLowerCase()+".com";
        return email;

    }

}
