
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    public void teste01(){
        Funcionario funcionario = new Funcionario(null,850);
        FaixaIrfp esperado = FaixaIrfp.PRIMEIRA;
        FaixaIrfp resultado = funcionario.identificarFaixaIrfp();
        assertEquals(esperado, resultado);
    }

    @Test
    public void teste02(){
        Funcionario funcionario = new Funcionario("Eduardo",850);
        double esperado = 0.00;
        double resultado = funcionario.calcularIrfp();
        assertEquals(esperado, resultado);
    }

    @Test
    public void teste03(){
        Funcionario funcionario = new Funcionario(null,1903.98);
        FaixaIrfp esperado = FaixaIrfp.PRIMEIRA;
        FaixaIrfp resultado = funcionario.identificarFaixaIrfp();
        assertEquals(esperado, resultado);
    }

    @Test
    public void teste04(){
        Funcionario funcionario = new Funcionario(null,1903.98);
        double esperado = 0.00;
        double resultado = funcionario.calcularIrfp();
        assertEquals(esperado, resultado);
    }

    @Test
    public void teste05(){
        Funcionario funcionario = new Funcionario(null,1903.99);
        FaixaIrfp esperado = FaixaIrfp.SEGUNDA;
        FaixaIrfp resultado = funcionario.identificarFaixaIrfp();
        assertEquals(esperado, resultado);
    }

}