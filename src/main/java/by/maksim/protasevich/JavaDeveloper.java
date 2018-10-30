package by.maksim.protasevich;

import by.maksim.protasevich.stack.v1.Developer;
import by.maksim.protasevich.stack.v1.project.Framework;
import by.maksim.protasevich.stack.v1.project.JvmLanguage;

import java.util.Set;

public class JavaDeveloper extends Developer {
    private JvmLanguage experiencedWith;
    private Set<Framework> knownFrameworks;

    public JvmLanguage getExperiencedWith() {
        return experiencedWith;
    }

    public void setExperiencedWith(JvmLanguage experiencedWith) {
        this.experiencedWith = experiencedWith;
    }

    public Set<Framework> getKnownFrameworks() {
        return knownFrameworks;
    }

    public void setKnownFrameworks(Set<Framework> knownFrameworks) {
        this.knownFrameworks = knownFrameworks;
    }
}
