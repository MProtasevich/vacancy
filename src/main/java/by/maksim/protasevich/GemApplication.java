package by.maksim.protasevich;

import by.maksim.protasevich.stack.v1.TeamRepository;
import by.maksim.protasevich.stack.v1.candidate.Experience;
import by.maksim.protasevich.stack.v1.candidate.Skill;
import by.maksim.protasevich.stack.v1.project.BuildTool;
import by.maksim.protasevich.stack.v1.project.Client;
import by.maksim.protasevich.stack.v1.project.Feature;
import by.maksim.protasevich.stack.v1.project.Infrastructure;
import by.maksim.protasevich.stack.v1.project.JvmLanguage;
import by.maksim.protasevich.stack.v1.project.PersistenceLayer;
import by.maksim.protasevich.stack.v1.project.Task;
import com.google.common.collect.ImmutableSet;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Collections;

@Configuration
public class GemApplication {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public JavaDeveloper newDeveloperInvited() {
        JavaDeveloper developer = new JavaDeveloper();

        developer.setExperiencedWith(JvmLanguage.JAVA_8);

        developer.setStrongAt(ImmutableSet.of(
                Skill.ALGORITHMS,
                Skill.DATA_STRUCTURES,
                Skill.MULTITHREADING
        ));

        developer.setAsAPlus(Collections.singleton(Experience.ELASTICSEARCH));

        return developer;
    }

    @Bean
    public Project provideProject(TeamRepository teamRepository) {
        Project gem = new Project();

        gem.setBasedOn(Infrastructure.GOOGLE_CLOUD_PLATFORM);
        gem.setWrittenIn(JvmLanguage.JAVA_8);

        gem.setClients(ImmutableSet.of(
                Client.ANDROID,
                Client.IOS,
                Client.WEB
        ));

        gem.setDatabase(PersistenceLayer.NO_SQL);
        gem.setModernAndStylish(BuildTool.GRADLE);

        gem.setToDevelop(ImmutableSet.of(
                Feature.MESSENGER,
                Feature.BOTS,
                Feature.BOT_MARKET,
                Feature.P2P_CALLS,
                Feature.INTERNAL_PAYMENTS
        ));

        gem.setDutiesAndOpportunities(ImmutableSet.of(
                Task.WRITE_CLEAN_CODE,
                Task.IMPLEMENT_WELL_DISTRIBUTED_SYSTEM,
                Task.COMMUNICATE_WITH_MOBILE_AND_WEB_TEAMS
        ));

        gem.setTeamRepository(teamRepository);

        return gem;
    }
}
