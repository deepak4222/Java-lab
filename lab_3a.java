import java.util.*;
public class lab_3a {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        int a,b,result;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the integer a and b");
        a=s.nextInt();
        b=s.nextInt();
        try //try block
        {
            result=a/b;
            System.out.println("The result after division is " + result);
        }
        catch(Exception e) //catch Block to catch any exceptions
        {
            e.printStackTrace();
        }
    }
}

