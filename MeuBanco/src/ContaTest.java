import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void depositar() {
        var obj = new Conta(100);
        obj.depositar(50);
        assertEquals(150.0, obj.getSaldo());
    }

    @Test
    void sacar() {
        var obj = new Conta(100);
        obj.sacar(20);
        assertEquals(80, obj.getSaldo());
    }

    @Test
    void getSaldo() {
    }
}