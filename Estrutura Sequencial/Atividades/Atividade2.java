import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		double raio = sc.nextDouble();
		double pi =  3.14159;
		
		double area = Math.pow(raio, 2.0) * pi;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
