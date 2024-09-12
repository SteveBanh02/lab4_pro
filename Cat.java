public class Cat{

    String name;
    String color;
    int age;

    public Cat(String tempName, String tempColor, int tempAge){

        name = tempName;
        color = tempColor;
        age = tempAge;
    }

    public String makesSound(String sound){
        return sound;
    }

    public void favouriteFood(){
        System.out.println("A cat's favorite food is fish!");//added cat favorite food
    }

    public static void main(String[] args) {
        
        Cat myCat = new Cat ("kit kat", "orange", 5);

        System.out.println("My cat's name is " + myCat.name);
        System.out.println("My cat's color is " + myCat.color);
        System.out.println("My cat is " + myCat.age + " years old");

        String catSound = myCat.makesSound("meow");
        System.out.println("my cat makes the sound " + catSound);
        
        myCat.favouriteFood();
    }
}