package org.generation.italy;

import java.awt.print.Printable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Esercizio sull'ASCIIART
		// Scrivere un programma che chiede all'utente la base e l'altezza di un
		// rettangolo, e lo "disegna" utilizzando l' "ASCII art".
		
Scanner sc=new Scanner (System.in);
		
		int base;
		int altezza;
		String rispostaUtente;
		do {
			
		
		System.out.println("Inserire il valore della base:");
		base = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Inserire il valore dell'altezza");
		altezza=sc.nextInt();
		sc.nextLine();
		
		
	for (int i = 1; i<=base; i++)
		System.out.print("*");//prima striscia
		System.out.println();//Seconda striscia
		
			for (int j=1; j<=base-2; j++) 
			{
				System.out.print("*");//terza striscia
				for (int i=1; i<=base-2; i++) 
				System.out.print(" ");
			System.out.println("*");
			}
			for (int i = 1; i<=base; i++)
				System.out.print("*");
			
			System.out.println("\n Puoi inserire nuovamente i dati:");
			rispostaUtente=sc.nextLine();
			
			
		} while(rispostaUtente.equalsIgnoreCase("si")) ;
		
}

}
