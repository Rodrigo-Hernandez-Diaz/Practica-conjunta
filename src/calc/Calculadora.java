/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {

    private int ans;

    public Calculadora() {
        this.ans = 0;
    }

    public int suma(int a, int b) {
        ans = a + b;
        return ans;
    }
    public int restar(int a, int b) {
        ans = a - b;
        return ans;
    }
    public double dividir(int a, int b) {
        if (b == 0) {
        throw new ArithmeticException("No se puede dividir por cero");
        }
    return a / b;
    }

    

}
