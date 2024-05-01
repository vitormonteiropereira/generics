


public class Main {
    public static void main(String[] args) {

        GenericExample<Carro> lista = new GenericExample<>();

        lista.add(new Mercedes("Benz", 2020));
        lista.add(new BMW("X1", 2018));
        lista.add(new Audi("A3", 2015));

        lista.lerLista();








        }

}