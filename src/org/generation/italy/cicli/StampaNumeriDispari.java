package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
	
		//inserire il numero
		System.out.println("Inserisci il numero: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//generatore random
		int[] numero = new int[n];
		Random random = new Random();
		for (int i=0; i < numero.length; i++) {
			numero[i]= random.nextInt(100);
			
			if(numero[i] % 2 != 0)
			System.out.println(numero[i]);
			
		}
		
		
		scanner.close();	
	}
	
}
