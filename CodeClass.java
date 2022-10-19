package com.saporafinza;

import java.util.*;

public class CodeClass {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int tahmin = random.nextInt(100);
	List <Integer> list = new ArrayList <Integer> ();  
	
	public void tahmin() {
		
	System.out.print("Bir sayı tahmin et (1-100 arası)");
	int sayi, sayac = 0;
		do {
			sayi = scanner.nextInt();
			if (sayi - tahmin < 3 && sayi - tahmin >= 0) {
				list.add(sayi);
				System.out.println("Yaklaştın... Aşağı!");
			}
			else if (tahmin - sayi < 3 && tahmin - sayi >= 0) {
				list.add(sayi);
				System.out.println("Yaklaştın... Yukarı!");
			}
			else if (sayi < tahmin) {
				list.add(sayi);
				System.out.println("Yukarı!");
			}
			else if (sayi > tahmin) {
				list.add(sayi);
				System.out.println("Aşağı");
			}
			sayac++;
		}
		while (sayi != tahmin);
		System.out.println("Tebrikler " + sayac + " tahminde aklımdaki " + list.size() + " sayısını buldun");
		System.out.println("Tahminler: " + list);
	}
}


