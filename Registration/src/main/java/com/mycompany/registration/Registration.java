
package com.mycompany.registration;

import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JFrame;


        
public class Registration {

Scanner sc = new Scanner(System.in);
   public static final int PASSWORD_LENGTH = 8;
    
    // code attribution
    // method taken from techdive.in
    // http://techdive.in/java/java-password-validation
    //arunraj
    //http://techdive.in/users/arunraj
    
   
   
    // code attribution
    // method taken from VCLEARN
    // https://myvc.iielearn.ac.za/ultra/courses/_138945_1/cl/outline
    // Fatima
   
   
   
   
   
    // code attribution
    // method taken from Course Hero
    // https://www.coursehero.com/file/146096621/2/
    //SargentEmuMaster319
    //https://www.coursehero.com/profile/SargentEmuMaster319/
   
   
   
    // code attribution
    // method taken from stack overflow
    //https://stackoverflow.com/questions/46199788/java-while-loop-for-entering-username-and-password-3-times-issue-with-break-s
    //Carcigenicate
    // https://stackoverflow.com/users/3000206/carcigenicate
   
   
   
    // code attribution 
    // method taken from youtube
    // Erron Bartolo
    // https://www.youtube.com/channel/UC-iDJA6iX_okcW7HemqJlvg
   
   
   
   
    public static void main(String[] args) {
       
       
       
       String Firstname;
       String Secondname;
       String Username;
       String Password;
       String usernameLogin;
       String passwordLogin;
       String invalidPassword;
       
       
       String menuFeature;
       String nofTasks;
       String Option1 ="";
       String taskName = "";
       String taskNumber;
       String taskDesc = "";
       String devDetails;
       String taskDuration;
       String taskId;
       int TASK_NUMBER;
       String taskStatus;
       String taskID = "";
       String totalHours = "";
       
       
       String searchDev = "";
       String searchTask = "";
       String searchDone = "";
       String searchStatus = "";
       String[] myarray; // declaration of string array without size
       String[] strArray = new String[4];// declaration with size
       
 
       Scanner sc = new Scanner(System.in);
       JFrame frame = new JFrame();
       
       int attempts = 0;
       
       
       Firstname =  JOptionPane.showInputDialog("Please Enter your First name:");
       Secondname = JOptionPane.showInputDialog("Please Enter your Second name:");
       Username =  JOptionPane.showInputDialog("Enter your  Username");
       Password = JOptionPane.showInputDialog("Enter your password");
        
       if (is_Valid_Password(Password)) {
            JOptionPane.showMessageDialog(frame,"Password successfully captured " + Password);
        } else {
            JOptionPane.showMessageDialog(frame,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character " );
            System.exit(0);
        }
       
        usernameLogin =JOptionPane.showInputDialog("Please enter your registered username");
        if(usernameLogin == Username){
             
        }
        passwordLogin =JOptionPane.showInputDialog("Please enter your registered password");
            if (Password == Password){
                JOptionPane.showMessageDialog(null,"Welcome "+Firstname+" "+Secondname+", it is great to see you again" );
            }
        else {
            
            invalidPassword = JOptionPane.showInputDialog("Username or password incorrect, please try again" );
            System.exit(0);
        }
       
       if (Password == Password) {
       JOptionPane.showMessageDialog(null,"Welcome to EasyKanban" );
  
}
      
       
      menuFeature = JOptionPane.showInputDialog(null,"Option 1 : Add tasks \r\n Option 2 : Show Report \r\n Option 3 : Quit   "); 
      
     while(menuFeature !="3"){
       
         switch(menuFeature){
          case "1":
              nofTasks =   JOptionPane.showInputDialog(null,"How many tasks do you wish to enter?"); 
              taskName =   JOptionPane.showInputDialog(null,"Enter name of task to be performed");
              taskNumber = JOptionPane.showInputDialog(null,"Enter task number");
              taskDesc = JOptionPane.showInputDialog(null,"Enter a short description of task less than 50 words");
              devDetails = JOptionPane.showInputDialog(null,"Enter First name and last name of developer assigned to task");
              taskDuration = JOptionPane.showInputDialog(null,"Enter estimated duration of the task in hours");
              taskStatus = JOptionPane.showInputDialog(null,"Enter status of task \r\n  To Do \r\n Done \r\n Doing");
              
              
                  // code attribution
                 // method taken from Grepper
                //https://www.codegrepper.com/code-examples/java/how+to+make+a+java+main+menu+loop+after+using+a+case
               //upset unicorn
              // https://www.codegrepper.com/profile/upset-unicorn-cggfifayxmig
              
              taskID = taskName.substring(0,2)+":"+
              taskNumber+":"+ devDetails.substring(devDetails.length()-3);
              taskName.toUpperCase();
              devDetails.toUpperCase();
              taskID.toUpperCase();
              totalHours = totalHours + taskDuration;
              
              
              
              JOptionPane.showMessageDialog(null,"Task status:"+ taskStatus+" \r\n Developer status:"+devDetails+" \r\n Task number:"+taskNumber+" \r\n Task name:"+taskName);
              JOptionPane.showMessageDialog(null,"Task description :"+ taskDesc + " \r\n Task ID: " +taskID+" \r\n Duration:"+ taskDuration);
              JOptionPane.showMessageDialog(null,"Total hours:" + totalHours  );
              
          
            if(taskDesc.length()<=50)
        {
       JOptionPane.showMessageDialog(null,"Task successfully captured");
                
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
              
        } 
              
          case "2":
              JOptionPane.showMessageDialog(null,"Coming soon");
              
              
          case "3":
              System.exit(0);
              
              
          
      }
         
         
     }
     System.exit(0);
     
     
     
   
       strArray[0] = "Mike Smith, Create Login, 5 , To do";
       strArray[1] = "Edward Harrison, Create Add Features, 8, Doing";
       strArray[2] = "Samantha Paulson, Create Reports, 2, Done";
       strArray[3] = "Glenda Oberholzer, Add Arrays, 11, To do";
       
       
        JOptionPane.showMessageDialog(null, strArray[3]);// array with most hours
        
        searchDev = JOptionPane.showInputDialog("Enter name of developer");
        
        if(searchDev == "Mike Smith")
        {
          JOptionPane.showMessageDialog(null, strArray[0]);
        }
        
        
        if(searchDev == "Edward Harrison")
        {
          JOptionPane.showMessageDialog(null, strArray[1]);
        }
        
        if(searchDev == "Samantha Paulson")
        {
          JOptionPane.showMessageDialog(null, strArray[2]);
        }
        
        
        if(searchDev == "Glenda Oberholzer")
        {
          JOptionPane.showMessageDialog(null, strArray[3]);
        }
        
        searchTask = JOptionPane.showInputDialog("Enter the task name");
        
        
        if(searchTask == "Create Login")
        {
          JOptionPane.showMessageDialog(null, strArray[0]);
        }
        
        
        if(searchTask == "Create Add Features")
        {
          JOptionPane.showMessageDialog(null, strArray[1]);
        }
        
        if(searchTask == "Create Reports")
        {
          JOptionPane.showMessageDialog(null, strArray[2]);
        }
        
        
        if(searchDev == "Add Arrays")
        {
          JOptionPane.showMessageDialog(null, strArray[3]);
        }
        
       searchStatus = JOptionPane.showInputDialog("Do you wish to display the tasks with the status of done?");
       
       if(searchStatus =="Yes")
       {
         JOptionPane.showMessageDialog(null, strArray[2]);  
       }
        
        
        
        JOptionPane.showMessageDialog(null,strArray[0]+ " " + strArray[1]+ " "+ strArray[2]+" "+strArray[3]); // report that lists full details of captured tasks
        
     
     
     
     
     
     
     
         
     /* switch(menuFeature){
          case "1":
              nofTasks =   JOptionPane.showInputDialog(null,"How many tasks do you wish to enter?"); 
              taskName =   JOptionPane.showInputDialog(null,"Enter name of task to be performed");
              taskNumber = JOptionPane.showInputDialog(null,"Enter task number");
              taskDesc = JOptionPane.showInputDialog(null,"Enter a short description of task less than 50 words");
              devDetails = JOptionPane.showInputDialog(null,"Enter First name and last name of developer assigned to task");
              taskDuration = JOptionPane.showInputDialog(null,"Enter estimated duration of the task in hours");
              taskStatus = JOptionPane.showInputDialog(null,"Enter status of task \r\n  To Do \r\n Done \r\n Doing");
              
              JOptionPane.showMessageDialog(null,"Task status:"+ taskStatus);
                
              taskID = taskName.substring(0,2)+":"+
              taskNumber+":"+ devDetails.substring(devDetails.length()-3);
              taskID.toUpperCase();
              
            JOptionPane.showMessageDialog(null,"");
              
          case "2":
              JOptionPane.showMessageDialog(null,"Coming soon");
              
          case "3":
              System.exit(0);
              
          
      }*/
      
      
       /* if (menuFeature == "1"  )  {
        nofTasks =   JOptionPane.showInputDialog(null,"How many tasks do you wish to enter?"); 
        taskName =   JOptionPane.showInputDialog(null,"Enter name of task to be performed");
        taskNumber = JOptionPane.showInputDialog(null,"Enter task number");
        taskDesc = JOptionPane.showInputDialog(null,"Enter a short description of task less than 50 words");
        devDetails = JOptionPane.showInputDialog(null,"Enter First name and last name of developer assigned to task");
        taskDuration = JOptionPane.showInputDialog(null,"Enter estimated duration of the task in hours");
        taskStatus = JOptionPane.showInputDialog(null,"Enter status of task /n  To Do /n Done /n Doing");
        
        
        JOptionPane.showMessageDialog(null,"Task status:"+ taskStatus);
                
         taskID = taskName.substring(0,2)+":"+
        taskNumber+":"+ devDetails.substring(devDetails.length()-3);
         taskID.toUpperCase();        
                
        Public String createTaskID(String taskName = "", int taskNumber = 0,String devDetails)
        {
        String taskID = taskName.substring(0,2)+":"+
        Integer.toString(taskNumber)+":"+ devDetails.substring(devDetails.length()-3);
        return taskID.toUpperCase();
        
        }
   
      }*/

      
        
      
      
              
            
       
    } 
    
    
    

        
        
        
        
        
// code attribution
      // this method was taken from w3resource
      // https://www.w3resource.com/java-exercises/method/java-method-exercise-11.php
      //anonymous
    
    
        public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

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
        public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
        public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
        
      public class loginSuccessfull {
      
      String returnMessage= "True";
      
      
      public String getMessage()
   {
      return returnMessage;
   }
      
      }  
       
        public static String createTaskID(String taskName, int taskNumber,String devDetails )
   {
       
       
     String taskID = taskName.substring(0,2)+ ":" + 

     Integer.toString(taskNumber)+ ":" + devDetails.substring(devDetails.length()-3); 

     return taskID.toUpperCase() ;
       
   }
        public String printTaskDetails(String taskName, int taskNumber, String taskDesc , 

String devDetails, int taskDuration, String taskID, String taskStatus ) 

{ 
String printValue = taskName+ " " + Integer.toString(taskNumber)+ " " + taskDesc + 
" " + devDetails +  " " + Integer.toString(taskDuration)+" " + taskID+ " "+ taskStatus; 
return printValue;  
   
}


        
        
        
        
}