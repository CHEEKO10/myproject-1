public class Car {
    String Modal;
    String Company;
    int year;
    String Color;
    void Displayinfo(){
        System.out.println("Company :" + Company);
        System.out.println("Modal :" + Modal);
        System.out.println("Year :"+ year);
        System.out.println("Color :"+ Color);

    }
    String  modal;
    String color;

    Car(String modal,String color){
        this.modal=modal;
        this.color=color;
    }
    void drive(){
        System.out.println("You drive " +color+" "+ modal);
    }
}
