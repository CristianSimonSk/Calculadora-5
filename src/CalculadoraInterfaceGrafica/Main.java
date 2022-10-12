/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraInterfaceGrafica;


public class Main {
    
    public double calc(double x, String op, double y){
        
        Divisao div = new Divisao();
        Multiplicacao mult = new Multiplicacao();
        Soma soma = new Soma();
        Subtracao subt = new Subtracao();
        double resultado = 0;
  
        switch(op){
          case "*" :
            resultado = mult.multiplicar(x,y); 
            break;

          case "/":
            resultado = div.dividir(x,y); 
            break;

          case "+":
            resultado = soma.somar(x,y); 
            break;

          case "-":
            resultado = subt.subtrair(x,y); 
            break;

        }
        return resultado;
    }
    
}
