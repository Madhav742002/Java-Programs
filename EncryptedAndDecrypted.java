import java.util.*;
class Check
{
    public static void main(String[] args) {
        int n,k,c,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        System.out.println("Enter the value of key:");
        k=sc.nextInt();

        System.out.println("original number= "+n);
        c=n^k;

        System.out.println("crypted text= "+c);
        n1=c^k;
        
        System.out.println("Original text= "+n1);
    }
}