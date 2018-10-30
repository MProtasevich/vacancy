package by.synesis.gem;

import java.util.Arrays;
import java.util.List;

public class Vacancy {

    private Project project = new Project();
    private JavaDeveloper javaDeveloper = new JavaDeveloper();

    static class Project {
        String name = "Gem4me";

        List<String> thingsNeedToDevelop = Arrays.asList(
                "Messenger server side",
                "Market server side",
                "P2P calls",
                "Internal payments"
        );

        List<String> dutiesAndOpportunities = Arrays.asList(
                "Write clean code",
                "Implement well distributed system",
                "Communicate with mobile and web teams"
        );

        void hireJavaDeveloper(JavaDeveloper javaDeveloper) {
            System.out.println(name + ": Welcome to our team!");
        }
    }

    static class JavaDeveloper {
        List<String> know = Arrays.asList(
                "Java 8+",
                "Spring Framework"
        );

        List<String> strongAt = Arrays.asList(
                "Algorithms",
                "Data structures",
                "Concurrency"
        );

        List<String> niceToHave = Arrays.asList(
                "Elasticsearch",
                "Google Cloud Platform",
                "NoSQL database",
                "Gradle",
                "Swagger",
                "TestNG"
        );

        boolean wantToWorkHard() {
            // TODO: Check if candidate want to be part of amazing team
            return true;
        }
    }

    public String readMore() {
        return "http://bit.ly/Gem4meVacancy";
    }

    public static void main(String[] args) {
        Vacancy vacancy = new Vacancy();
        JavaDeveloper you = new JavaDeveloper();
        if (you.wantToWorkHard()) {
            vacancy.project.hireJavaDeveloper(you);
        }
    }
}
