package practicaPokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander(int numPokedex, String tipo, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, tipo, nombre, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usó placaje\n");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander usó arañazo\n");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usó mordisco\n");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usó puño fuego\n");
    }

    @Override
    public void atacerLanzallamas() {
        System.out.println("Charmander usó lanzallamas\n");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó ascuas\n");
    }
}
