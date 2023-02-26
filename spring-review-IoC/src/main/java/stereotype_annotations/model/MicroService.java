package stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class MicroService {

    public void getHours() {
        System.out.println("Total hours: " + 20);
    }
}
