package com.guillermo.dam.model;

public class AnalisisPeso {
	/*
	 * He tenido que cambiar peso y volumen de double a int.
	 * El cambio se debe que al hacer las prubas con junit  assertequals me daba error "compare floating-point numbers"
	 */
private int peso;
private int volumen;
private int edad;
private double pesoIdeal;

public void realizarAnalisis(double peso, double volumen) {
	this.pesoIdeal=peso/volumen;
}
/*
 * constructor
 */
public AnalisisPeso(int peso, int volumen, int edad) {
	this.peso = peso;
	this.volumen = volumen;
	this.edad = edad;
}
/*
 * getter y setters
 */
public double getPeso() {
	return peso;
}

public void setPeso(int peso) {
	this.peso = peso;
}
public double getVolumen() {
	return volumen;
}
public void setVolumen(int volumen) {
	this.volumen = volumen;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getPesoIdeal() {
	return pesoIdeal;
}
public void setPesoIdeal(double pesoIdeal) {
	this.pesoIdeal = pesoIdeal;
}

}
