package exercises.week11.exercise01;

import org.junit.jupiter.api.Test;

import java.time.*;

public class MatildaTimeTable {

    @Test
    void wakeUpsTimeAndDayOfIt() {
        LocalTime firstTime = LocalTime.parse("10:00:00");
        LocalDate firstDay = LocalDate.parse("2003-03-13");
        LocalDateTime localDateTime = LocalDateTime.of(firstDay, firstTime);
        System.out.println("\nTime(wakes up):" + firstTime.getHour() + ":" + firstTime.getMinute());
        System.out.println("\nDate(wakes up):" + localDateTime);

        LocalDateTime pickUpTime = LocalDateTime.of(localDateTime.toLocalDate(), localDateTime.toLocalTime().plusMinutes(37).plusSeconds(21));
        System.out.println("\n(picked up by the limousine):" + pickUpTime);

        LocalDateTime airportArrival = LocalDateTime.of(pickUpTime.toLocalDate(), pickUpTime.toLocalTime().plusMinutes(90));
        System.out.println("\n(arrives at the airport):" + airportArrival);

        LocalTime departureTime = LocalTime.parse("11:04");
        boolean isAfter = airportArrival.toLocalTime().isAfter(departureTime);
        if (isAfter) {
            System.out.println("\n(isAfter):" + isAfter);
            System.out.println("\n(he miss his flight)");

            LocalDateTime nextFlight = LocalDateTime.of(firstDay, LocalTime.parse("18:45"));
            Duration waitingTimeForNextFlight = Duration.between(nextFlight, airportArrival);
            System.out.println("\n(he have to wait):" + waitingTimeForNextFlight);


            ZoneId london = ZoneId.of("Europe/London");
            ZonedDateTime departureLondonZonedDateTime = airportArrival.atZone(london);
            System.out.println(departureLondonZonedDateTime);
            ZonedDateTime arrivalZoneDateTime = departureLondonZonedDateTime.plusHours(11).plusMinutes(50);
            ZoneId tokyo = ZoneId.of("Asia/Tokyo");
            ZonedDateTime tokyoZonedDateTime = arrivalZoneDateTime.withZoneSameInstant(tokyo);
            LocalDateTime tokyoLocalDateTime = tokyoZonedDateTime.toLocalDateTime();
            System.out.println("\n(date and Time in Tokyo):" + tokyoZonedDateTime);
            System.out.println("\n (Local date and Time in Tokyo):" + tokyoLocalDateTime);

            LocalDateTime wakeUpWithPillow = tokyoLocalDateTime.plusHours(2).plusHours(9);

//                    localDateTime.of(tokyoLocalDateTime.toLocalDate(), tokyoLocalDateTime.toLocalTime().plusHours(11));
            System.out.println("\n(Wakeup in Tokyo:)" + wakeUpWithPillow);

            LocalDateTime beginAdvertisementShootingsTime = wakeUpWithPillow.plusMinutes(47);
            System.out.println("\n(begin shooting times:)" + beginAdvertisementShootingsTime);

            LocalDateTime privatePhoneCall = beginAdvertisementShootingsTime.plusSeconds(546);
            System.out.println("\n(Private phone call times:)" + privatePhoneCall);

            Duration preparedTime = Duration.ofMinutes(47).minusSeconds(546);
            System.out.println("\n( Maguta time to prepared:)" + preparedTime);

//            Duration between = Duration.between(privatePhoneCall, beginAdvertisementShootingsTime);
//            System.out.println("\n(between shooting and calling:)" + between);
//            long minutes = between.toMinutes();
//            System.out.println("\n(Duration in minutes:)" + minutes);
//            Duration duration = between.minusMinutes(9).minusSeconds(6);
//            System.out.println("\n(Maguta time to prepared:)" + duration);
//
            LocalDateTime timeAfterShooting = privatePhoneCall.plusHours(7);
            System.out.println("\n(Time After Shooting:)" + timeAfterShooting);

            LocalTime lunchTime = LocalTime.parse("13:00");
            System.out.println("\n(Lunch time:)" + lunchTime);

            LocalTime dinnerTime = LocalTime.parse("20:00");
            System.out.println("\n(Dinner time:)" + dinnerTime);

            boolean lostLunch = timeAfterShooting.toLocalTime().isAfter(lunchTime);
            if (lostLunch) {
                System.out.println("\n(he can take just dinner)");

            } else
                System.out.println("\n(he can take lunch");
            LocalDateTime landingTimeInLondonInTokyo = timeAfterShooting.plusDays(3).plusHours(12).plusHours(11).plusMinutes(50);
            System.out.println("\n(Time in Tokyo)" + landingTimeInLondonInTokyo);
            ZonedDateTime inTokyo = landingTimeInLondonInTokyo.atZone(tokyo);
            ZonedDateTime inLondon = inTokyo.withZoneSameInstant(london);
            LocalDateTime londonLocalDateTime = inLondon.toLocalDateTime();
            System.out.println("\n(Date in london)" + londonLocalDateTime.toLocalDate());
            int autoGraph = 12 * 173;
            LocalDateTime finalSeconds = londonLocalDateTime.plusSeconds(autoGraph);
            Duration spendingTimeWithAutoGraphs = Duration.between(finalSeconds.toLocalTime(), londonLocalDateTime.toLocalTime());
            System.out.println("\n(Spend time with his fans:)" + spendingTimeWithAutoGraphs);

            LocalTime afterSpendingTimeWithFans = londonLocalDateTime.toLocalTime().plusMinutes(34).plusSeconds(36);
            LocalTime arrivesAtHisHotel = afterSpendingTimeWithFans.plusHours(1);
            System.out.println("\n(Arrives time at the hotel:)" + arrivesAtHisHotel);

            LocalTime saunaOpeningTime = LocalTime.parse("09:00");
            LocalTime saunaClosingTime = LocalTime.parse("14:00");
            LocalTime saunaOpeningTimeInTheAfternoon = LocalTime.parse("16:00");
            LocalTime saunaClosingTimeInTheAfternoon = LocalTime.parse("20:00");

            boolean isOpenInTheMorning = arrivesAtHisHotel.isAfter(saunaOpeningTime) && arrivesAtHisHotel.plusMinutes(30).isBefore(saunaClosingTime);
            boolean isOpenInTheAfternoon = arrivesAtHisHotel.isAfter(saunaOpeningTimeInTheAfternoon) && arrivesAtHisHotel.plusMinutes(30).isBefore(saunaClosingTimeInTheAfternoon);
            if (isOpenInTheMorning) {
                System.out.println("\n(he can use the Sauna in the morning");

            } else if (isOpenInTheAfternoon) {
                System.out.println("\n(he can use the Sauna in the afternoon");
            } else {
                System.out.println("\n(he can't use the Sauna");

            }


        }


    }}

