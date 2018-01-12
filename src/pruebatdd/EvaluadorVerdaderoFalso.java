/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatdd;

import static java.lang.System.err;

/**
 *
 * @author Byron
 */
public class EvaluadorVerdaderoFalso {
    public boolean evalua(String expresion){
       err.println("expresion = " + expresion);        
       expresion = expresion.trim();
       if(expresion.startsWith("(")){
            expresion = expresion.substring(1).trim();
        }
       if(expresion.endsWith(")")){
            expresion = expresion.substring(0, expresion.length()-1).trim();
        }
       String[] partes = expresion.split("y");
       if(partes.length > 1){
           boolean parcial = true;
           for(String parte:partes){
               parcial = parcial && evalua(parte);
           }
           return parcial;
       }
        return "verdadero".equals(expresion);
    }
            
    
}
