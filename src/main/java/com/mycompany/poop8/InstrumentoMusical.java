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
public interface InstrumentoMusical {
    //Por defecto todos los metodos definidos dentro de una interfaz 
    //son publicos y abstractos
    
    /**
     * Función tocar() dentro de la clase de tipo Interfaz
     * Para acceder a ella debe ser llamada desde otra clase
     */
    void tocar();
    
    /**
     * Función afinar() dentro de la clase de tipo Interfaz
     * Para acceder a ella debe ser llamada desde otra clase
     */
    void afinar();
    
    /**
     * Función tipoInstrumento() del tipo String dentro de la clase de tipo Interfaz
     * Para acceder a ella debe ser llamada desde otra clase
     * @return el tipo de instrumento musical
     */
    String tipoInstrumento(); 
}