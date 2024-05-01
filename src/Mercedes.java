public class Mercedes extends Carro{

    public String modelo;

    public int ano;


    public Mercedes(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
