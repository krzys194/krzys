public class Greeting {
    private final long id;
    private final int age;

    public Greeting(long id, int age) {
        this.id = id;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}