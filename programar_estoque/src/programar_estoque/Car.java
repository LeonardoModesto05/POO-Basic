package programar_estoque;

import java.util.Scanner;

import entities.carro;

public class Car {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		carro car = new carro(); 
		System.out.println("Digite a marca do carro: ");
		car.marca = sc.next();
		System.out.println("Digite o modelo do carro: ");
		car.modelo = sc.next();
		System.out.println("Digite o ano do carro: ");
		car.ano = sc.nextInt();
		
		System.out.println();
		System.out.println(car);
		System.out.println("Ligue ou desligue o carro (0/1): " );
		int on = sc.nextInt();
		car.ligar(on);
		System.out.printf("%s", car.ligar(on));
		sc.close();
	}

}
