public class BMW extends Carro{
    public String modelo;
    public int ano;

    public BMW(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
