public class EmailBackEnd {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String emailid;

    EmailBackEnd(String firstName, String LastName){
        this.firstName=firstName;
        this.lastName=LastName;
        this.department=setDepartment();
        this.password=setPass();
        this.emailid=createEmail();

    }

    private String setDepartment(){
        System.out.println("Choose your Department :\n1.Sales\n2.DevOps\n3.Management\n ");
        

    }

    private String setPass(){

    }
    private String createEmail(){

    }

}
