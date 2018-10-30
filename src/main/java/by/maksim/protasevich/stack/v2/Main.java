package by.maksim.protasevich.stack.v2;

import by.maksim.protasevich.JavaDeveloper;
import by.maksim.protasevich.stack.v1.project.JvmLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @Autowired
    private DeveloperDataSource developerDataSource;

    @EventListener
    public void lookingForANewJavaDev(ContextRefreshedEvent event) {
        developerDataSource.getDevelopers()
                .filter(dev -> dev instanceof JavaDeveloper)
                .map(JavaDeveloper.class::cast)
                .filter(javaDev -> JvmLanguage.JAVA_8.equals(javaDev.getExperiencedWith()))
                .filter(javaDev -> true)
                .findAny()
                .ifPresent(javaDev -> {

                });
    }
}
