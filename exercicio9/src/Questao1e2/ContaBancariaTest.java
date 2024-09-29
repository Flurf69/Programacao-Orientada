package Questao1e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    public void caso1(){
        ContaEspecial c = new ContaEspecial();

        c.setLimiteCredito(100);
        c.depositar(20);
        c.sacar(50);

        assertEquals(-30, c.getSaldo());
    }
    @Test
    public void caso2(){
        ContaEspecial c = new ContaEspecial();

        c.setLimiteCredito(100);
        c.depositar(20);
        c.sacar(120);

        assertEquals(-100, c.getSaldo());
    }
    @Test
    public void caso3(){
        ContaEspecial c = new ContaEspecial();

        c.setLimiteCredito(100);
        c.depositar(20);

        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            c.sacar(120.01);
        });
        String esperado = "Valor insuficiente";
        assertEquals(esperado, exception.getMessage());
    }
}