public class Main{

    public static void main(String args[]){

        Retangulo retangulo = new Retangulo("azul", 10, 15);
        System.out.println("Area do retangulo: " + retangulo.area());

        Quadrado quadrado = new Quadrado("vermelho", 10);
        System.out.println("Area do quadrado: " + quadrado.area());

        Triangulo triangulo = new Triangulo("amarelo", 5, 25);
        System.out.println("Area do triangulo: " + triangulo.area());

        Circulo circulo = new Circulo("verde", 5);
        System.out.println("Area do circulo: " + circulo.area() + "\nDiametro do circulo: " + circulo.getDiametro());
        
    }

}