import java.util.*;
public class EmailBackEnd {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailid;
    private String companyName="Astril";
    private String admin="Sutar";
    private String admin_password="sutar#210599";
    private boolean runtime=true;
    private HashMap<String, String> email_pass=new HashMap<>();//Maintain a record of Employee credentials

    EmailBackEnd(String adminID, String adminPass){

        if (validateAdmin(adminID,adminPass)){
            while (this.runtime){
                System.out.println("Welcome Admin! Press 1 for adding employee, Press 2 for management employee, Press 3 to exit");
                Scanner ad=new Scanner(System.in);
                int adch=ad.nextInt();

                if (adch==1){
                    System.out.println("Enter the number of employees you wish to add.");
                    int num=ad.nextInt();
                    for (int k=0;k<num;k++){
                        System.out.println("Enter employee "+(k+1) +" first name :");
                        String first=ad.next();
                        System.out.println("Enter employee " +(k+1)+" last name");
                        String last=ad.next();
                        setemp(first,last);
                    }
                }
                else if (adch==2) {
                    System.out.println("Press 1 to view the hashmap of credentials, Press 2 to change password for an employee");
                    int d = ad.nextInt();
                    if (d == 1) {
                        System.out.println(email_pass);
                    } else if (d == 2) {
                        System.out.println("Enter the email id of the employee");
                        String emailChange = ad.next();
                        if (email_pass.containsKey(emailChange)) {
                            System.out.println("Employee found!");
                            System.out.println("Generating a new password for employee");
                            String newPass = setPass();
                            System.out.println("The new password is " + newPass);

                        } else {
                            System.out.println("Email id does not exist");
                        }
                    }
                }
                else if(adch==3){
                    System.out.println("Bye!");
                    //this.runtime=false;
                    break;

                        }



            }


        }
        else{
            System.out.println("Invalid Credentials");

        }

    }
    private  void setemp(String first, String last){
        this.firstName=first;
        this.lastName=last;

        this.department=setDepartment();
        this.password=setPass();
        System.out.println("Your randomly generated password is :"+this.password);
        createEmail();
        System.out.println("Your generated email id is :"+this.emailid);
        email_pass.put(emailid,password);


    }

    private boolean validateAdmin(String id, String pass){
        return id.equals(this.admin) && pass.equals(this.admin_password);

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
    private void createEmail(){
        this.emailid=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+companyName.toLowerCase()+"-"+this.department.toLowerCase()+".com";


    }

}
