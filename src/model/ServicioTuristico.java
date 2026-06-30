package model;

public class ServicioTuristico {

    // Atributos
    private String nombre;
    private int duracionHoras;

    // Constructor
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDuración: " + duracionHoras + " horas";
    }
}