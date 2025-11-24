import entities.Pessoas;

public final class Funcionarios extends Pessoas{
    private  double salario;
    private Cargos cargos;

    public Funcionarios(){
        super();
    }

    public Funcionarios (double salario, Cargos cargos){
        this.salario = salario;
        this.cargos = cargos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargos getCargos(){
        return cargos;
    }
    public void setCargos(Cargos cargos){
        this.cargos=cargos;
    }

}
