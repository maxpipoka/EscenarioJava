package seminariolenguajes2.escenario.modelo;

public class Sensor {
    private int idSensor;
    private TipoSensor tipoSensor;

    void setIdSensor(int idSensor){
        this.idSensor = idSensor;
    }

    void setTipoSensor(TipoSensor tipoSensor){
        this.tipoSensor = tipoSensor;
    }

    int getIdSensor(){
        return this.idSensor;
    }

    TipoSensor getTipoSensor(){
        return this.tipoSensor;
    }
}
