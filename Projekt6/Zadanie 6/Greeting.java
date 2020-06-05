public class Greeting {
    private final long id;
    private final String wzorzec;

    public Greeting(long id, String wzorzec){
        this.id = id;
        this.wzorzec = wzorzec;
    }
    public long getId(){
        return id;
    }
    public String getWzorzec(){
        return wzorzec;
    }
}