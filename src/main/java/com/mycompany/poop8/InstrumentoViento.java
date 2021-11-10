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
public class InstrumentoViento extends Object implements InstrumentoMusical{
    
    /**
     * Función tocar() implementada desde la clase Interfáz InstrumentoMusical
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    /**
     * Función afinar() implementada desde la clase Interfáz InstrumentoMusical
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    /**
     * Función tipoInstrumento() implementada desde la clase Interfáz InstrumentoMusical
     * @return una cadena de texto: "Instrumento de viento"
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    /**
     * Regresa los atributos guardados en la clase InstrumentoViento
     * @return los atributos de la clase InstrumentoViento
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}