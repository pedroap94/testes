import java.util.Date;

public class Cliente {
    private String cliente;
    private Login login;
    private Date createDate;
    private Boolean aptidao;

    public Cliente(String cliente) {
        this.cliente = cliente;
    }

    public Cliente(String cliente, Login login, Date createDate, Boolean aptidao) {
        this.cliente = cliente;
        this.login = login;
        this.createDate = createDate;
        this.aptidao = aptidao;
    }

    public Cliente(){}

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getAptidao() {
        return aptidao;
    }

    public void setAptidao(Boolean aptidao) {
        this.aptidao = aptidao;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "cliente='" + cliente + '\'' +
                '}';
    }
}
