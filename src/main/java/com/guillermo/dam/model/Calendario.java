package com.guillermo.dam.model;

public class Calendario {
private int dia;
private int mes;
private int anno;
private Ejercicios nuevoEjercicio;
/*
 * metodos de clase
 */
public void annadirEjercicio() {
	
}
public void verPlanificacion() {
	
}
/*
 * constructor
 */
public Calendario(int dia, int mes, int anno, Ejercicios nuevoEjercicio) {
	super();
	this.dia = dia;
	this.mes = mes;
	this.anno = anno;
	this.nuevoEjercicio = nuevoEjercicio;
}
/*
 * getter y setters
 */
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getAnno() {
	return anno;
}
public void setAnno(int anno) {
	this.anno = anno;
}
public Ejercicios getNuevoEjercicio() {
	return nuevoEjercicio;
}
public void setNuevoEjercicio(Ejercicios nuevoEjercicio) {
	this.nuevoEjercicio = nuevoEjercicio;
}
}
