public class Hule extends Pato implements Cuackable, Swimable{
    @Override
    public void doCuack() {

        System.out.println("Cuack desde un pato de Hule");
    }

    @Override
    public void doSwim() {

        System.out.println("Nadando desde un pato de Hule");
    }
}