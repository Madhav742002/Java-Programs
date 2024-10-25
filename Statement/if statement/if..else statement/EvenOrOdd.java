import java.util.*;
class EvenOrOdd
{
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number:");
            n=sc.nextInt();
        }
        if(n%2==0)
        {
            System.out.println("Even number="+n);
        }
        else{
            System.out.println("odd number="+n);
        }
    }
}

