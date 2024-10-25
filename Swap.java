import java.util.*;
class Swap
{
    public static void main(String[] args) {
        int x,y,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println("Number before swapping:"+x+ " " +y);
        temp=x;     //Swap using third variable.
        x=y;
        y=temp;

        System.out.println("Number after swapping:"+x+ " " +y);
    }
}
