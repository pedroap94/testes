public class Socio {
    private String cpf;
    private boolean responsavelReceita;
    private String nome;


    public Socio(String cpf, boolean responsavelReceita, String nome) {
        this.cpf = cpf;
        this.responsavelReceita = responsavelReceita;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isResponsavelReceita() {
        return responsavelReceita;
    }

    public String getNome() {
        return nome;
    }
}
