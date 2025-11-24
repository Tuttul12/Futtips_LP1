import entities.Pessoas;
import java.time.LocalDate;


public final class Clientes extends Pessoas{
    private LocalDate dataCadastro;
    private float telefone;

    public Clientes (){
        super();
    }

    public Clientes(LocalDate dataCadastro, float telefone) {
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }
}
