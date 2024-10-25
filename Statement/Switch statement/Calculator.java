import java.util.*;
class Calculator
{
    public static void main(String[] args) {
        int n1,n2,r,ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two Number:");

            n1=sc.nextInt();
            n2=sc.nextInt();

            System.out.println("1. Addition");
            System.out.println("2. subtration");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");

            System.out.print("enter your choice:");
            ch=sc.nextInt();

        switch (ch) {
            case 1:
                r=n1+n2;
                System.out.println("Addition= "+r);
                break;

            case 2:
                r=n1-n2;
                System.out.println("Subtration= "+r);
                break;  
                
            case 3:
                r=n1/n2;
                System.out.println("Division= "+r);
                break; 
                
            case 4:
                r=n1*n2;
                System.out.println("Multiplication= "+r);
                break;    

            case 5:
                System.exit(0);
        
            default:
                System.out.println("Invalid choice.");
        }
    }
}
