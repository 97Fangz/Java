import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to (F)ahrenheit or (C)elsius? ");
        char scale = scanner.next().charAt(0);

        double convertedTemperature;
        if (scale == 'F' || scale == 'f') {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else if (scale == 'C' || scale == 'c') {
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else {
            System.out.println("Invalid scale!");
        }
    }
}

