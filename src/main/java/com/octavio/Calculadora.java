package com.octavio;

public class Calculadora {
	private int numero1;
	private int numero2;
	private char operacion;
	private float resultado;
	
	
	
	public int getNumero1() {
		return numero1;
	}



	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}



	public char getOperacion() {
		return operacion;
	}



	public void setOperacion(char operacion) {
		this.operacion = operacion;
	}



	public float getResultado() {
		return resultado;
	}



	public void setResultado(float resultado) {
		this.resultado = resultado;
	}



	public void Calcular()
	{
		switch (operacion) {
		case '+':
			resultado = numero1 + numero2;
		break;
		case '-':
			resultado = numero1 - numero2;
		break;
		case '*':
			resultado = numero1 * numero2;
		break;
		case '/':
			resultado = (float)numero1 / numero2;
		break;
		default:
			break;
		
		
		
		}
	}
}
