package com.guillermo.dam.model;

import java.util.Date;

public class Fotos {
private Date fecha;
private String filtro;
private String redSocial;
/*
 * metodos de clase
 */
public void compartir() {
	
}
public void editar() {
	
}
/*
 * constructor
 */
public Fotos(Date fecha, String filtro, String redSocial) {
	super();
	this.fecha = fecha;
	this.filtro = filtro;
	this.redSocial = redSocial;
}
/*
 * getter y setters
 */
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getFiltro() {
	return filtro;
}
public void setFiltro(String filtro) {
	this.filtro = filtro;
}
public String getRedSocial() {
	return redSocial;
}
public void setRedSocial(String redSocial) {
	this.redSocial = redSocial;
}
}
