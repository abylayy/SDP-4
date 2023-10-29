class Student implements IJobObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String jobPosting) {
        System.out.println("Good news! " + name + ", a new job is posted: " + jobPosting);
    }
}