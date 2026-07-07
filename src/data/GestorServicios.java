package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    public List<ServicioTuristico> obtenerServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        // Rutas gastronómicas
        servicios.add(new RutaGastronomica(
                "Ruta Gastronómica de Puerto Varas",
                4,
                5));

        servicios.add(new RutaGastronomica(
                "Ruta de Frutillar",
                3,
                4));

        // Paseos lacustres
        servicios.add(new PaseoLacustre(
                "Paseo por el Lago Llanquihue",
                2,
                "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Navegación Lago Todos los Santos",
                3,
                "Lancha"));

        // Excursiones culturales
        servicios.add(new ExcursionCultural(
                "Museo Pablo Fierro",
                2,
                "Museo Pablo Fierro"));

        servicios.add(new ExcursionCultural(
                "Fuerte San Antonio",
                3,
                "Fuerte San Antonio"));

        return servicios;
    }

    public void mostrarServicios() {

        for (ServicioTuristico servicio : obtenerServicios()) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}