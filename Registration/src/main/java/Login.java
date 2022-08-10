
import static com.mycompany.registration.Registration.USERNAME_LENGTH;
import static com.mycompany.registration.Registration.is_Letter;
import static com.mycompany.registration.Registration.is_Numeric;
import javax.swing.JOptionPane;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Login {
    // fields
     public static final int USERNAME_LENGTH = 8;
     public static final int PASSWORD_LENGTH = 8;
       String Firstname;
       String Secondname;
       String Username;
       String Password;
       int userChar;
       
       
       public boolean checkUserName()
       {
        
           if (Username.length() < USERNAME_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int specialCount =0;
        for (int i = 0; i < Username.length(); i++) {

            char ch = Username.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
         return (charCount >= 2 && numCount >= 1 );      
    }

    /**
     *
     * @param ch
     * @return
     */
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
        public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
           
           
      public boolean checkPasswordComplexity()
      {
            if (Password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int specialCount =0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
         return (charCount >= 2 && numCount >= 1 );      
    }
        public static  boolean is_Letter1(char ch1) {
        ch1 = Character.toUpperCase(ch1);
        return (ch1 >= 'A' && ch1 <= 'Z');
    }
        public static boolean is_Numeric1(char ch1) {

        return (ch1 >= '0' && ch1 <= '9');
      
      
      }

    private static class password {

        private static int length() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public password() {
        }
    }
     
    
   public String registerUser() {
       
       
     
         return null;
     
    }
    
    
    
    public static boolean loginUser(){
        
        
        
        
        
         return false;
        
    }
    
    
    
    public static String returnLoginStatus() {
        
        passwordLogin =JOptionPane.showInputDialog("Please enter your registered password");
            if (Password == Password){
                JOptionPane.showMessageDialog(null,"Welcome "+Firstname+" "+Secondname+", it is great to see you again" );
            }
        else {
            
            invalidPassword = JOptionPane.showInputDialog("Username or password incorrect, please try again" );
            System.exit(0);
        }
        
        
         
    }
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public class MessageTest {
    Message message = new Message();
    public MessageTest() {
    }

    
    public void testSomeMethod() 
    {
        String expected = "True";
        String actual = message.getMessage();
                
        assertEquals(expected,actual);
    }

        private void assertEquals(String expected, String actual) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    
    
    
    
}


    
        


            

        
















}