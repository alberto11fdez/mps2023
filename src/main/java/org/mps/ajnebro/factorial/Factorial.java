package org.mps.ajnebro.factorial;

/*
 *Class providing a method to compute the factorial of an integer number
 *
 * git checkout para cambiarte de una rama a otra
 * git commit -am "..."
 * git merge nombreRama -> mezcla las ramas
 */
public class Factorial {
    public int compute(int value){
        int result;
        if(value < 0){
            throw new NegativeValueException("This value " + value + " es negativo");
        }else if((value == 0) || (value==1)){
            result = 1;
        }else {
            result = value * compute(value-1);
        }

        return result;
    }

}
