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
public class CuadrilateroA extends PoligonoA{
    private int alfa, beta;
    private float a, b, base, alt;

    /**
     * Creación del constructor vacío
     */
    public CuadrilateroA() {
    }

    /**
     * Creación del contructor con todos los atributos de la clase
     * @param alfa como ángulo del cuadrilátero
     * @param beta como ángulo del cuadrilátero
     * @param a como lado del cuadrilátero
     * @param b como lado del cuadrilátero
     * @param base como valor de la base del cuadrilátero
     * @param alt como valor de la altura del cuadrilátero
     */
    public CuadrilateroA(int alfa, int beta, float a, float b, float base, 
            float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }

    /**
     * Regresamos el valor alfa
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
     * @param b como lado del cuadrilátero
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
     * Recibimos el valor de la base
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
     * Recibimos el valor de la altura
     * @param alt como valor de la altura del cuadrilátero
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }
    
    /**
     * Implementación de la función area() de la clase abstracta
     * @return el valor del área del cuadrilátero
     */
    @Override
    public double area() {
        return base*alt;
    }

    /**
     * Implementación de la función perimetro() de la clase abstracta
     * @return el valor del perímetro del cuadrilátero
     */
    @Override
    public double perimetro() {
        return 2*(a+b);
    }

    /**
     * Regresa los atributos guardados en la clase CuadrilateroA
     * @return los atributos de la clase CuadrilateroA
     */
    @Override
    public String toString() {
        return "CuadrilateroA{" + "alfa=" + alfa + ", beta=" + beta + ", a=" 
                + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
}