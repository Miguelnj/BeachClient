/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.gson.Gson;
import consumews.NewJerseyClient;
import java.util.ArrayList;

/**
 *
 * @author OrlandoPadrón
 */
public class Utilidades {
    
    private final NewJerseyClient njc; 
    private final Gson gson; 
    private ArrayList<Playa> playas = new ArrayList<>(); 

    public Utilidades() {
        this.njc = new NewJerseyClient();
        this.gson = new Gson();
        findPlayas();
        
    }
    
    private void findPlayas(){
        String json = njc.findAll(String.class);
        Playa[] aux = gson.fromJson(json, Playa[].class);
        for (int i = 0; i < aux.length; i++) {
            playas.add(aux[i]);
        }
    }
    
    public ArrayList<Playa> getPlayas(){
        return playas;
    }
    
    public void add(){
        
    }
    
    public NewJerseyClient getNjc() {
        return njc;
    }

    public int getCount() {
        return Integer.parseInt(njc.countREST());
    }

    public Gson getGson() {
        return gson;
    }   
}
