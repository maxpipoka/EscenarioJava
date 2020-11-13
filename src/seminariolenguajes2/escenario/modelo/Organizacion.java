package seminariolenguajes2.escenario.modelo;

public class Organizacion {
    private int idOrganizacion;
    private String cuit;
    private String razonSocial;

    void setIdOrganizacion(int idOrganizacion){
        this.idOrganizacion = idOrganizacion;
    }
    
    void setCuit(String cuit){
        this.cuit = cuit;
    }
    
    void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    int getIdOrganizacion(){
        return this.idOrganizacion;
    }

    String getCuit(){
        return this.cuit;
    }

    String getRazonSocial(){
        return this.razonSocial;
    }
}
