package ferroviaria.personal;

public class Maquinista {

    private String nombre;
    private String DNI;
    private double sueldo;
    private String rango;
    public static int maquinistas;

    public Maquinista(String nombre, String DNI, double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
        maquinistas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return  "\nDatos del maquinista: " + getNombre() +
                "\n---------------------------------"+
                "\n* Nombre= " + nombre +
                "\n* DNI= " + DNI +
                "\n* Sueldo= " + sueldo +
                "\n* Rango= " + rango
                ;
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}

