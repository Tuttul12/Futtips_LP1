package entities;

public class Parcelas {
    private int codigo;
    private int qtd;
    private double valor;
    private Pedidos pedidos;
    
    public Parcelas(){
    }

    public Parcelas(int codigo, int qtd, double valor, Pedidos pedidos) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.valor = valor;
        this.pedidos = pedidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd() {
        return qtd;
    }


    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedidos getPedidos(){
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos){
        this.pedidos = pedidos;
    }

}
