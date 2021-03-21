package io.github.robertocajueiro.estudojava2;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 7;
		String resultado = "";
		if (nota >= 7) {
			resultado = "Aprovado!";
		}else if (nota > 4){
			resultado = "Recuperação";
		}else {
			resultado = "Reprovado";
		}
		System.out.println(resultado);
	}

}
