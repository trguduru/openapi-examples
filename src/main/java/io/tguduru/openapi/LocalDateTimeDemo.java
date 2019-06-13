package io.tguduru.openapi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.TimeZone;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-06-03
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        long currentInstant = Instant.now().getEpochSecond();
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        LocalDateTime convertedLocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(currentInstant),timeZone.toZoneId());
        System.out.println(convertedLocalDateTime);
    }
}
