package by.maksim.protasevich.stack.v2;

import by.maksim.protasevich.stack.v1.Developer;

import java.util.stream.Stream;

public interface DeveloperDataSource {
    Stream<Developer> getDevelopers();
}
