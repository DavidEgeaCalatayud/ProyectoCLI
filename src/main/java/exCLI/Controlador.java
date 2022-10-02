/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exCLI;

/**
 *
 * @author Toilo
 */
public class Controlador {
    private Vista vista;
    private Modelo modelo;
    
   public Controlador() {
        
        vista  = new Vista(this);
    }
    public static void main(String[] args) {
        args = new String[]{"-s", "8"};
        //args = new String[]{"-p", "6"};
        Controlador ctrl = new Controlador();
        ctrl.inciarVista(args);
        System.out.println( modelo.setTempAgua());
}

    private void inciarVista(String[] args) {
        
        vista.temp(args);
    }
    void subirTemp(int temp){
    int temp =modelo.getTempAgua();
    
    }
    
}

 

