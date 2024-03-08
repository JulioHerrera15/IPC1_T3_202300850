package tarea3;

import java.util.ArrayList;
import java.util.List;

abstract class Figura {
    abstract double calcularArea();

    void display() {
        System.out.println("Figura");
        
    }

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Triangulo((Math.random()*9) + 1, (Math.random()*9) + 1));
        figuras.add(new Hexagono((Math.random()*9) + 1));
        figuras.add(new Cuadrado((Math.random()*9) + 1));

        for (Figura figura : figuras) {
            figura.display();
            System.out.println("El área de la figura es: " + String.format("%.2f", figura.calcularArea()) + "\n");
        }
    }


    
    
}
