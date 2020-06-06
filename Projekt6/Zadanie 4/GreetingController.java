import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    private static final String template = " Hello, %s!, name %s!,age %s!, id %s!";


    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "age", defaultValue = "0") String age, @RequestParam(value = "id", defaultValue = "id") String id) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name, age, id));
    }


}