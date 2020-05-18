package com.guillermo.dam.appGato;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.guillermo.dam.model.AnalisisPeso;


public class AppTest 
{
	static AnalisisPeso nuevoAnalisis;//declaracion clase
    @BeforeAll
    public static void setup() {
    	nuevoAnalisis=new AnalisisPeso(6,2,10);//inicializacion de la clase
    }
    /*
     * Prueba para comprobar que la operacion del analisis de peso funciona y se guarda en la variable de clase.
     */
    @Test
    public void funcionamientoAnalisis()
    {
    	nuevoAnalisis.realizarAnalisis(nuevoAnalisis.getPeso(), nuevoAnalisis.getVolumen());
        assertEquals(3,nuevoAnalisis.getPesoIdeal());
        
    }
}
