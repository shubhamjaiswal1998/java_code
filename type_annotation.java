import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Schedules.class)
@interface Schedule {
    String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
}

public class type_annotation {
    @Schedule(day = "Monday")
    @Schedule(day = "Wednesday")
    @Schedule(day = "Friday")
    public void doWork() {
        System.out.println("Working...");
    }

    public static void main(String[] args) {
        Schedule[] i = type_annotation.class.getDeclaredMethods()[0]
                        .getAnnotationsByType(Schedule.class);
        for (Schedule schedule : i) {
            System.out.println("Scheduled on: " + schedule.day());
        }
    }
}

