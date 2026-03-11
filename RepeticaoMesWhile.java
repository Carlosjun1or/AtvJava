package br.edu.fatec.tecprog.view;

import java.util.Scanner;

public class RepeticaoMesWhile {
	public static void main(String[] args) {
		int mes;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 12: ");
		mes = scan.nextInt();

		while (mes != 0) {
			switch (mes) {
			case 1:
				System.out.println("O mes referente ao numero " + mes + " e JANEIRO");
				break;
			case 2:
				System.out.println("O mes referente ao numero " + mes + " e FEVEREIRO");
				break;
			case 3:
				System.out.println("O mes referente ao numero " + mes + " e MARCO");
				break;
			case 4:
				System.out.println("O mes referente ao numero " + mes + " é ABRIL");
				break;
			case 5:
				System.out.println("O mes referente ao numero " + mes + " e MAIO");
				break;
			case 6:
				System.out.println("O mes referente ao numero " + mes + " e JUNHO");
				break;
			case 7:
				System.out.println("O mes referente ao numero " + mes + " é JULHO");
				break;
			case 8:
				System.out.println("O mes referente ao numero " + mes + " e AGOSTO");
				break;
			case 9:
				System.out.println("O mes referente ao numero " + mes + " e SETEMBRO");
				break;
			case 10:
				System.out.println("O mes referente ao numero " + mes + " e OUTUBRO");
				break;
			case 11:
				System.out.println("O mes referente ao numero " + mes + " e NOVEMBRO");
				break;
			case 12:
				System.out.println("O mes referente ao numero " + mes + " e DEZEMBRO");
				break;
			default:
				System.out.println("Mes invalido");
			}
			System.out.println("\nDigite um numero de 1 a 12 (0 para sair): ");
			mes = scan.nextInt();
		}
		System.out.println("\nPrograma encerrado.");
	}
}
