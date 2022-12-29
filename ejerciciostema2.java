package com.example;

public class ejerciciostema2 {

    public static void main(String[] args) {

        double precio = precioGetprecio();
        System.out.println("El precio del producto es: " + precio + "€ IVA incluido");


    }
    public static double precioGetprecio() {

        double precio = 100;
        return precio + 21;
    }
}
