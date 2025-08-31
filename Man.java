public class Man {
    String name;
    int age;
    float height;

    public Man(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public Man() {}
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[]rafinvaStrings) {
        Man man1 = new Man("Sajmul", 20, (float) 80.63);
        System.out.println(man1.getName());
        System.out.println(man1.getAge());
    }
}
