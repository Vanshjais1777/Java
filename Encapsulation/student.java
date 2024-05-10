public class student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default ctor
    public student() {
        System.out.println("student default ctor called");
    }

    // Parameterised ctor
    public student(int id, int age, String name, int nos) {
        System.out.println("student Parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Methods / Behaviours
    public void study() {
        System.out.println(name + " - Studying");
    }

    public void sleep() {
        System.out.println(name + " - Sleeping");
    }

    public void bunk() {
        System.out.println(name + " - Bunking");
    }
}
