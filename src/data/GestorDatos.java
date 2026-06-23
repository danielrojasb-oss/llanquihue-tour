package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                try {
                    String[] datos = linea.split(";");

                    if (datos.length < 3) {
                        System.out.println("Línea incompleta, se omite: " + linea);
                        continue;
                    }

                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2].trim());

                    Tour tour = new Tour(nombre, tipo, precio);
                    tours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Precio inválido en línea: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return tours;
    }
}