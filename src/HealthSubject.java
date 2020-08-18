public interface HealthSubject {
    void register(HealthObserver o);

    void notifyObserver();
}

