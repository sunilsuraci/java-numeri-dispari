package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
	
		
		System.out.println("Inserisci il numero: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//System.out.println(n);
		int[] numero = new int[n];
		Random random = new Random();
		for (int i=0; i < numero.length; i++) {
			numero[i]= random.nextInt(100);
			System.out.println(numero[i]);
		}
		
		
		scanner.close();	
	}
	
}
