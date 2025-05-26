package solid_principles.interface_segregation.solution;

public class HumanWorker implements Workable,Eatable{
    @Override
    public void eat() {
        //Human eating
    }

    @Override
    public void work() {
        //Human working
    }
}
