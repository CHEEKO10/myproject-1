public class Student {
    String name;
    int age;
    double marks;

    Student(String b,int a,double marks){
        this.name=b;
        this.age=a;
        this.marks=marks;


    }
    void DisplayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
}
