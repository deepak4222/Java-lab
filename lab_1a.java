import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Student{
    private String USN;
    private String Name;
    private String Branch;
    private String Phone;
    public void read() {
        Scanner sc = new Scanner(System.in);
        USN = sc.nextLine();
        Name = sc.nextLine();
        Branch = sc.nextLine();
        Phone = sc.nextLine();
    }
    void display()
    { System.out.println(USN+"\t"+Name+"\t\t"+Branch+"\t"+Phone);
    }
}
public class lab_1a {
    public static void main(String[] args) throws Exception {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of students:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] st = new Student[n];
        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();
        }
        // Read the student information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter USN, Name, Branch & Phone no. for student " + (i + 1));
            st[i].read();
        }
        // Display the student information
        System.out.println("USN\tName\tBranch\tPhone");
        for (int i = 0; i < n; i++) {
            st[i].display();
        }
    }
}
