package ifmt.cba.vo;

public class cardapio {

    private int codigo;
    private String nome;
    private String descricao;
    private preparoProduto preparoProduto;



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public preparoProduto getPreparoProduto() {
        return preparoProduto;
    }

    public void setPreparoProduto(preparoProduto preparoProduto) {
        this.preparoProduto = preparoProduto;
    }
}

