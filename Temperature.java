import java.util.*;
public class Temperature {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit :");
        int F = sc.nextInt();
        int C =(((F-32)*5)/9);
        System.out.println("Temperature in  celsius : " + C);

    }
}
