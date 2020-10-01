package fabrica;

import java.util.Date;

//Este es un nuevo comentario
public class Fabrica {

    private String nombre; //Este es el nombre de la fábrica
    private int numeroDeTrabajadores; //Son los trabajadores contratados
    private Date fechaDeFundacion;// La fecha en que se fundó la fábrica
    private String especialidad;// Es en lo que mejor se desempeña la fábrica
    private Boolean internacional;// Denota si la fábrica hace exportaciones o no 

    public Fabrica(
            String nombre,
            int numeroDeTrabajadores,
            Date fechaDeFundacion,
            String especialidad,
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.internacional = internacional;
    }

    /**
     * El método aumenta la cantidad de trabajadores de la fábrica en 100 y la
     * conviente en internacional
     */
    public void ampliarPlanta() {
        this.numeroDeTrabajadores += 100;
        this.internacional = true;
    }

    /**
     * Este método permite cambiar el nombre de la fábrica y su especialidad
     */
    public void reinaguracion(
            String nuevoNombre,
            String nuevaEspecialidad) {
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.numeroDeTrabajadores += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }

    public static void main(String[] args) {
        Fabrica fabricaUno = new Fabrica(
                "Colombia Maderas",
                150,
                new Date(),
                "enchapados de madera",
                false);
        Fabrica fabricaDos = new Fabrica(
                "Ropaimas",
                15,
                new Date(),
                "Ropa y accesorios",
                true);
        
        System.out.println(fabricaUno.getNombre());
        System.out.println(fabricaUno.getNumeroDeTrabajadores());
        System.out.println(fabricaUno.getInternacional());
        
        fabricaUno.ampliarPlanta();
        
        System.out.println(fabricaUno.getNombre());
        System.out.println(fabricaUno.getNumeroDeTrabajadores());
        System.out.println(fabricaUno.getInternacional());
    }
}
