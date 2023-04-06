import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Digite a temperatura:");
        double temp = entry.nextDouble();

        System.out.println("Digite a escala de temperatura de entrada (C, F ou K):");
        String option = entry.next().toUpperCase();

        double celsius = 0, fahrenheit = 0, kelvin = 0;

        if(option.equals("C")) {
            celsius = temp;
            fahrenheit = 1.8 * celsius + 32;
            kelvin = celsius + 273.15;
        }else if(option.equals("F")){
            fahrenheit = temp;
            celsius = (fahrenheit - 32) / 1.8;
            kelvin = celsius + 273.15;
        }else if(option.equals("K")){
            kelvin = temp;
            celsius = kelvin - 273.15;
            fahrenheit = 1.8 * celsius + 32;
        }else{
                System.out.println("Opção invalida");
                System.exit(0);
        }

        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);

        entry.close();
    }
}
