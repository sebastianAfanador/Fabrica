package fabrica;


public class SuperHeroe extends Persona{
    private String superPoder;
    private Boolean viveAun;

    public SuperHeroe(String nombre, String apellido, String superPoder, Boolean viveAun){
        super(nombre, apellido);
        this.superPoder = superPoder;
        this.viveAun = viveAun;
    }

    
}
