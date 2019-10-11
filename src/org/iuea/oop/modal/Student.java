package org.iuea.oop.modal;

/*Group members 
MADRAGULE Andrito Joas  18/208/BIT-J
DUT Daniel Kur          19/550/BSCS-S
FAROUQ MUHAMMAD Ahmed   18/225/BIT-J
MOKILI LILALA Levi      18/0053/BSSE-J
AGANZE DUNIA Ghislain   18/138/BSSE-j
*/

public class Student {
	//creating variables to hold details of a student
    static String fname;
    static String lname;
    static String email;
    static String course;
    
    //creating a constructor that help us initialize the attributes of a student
    public Student(String a,String b,String c,String d){
               //information about the student
               fname=a;
               lname=b;
               email=c;
               course=d;
               
    }
    
    //creating the main method to make the class be able to run
    public static void main(String[]args){
        
        
    }
}



