package programar_estoque;

import java.util.Scanner;

import entities.Desafio;

public class Challange {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Desafio chall = new Desafio();
		chall.idade = sc.nextDouble();
		chall.peso = sc.nextDouble();
		System.out.println(chall.toString());
		sc.close();

	}

}
