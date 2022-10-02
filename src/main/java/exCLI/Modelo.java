/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exCLI;

/**
 *
 * @author Toilo
 */
public class Modelo {

    private int tempAgua = (int) (Math.random()*100);
   
    private int subirTemp = tempAgua;
    private int bajarTemp = tempAgua;
    public Modelo(int tempAgua) {
        this.tempAgua = tempAgua;
    }

    public int getTempAgua() {
        return tempAgua;
    }

    public void setTempAgua(int tempAgua) {
        this.tempAgua = tempAgua;
    }

    public int getSubirTemp() {
        return subirTemp;
    }

    public void setSubirTemp(int subirTemp) {
        this.subirTemp = subirTemp;
    }

    public int getBajarTemp() {
        return bajarTemp;
    }

    public void setBajarTemp(int bajarTemp) {
        this.bajarTemp = bajarTemp;
    }
    

}
    
   
