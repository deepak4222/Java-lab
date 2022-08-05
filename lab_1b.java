import java.util.Scanner;
class StackDemo {
    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int top = -1;
    public void push(int pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Element "+pushedElement+" is pushed into Stack!");
        }
        else {
            System.out.println("Stack Overflow !");
        }
    }
    public void pop() {
        if (top >= 0) {
            top--;
            System.out.println("Pop operation is successfull !");
            System.out.print("and popped element is :" + arr[top+1]);
        }
        else {
            System.out.println("Stack Underflow !");
        }
    }
    public void printElements() {
        if (top >= 0) {
            System.out.println("Elements in stack :");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
        else{
            System.out.println(" Stack is empty");
        }
    }
}
public class lab_1b {
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter Your Choice");
            System.out.print("1.PUSH \n2.POP \n3.DISPLAY \n");
            int Choice=in.nextInt();
            switch(Choice){
                case 1: System.out.println("Enter Number to be pushed:-");
                    int Number =in.nextInt();
                    stackDemo.push(Number);
                    break;
                case 2: stackDemo.pop();
                    break;
                case 3: stackDemo.printElements();
                    break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
}

