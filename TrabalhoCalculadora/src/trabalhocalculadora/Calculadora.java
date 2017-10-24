/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocalculadora;

/**
 *
 * @author Notebook
 */
public class Calculadora {
    
    public double somar (double valor1, double valor2){
    double resultado;
    resultado = valor1 + valor2;
    return resultado;   
}
    
    public double menos (double valor1, double valor2){
    double resultado;
    resultado = valor1 - valor2;
    return resultado;   
}
    
    public double dividir (double valor1, double valor2){
    double resultado;
    resultado = valor1 / valor2;
    return resultado;   
}
    
    public double vezes (double valor1, double valor2){
    double resultado;
    resultado = valor1 * valor2;
    return resultado;   
}
}