/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicos;

/**
 *
 * @author Mulay
 */
public class EjerciciosBasicos {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuántas bellotas haya
        if (finDeSemana){
            return true;
        }
        //si llega aqui esque no es fin de semana
        if (numBellotas >= 40 && numBellotas <=60){
            return true;
        }
        return false;
    }
    
 /**
  * Si	la	velocidad	es	de	60	o	menos,	el	resultado	es	0	
  * Si	la	velocidad	es	de	entre	61	y	80	inclusive,	el	resultado	es	1
  * Si	la	velocidad	es	81	o	más,	el	resultado	es	2
  */
   public int multa(int velocidad, boolean birthday){
       //si es tucumpleaños, le resta 5 a la velocidad
       if (birthday){
           velocidad = velocidad - 5; //velocidad -= 5; (estos dos codigos hacen lo mismo)        
       }
       if (velocidad<= 60){
           return 0; //no hay multa
       } 
       //si va entre 61 y 80
       if (velocidad > 60 && velocidad <= 80){
           return 1; //multa pequeña
           
       }
       //en cualquier otro valor que tuviera velocidad devolvemos la multa grande
       return 2;
   }
    
   /**
    * 
    * @param numero el numero a evaluar si es o no vanidoso. Es vanidoso si
    * es multiplo de 11 o uno más de un múltiplo de 11
    * @return 
    */
   
    public boolean muyVanidoso(int numero){
        if (numero % 11 == 0){ //si la división da como resto cero 
            return true;
        }
        return false;
    }
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicos ejercicio = new EjerciciosBasicos();
        ejercicio.fiestaArdillas(0, true);
        System.out.println("Ejercicio 01 Ardillas:");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        //
        System.out.println("Ejercicio 02 Multa:");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
        
        
        System.out.println("Ejercicio 03 muy Vanidoso:");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
    }  
}
