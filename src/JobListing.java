import java.util.ArrayList;
import java.util.List;

class JobListing {
    private List<IJobObserver> observers = new ArrayList<>();

    public void addObserver(IJobObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IJobObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String jobPosting) {
        for (IJobObserver observer : observers) {
            observer.update(jobPosting);
        }
    }
}