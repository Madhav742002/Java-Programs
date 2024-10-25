//Enter any number and display the sum of its digit.

import java.util.Scanner;
class Dsum
{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=sc.nextInt();
        while (n!=0) { 
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
