import java.time.Duration;
import java.time.LocalTime;

public class Meeting {
    private final LocalTime start;
    private final LocalTime end;

    public Meeting(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public Duration getDuration() {
        return Duration.between(start, end);
    }
}
