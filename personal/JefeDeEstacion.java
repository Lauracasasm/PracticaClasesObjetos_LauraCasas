package ferroviaria.personal;

import java.time.LocalDate;

public class JefeDeEstacion {

   private String nombre;
   private String DNI;
   private LocalDate fechaNombramiento;
   public static int jefesDeEstacion;

   public JefeDeEstacion(String nombre, String DNI, LocalDate fechaNombramiento) {
      this.nombre = nombre;
      this.DNI = DNI;
      this.fechaNombramiento = fechaNombramiento;
      jefesDeEstacion++;
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

   public LocalDate getFechaNombramiento() {
      return fechaNombramiento;
   }

   public void setFechaNombramiento(LocalDate fechaNombramiento) {
      this.fechaNombramiento = fechaNombramiento;
   }


   @Override
   public String toString() {

      return  "\nDatos del jefe de estación: " + getNombre() +
              "\n---------------------------------"+
              "\n* Nombre= " + nombre +
              "\n* DNI= " + DNI +
              "\n* Fecha de nacimiento= " + fechaNombramiento
              ;
   }

   public void imprimirDatos(){
      System.out.println(toString());
   }
}
