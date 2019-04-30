/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Gabriel Valenzuela
 */
public class ValidaEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     String email="gabriel.valenzuela001@gmail.com";   
     
    System.out.println(checkEmail (email));
        
  
    }
    
    
    
    public static boolean checkEmail (String email) {

    // Establecer el patron
    Pattern p = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");

    // Asociar el string al patron
    Matcher m = p.matcher(email);

   // Comprobar si encaja
   return m.matches();

}
    
}
