package main.padroescriacao.singleton;

public class Login {

    private Login() {};
    private static Login instance = new Login();
    public static Login getInstance() {
        return instance;
    }

    private String tokenLogin;
    public String getTokenLogin() {
        return tokenLogin;
    }

    public void setTokenLogin(String tokenLogin) {
        this.tokenLogin = tokenLogin;
    }
}

