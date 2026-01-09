

class Person {
    private String name; //private lar ingen endre disse og derfor behøver vi get og set
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Alder kan ikke være null");
        }
        this.name = name;  //this.name er feltet, name er input-parameter-variablene
        this.age = age;    // tilsvarende her
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Alder kan ikke være negativ");
        }
        this.age = age;
    }

    @Override
    public String toString() {            
        return "Navn: " + name + " Alder: " + age;
    }
}

public class Main {
    public void main() {
        Person testperson = new Person("test", 10);
        System.out.println(testperson.getAge());
    }
}
    