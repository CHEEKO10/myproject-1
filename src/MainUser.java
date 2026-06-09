public class MainUser {
    public static void main(String[] args){
        OverUser user = new OverUser();
        OverUser user1 = new OverUser("Charith");
        OverUser user2 = new OverUser("Charith","raikcharith@gmail.com");
        OverUser user4 = new OverUser("Charith","charith@gmail.com",23);


        System.out.println(user.Username);
        System.out.println(user.Email);
        System.out.println(user.age);

        System.out.println(user1.Username);
        System.out.println(user1.Email);
        System.out.println(user1.age);

        System.out.println(user2.Username);
        System.out.println(user2.Email);
        System.out.println(user2.age);

        System.out.println(user4.Username);
        System.out.println(user4.Email);
        System.out.println(user4.age);

    }
}
