package ferroviaria;

import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;

import ferroviaria.personal.Especialidad;
import ferroviaria.personal.JefeDeEstacion;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecanico;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Maquinista maquinista1 = new Maquinista("Luis","11111111L", 40500,"1");
        maquinista1.imprimirDatos();
        Maquinista maquinista2 = new Maquinista("Maria","22222222M", 50500,"2");
        maquinista2.imprimirDatos();

        Mecanico mecanico1 = new Mecanico("Eduardo", "666 00 00 00", Especialidad.ELECTRICIDAD);
        mecanico1.imprimirDatos();
        Mecanico mecanico2 = new Mecanico("Javier", "666 11 11 11", Especialidad.FRENOS);
        mecanico2.imprimirDatos();
        Mecanico mecanico3 = new Mecanico("Isabel", "666 22 22 22", Especialidad.MOTOR);
        mecanico3.imprimirDatos();
        Mecanico mecanico4 = new Mecanico("Ana", "666 33 33 33", Especialidad.HIDRAULICA);
        mecanico4.imprimirDatos();

        JefeDeEstacion jefeDeEstacion1 = new JefeDeEstacion("Marta", "44444444M", LocalDate.of(1960,03,30));
        jefeDeEstacion1.imprimirDatos();
        JefeDeEstacion jefeDeEstacion2 = new JefeDeEstacion("Juan", "33333333J", LocalDate.of(1976,12,15));
        jefeDeEstacion2.imprimirDatos();

        Locomotora locomotora = new Locomotora("X1234", 550, 1990, mecanico1);
        locomotora.imprimirDatos();

        Tren tren = new Tren(locomotora);
        System.out.println("\n Añadimos 5 vagones e intentamos añadir uno más");
        System.out.println("************************************************");
        tren.añadirVagon();
        tren.añadirVagon();
        tren.añadirVagon();
        tren.añadirVagon();
        tren.añadirVagon();
        tren.añadirVagon();
        System.out.println("Numero de vagones: " + tren.getVagones());
        tren.setMaquinista(maquinista2);
        tren.imprimirDatos();

        System.out.println("Quitamos un vagón");
        System.out.println("*********************");
        tren.eliminarVagon();
        System.out.println("Numero de vagones: " + tren.getVagones());
        tren.imprimirDatos();

        //Probamos a añadir dos vagones mas despues de eliminar uno, solo nos deberia dejar añadir uno mas.
        tren.añadirVagon();
        tren.añadirVagon();
        System.out.println("Numero de vagones: " + tren.getVagones());
        tren.imprimirDatos();

        System.out.println("\n \uD83D\uDE89 Personal y maquinaria de la estacion \uD83D\uDE89");
        System.out.println("\nPersonal:");
        System.out.println( JefeDeEstacion.jefesDeEstacion +  " jefes de estación.");
        System.out.println( Maquinista.maquinistas +  " maquinistas.");
        System.out.println( Mecanico.mecanicos +  " mecanicos.");

        System.out.println("\nMaquinaria:");
        System.out.println( Locomotora.locomotora +  " locomotoras.");
        System.out.println( Tren.trenes +  " trenes.");
    }
}
