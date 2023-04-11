import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double number = entry.nextDouble();
        if(number%2==0){
            double raizCubica = Math.cbrt(number);
            System.out.println("A raiz cubica é "+ raizCubica);
        }else{
            double raizQuadrada = Math.sqrt(number);
            System.out.println("A raiz quadrada é "+raizQuadrada);
        }




        entry.close();
    }
}
