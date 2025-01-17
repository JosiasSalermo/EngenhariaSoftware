import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    void saldoInicial(){
        var obj = new Conta(100);
        assertEquals(100.0, obj.getSaldo());
    }

    @Test
    void depositar() {
        var obj = new Conta(100);
        obj.depositar(50);
        assertEquals(150.0, obj.getSaldo());
    }

    @Test
    void sacar() throws Exception {
        var obj = new Conta(100);
        obj.sacar(20);
        assertEquals(80, obj.getSaldo());
    }

    @Test
    void getSaldo() {
        var obj = new Conta(1);
        assertEquals(1, obj.getSaldo());

    }

    @Test
    void sacarAcimaSaldo(){
        var obj = new Conta(100);
        assertThrows(Exception.class, () -> obj.sacar(100.01));
    }
}