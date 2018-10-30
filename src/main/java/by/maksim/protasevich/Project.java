package by.maksim.protasevich;

import by.maksim.protasevich.stack.v1.Developer;
import by.maksim.protasevich.stack.v1.HrService;
import by.maksim.protasevich.stack.v1.TeamRepository;
import by.maksim.protasevich.stack.v1.project.BuildTool;
import by.maksim.protasevich.stack.v1.project.Client;
import by.maksim.protasevich.stack.v1.project.Feature;
import by.maksim.protasevich.stack.v1.project.Infrastructure;
import by.maksim.protasevich.stack.v1.project.JvmLanguage;
import by.maksim.protasevich.stack.v1.project.PersistenceLayer;
import by.maksim.protasevich.stack.v1.project.Task;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.Optional;
import java.util.Set;

public class Project {
    private Infrastructure basedOn;
    private PersistenceLayer database;
    private JvmLanguage writtenIn;
    private Set<Feature> toDevelop;
    private BuildTool modernAndStylish;
    private Set<Task> dutiesAndOpportunities;
    private TeamRepository teamRepository;
    private Set<Client> clients;
    private HrService hrService;

    private ObjectFactory<Developer> developerProvider;

    @EventListener
    public void newDeveloperArrived(ContextRefreshedEvent contextRefreshed) {
        Optional.of(developerProvider.getObject())
                .filter(javaDev -> hrService.interview(javaDev).isGood())
                .filter(javaDev -> hrService.proposeAnOfferTo(javaDev).isAccepted())
                .ifPresent(javaDev -> teamRepository.add(javaDev));
    }

    public void setBasedOn(Infrastructure basedOn) {
        this.basedOn = basedOn;
    }

    public void setDatabase(PersistenceLayer database) {
        this.database = database;
    }

    public void setWrittenIn(JvmLanguage writtenIn) {
        this.writtenIn = writtenIn;
    }

    public void setToDevelop(Set<Feature> toDevelop) {
        this.toDevelop = toDevelop;
    }

    public void setModernAndStylish(BuildTool modernAndStylish) {
        this.modernAndStylish = modernAndStylish;
    }

    public void setDutiesAndOpportunities(Set<Task> dutiesAndOpportunities) {
        this.dutiesAndOpportunities = dutiesAndOpportunities;
    }

    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
