package test.padroescriacao.singleton;

import main.padroescriacao.singleton.Login;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void deveRetornarTokenLogin() {
        Login.getInstance().setTokenLogin("12345678900");
        assertEquals("12345678900", Login.getInstance().getTokenLogin());
    }
}
