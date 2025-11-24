package entities;

public class PedidosCamisas {
    private int qtd;
    private Pedidos pedidos;
    private Camisas camisas;
    
    public PedidosCamisas(){
    }
    
    public PedidosCamisas(int qtd, Pedidos pedidos, Camisas camisas) {
        this.qtd = qtd;
        this.pedidos = pedidos;
        this.camisas = camisas;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public Camisas getCamisas() {
        return camisas;
    }

    public void setCamisas(Camisas camisas) {
        this.camisas = camisas;
    }

    

}
