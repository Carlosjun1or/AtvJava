package br.edu.fatec.tecprog.view;

import java.util.Scanner;

public class DezNumNovosValoresArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + " número: ");
			valores[i] = scan.nextInt();
		}
		System.out.println("\n Antigos Valores: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(valores[i] + " ");
		}
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 == 0) {
				valores[i] = (valores[i] + 1);
			} else {
				valores[i] = valores[i] - 1;
			}
		}
		System.out.println("\n Novos Valores: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(valores[i] + " ");
		}
	}
}
