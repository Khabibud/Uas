/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author GCC
 */
public class Smartphone implements PPNCalculator {
    private String vendor;
    private String tipe;
    private double harga;

    // Constructor
    public Smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // penerapan methode
    
    public Smartphone() {
    }

    public double calculateTotalPrice() {
        double totalHarga;
        if (harga > 4500000) {
            totalHarga = harga + (harga * 0.05); // PPN 5%
        } else if (harga >= 4200000 && harga <= 4500000) {
            totalHarga = harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            totalHarga = harga + (harga * 0.01); // PPN 1%
        } else {
            totalHarga = harga; // No PPN
        }
        return totalHarga;
    }

    // Getters dan setters

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Main method
    public static void main(String[] args) {
        // Create objects for each smartphone
        Smartphone samsung = new Smartphone("Samsung", "A 51", 5000000.00);
        Smartphone oppo = new Smartphone("Oppo", "Reno 5", 4400000.00);
        Smartphone xiaomi = new Smartphone("Xiaomi", "A1", 4100000.00);

        // Menghitung dan mencetak hp dengan tambahan PPN
        System.out.println("Vendor: " + samsung.getVendor() + ", Tipe: " + samsung.getTipe() + ", Total Harga: " + samsung.calculateTotalPrice());
        System.out.println("Vendor: " + oppo.getVendor() + ", Tipe: " + oppo.getTipe() + ", Total Harga: " + oppo.calculateTotalPrice());
        System.out.println("Vendor: " + xiaomi.getVendor() + ", Tipe: " + xiaomi.getTipe() + ", Total Harga: " + xiaomi.calculateTotalPrice());
    }
}



