package br.pucminas.Veiculo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * TestsVeiculo
 */
public class TestsVeiculo {

    @Test
    public void testaMovimentoGasolina() {
        Veiculo vei = new Veiculo(true);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        vei.anda(30);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        assertEquals(47, vei.getTanqueCombustivel(),0.00001);
    }

    @Test
    public void testaMovimentoAlcool() {
        Veiculo vei = new Veiculo(false);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        vei.anda(30);
        vei.getTanqueCombustivel();
        vei.getDistanciaPercorrida();
        assertEquals(45.716, vei.getTanqueCombustivel(),0.00001);
    }

}