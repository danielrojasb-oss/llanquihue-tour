package ui;

import data.GestorDatos;
import data.GestorServicios;
import model.ServicioTuristico;
import model.Tour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        System.out.println("=== TODOS LOS TOURS ===");
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n=== TOURS CULTURALES ===");
        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("Cultural")) {
                System.out.println(tour);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== BÚSQUEDA POR NOMBRE ===");
        System.out.print("Ingresa el nombre del tour a buscar: ");
        String busqueda = scanner.nextLine();

        boolean encontrado = false;
        for (Tour tour : tours) {
            if (tour.getNombre().equalsIgnoreCase(busqueda)) {
                System.out.println("Tour encontrado: " + tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún tour con ese nombre.");
        }

        System.out.println("\n=== SERVICIOS TURÍSTICOS (POLIMORFISMO) ===");

        GestorServicios gestorServicios = new GestorServicios();

        List<ServicioTuristico> servicios = gestorServicios.obtenerServicios();

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }

        scanner.close();
    }
}