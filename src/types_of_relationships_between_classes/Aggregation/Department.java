package types_of_relationships_between_classes.Aggregation;

import java.util.List;

//Aggregation : Department has professors
//A "has-a" relationship; both can exist independently.
public class Department {
    List<Professor> professors;
}
