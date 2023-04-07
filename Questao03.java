import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = entry.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String middleName = entry.nextLine().toUpperCase();

        switch (middleName){
            case "WAYNE":
                System.out.println("Acesso liberado, Sr. Wayne");
                break;
            case "KENT":
                System.out.println("Saí daí, mané!");
                break;
            default:
                if (name.equalsIgnoreCase("Diana")) {
                    System.out.println("Bem-vinda, Princesa de Themyscara");
                } else {
                    System.out.println("Cai fora!");
                }
                break;
        }

        entry.close();
    }
}
