import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorTotal1 = quantidade1 * valor1;
		double valorTotal2 = quantidade2 * valor2;
		double valorTotal = valorTotal1 + valorTotal2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
