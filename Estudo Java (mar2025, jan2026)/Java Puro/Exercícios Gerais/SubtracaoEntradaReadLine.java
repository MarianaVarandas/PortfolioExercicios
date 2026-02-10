//março/2025 - curso Java IFRS
// lembrar que readLine não roda em IDE
public class SubtracaoEntradaReadLine {

	public static void main(String[] args) {

		int num_1, num_2, res;

		System.out.print("Digite um número inteiro: \n");
		num_1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite outro número inteiro: \n");
		num_2 = Integer.parseInt(System.console().readLine());

		res = num_1 - num_2;

		System.out.printf("A subtração destes dois números é %d", res);

	}
}