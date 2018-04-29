/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Timón
 */
public class Playa {
    private int id;
    private String name;
    private String comunidad;
    private String provincia;
    private double latitud;
    private double longitud;
    private String isla;

    public Playa(){}
    
    public Playa(int id, String name, String comunidad, String provincia, double latitud, double longitud, String isla) {
        this.id = id;
        this.name = name;
        this.comunidad = comunidad;
        this.provincia = provincia;
        this.latitud = latitud;
        this.longitud = longitud;
        this.isla = isla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getIsla() {
        return isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
    }
    
    @Override
    public String toString(){
        if(this.isla == null){
            return "Nombre: " + this.name +  "\nComunidad: " + this.comunidad + "\nProvincia: "
                + this.provincia;
        }else{
            return "Nombre: " + this.name + "\nIsla: " + this.isla +  "\nComunidad: " + this.comunidad + "\nProvincia: "
                + this.provincia;
        }
    }
}
