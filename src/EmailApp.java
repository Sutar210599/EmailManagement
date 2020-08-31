import java.util.*;
public class EmailApp {
    public static void main(String[] args){
        System.out.println("Enter the number of employees you want to enter \n");
        Scanner empnum=new Scanner(System.in);


        int num=empnum.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Enter employees first name :");
            String firstname=empnum.nextLine();
            System.out.println("Enter employees last name");
            String lastname=empnum.nextLine();
            EmailBackEnd emp=new EmailBackEnd(firstname,lastname);

        }


    }
}
