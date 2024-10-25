import java.util.*;
class AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float radius = sc.nextFloat();
        float area = (float) (Math.PI+radius*radius);

        System.out.println("The area of circle: "+area);
    }
}
