package practicaPokemon;

public class EjercicioIntegrador {

    public static void main(String[] args) {

    Bulbasaur bulb1 = new Bulbasaur(1, "Planta", "Bulbasaur", 4.5, "Macho", 1);
    Charmander charm1 = new Charmander(4, "Fuego", "Charmander", 3.5, "Macho", 1);
    Squirtle squi1 = new Squirtle(7, "Agua", "Squirtle", 4, "Macho", 1);
    Pikachu pika1 = new Pikachu(25, "Electrico", "Pikachu", 3, "Macho", 1);

    squi1.showMessage();
    squi1.atacarAraniazo();
    squi1.atacarHidrobomba();

    charm1.showMessage();
    charm1.atacarAraniazo();
    charm1.atacerLanzallamas();

    bulb1.showMessage();
    bulb1.atacarAraniazo();
    bulb1.atacarDrenaje();

    pika1.showMessage();
    pika1.atacarAraniazo();
    pika1.atacarImpactrueno();


    }
}
