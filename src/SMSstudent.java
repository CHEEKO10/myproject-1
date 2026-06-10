public class SMSstudent extends SMSMmain{
    int studentID;
    double marks;
    SMSstudent(String name,int Studendid, double marks,int age){
        super(name,age);
        this.studentID = Studendid;
        this.marks = marks;
    }
     @Override
    void  displayInfo(){
         System.out.println(name+ " with student id "+studentID+" has obtained "+ marks + " marks");
     }
    void isPassed(){
        System.out.println("Is passed the exmam");
    }
}
