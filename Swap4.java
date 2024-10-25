import java.util.*;
class swap4
{
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Number before swapping:"+x+ " " +y);
        x=x^y;     //Swapping without third variable.
        y=x^y;     // XOR operator(^).
        x=x^y;

        System.out.println("Number after swapping:"+x+ " " +y);
    }
}
