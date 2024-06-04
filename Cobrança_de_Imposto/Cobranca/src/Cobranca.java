import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cobranca{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
    double soma = 0;
    
    System.out.print("Insira o número de contribuintes: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
     System.out.println();
     System.out.println("Dados do contribuinte nº"+i+":");
     System.out.print("Pessoa física ou jurídica (f/j)? ");
     char fj = sc.next().charAt(0);
     System.out.print("Nome: ");
     sc.nextLine();
     String nome = sc.nextLine();
     System.out.print("Rendimento Anual: ");
     Double rendaAnual = sc.nextDouble();

     if (fj == 'f'){
        System.out.print("Despesas com saúde: ");
        Double gastoSaude = sc.nextDouble();
        list.add(new PessoaFisica(gastoSaude, nome, rendaAnual));}
    else {
        System.out.print("Numero de Funcionarios: ");
        Integer funcionarios = sc.nextInt();
        list.add(new PessoaJuridica(funcionarios, nome, rendaAnual));}
    }

    System.out.println();
    System.out.println("IMPOSTOS PAGOS: ");
    for (Pessoa pes : list) {
        double imposto = pes.imposto();
        System.out.println(pes.getNome()+ ": $ " + String.format("%.2f", imposto));
        soma += imposto;}

    System.out.println();
    System.out.println("IMPOSTOS TOTAIS: $"+ String.format("%.2f",soma));
    }
}
