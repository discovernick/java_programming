package originals;

public class ObjectInheritance extends java.lang.Object {
    public static void main(String[] args) {
        Studente max = new Studente("Max",21);
        System.out.println(max.toString());

        Primary jim = new Primary("jim", 8, "carol");
        System.out.println(jim.toString());
    }
}

class Studente {
    private String name;
    private int age;

    Studente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "originals.Studente{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Primary extends Studente {
    private String parent;

    Primary(String name, int age, String parent) {
        super(name, age);
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "originals.Primary{" +
                "parent='" + parent + '\'' +
                "} " + super.toString();
    }
}