
import entities.Conta;
import entities.excecões.DominioExcecao;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

   
    System.out.println("Entre com os dados da conta");
    System.out.print("Numero da conta: ");
    Integer numero = sc.nextInt();
    System.out.print("Nome do titular da conta: ");
    sc.nextLine();
    String titular = sc.nextLine();
    System.out.print("Saldo inicial: ");
    Double balanco = sc.nextDouble();
    System.out.print("Limite de saque: ");
    Double limiteDeSaque = sc.nextDouble();

    Conta conta = new Conta(numero, titular, balanco, limiteDeSaque);
    
    System.out.println();
    System.out.print("Entre com a quantia de saque: ");
    Double quantia = sc.nextDouble();
    
    try{
    conta.saque(quantia);
    System.out.printf("Novo Saldo: %.2f%n", conta.getBalanco());
    }
    catch(DominioExcecao e){
        System.out.println(e.getMessage());
    }
   
    
     sc.close();
    }
    }

