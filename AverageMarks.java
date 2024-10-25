import java.util.*;
class AverageMarks
{
    public static void main(String[] args) {
        float math,eng,cs,avg;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three subjects marks:");
            math=sc.nextFloat();
            eng=sc.nextFloat();
            cs=sc.nextFloat();
        }
        avg=(math+eng+cs)/3;
        System.out.println("Average= "+avg);
    }
}

