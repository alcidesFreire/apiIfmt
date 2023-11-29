package ifmt.cba.vo;

public class preparoProduto {

    private int codigo;
    private produto produto;
    private tipoPreparo tipoPreparo;
    private String tempoPreparo;
    private double valorPreparo;

    // Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public produto getProduto() {
        return produto;
    }

    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public tipoPreparo getTipoPreparo() {
        return tipoPreparo;
    }

    public void setTipoPreparo(tipoPreparo tipoPreparo) {
        this.tipoPreparo = tipoPreparo;
    }

    public String getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public double getValorPreparo() {
        return valorPreparo;
    }

    public void setValorPreparo(double valorPreparo) {
        this.valorPreparo = valorPreparo;
    }
}
