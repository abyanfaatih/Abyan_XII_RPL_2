import java.util.Scanner;

public class SuhuConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Suhu dalam Kelvin: " + kelvin);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        
        input.close();
    }
}
