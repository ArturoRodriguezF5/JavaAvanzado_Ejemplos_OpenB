package org.arthycode.fucntionalinterfaces;

public class FuncInterface {
    public double operar(double x, double y) {
        Operacion op = Double::sum;
        return op.calcular(x, y);
    }

    public static void main(String[] args) {
        FuncInterface f1 = new FuncInterface();
        double rpta = f1.operar(2, 3);
        System.out.println(rpta);
    }
}
