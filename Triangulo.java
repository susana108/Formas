public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double area(){
        return this.base * this.altura / 2;
    }

    public String toString(){
        String str = this.getCor() + "\n" + this.base + "\n" + this.altura;
        return str;
    }
}
