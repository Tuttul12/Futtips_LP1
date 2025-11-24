public class Tipos {
    private int id;
    private String modelo;
    private String fabricante;

    public Tipos(){
    }

    public Tipos(int id, String modelo, String fabricante){
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
