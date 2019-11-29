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
public class FibonacciMemoize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       fibArray[0]=1;
  fibArray[1]=1;
  long preTiempo=System.currentTimeMillis();
  System.out.println("Valor Numero 50 es igual a ="+fibonacci(50));
  long postTiempo=System.currentTimeMillis();
  System.out.println("milisegundos en encontrarlo "+(postTiempo-preTiempo));
    }
   
 public static long fibArray[]=new long[51];
 
 public static long fibonacci(long n){
  long fibValor=0;
  if(n==0 ){
   return 0;
  }else if(n==1){
   return 1;
  }else if(fibArray[(int)n]!=0){
   return fibArray[(int)n];
  }else{
   fibValor=fibonacci(n-1)+fibonacci(n-2);
   fibArray[(int) n]=fibValor;
   return fibValor;
  }
 }
}
