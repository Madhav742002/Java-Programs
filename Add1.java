import java.util.*;
class Add1
{
    public static void main(String[] args) {
        int x,y,z;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            x=sc.nextInt();
            y=sc.nextInt();
        }
        z=x+y;
        System.out.println("Addition= "+z);
    }
}
