package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Paseo Lacustre ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Tipo de embarcación: " + tipoEmbarcacion);
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de embarcación: " + tipoEmbarcacion;
    }
}