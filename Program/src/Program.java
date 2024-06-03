import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
       List<Produto> list = new ArrayList<>();
		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		  System.out.println("Dados #"+i+" Produto:");
		  System.out.print("Comum, usado ou importado (c,u,i)? ");
		  char p = sc.next().charAt(0);
		  System.out.print("Nome: ");
		  sc.nextLine();
		  String nome = sc.nextLine();
		  System.out.print("Preco: ");
		  Double preco = sc.nextDouble();

		  if (p == 'i'){
           System.out.print("Taxa Aduaneira: ");
		   Double taxaAduaneira = sc.nextDouble();
		   list.add(new ProdutoImportado(nome, preco, taxaAduaneira));}
		  else if (p == 'u'){
           System.out.print("Data de Fabricacao(DD/MM/AAAA): ");
		   String data = sc.next();
		   Date dataDeFabricaçao = sdf.parse(data);
		   list.add(new ProdutoUsado(nome, preco, dataDeFabricaçao));}
		   else{
			list.add(new Produto(nome, preco));}
		}
		System.out.println();
        System.out.println("Etiqueta de Preço: ");
		for (Produto prod : list) {
			System.out.println(prod.toString());
		}

	
		
		sc.close();
	}
}