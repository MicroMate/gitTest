package com.micromate.hello_egit;

import java.util.Arrays;


public class Hello_eGit {
	 
	
	public static void main (String args[]){ 
	
		System.out.println("Hello eGIT");
		
		//dodane w nowym branchu
		NowyBranch nowyBranch;
		nowyBranch = new NowyBranch();
		nowyBranch.wyswietl();
		
		int[] tabi = {3,4,2,8,1};
		tabi = nowyBranch.segreguj(tabi);
		
		System.out.println(Arrays.toString(tabi));
	 }		
}
