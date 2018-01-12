/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Byron D
 */

public class PruebaTddTest {
    
    @Test
    public void testTrue() {
        EvaluadorVerdaderoFalso evaluador = new EvaluadorVerdaderoFalso();
        assert evaluador.evalua("verdadero") == true;
    }
    
    @Test
    public void testFalse() {
        EvaluadorVerdaderoFalso evaluador = new EvaluadorVerdaderoFalso();
        assert evaluador.evalua("falso") == false;
    }
    
    @Test
    public void testParentesis() {
        EvaluadorVerdaderoFalso evaluador = new EvaluadorVerdaderoFalso();
        assert evaluador.evalua("(verdadero)") == true;        
        assert evaluador.evalua("(false)") == false;
    }

    @Test
    public void testEspacios() {
        EvaluadorVerdaderoFalso evaluador = new EvaluadorVerdaderoFalso();
        assert evaluador.evalua(" verdadero  ");
        assert !evaluador.evalua(" falso    ");
        assert evaluador.evalua(" ( verdadero   )     ");
        assert !evaluador.evalua(" ( falso   )     ");
    }

    @Test
    public void testY(){
        EvaluadorVerdaderoFalso evaluador = new EvaluadorVerdaderoFalso();
        assert !evaluador.evalua("verdadero y falso");
        assert evaluador.evalua("verdadero y verdadero");
    }

    
}
