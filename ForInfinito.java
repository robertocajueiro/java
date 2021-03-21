package io.github.robertocajueiro.estudojava2;

public class ForInfinito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;;) {
			System.out.println("i = "+ i++);
			if(i==5)
				break; // break interrompe o loop
		}
	}

}
