/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop8;

/**
 *
 * @author Daniel Medrano,Angel Jimenez,Ariana Alvarez,Melisa Matias
 */
public class Flauta extends InstrumentoViento{

    /**
     * Creación de un constructor vacío
     */
    public Flauta() {
    }
    //Podemos sobreescribir los metodos
    
    /**
     * Implementación de la función tipoInstrumento que extiende desde la clase InstrumentoViento hasta la clase interfáz InstrumentoMusical
     * @return 
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    /**
     * Regresa los atributos guardados en la clase Flauta
     * @return los atributos de la clase Flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}