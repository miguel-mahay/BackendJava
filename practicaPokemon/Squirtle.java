package practicaPokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(int numPokedex, String tipo, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, tipo, nombre, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usó placaje\n");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle usó arañazo\n");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usó mordisco\n");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle usó hidrobomba\n");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usó burbuja\n");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usó pistola de agua\n");
    }

    @Override
    public void atacarHidropulso() {  System.out.println("Squirtle usó hidropulso\n");  }
}
