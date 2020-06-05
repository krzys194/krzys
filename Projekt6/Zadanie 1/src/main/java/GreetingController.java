import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
 
6
    Opracowała: dr inż. Kornelia Indykiewicz
    private static final String template = "bye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye") // odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String
                                     name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
} 