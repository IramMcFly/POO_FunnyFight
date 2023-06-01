public class Pokemon extends Poketipo{
    
    private int vida;
    private String nombre;

    
    public Pokemon(int vida, String nombre,String tipo,int special) {
        super(special,tipo);
        this.vida = vida;
        this.nombre = nombre;
        
    }
    public Pokemon() {  
        super(0, "");
    }
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida += vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
}
