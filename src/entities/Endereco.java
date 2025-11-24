import entities.Pessoas;

public class Endereco {
    private String rua;
    private int nr;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private Pessoas pessoas;

    public Endereco(){
    }

    public Endereco(int id, String rua, int nr, Pessoas pessoas){
        this.rua=rua;
        this.nr=nr;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.pessoas = pessoas;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pessoas getPessoas(){
        return pessoas;
    }

    public void setPessoas(Pessoas pessoas){
        this.pessoas = pessoas;
    }
}
