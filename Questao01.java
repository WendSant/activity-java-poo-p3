import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double number1, number2, aux;
        int option = 1;
        System.out.println("============================================");
        System.out.println("=============== Calculadora ================");
        System.out.println("============================================");
        do {
            System.out.println("\n1============ OPÇÕES ============");
            System.out.println("Soma digite 1\n" +
                               "Subtração digite 2\n" +
                                "Divisão digite 3\n" +
                                "Multiplicação digite 4\n" +
                                "Potenciação digite 5\n" +
                                "Raiz Quadrada digite 6\n" +
                                "Raiz Cubica digite 7\n" +
                                "Digite 0 para sair");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Digite a opção: ");
            option = entry.nextInt();
            if(option == 1){
                System.out.println("Digite o primeiro número: ");
                number1 = entry.nextDouble();
                System.out.println("Digite o segundo número: ");
                number2 = entry.nextDouble();
                aux = number1 + number2;
                System.out.println("A soma é "+aux);
            } else if(option == 2){
                System.out.print("Digite o primeiro número: ");
                number1 = entry.nextDouble();
                System.out.print("Digite o segundo número: ");
                number2 = entry.nextDouble();
                aux = number1 - number2;
                System.out.println("A subtração é: " + aux);
            }else if(option == 3){
                System.out.print("Digite o primeiro número: ");
                number1 = entry.nextDouble();
                System.out.print("Digite o segundo número: ");
                number2 = entry.nextDouble();
                if (number2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    aux = number1 / number2;
                    System.out.println("A divisão é: " + aux);
                }
            }else if(option == 4){
                System.out.print("Digite o primeiro número: ");
                number1 = entry.nextDouble();
                System.out.print("Digite o segundo número: ");
                number2 = entry.nextDouble();
                aux = number1 * number2;
                System.out.println("A multiplicação é: " + aux);
            }else if(option == 5){
                System.out.print("Digite a base: ");
                number1 = entry.nextDouble();
                System.out.print("Digite o expoente: ");
                number2 = entry.nextDouble();
                aux = Math.pow(number1, number2);
                System.out.println("A potenciação é: " + aux);
            }else if(option == 6){
                System.out.print("Digite o número: ");
                number1 = entry.nextDouble();
                if (number1 < 0) {
                    System.out.println("Não é possível calcular a raiz quadrada com um número menor que 0");
                } else {
                    aux = Math.sqrt(number1);
                    System.out.println("A raiz quadrada é: " + aux);
                }
            }else if(option == 7){
                System.out.print("Digite o número: ");
                number1 = entry.nextDouble();
                if (number1 < 0) {
                    System.out.println("Não é possível calcular a raiz cubica com um número menor que 0");
                } else {
                aux = Math.cbrt(number1);
                System.out.println("O resultado da raiz cúbica é: " + aux);
                }
            }

        }while (option != 0);
        entry.close();
    }

}
