import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private static final String template = "ID: %s, age: %s";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/age")// odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "age", defaultValue = "0") String age, @RequestParam(value = "id", defaultValue = "id") String id) {
        return new Greeting(counter.incrementAndGet(), String.format(template, id, age));
    }


}