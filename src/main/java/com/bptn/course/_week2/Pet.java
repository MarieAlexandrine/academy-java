package week2;
public class Pet {
    private String name;
    private String type;

    public Pet(String n, String t) {
        name = n;
        type = t;
    }
    public String getType() {
      return type;
    }
    public String getName() {
      return name;
    }

    public String speak() {
      return "grr!";
    }
    
    public static void main(String[] args) {
        Pet p = new Pet("Sammy","hamster");
        System.out.println(p.getType());
        System.out.println(p.speak());

        Dog d = new Dog("Fido");
        System.out.println(d.getType());
        System.out.println(d.speak());

//        Cat c = new Cat("Fluffy");
//        System.out.println(c.getType());
//        System.out.println(c.speak());
        
    }
}
