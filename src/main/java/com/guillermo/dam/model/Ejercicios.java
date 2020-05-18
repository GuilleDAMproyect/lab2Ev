package com.guillermo.dam.model;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {
private int nivel;
private int duracion;
private String entorno;
private String tipo;
private List<Ejercicios> ejerciciosCompletados;
private Calendario calendario;
/*
 * metodos de clase
 */
public void visualizarEjercicio() {
	
}
public void crearPlanificacion() {
	
}
/*
 * Constructor
 */
public Ejercicios(int nivel, int duracion, String entorno, String tipo) {
	
	this.nivel = nivel;
	this.duracion = duracion;
	this.entorno = entorno;
	this.tipo = tipo;
	this.ejerciciosCompletados=new ArrayList<Ejercicios>();
	this.calendario= new Calendario(1,1,1,null);
}
/*
 * Getters y setters
 */
public int getNivel() {
	return nivel;
}

public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public String getEntorno() {
	return entorno;
}
public void setEntorno(String entorno) {
	this.entorno = entorno;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public List<Ejercicios> getEjerciciosCompletados() {
	return ejerciciosCompletados;
}
public void setEjerciciosCompletados(List<Ejercicios> ejerciciosCompletados) {
	this.ejerciciosCompletados = ejerciciosCompletados;
}

}
