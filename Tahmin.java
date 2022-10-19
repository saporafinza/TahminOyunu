package com.saporafinza;

import java.util.*;

public class Tahmin {
	
	static boolean start = true;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CodeClass codeClass = new CodeClass();

		String lastChoice;
		
		while (start) {
			codeClass.tahmin();
			System.out.println("Yeniden oynamak için C tuşuna, çıkmak için E tuşuna basın...");
			
			lastChoice = scanner.nextLine();
			
			if (lastChoice.equals("E") || lastChoice.equals("e")) {
				System.out.println("Programdan çıkılyor..");
				start = false;
			}
			
		}

	}

}
