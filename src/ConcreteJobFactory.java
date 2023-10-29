class ConcreteJobFactory implements IJobFactory {
    @Override
    public Job createJob(String title, String description) {
        return new Job(title, description);
    }
}