/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decbincliente;

/**
 *
 * @author Gustavo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient cliente = new NewJerseyClient();
        System.out.println("El binario de 4 es: "+ cliente.Conversion("4"));
        System.out.println("El factorial de 4 es: " +factorial(4));
    }

    private static long factorial(int num) {
        org.factorial.Factorial_Service service = new org.factorial.Factorial_Service();
        org.factorial.Factorial port = service.getFactorialPort();
        return port.factorial(num);
    }
    
}
