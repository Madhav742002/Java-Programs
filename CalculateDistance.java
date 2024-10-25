import java.util.*;
class CalculateDistance
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the initial velocity(m/s):");
            float initialVelocity=sc.nextFloat();
            System.out.print("Enter the acceleration(m/s^2):");
            float acceleration = sc.nextFloat();
            System.out.print("Enter the time(sec):");
            float time=sc.nextFloat();

            float distance=(float) (initialVelocity*time+0.5*acceleration*time*time);  //formula(s = ut+1/2at^2) 
            System.out.println("The distance traveled is:"+ distance + " meters");
        }
    }
}
