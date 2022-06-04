package practicaPokemon;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(int numPokedex, String tipo, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, tipo, nombre, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usó placaje\n");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu usó arañazo\n");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usó mordisco\n");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usó impactrueno\n");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usó puño trueno\n");
    }

    @Override
    public void atacarRayo() {  System.out.println("Pikachu usó rayo\n");  }

    @Override
    public void atacarRayoCarga() {  System.out.println("Pikachu usó rayo carga\n");  }
}
