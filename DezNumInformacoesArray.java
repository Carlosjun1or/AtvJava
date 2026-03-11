package br.edu.fatec.tecprog.view;

import java.util.Scanner;

public class DezNumInformacoesArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[10];
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			valores[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
		}
		System.out.println("\nQuantidade de números pares: " + qtdPares);
		System.out.print("Números pares: ");
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 == 0) {
				System.out.print(valores[i] + " ");
			}
		}
		System.out.println("\n\nQuantidade de números ímpares: " + qtdImpares);
		System.out.print("Números ímpares: ");
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 != 0) {
				System.out.print(valores[i] + " ");
			}
		}
	}
}
