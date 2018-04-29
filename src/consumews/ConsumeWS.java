/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumews;

import Model.Playa;
import API.ClienteForAPI; 
import Model.Utilidades;
import com.google.gson.Gson;

/**
 *
 * @author timon
 */
public class ConsumeWS{

    public static void main(String[] args) {
        

        
        NewJerseyClient njc = new NewJerseyClient();
        //Número de elementos existentes. 
        int count = Integer.parseInt(njc.countREST()); 
        
        System.out.println(njc.findAll(String.class));
        
        
        Gson gson = new Gson(); 
        
        Playa[] playa = new Playa[count];
        //Pasar a String todas las provincias. 
        for (int i = 1; i < count; i++){
            String[] playaJson = new String[count];  
            playaJson[i] = njc.find(String.class, String.valueOf(i)); 
             
            playa[i] = gson.fromJson(playaJson[i], Playa.class);

        }
        //String playaJson = njc.find(String.class, "25");
        
        
        System.out.println(playa[1].getLatitud());
        //int id, String name, String comunidad, String provincia, double latitud, double longitud, String isla
        Playa playaToPost = new Playa(43,"Playa de pepito", "Comunidad pepito", "Provincia pepito", 40.4167, -3.70325, "Isla Pepito");
                
        
       //Does work. 
       njc.create(playaToPost);
       //njc.edit(playaToPost, "3");
       //PRUEBAS CON LA PLAYA METIDA EN LA BASE DE DATOS. 
        //System.out.println("PRUEBA PLAYA PEPITO:" + playaToPost.getIsla());
        //System.out.println(njc.countREST());
        //System.out.println(njc.findAll(String.class));
       
       //This works
       //Quitamos la playa pepito mediante su id. 
        //njc.remove("43");
        //System.out.println(njc.countREST());
        //System.out.println(njc.findAll(String.class));
        
        
  
        
        //ClienteForAPI weather = new ClienteForAPI(String.valueOf(playaToPost.getLatitud()), String.valueOf(playaToPost.getLongitud())); 
        //System.out.println("RESPUESTA:\n" + weather.respuesta().toString());
        
        
        //PROBANDO
        
        //Utilidades util = new Utilidades();
        //Playa[] playas = util.devolverPlayas(); 
        
        //System.out.println("PRUEBA: " + playas[5]);
        //System.out.println(util.getCount());
        //System.out.println(util.getNjc().find(String.class, ""));
        
        //njc.remove("27"); 
        
    }


}
