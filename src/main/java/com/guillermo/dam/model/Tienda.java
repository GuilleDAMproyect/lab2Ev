package com.guillermo.dam.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
private List<String> menu;
private List<String> recomendaciones;
//private List<Carrito> historial; Lo comento por que no tengo creada la clase carrito

public Tienda() {
	
	this.menu = new ArrayList<String>();
	this.recomendaciones = new ArrayList<String>();
	//this.historial = new ArryList<Carrito>();
}
/*
 * getter y setters
 */
public List<String> getMenu() {
	return menu;
}
public void setMenu(List<String> menu) {
	this.menu = menu;
}
public List<String> getRecomendaciones() {
	return recomendaciones;
}
public void setRecomendaciones(List<String> recomendaciones) {
	this.recomendaciones = recomendaciones;
}
/*public List<Carrito> getHistorial() {
	return historial;
}
public void setHistorial(List<Carrito> historial) {
	this.historial = historial;
}*/


}
