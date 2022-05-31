package practicaHarry;

public class Practice {

    public static void main(String[] args) {

        Wizard w1 = new Wizard("Harry", "Potter", "Male", "Grynffindor", "Dementor", "Stag");
        Wizard w2 = new Wizard("Newton", "Scamander", "Male", "Hufflepuff", "Oficce job", "Kelpie");
        Wizard w3 = new Wizard("Minerva", "McGonagall", "Female", "Grynffindor", "Lord Voldemort", "Cat");
        Wizard w4 = new Wizard("Hannah", "Abbott", "Female", "Hufflepuff", "Lord Voldermort", "Non-corporeal");
        Wizard w5 = new Wizard("Albus", "Dumbledore", "Male", "Grynffindor", "Ariana death", "Phoenix");



        w1.showInformation();
        w2.showInformation();
        w3.showInformation();
        w4.showInformation();
        w5.showInformation();


    }
}
