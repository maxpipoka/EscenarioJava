package seminariolenguajes2.escenario.modelo;

public class TipoSensor {
    private int idTipoSensor;
    private String descripcion;
    private String unidadMedida;
    
    void setIdTipoSensor(int idTipoSensor){
        this.idTipoSensor = idTipoSensor;
    }
    
    void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    void setUnidadMedida(String unidadMedida){
        this.unidadMedida = unidadMedida;
    }

    int getIdTipoSensor(){
        return this.idTipoSensor;
    }

    String getDescripcion(){
        return this.descripcion;
    }

    String getUnidadMedida(){
        return this.unidadMedida;
    }
}
