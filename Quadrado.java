public class Quadrado extends Retangulo{

    public Quadrado(String cor, double lado){
        super(cor, lado, lado);
    }

    public String toString(){
        String str = this.getCor() + "\n" + this.getLado1() + "\n" + this.getLado2();
        return str;
    }

}
