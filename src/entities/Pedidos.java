import java.time.LocalDate;

public class Pedidos {
    private int codigo;
    private LocalDate data_pedido;
    private int protocolo;
    private double valor;
    private Parcelas parcelas;
    private Clientes clientes;
    private Camisas camisas;


    public Pedidos(){
    }

    public Pedidos(int codigo, int protocolo, double valor, LocalDate data_pedido, Parcelas parcelas, Clientes clientes, Camisas camisas) {
        this.codigo = codigo;
        this.protocolo = protocolo;
        this.valor = valor;
        this.data_pedido = data_pedido;
        this.parcelas = parcelas;
        this.clientes = clientes;
        this.camisas = camisas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(LocalDate data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Parcelas getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcelas parcelas) {
        this.parcelas = parcelas;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Camisas getCamisas() {
        return camisas;
    }

    public void setCamisas(Camisas camisas) {
        this.camisas = camisas;
    }

    

}
