package solid_principles.interface_segregation.problem;

public class AiWorker implements Worker{
    @Override
    public void work() {
        //Ai working
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("AiWorker can't eat");
    }
}
