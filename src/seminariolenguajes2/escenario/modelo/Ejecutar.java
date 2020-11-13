package seminariolenguajes2.escenario.modelo;

public class Ejecutar {
    public static void main(String[] args) {
        Dispositivo nDispositivo = new Dispositivo();
        int idAAsignar = 1;
        nDispositivo.setIdDispositivo(idAAsignar);

        System.out.println("El id del dispositivo es: " + nDispositivo.getIdDispositivo());
    }
}
