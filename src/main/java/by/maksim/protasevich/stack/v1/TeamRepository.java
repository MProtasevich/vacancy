package by.maksim.protasevich.stack.v1;

public interface TeamRepository /*extends CrudRepository<Developer, Long>*/ {
    boolean add(Developer newDeveloper);
}
