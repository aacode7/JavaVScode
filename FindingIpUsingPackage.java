import java.util.*;  //get all classes from subpackage loads Date class

import java.util.Scanner; //get one specific class Scanner

public class FindingIpUsingPackage{  

public static void main(String args[])throws Exception

  {  

// Instantiate a scanner object 

          Scanner scanObj = new Scanner(System.in);  

          System.out.print("Kindly Enter Your UserName :");  

          String sName = scanObj.nextLine();  

          System.out.println("UserName is: " + sName);  

  scanObj.close(); 

      // Instantiate a Date class from Util package

      Date currdate = new Date();

      System.out.println(currdate.toString());

//Without importing java.net package use complete qualified name to access the class InetAddress

java.net.InetAddress ipAddress=java.net.InetAddress.getLocalHost();  

System.out.println("My IP Address :"+ipAddress.getHostAddress());                     

  }  

}  
