package com.micromate.hello_egit;

import java.util.Arrays;

public class Hello_eGit {
	 
	
	 public static void main (String args[]){ 
	
		int tab[] = {10,5,3,8,15,2};
		//tablica 2
		int[] tabi = {3,4,2,8,1}; 
		 
		 System.out.println("Hello eGIT");
		
		//Poprawki w Master
		
		 //tablica int
		for (int i =0; i<tab.length; i++){
			System.out.println(tab[i]);
		}
		
		//szybkie wyswietlanie
		System.out.println(Arrays.toString(tab));
		
		//******
		//Dodane w nowym branchu
		NowyBranch nowyBranch;
		nowyBranch = new NowyBranch();
		nowyBranch.wyswietl();
		
		tab = nowyBranch.segreguj(tab);
		
		//segregowanie tablicy 2
		tabi = nowyBranch.segreguj(tabi);
		
		System.out.println(Arrays.toString(tabi));
	 }		
}
