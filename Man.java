public class Man {
    String name;
    int age;
    float height;

    public Man() {}
    
    public Man(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Man man1 = new Man("Sajmul", 20, (float) 80.63);
        Man man2 = new Man();
        System.out.println(man2.hashCode());
        System.out.println(man1.getName());
        System.out.println(man1.getAge());
    }
}
