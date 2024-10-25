import java.util.*;
class FahrenheitToCelcius
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        float fahrenheit=sc.nextFloat();
        float celcius=(float) ((fahrenheit-32)*5/9);
        System.out.println("Fahrenheit is= "+celcius);
    }
}
