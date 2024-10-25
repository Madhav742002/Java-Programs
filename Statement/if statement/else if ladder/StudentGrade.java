import java.util.*;
class StudentGrade
{
    public static void main(String[] args) {
        int s1,s2,s3,totalMarks;
        float averageMarks;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three subjects marks:");
            s1=sc.nextInt();
            s2=sc.nextInt();
            s3=sc.nextInt();
        }
        totalMarks=s1+s2+s3;
        System.out.println("Total marks= "+totalMarks);
        averageMarks=totalMarks/3;

        System.out.println("Average Marks= "+averageMarks);
        if(averageMarks >= 75)
        {
            System.out.println("Distinction");
        }
        else if(averageMarks >= 60 && averageMarks < 75)
        {
            System.out.println("First division");
        }
        else if(averageMarks >= 45 && averageMarks < 60)
        {
            System.out.println("second division");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}