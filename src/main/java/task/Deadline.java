package task;

/**
 * Representation of a Deadline task.
 */

public class Deadline extends Task {
    private String deadline;

    public Deadline (String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String getTaskDetails() {
        return "[D][" + this.getStatusIcon() + "] " + this.description + " (by: " + this.deadline + ")";
    }

    @Override
    public String getTaskAsString() {
        return "D | " + this.getDoneAsInteger() + " | " + this.description + " | " + this.deadline;
    }
}
