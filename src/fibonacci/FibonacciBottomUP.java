/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Development
 */
public class FibonacciBottomUP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                   

                    System.out.println(fiboBottomUp(6) );

                   
    }
    //muestra el valor segun el numero que se escrtiba en fiboBottomUP
     public static int fiboBottomUp(int n) {
                    if (n < 0) throw new IllegalArgumentException(" el valor de  n: " + n  + " .");

                    int a = 0;
                    int b = 1;
                    int c = 0;
                    for (int i = 0; i < n; i++) {
                        a = b;
                        b = c;
                        c = a + b;
                    }
                    return c;
                }
}
