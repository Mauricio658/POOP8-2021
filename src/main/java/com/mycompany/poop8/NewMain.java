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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("####### Objetos se comportan como sus "
                + "superclases #######");
        PoligonoC poligonoC = new PoligonoC();
        //Poligono puede comportarse como su superclase Object
        Object objeto = poligonoC;
        System.out.println(poligonoC);
        System.out.println(objeto);
        poligonoC = (PoligonoC) objeto; //Se requiere hacer un casteo
        
        System.out.println(poligonoC);
        poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        System.out.println(poligonoC.toString());
        
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
        //poli.setBase(5.5f); //El método no esta definido en el PoligonoC
                              //por lo tanto no puede sobreescribirlo
        
        System.out.println("\n####### Clases Abstractas #######");
        //PoligonoA polA = new PoligonoA(); 
        //No se puede crear objetos de clases abstractas
        PoligonoA polA = new TrianguloA();
        System.out.println(polA);
        polA = new CuadrilateroA();
        System.out.println(polA);
        
        System.out.println("\n####### Interfaces #######");
        //Podemos crear una referencia a interfaz
        InstrumentoMusical instrumento;
        //Pero no podemos implementarla
        //InstrumentoMusical instru = new InstrumentoMusical();
        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println("\n####### Prueba Meses #######");
        //Se puede acceder a las variables de la interfaz sin crear instancias
        System.out.println("El mes "+ Meses.DOS +" corresponda a "+ 
                Meses.NOMBRES_MESES[Meses.DOS]);
        System.out.println("El mes "+ Meses.OCHO +" corresponda a "+ 
                Meses.NOMBRES_MESES[Meses.OCHO]);
        System.out.println("El mes "+ Meses.SEIS +" corresponda a "+ 
                Meses.NOMBRES_MESES[Meses.SEIS]);
        System.out.println("El mes "+ Meses.ONCE +" corresponda a "+ 
                Meses.NOMBRES_MESES[Meses.ONCE]);
        System.out.println("El mes "+ Meses.NUEVE +" corresponda a "+ 
                Meses.NOMBRES_MESES[Meses.NUEVE]);
        //También se puede con un contador
        System.out.println("\n#### Usando contador####");
        for(int i=1; i<=12; i++){
            System.out.println("El mes "+ i +" corresponda a "+ 
                Meses.NOMBRES_MESES[i]);
        }
    }  
}