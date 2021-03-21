package io.github.robertocajueiro.estudojava2;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {0,2,4,6,8};
		
		//Modo convencional
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i +"]=" + x[i]);
		}
		
		for (int elemento : x) {
			System.out.println("Elemento = " + elemento);
		}

	}

}
