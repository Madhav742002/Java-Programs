import java.util.*;
class Greatest3
{
    public static void main(String[] args) {
        int x,y,z,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        max = ((x>y)&&(x>z)?x:(y>z)?y:z);  //Conditional operator(?:).
        System.out.println("Greatest= "+max);
    }
}        
        