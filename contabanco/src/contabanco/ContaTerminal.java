package contabanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Por favor, digite o número da Conta:");
			int numero = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Por favor, digite o número da Agência:");
			String agencia = scanner.nextLine();

			System.out.println("Por favor, digite seu nome:");
			String nomeCliente = scanner.nextLine();

			System.out.println("Por favor, digite o saldo:");
			double saldo = scanner.nextDouble();

			System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
					+ "sua agência é " + agencia + ", conta " + numero + " e seu saldo %.2f " + saldo
					+ " já está disponível para saque.");

		} catch (Exception e) {
			System.out.println("Erro : Entrada inválida. Por favor, insira os dados corretamente");
		} finally {
			scanner.close();
		}

	}
}