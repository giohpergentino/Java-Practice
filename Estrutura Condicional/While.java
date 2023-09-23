import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		//Programa que lê numeros inteiros até que o zero seja lido. Ao final mostrar a soma de números lidos.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();			
		}
		System.out.println(soma);
		sc.close();
	}

}
