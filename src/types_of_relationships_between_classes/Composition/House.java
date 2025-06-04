package types_of_relationships_between_classes.Composition;

import java.util.List;

//Composition is a strong relationship where the child cannot exist without the parent.
//A strong "has-a" relationship; contained object cannot exist without the container
public class House {
    public List<Room> rooms; //Rooms are part of the House
}
