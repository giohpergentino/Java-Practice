import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria"; //concatenação
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		double b, B, h, area; //calculo da area
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		int a, c; // casting = É a conversão explícita de um tipo para outro.
		double resultado;
		a = 5;
		c = 2;
		resultado = (double) a / c;
		System.out.println(resultado);

		double g;
		int e;
		g = 5.0;
		e = (int) g;
		System.out.println(e);
		
	}
}
