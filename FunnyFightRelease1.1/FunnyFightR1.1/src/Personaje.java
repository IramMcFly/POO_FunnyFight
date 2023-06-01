
public abstract class Personaje implements PlayerControls {

    private double potenciador;
    private String personaje;
    private Pokemon pokemon;

    public Personaje(){
        this.potenciador = 0;
        this.personaje = "-----";
    }

    public double getPotenciador() {
        return potenciador;
    }

    public void setPotenciador(double potenciador) {
        this.potenciador = potenciador;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public int atacar() {
        double ataqueD = ((Math.random() * 15) + 10) * potenciador;
        int ataqueP = (int) ataqueD; //transformamos el double a int para bajarselo a la barra del p2
        //que por motivos que aun desconocemos solo trabaja con ints 
        //a parte de que esa horrible cosa no deja cambiar su diseno
        return ataqueP;
    }

    @Override
    public int curar() {
        return 15;
    }

}
