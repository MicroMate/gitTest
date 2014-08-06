package com.micromate.hello_egit;

public class NowyBranch {
	
	public void wyswietl(){
		System.out.println("Klasa zoztała utworona w nowym Branchu");
	}
	
	public int[] segreguj(int[] tab){
		
		int[] tab1 = null;
		tab1 = tab;
		int l;
		int licznik =1;
		
		for (int j = 0; j<tab1.length-1;j++){
			for (int i=0; i<tab1.length - licznik; i++){
				l = tab[i];
			
				if ( l > tab[i+1]){
					tab[i] = tab[i+1];
					tab[i+1] = l;
				}
			}
			licznik++;
		}
		return tab1;
	}

}

