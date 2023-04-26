import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calendar calendar1 = new Calendar(
                new WorkingHours(LocalTime.of(9, 0), LocalTime.of(19, 55)),
                List.of(
                        new Meeting(LocalTime.of(9, 0), LocalTime.of(10, 30)),
                        new Meeting(LocalTime.of(12, 0), LocalTime.of(13, 0)),
                        new Meeting(LocalTime.of(16, 0), LocalTime.of(18, 0))
                )
        );

        Calendar calendar2 = new Calendar(
                new WorkingHours(LocalTime.of(10, 0), LocalTime.of(18, 30)),
                List.of(
                        new Meeting(LocalTime.of(10, 0), LocalTime.of(11, 30)),
                        new Meeting(LocalTime.of(12, 30), LocalTime.of(14, 30)),
                        new Meeting(LocalTime.of(14, 30), LocalTime.of(15, 0)),
                        new Meeting(LocalTime.of(16, 0), LocalTime.of(17, 0))
                )
        );

        Duration meetingDuration = Duration.ofMinutes(30);

        List<MeetingSlot> availableSlots = MeetingScheduler.findMeetingSlots(calendar1, calendar2, meetingDuration);

        System.out.println("Available meeting slots:");
        for (MeetingSlot slot : availableSlots) {
            System.out.println(slot.getStart() + " , " + slot.getEnd());
        }
    }

}



