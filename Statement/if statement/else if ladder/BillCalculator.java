import java.util.*;
class BillCalculator
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the consumed units:");
        float units=sc.nextFloat();
        float billAmount ;
        float fixCharge=250;

        if(units <= 100)
        {
            billAmount = units*5+fixCharge;
        }
        else if(units <= 500)
        {
            billAmount = 100*5 +(units-100)*8+fixCharge;
        }
        else
        {
            billAmount = 100*5 + 400*8 +(units-500)*10+fixCharge;
        }

        System.out.println("The total bill amount is: Rs "+billAmount);
    }
}