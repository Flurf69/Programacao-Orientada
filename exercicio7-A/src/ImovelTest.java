import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {
    @Test
    public void caso1(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            Imovel imovel = new Imovel();
            imovel.setArea(-5);
        });

        String esperado = "Area invalida";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }
    @Test
    public void caso2(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        imovel.setFinalidade(finalidade);
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);

        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            imovel.calcularIptu();
        });
        String esperado = "Area invalida";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);

    }
    @Test
    public void caso3(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(250);

        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            imovel.calcularIptu();
        });
        String esperado = "Finalidade invalida";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }

    @Test
    public void caso4(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        imovel.setFinalidade(finalidade);
        imovel.setArea(400);

        Throwable exception = assertThrows(IllegalArgumentException.class, () ->{
            imovel.calcularIptu();
        });
        String esperado = "Bairro invalido";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }
    @Test
    public void caso5(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(400);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(400,imovel.calcularIptu());
    }
    @Test
    public void caso6(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(80);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(500,imovel.calcularIptu());
    }
    @Test
    public void caso7(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(250);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(1000,imovel.calcularIptu());
    }
    @Test
    public void caso8(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.COMERCIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(500);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(1275,imovel.calcularIptu());
    }
    @Test
    public void caso9(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.INDUSTRIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(2000);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(1000,imovel.calcularIptu());
    }
    @Test
    public void caso10(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.INDUSTRIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(1.0);
        imovel.setBairro(bairro);
        imovel.setArea(3000);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(1650,imovel.calcularIptu(),0.009);
    }
    @Test
    public void caso11(){
        Imovel imovel = new Imovel();
        Bairro bairro = new Bairro();
        Finalidade finalidade = Finalidade.RESIDENCIAL;
        bairro.setNome("centro");
        bairro.setCoeficienteIptu(2.5);
        imovel.setBairro(bairro);
        imovel.setArea(500);
        imovel.setFinalidade(finalidade);

        imovel.calcularIptu();

        assertEquals(1250,imovel.calcularIptu());
    }
}