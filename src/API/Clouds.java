/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

/**
 *
 * @author Miguel
 */
class Clouds {
    private double all;

    public Clouds(double all) {
        this.all = all;
    }

    public double getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds:" + all;
    }
    
    
}
