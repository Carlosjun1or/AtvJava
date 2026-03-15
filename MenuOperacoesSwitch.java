package br.edu.fatec.tecprog.view;

import java.util.Scanner;

public class MenuOperacoesSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int op;
		int num1, num2;

		System.out.println(
				"Qual operação: (Escolha: 1. Somar | 2. Subtrair | 3. Multiplicar | 4. Dividir | 5. Raiz Quadrada)");
		op = scan.nextInt();

		switch (op) {

		case 1:
			System.out.println("Soma");
			System.out.print("Digite num1: ");
			num1 = scan.nextInt();
			System.out.print("Digite num2: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;

		case 2:
			System.out.println("Subtração");
			System.out.print("Digite num1: ");
			num1 = scan.nextInt();
			System.out.print("Digite num2: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;

		case 3:
			System.out.println("Multiplicação");
			System.out.print("Digite num1: ");
			num1 = scan.nextInt();
			System.out.print("Digite num2: ");
			num2 = scan.nextInt();
			System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
			break;

		case 4:
			System.out.println("Divisão");
			System.out.print("Digite num1: ");
			num1 = scan.nextInt();
			System.out.print("Digite num2: ");
			num2 = scan.nextInt();

			if (num2 == 0) {
				System.out.println("Erro! Não é possível dividir por zero.");
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
			}
			break;

		case 5:
			System.out.println("Raiz Quadrada");
			System.out.print("Digite um número: ");
			num1 = scan.nextInt();
			System.out.println("Raiz Quadrada de " + num1 + " é: " + Math.sqrt(num1));
			break;

		default:
			System.out.println("Essa opção não existe.");
		}
	}
}