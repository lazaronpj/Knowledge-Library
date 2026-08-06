package br.com.lazaro.bibliotecasaber.util;

public class ValidadorSenha {

	public void validarSenha(char[] senha) {
		
		if(auxValidarSenha(senha)) {
			System.out.println("Senha aceita!");
		}else {
			System.out.println("Senha negada!");
		}
	}
	
	public boolean auxValidarSenha(char[] senha) {
		boolean letraMaiuscula = false;
		boolean letraMinuscula = false;
		boolean caractereEspecial = false;
		boolean digito = false;
		
		if(senha == null || senha.length < 8) {
			return false;
		}
		
		for (char c :senha) {
			if(Character.isUpperCase(c)) {
				letraMaiuscula = true;
			} else if(Character.isLowerCase(c)) {
				letraMinuscula = true;
			} else if(Character.isDigit(c)) {
				digito = true;
			} else if(!Character.isLetterOrDigit(c)) {
				caractereEspecial = true;
			}
			
		    if (letraMaiuscula && letraMinuscula && caractereEspecial && digito) {
                break;
            }
		}
		
		return letraMaiuscula && letraMinuscula && caractereEspecial && digito;
	}

}
