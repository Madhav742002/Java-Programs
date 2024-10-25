import java.util.*;
class EvenOrOdd2
{
    public static void main(String[] args) {
        int n,t=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number:");
            n=sc.nextInt();
        }
        if((int)(n & t)==0)     //AND operator(&).
        {
            System.out.println("Even number: "+n);
        }
        else{
            System.out.println("odd number: "+n);
        }
    }
}
