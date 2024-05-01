public class Audi extends Carro{
    public String modelo;
    public int ano;

    public Audi(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
