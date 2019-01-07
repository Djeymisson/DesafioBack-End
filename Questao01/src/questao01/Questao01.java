package questao01;

import java.util.Scanner;

public class Questao01 {
    
    static int contador(String digitos, int i) {   
        if (i == 0 || i == 1) 
            return 1;
        
        int total = 0;
        
        if (digitos.charAt(i - 1) > '0') 
            total = contador(digitos, i - 1); 

        if (digitos.charAt(i - 2) == '1' || 
           (digitos.charAt(i - 2) == '2' && digitos.charAt(i - 1) <= '6')){
            total += contador(digitos, i - 2); 
        }
        
        return total; 
    } 

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String digitos;
        
        digitos = ler.nextLine();
        int i = digitos.length()-1; 
        
        System.out.printf("%d\n", contador(digitos, i)); 
    } 
    
}
