package ferroviaria.maquinaria;

import ferroviaria.personal.Mecanico;

public class Locomotora {

    String matricula;
    double potencia;
    int antiguedad;
    Mecanico mecanico;
    public static int locomotora;

    public Locomotora(String matricula, double potencia, int antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
        locomotora++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return  "\nDatos de la locomotora: " +
                "\n---------------------------------"+
                "\n* Matrícula= " + matricula +
                "\n* Potencia= " + potencia +
                "\n* Año de fabricacion= " + antiguedad +
                "\n* Mecanico= " + mecanico.getNombre() + ", telf: " + mecanico.getTelefono() + ", especiaidad: " + mecanico.getEspecialidad();

    }

    public void imprimirDatos(){
        System.out.println(toString());
    }
}
