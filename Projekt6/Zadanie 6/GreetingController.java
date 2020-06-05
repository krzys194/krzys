import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET; 

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private WWzorzec wWzorzec;

    @Autowired // Wstrzykiwanie zależności przez konstruktor
    public GreetingController(WWzorzec wWzorzec) {
        this.wWzorzec = wWzorzec;
    }

    @RequestMapping(path="/greeting") // odpowiada endpoin'tom http
    public Greeting greeting(@RequestParam(value = "wzorzec", defaultValue = "World") String
                                     wzorzec) {
        return new Greeting(counter.incrementAndGet(),String.format(template,
                WWzorzec.count(wzorzec)));
    }
} 