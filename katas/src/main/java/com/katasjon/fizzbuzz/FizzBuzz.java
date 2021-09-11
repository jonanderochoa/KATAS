package com.katasjon.fizzbuzz;

/**
 * @project miKata
 *
 * Escribir un programa que muestre en pantalla los números del 1 al 100,
 * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos
 * de 5 por “buzz” y los múltiplos de ambos, es decir, los múltiplos de
 * 3 y 5 (o de 15), por la palabra “fizzbuzz”.
 *
 * @author: jonan on 06/09/2021
 */
public class FizzBuzz {

    public void fizBuzzList() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public String fizzBuzz(int numero) {
        if(numero % 15 == 0){
            return "FizzBuzz";
        } else if(numero % 3 == 0){
            return "Fizz";
        } else if(numero % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(numero);
    }
}
