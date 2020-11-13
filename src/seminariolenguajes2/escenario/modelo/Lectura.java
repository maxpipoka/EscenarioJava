package seminariolenguajes2.escenario.modelo;

public class Lectura {
    private int idLectura;
    private Sensor sensor;
    private String fecha;
    private String hora;
    private String valor;

    void setIdLectura(int idLectura){
        this.idLectura = idLectura;    
    }

    void setSensor(Sensor sensor){
        this.sensor = sensor;    
    }

    void setFecha(String fecha){
        this.fecha = fecha;    
    }
    
    void setHora(String hora){
        this.hora = hora;    
    }
    
    void setValor(String valor){
        this.valor = valor;    
    }

    int getIdLectura(){
        return this.idLectura;
    }

    Sensor getSensor(){
        return this.sensor;
    }

    String getFecha(){
        return this.fecha;
    }

    String getHora(){
        return this.hora;
    }

    String getValor(){
        return this.valor;
    }

}
