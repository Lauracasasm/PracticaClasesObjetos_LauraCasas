package ferroviaria.maquinaria;

import ferroviaria.personal.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

public class Tren {

    Locomotora locomotora;
    ArrayList<Vagon> vagones = new ArrayList<>(5);
    Maquinista maquinista;
    public static int trenes;

    public static Scanner scanner = new Scanner(System.in);

    public Tren(Locomotora locomotora) {
        this.locomotora = locomotora;
        trenes++;
    }

    public void añadirVagon() {
        if (vagones.size() == 5) {
            System.out.println("No se puede añadir mas vagones");
        } else {
            Vagon nuevoVagon = new Vagon((trenes + vagones.size()), cargaMaxima(), mercancia());
            scanner.nextLine();
            vagones.add(nuevoVagon);
        }
    }

    private double cargaMaxima() {
        System.out.println("Indica la carga máxima: ");
        double cargaMaxima = scanner.nextDouble();
        scanner.nextLine();
        return cargaMaxima;
    }

    private Mercancia mercancia() {

        do {
            System.out.println("""
                    Tipo de mercancia:
                     1.PERECEDERA,
                     2.NO_PERECEDERA,
                     3.FRAGIL,
                     4.PELIGROSA,
                     5.DIMENSIONAL\s""");

            switch (scanner.nextInt()) {
                case 1:
                    return Mercancia.PERECEDERA;
                case 2:
                    return Mercancia.NO_PERECEDERA;
                case 3:
                    return Mercancia.FRAGIL;
                case 4:
                    return Mercancia.PELIGROSA;
                case 5:
                    return Mercancia.DIMENSIONAL;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (true);
    }

    public void eliminarVagon() {
        vagones.remove(vagones.size() - 1);
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public int getVagones() {
        return vagones.size();
    }

    public void setVagones(ArrayList<Vagon> vagones) {
        this.vagones = vagones;
    }

    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {

        return  "\nDatos del tren: "+
                "\n---------------------------------"+
                "\n" + locomotora +
                "\n" + vagones
                ;
    }

    public void imprimirDatos() {
        System.out.println(toString());
    }
}
