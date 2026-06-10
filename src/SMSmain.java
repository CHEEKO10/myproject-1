public class SMSmain {
    public static void main(String[] args){
        SMSteacher teacher = new SMSteacher(01,"CO","suhas",34);
        SMSstudent student = new SMSstudent("Charith",23,89.6,23);
        teacher.displayInfo();
        student.displayInfo();
    }
}
