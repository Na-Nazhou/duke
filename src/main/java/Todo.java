public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String serialize() {
        return String.format("T | %d | %s", getStatusCode(), description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}