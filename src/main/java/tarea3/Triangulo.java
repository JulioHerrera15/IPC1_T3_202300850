package tarea3;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double d, double base, double altura) {
        super(d);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    void display() {
        System.out.println("Triángulo:");
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
}
