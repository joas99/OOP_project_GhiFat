package org.iuea.oop.modal;

/*Group members 
MADRAGULE Andrito Joas  18/208/BIT-J
DUT Daniel Kur          19/550/BSCS-S
FAROUQ MUHAMMAD Ahmed   18/225/BIT-J
MOKILI LILALA Levi      18/0053/BSSE-J
AGANZE DUNIA Ghislain   18/138/BSSE-j
*/
public class Course extends CourseUnits {
	//creating attributes of the course class
    static String course;
    static String stcoursecode;
    static String coursedescript;
    
    //creating the constructor that help initialize the course and courseUnit's details
    public Course(String course, String stcoursecode, String coursedescript, String cUnitname,
            String creditUnit, String cUnitdescription, String cUnitcontent, String coursecode, String cUnityear){
        this.course=course;
        this.stcoursecode=stcoursecode;
        this.coursedescript=coursedescript;
        this.cUnitname=cUnitname;
        this.creditUnit=creditUnit;
        this.cUnitdescription=cUnitdescription;
        this.cUnitcontent=cUnitcontent;
        this.coursecode=coursecode;
        this.cUnityear=cUnityear;
    }
    
    //creating the main method to make this class be able to run
    public static void main(String[]args){
        
    }
}


