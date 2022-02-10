package ferroviaria.personal;

public class Mecanico {

    private String nombre;
    private String telefono;
    private Especialidad especialidad;//
    public static int mecanicos;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        mecanicos++;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return  "\nDatos del mecanico: " + getNombre() +
                "\n---------------------------------"+
                "\n* Nombre= " + nombre +
                "\n* Teléfono= " + telefono +
                "\n* Especialidad= " + especialidad
                ;
    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}
