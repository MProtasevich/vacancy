package by.maksim.protasevich.stack.v1;

import by.maksim.protasevich.stack.v1.candidate.Experience;
import by.maksim.protasevich.stack.v1.candidate.Skill;

import java.util.Set;

public class Developer {
    private Set<Skill> strongAt;
    private Set<Experience> asAPlus;

    public Set<Skill> getStrongAt() {
        return strongAt;
    }

    public void setStrongAt(Set<Skill> strongAt) {
        this.strongAt = strongAt;
    }

    public Set<Experience> getAsAPlus() {
        return asAPlus;
    }

    public void setAsAPlus(Set<Experience> asAPlus) {
        this.asAPlus = asAPlus;
    }
}
