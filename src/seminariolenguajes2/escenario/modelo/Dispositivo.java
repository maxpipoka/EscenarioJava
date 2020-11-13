package seminariolenguajes2.escenario.modelo;


public class Dispositivo {
    
    private int idDispositivo;
    private String descripcion;
    private float latitud;
    private float longitud;

    void setIdDispositivo(int id){
        this.idDispositivo = id;
    }
    
    void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    void setLatitud(float latitud){
        this.latitud = latitud;
    }
    
    void setLongitud(float longitud){
        this.longitud = longitud;
    }
    
    int getIdDispositivo(){
        return this.idDispositivo;
    }
    
    String getDescripcion(){
        return this.descripcion;
    }
    
    float getlatitud(){
        return this.latitud;
    }
    
    float getlongitud(){
        return this.longitud;
    }
    
}
