package ferroviaria.maquinaria;

class Vagon {

    int identificador;
    double cargaMax;
    double cargaActual;
    public static int vagones;
    Mercancia mercancia;

    public Vagon(int identificador, double cargaMax, Mercancia mercancia) {
        this.identificador = identificador;
        this.cargaMax = cargaMax;
        this.cargaActual = 0;
        this.mercancia = mercancia;
        vagones++;
    }


    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public Mercancia getMercancia() {
        return mercancia;
    }

    public void setMercancia(Mercancia mercancia) {
        this.mercancia = mercancia;
    }



    @Override
    public String toString() {
        return "\nVagon: " +
                " identificador= " + identificador +
                " cargaMax= " + cargaMax +
                " cargaActual= " + cargaActual +
                " mercancia= " + mercancia;
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}
