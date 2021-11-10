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
public class CuadrilateroC extends PoligonoC{
    private int alfa, beta;
    private float a, b, base, alt;

    /**
     * Creación del constructor vacío
     */
    public CuadrilateroC() {
    }

    /**
     * Regresamos el valor de alfa
     * @return el valor de alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Recibimos el valor de alfa
     * @param alfa como ángulo del cuadrilátero
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Regresamos el valor de beta
     * @return el valor de beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Recibimos el valor de beta
     * @param beta como ángulo del cuadrilátero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Regresamos el valor de a
     * @return el valor de a
     */
    public float getA() {
        return a;
    }

    /**
     * Recibimos el valor de a
     * @param a como lado del cuadrilátero
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Regresamos el valor de b
     * @return el valor de b
     */
    public float getB() {
        return b;
    }

    /**
     * Recibimos el valor de b
     * @param b como lado de cuadrilátero
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Regresamos el valor de la base
     * @return el valor de la base
     */
    public float getBase() {
        return base;
    }

    /**
     * Recibimos el valor de la base del cuadrilátero
     * @param base como valor de la base del cuadrilátero
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Regresamos el valor de la altura
     * @return el valor de la altura
     */
    public float getAlt() {
        return alt;
    }

    /**
     * Recibimos el valor de la altura del cuadrilátero
     * @param alt como valor de la altura del cuadrilátero
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }

    /**
     * Regresa los atributos guardados en la clase CuadrilateroC
     * @return los atributos de la clase CuadrilateroC
     */
    @Override
    public String toString() {
        return "CuadrilateroC{" + "alfa=" + alfa + ", beta=" + beta 
                + ", a=" + a + ", b=" + b + ", base=" + base 
                + ", alt=" + alt + '}';
    }
}