package Avengers;

import java.util.Scanner;

public class Atividade_IfElse {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("====================DIAS DA SEMANA=========================");
	
		System.out.print("\nDigite o dia da semana: ");
		String diaSemana = S.nextLine();

	
		if (diaSemana.equals("domingo")) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 1° dia da semana!");

		} else if ((diaSemana.equals("segunda")) || (diaSemana.equals("segunda-feira"))) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 2° dia da semana!");

		} else if ((diaSemana.equals("terça")) || (diaSemana.equals("terça-feira"))) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 3° dia da semana!");

		} else if ((diaSemana.equals("quarta")) || (diaSemana.equals("quarta-feira"))) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 4° dia da semana!");

		} else if ((diaSemana.equals("quinta")) || (diaSemana.equals("quinta-feira"))) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 5° dia da semana!");

		} else if ((diaSemana.equals("sexta")) || (diaSemana.equals("sexta-feira"))) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 6° dia da semana!");

		} else if (diaSemana.equals("sábado")) {
			System.out.println(diaSemana.substring(0, 1).toUpperCase().concat(diaSemana.substring(1)) + " é o 7° dia da semana!");
		} else {
			System.out.println("DIA INVÁLIDO!! \nDigite um dia correspondente a: Domingo, Segunda, Terça, Quarta, Quinta, Sexta ou Sábado");
		}

		S.close();

	}

}
