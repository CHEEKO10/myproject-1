public class SMSteacher extends SMSMmain {
    int teacherId;
    String subject;
    SMSteacher(int teacherId,String Subject,String name,int age){
        super(name,age);
        this.teacherId = teacherId;
        this.subject=Subject;

    }
    @Override
    void displayInfo(){
        System.out.println(name +" with teacher id " + teacherId + " is teaching " + subject+" at the age of " + age);
    }
}
