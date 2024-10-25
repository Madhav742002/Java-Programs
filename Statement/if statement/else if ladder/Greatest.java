import java.util.*;
class Greatest
{
    public static void main(String[] args) {
        int x,y,z;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
        }
        if((x>y) && (x>z))
        {
            System.out.println("Greatest= "+x);
        }
        else if(y>z)
        {
            System.out.println("Greatest= "+y);
        }
        else
        {
            System.out.println("Greatest= "+z);
        }
    }
    
}