import java.math.BigDecimal;
import java.util.Map;

public class Orcamento {
    private String nome;
    private BigDecimal valorTotal;
    private String descricao;
    private Map<String, BigDecimal> valorMinMax;

    public Orcamento(String nome, BigDecimal valorTotal, String descricao, Map<String, BigDecimal> valorMinMax) {
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.descricao = descricao;
        this.valorMinMax = valorMinMax;
    }

    public Orcamento(String nome, BigDecimal valorTotal, String descricao) {
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Map<String, BigDecimal> getValorMinMax() {
        return valorMinMax;
    }

    public void setValorMinMax(Map<String, BigDecimal> valorMinMax) {
        this.valorMinMax = valorMinMax;
    }
}
