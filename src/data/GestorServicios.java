package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    public ServicioTuristico[] obtenerServicios() {

        ServicioTuristico[] servicios = new ServicioTuristico[6];

        // Rutas gastronómicas
        servicios[0] = new RutaGastronomica(
                "Ruta Gastronómica de Puerto Varas",
                4,
                5);

        servicios[1] = new RutaGastronomica(
                "Ruta de Frutillar",
                3,
                4);

        // Paseos lacustres
        servicios[2] = new PaseoLacustre(
                "Paseo por el Lago Llanquihue",
                2,
                "Catamarán");

        servicios[3] = new PaseoLacustre(
                "Navegación Lago Todos los Santos",
                3,
                "Lancha");

        // Excursiones culturales
        servicios[4] = new ExcursionCultural(
                "Museo Pablo Fierro",
                2,
                "Museo Pablo Fierro");

        servicios[5] = new ExcursionCultural(
                "Fuerte San Antonio",
                3,
                "Fuerte San Antonio");

        return servicios;
    }
}