package hello;

import com.google.common.base.Stopwatch;
import org.joda.time.LocalTime;

public class HelloWorld {

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(stopwatch);
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        System.out.println("Hello World");

        System.out.println(stopwatch.stop());
    }
}