import java.util.*;
public class EmailApp {
    public static void main(String[] args){
        System.out.println("Enter the number of employees you want to enter:");
        Scanner empnum=new Scanner(System.in);


        int num=empnum.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Enter employee "+(i+1) +" first name :");
            String firstname=empnum.next();
            System.out.println("Enter employees " +(i+1)+" last name");
            String lastname=empnum.next();
            EmailBackEnd emp=new EmailBackEnd(firstname,lastname);

        }


    }
}
