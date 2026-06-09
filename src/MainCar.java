public class MainCar {
    public static void main(String[] arg){
//        Car car1 = new Car();
//        Car car2 = new Car();
//        car1.Modal="Mustang";
//        car1.Company="Ford";
//        car1.year=2025;
//        car1.Color="Red";
//        car2.Modal="M4";
//        car2.Company="BMW";
//        car2.Color="Black";
//        car2.year=2025;
//        car1.Displayinfo();
//        System.out.println();
//        car2.Displayinfo();
        Car Car1 = new Car("Mustang","Red");
        Car Car2 = new Car("Covette","Blue");
        Car Car3 = new Car("Charger","Yellow");

        Car[] cars = {Car1,Car2,Car3};

        for(int i = 0 ; i< cars.length;i++){
           cars[i].drive();
        }
    }
}
