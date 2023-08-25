public class Circulo extends Figura{

    private double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    public double area(){
        return Math.PI * getDiametro();
    }

    public double getDiametro(){
        return this.raio * this.raio;
    }

    public String toString(){
        String str = this.getCor() + "\n" + this.raio;
        return str;
    }

}
