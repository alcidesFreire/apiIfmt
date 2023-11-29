package ifmt.cba.vo;

public class produto {
    private int id;
    private String nome;
    private float custoUnidade;
    private int kcal;
    private int estoque;
    private int grupoAlimentar;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getCustoUnidade() {
        return custoUnidade;
    }
    public void setCustoUnidade(float custoUnidade) {
        this.custoUnidade = custoUnidade;
    }
    public int getKcal() {
        return kcal;
    }
    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getGrupoAlimentar() {
        return grupoAlimentar;
    }
    public void setGrupoAlimentar(int grupoAlimentar) {
        this.grupoAlimentar = grupoAlimentar;
    }

    
}
