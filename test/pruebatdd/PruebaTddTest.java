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
 * @author Sercop-Admin
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

    
}
