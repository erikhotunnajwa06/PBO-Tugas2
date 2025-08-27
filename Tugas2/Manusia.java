/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Manusia {

    /**
     * @return the Makan
     */
    protected String getMakan() {
        return Makan;
    }

    /**
     * @param Makan the Makan to set
     */
    protected void setMakan(String Makan) {
        this.Makan = Makan;
    }

    /**
     * @return the Belajar
     */
    protected String getBelajar() {
        return Belajar;
    }

    /**
     * @param Belajar the Belajar to set
     */
    protected void setBelajar(String Belajar) {
        this.Belajar = Belajar;
    }

    private String Makan;  
    private String Belajar;

    public Manusia(String Makan, String Belajar) {
        this.Makan = Makan;
        this.Belajar = Belajar;
    }
   
}
