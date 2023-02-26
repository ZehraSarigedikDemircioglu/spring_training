package stereotype_annotations.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure{

    private final ExtraHours extraHours;
    public void getHours() {
        System.out.println("Total hours: " + (30 + extraHours.ExtraHours()));
    }
}
