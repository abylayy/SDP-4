public class Main {
    public static void main(String[] args) {
        JobListing jobListing = new JobListing();

        Student student1 = new Student("Zhandos");
        Student student2 = new Student("Aliya");

        jobListing.addObserver(student1);
        jobListing.addObserver(student2);

        IJobFactory jobFactory = new ConcreteJobFactory();
        Job newJob = jobFactory.createJob("Intern Go Developer", "Astana Hub, Developing software applications");

        jobListing.notifyObservers(newJob.getTitle() + " - " + newJob.getDescription());

    }
}