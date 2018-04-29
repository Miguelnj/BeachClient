/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ClienteForAPI {

    /**
     * @param args the command line arguments
     */
    private String lon;
    private String lat; 
   
    public ClienteForAPI(String lat, String lon) {
        this.lon = lon;
        this.lat = lat; 
    }
    
    public BeachWeather respuesta(){
        
        String json = "";
        
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&APPID=25bd853dd4ec637a1e0e4a3f382e3e16");
            URLConnection conn = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
                json += inputLine;
            in.close();
                
        } catch (MalformedURLException ex) {
            System.out.println("Something went wrong creating the URL");
        } catch (IOException ex) {
            System.out.println("Exception during the access to the URL");
        }
        
        
        
        Gson gson = new Gson();
        BeachWeather weather = new Gson().fromJson(json, BeachWeather.class);
        //System.out.println(weather);
        return weather; 
    }
}
