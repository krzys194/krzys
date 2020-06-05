import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template1 = "Hello, %s!";
    private static final String template2 = "bye, %s!";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") // odpowiada endpoint’om http
    public Greetireng geting(@RequestParam(value = "name", defaultValue = "World") String
                                     name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @RequestMapping("/bye") // odpowiada endpoint’om http
    public Greetireng geting(@RequestParam(value = "name", defaultValue = "World") String
                                     name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}