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
public abstract class PoligonoA {
    //En las clases abstractas podemos tener metodos abstractos y concretos
    
    /**
     * Función que permite regresar el área de un´polígono.
     * Es del tipo abstracto, necesita ser implementada por otra clase
     * @return el área de un polígono
     */
    public abstract double area();
    
    /**
     * Función que permite regresar el perímetro de un polígono
     * Es del tipo abstracto, necesita ser implementada por otra clase
     * @return el perímetro de un polígono
     */
    public abstract double perimetro();

    /**
     * Regresa los atributos guardados en la clase abstracta PoligonoA
     * @return los atributos de la clase abstracta PoligonoA
     */
    @Override
    public String toString() {
        return "PoligonoA{" + '}';
    }
}