public class Silvestre extends Pato implements Cuackable, Swimable, Flyable {




    @Override
    public void doCuack() {

        System.out.println("Haciendo Cuack desde Silvestre");
    }

    @Override
    public void doFly() {

        System.out.println("Volando desde silvestre");

    }

    @Override
    public void doSwim() {

        System.out.println("Nadando desde Silvestre");

    }

}
