public class Dog{

    String name, color;
    int age;

    public Dog (String dogName, String dogColor, int dogAge){
        name = dogName;
        color = dogColor;
        age = dogAge;
    }

    public String makesSound(String sound){
        return sound;
    }

    public void favoriteFood(String food){
        System.out.println("A dog's favorite food is " + food);
    }

    public static void main(String[] args) {

        Dog myDog = new Dog("Danny", "Brown", 8);
                
        String dogSound = myDog.makesSound("woof");
        System.out.println("The sound a dog makes is " + dogSound);

        myDog.favoriteFood("Bone");

        myDog.favoriteFood("Meat");
    }
}