package com.guillermo.dam.model;

import java.util.ArrayList;
import java.util.List;

public class Gato {
private String nombre;
private int peso;
private double nivelEjercicio;
private double pesoObjetivo;
private List<Integer> historialPeso;

/*
 * metodos de la clase
 */
public void verHistorialPeso() {
	
}
public void verTienda() {
	
}
public void hacerFoto() {
	
}
public void realizarEjercicio() {
	
}
public void analisisPeso() {
	
}
/*constructor*/
public Gato(String nombre, int peso, double nivelEjercicio, double pesoObjetivo) {
	this.nombre = nombre;
	this.peso = peso;
	this.nivelEjercicio = nivelEjercicio;
	this.pesoObjetivo = pesoObjetivo;
	this.historialPeso=new ArrayList<Integer>();
	
}
/*getters y setters*/
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public double getNivelEjercicio() {
	return nivelEjercicio;
}
public void setNivelEjercicio(double nivelEjercicio) {
	this.nivelEjercicio = nivelEjercicio;
}
public double getPesoObjetivo() {
	return pesoObjetivo;
}
public void setPesoObjetivo(double pesoObjetivo) {
	this.pesoObjetivo = pesoObjetivo;
}
}
