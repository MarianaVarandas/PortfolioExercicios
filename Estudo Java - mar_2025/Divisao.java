public class Divisao {
	public static void main (String[] args) {

		double num_01, num_02, res;
		
		System.out.print("Digite um número inteiro diferente de zero (exemplo 2.0): \n");
		num_01 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite outro número inteiro diferente de zero (exemplo 2.0): \n");
		num_02 = Double.parseDouble(System.console().readLine());

		res = num_01/num_02;

		System.out.printf ("O resultado da divisão entre %.2f e %.2f é: %.2f", num_01, num_02, res);

	}
}