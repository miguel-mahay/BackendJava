package practicaPokemon;

public abstract class Pokemon {

    private int numPokedex;
    private String tipo;
    private String nombre;
    private double peso;
    private String sexo;
    private int temporada;

    public Pokemon(int numPokedex, String tipo, String nombre, double peso, String sexo, int temporada) {
        this.numPokedex = numPokedex;
        this.tipo =  tipo;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }


    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();


    public void showMessage(){
        System.out.println("# Pokedex: "+numPokedex+"\n"+
                "Tipo: "+tipo+"\n"+
                "Nombre: "+nombre+"\n"+
                "Peso: "+peso+"\n"+
                "Sexo: "+sexo+"\n"+
                "Temporada: "+temporada+"\n\n");
    }
}
