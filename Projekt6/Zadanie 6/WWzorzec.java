import org.springframework.stereotype.Component;

@Component
public class WWzorzec {
    String a = "Zawiera się";
    String b = "Nie zawiera się";
    public int count(String wzorzec){
       if (wzorzec.contains(template)){
           return a;
    }
       else return b;
}
}
