package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.HoursConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.ExtraHours;
import stereotype_annotations.model.MicroService;

public class Main {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(HoursConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        MicroService microService = container.getBean(MicroService.class);

        dataStructure.getHours();
        microService.getHours();

        ExtraHours extraHours = container.getBean(ExtraHours.class);
        System.out.println(extraHours.ExtraHours());



    }
}
