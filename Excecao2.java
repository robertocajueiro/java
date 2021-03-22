package io.github.robertocajueiro.estudojava2;

public class Excecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int[] v = {0,2,4,8};
		
		
		
		
		try {
			System.out.println(i/v[0]);
			System.out.println(v[4]);
		}catch(ArithmeticException e){
			System.out.println("Erro de indice invalido de vetor");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Erro de indice invalido de vetor");
		}catch(Exception e){
			System.out.println("Erro generico, não previsto acima");
		}finally {
			System.out.println("Sempre passa aqui");
		}
	}

}
