public class OverUser {
    int age;
    String Username;
    String Email;
    OverUser(){
        this.age = 0;
        this.Username = "Guest";
        this.Email = "Not Provided";
    }
    OverUser(String a){
        this.Username=a;
        this.Email = "Not provided";
        this.age  = 0;
    }
    OverUser(String username,String Email){
        this.Username=username;
        this.Email=Email;
        this.age=0;
    }
    OverUser(String a,String b,int c){
        this.Username=a;
        this.Email=b;
        this.age=c;
    }
}
