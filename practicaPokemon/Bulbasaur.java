package practicaPokemon;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(int numPokedex, String tipo, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, tipo, nombre, peso, sexo, temporada);
    }


    @Override
    protected void atacarPlacaje() {  System.out.println("Bolbasaur usó placaje\n");  }

    @Override
    protected void atacarAraniazo() {  System.out.println("Bolbasaur usó arañazo\n");  }

    @Override
    protected void atacarMordisco() {  System.out.println("Bolbasaur usó mordisco\n");  }

    @Override
    public void atacarDrenaje() {  System.out.println("Bolbasaur usó drenaje\n");  }

    @Override
    public void atacarParalizar() {  System.out.println("Bolbasaur usó paralizar\n");  }

    @Override
    public void atacarHojaAfilada() {  System.out.println("Bulbasaur usó hoja afilada\n");  }

    @Override
    public void atacarLatigoCepa() {  System.out.println("Bulbasaur usó latigo cepa\n");  }
}
