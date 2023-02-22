package com.cydeo.stereotype_annotation;
import com.cydeo.stereotype_annotation.casefactory.Case;
import com.cydeo.stereotype_annotation.monitorfactory.Monitor;
import com.cydeo.stereotype_annotation.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //@Autowired is done by Spring
    // Starting with Spring version 4.3, when you only have one constructor in the class, you can omit writing the @Autowired annotation
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}
