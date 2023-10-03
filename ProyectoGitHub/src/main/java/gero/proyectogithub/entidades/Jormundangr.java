
package gero.proyectogithub.entidades;

public class Jormundangr {
    
    private String nombre;
    private String animal;
    private Integer vida;
    private Integer fuerza;
    private Integer resistencia;

    public Jormundangr() {
    }

    public Jormundangr(String nombre, String animal, Integer vida, Integer fuerza, Integer resistencia) {
        this.nombre = nombre;
        this.animal = animal;
        this.vida = vida;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Jormundangr{" + "nombre=" + nombre + ", animal=" + animal + ", vida=" + vida + ", fuerza=" + fuerza + ", resistencia=" + resistencia + '}';
    }
    
}
