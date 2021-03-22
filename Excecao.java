package io.github.robertocajueiro.estudojava2;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int x = 0;
		int r = 0;
		
		
		try {
			r = i/x;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
		System.out.println("r = " + r);

	}

}
