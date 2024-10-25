
import java.util.*;
class ReverseDigit
{
    public static void main(String[] args) {
        int n,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=sc.nextInt();
        while (n!=0) { 
            r=r*10+n%10;
            n=n/10;
        }
        System.out.println("Reverse of digits: "+r);
    }
}
