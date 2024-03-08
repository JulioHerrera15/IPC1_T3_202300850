package tarea3;

public class Hexagono extends Figura{
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    void display() {
        System.out.println("Hexágono:");
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
   
    
    
    
}
