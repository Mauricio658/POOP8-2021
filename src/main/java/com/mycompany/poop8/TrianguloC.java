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
public class TrianguloC extends PoligonoC{
    private int alfa, beta, gamma;
    private float a, b, c, base, alt;
    
    /**
     * Creación del contructor vacío
     */
    public TrianguloC() {
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
     * @param alfa como ángulo del triángulo
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
     * @param beta como ángulo del triángulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * Regresamos el valor de gamma
     * @return el valor de gamma
     */
    public int getGamma() {
        return gamma;
    }
    
    /**
     * Recibimos el valor de gamma
     * @param gamma como ángulo del triángulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
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
     * @param a como lado del triángulo
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
     * @param b como lado del triángulo
     */
    public void setB(float b) {
        this.b = b;
    }
    
    /**
     * Regresamos el valor de c
     * @return el valor de c
     */
    public float getC() {
        return c;
    }
    
    /**
     * Recibimos el valor de c
     * @param c como lado del triángulo
     */
    public void setC(float c) {
        this.c = c;
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
     * @param base como valor de la base del triángulo
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
     * @param alt como valor de la altura del triangulo
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }

    /**
     * Regresa los atributos guardados en la clase TrianguloC
     * @return los atributos de la clase TrianguloC
     */
    @Override
    public String toString() {
        return "TrianguloC{" + "alfa=" + alfa + ", beta=" + beta 
                + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" 
                + c + ", base=" + base + ", alt=" + alt + '}';
    }
}