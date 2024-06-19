import java.beans.AppletInitializer;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu  primeiro nome:");
    String nome = sc.next();

    System.out.println("Digite seu sobrenome:");
    String sobrenome  = sc.next();

    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();

    System.out.println("Digite sua altura (em cm):");
    double altura = sc.nextInt();

    System.out.println("Digite sua massa (em KG):");
    int massa = sc.nextInt();

    double alturam = altura / 100;

    double alturaquadrado = alturam * alturam;

    double pesodivido = massa / alturaquadrado;

    System.out.println("");

    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
    System.out.println("{         Resultado         }");
    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
    System.out.println("");

    System.out.print("Nome: ");
    System.out.println(nome + (" ") + sobrenome); 
    
    System.out.print("Idade: ");
    System.out.println(idade + " anos");

    System.out.print("Altura: ");
    System.out.println(alturam + " metros");

    System.out.print("Massa: ");
    System.out.println(massa + " Kg");

    System.out.println(" ");

    System.out.println("IMC:");
    System.out.println("");
    System.out.println(pesodivido);
  
    sc.close();
  }

}