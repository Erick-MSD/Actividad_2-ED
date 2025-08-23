public class Task {
    private final String id;
    private final String description;
    private final int duration; // in ticks

    public Task(String id, String description, int duration) {
        this.id = id;
        this.description = description;
        this.duration = duration;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public int getDuration() { return duration; }

    @Override
    public String toString() {
        return id + ": " + description + " (" + duration + " ticks)";
    }
}
