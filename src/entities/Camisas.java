public class Camisas {
    private int id;
    private String descricao;
    private String tamanho;
    private Funcionarios funcionarios;
    private Pedidos pedidos;
    private Tipos tipos;

    public Camisas(){
    }

    public Camisas(int id, String descricao, String tamanho, Funcionarios funcionarios, Pedidos pedidos, Tipos tipos){
        this.id = id;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.funcionarios = funcionarios;
        this.pedidos = pedidos;
        this.tipos = tipos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public Tipos getTipos() {
        return tipos;
    }

    public void setTipos(Tipos tipos) {
        this.tipos = tipos;
    }

    
}
