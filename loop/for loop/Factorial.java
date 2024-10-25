import java.util.*;
class Factorial
{
    public static void main(String[] args) {
        int num,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial= "+f);
    }
}
