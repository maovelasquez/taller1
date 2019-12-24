import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Hierro ironPato = new Hierro();
        Madera hoodPato = new Madera();
        Silvestre donalPato = new Silvestre();
        Hule base20Pato = new Hule();
        Hierro donPato = new Hierro();
        Silvestre mrPato = new Silvestre();
        Hule condePatula = new Hule();
        Madera superPato = new Madera();
        Hierro cyborPato = new Hierro();
        Hule darkPato = new Hule();
        Silvestre pikachuPato = new Silvestre();
        TheWarnerDuck donald = new TheWarnerDuck();
        ComicDuck lucas = new TheWarnerDuck();

        lucas.doFly();
        lucas.doBoom();


        ArrayList<Pato> allDuck = new ArrayList<>();
        allDuck.add(ironPato);
        allDuck.add(hoodPato);
        allDuck.add(donalPato);
        allDuck.add(base20Pato);
        allDuck.add(donPato);
        allDuck.add(mrPato);
        allDuck.add(condePatula);
        allDuck.add(superPato);
        allDuck.add(cyborPato);
        allDuck.add(darkPato);
        allDuck.add(pikachuPato);
        allDuck.add(donald);

        for (Pato pato:allDuck){
            System.out.println(pato);
        }

        ArrayList<Swimable> swimDuck = new ArrayList<>();
        swimDuck.add(hoodPato);
        swimDuck.add(donalPato);
        swimDuck.add(base20Pato);
        swimDuck.add(mrPato);
        swimDuck.add(condePatula);
        swimDuck.add(superPato);
        swimDuck.add(darkPato);
        swimDuck.add(pikachuPato);

        for (Swimable pato:swimDuck){
            pato.doSwim();
        }

        ArrayList<Cuackable> cuackables = new ArrayList<>();
        cuackables.add(donalPato);
        cuackables.add(base20Pato);
        cuackables.add(mrPato);
        cuackables.add(condePatula);
        cuackables.add(darkPato);
        cuackables.add(pikachuPato);

        for (Cuackable pato:cuackables) {
            pato.doCuack();
        }
            ArrayList<Flyable> flyables = new ArrayList<>();
            flyables.add(donalPato);
            flyables.add(mrPato);
            flyables.add(pikachuPato);
            flyables.add(donald);

            for(Flyable pato:flyables){
                pato.doFly();
            }

        }
    }

