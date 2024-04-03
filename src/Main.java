import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        int day = Utils.scanInt("day: ");
        int moon = Utils.scanInt("moon: ");
        int year = Utils.scanInt("year: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        String todayDate = dateFormat.format(currentDate);
        String[] todayParts = todayDate.split("/");
        int thisDay = Integer.parseInt(todayParts[0]);
        int thisMoon = Integer.parseInt(todayParts[1]);
        int thisYear = Integer.parseInt(todayParts[2]);

        int young = thisYear - year;
        if (thisMoon < moon || (thisMoon == moon && thisDay < day)) {
            young--;
        }

        int lastDay = (thisYear - year) * 365;
        int lastMonn = 0;
        for (int i = moon + 1; i <= thisMoon; i++) {
            lastMonn += generateDays(i, thisYear);
        }
        int lastDayInTheMoon = day - thisDay;
        int lastMoonInTheDays = generateDays(moon, year) - thisDay;
        lastDay += lastMonn + lastDayInTheMoon + lastMoonInTheDays;

        System.out.println("Siz: " + young + " yoshdasiz✅");
        System.out.println("Hozirgi paytgacha: " + lastDay + " kun o'tgan");
    }

    public static int generateDays(int moon, int year) {
        if (moon == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else if (moon == 4 || moon == 6 || moon == 9 || moon == 11) {
            return 30;
        } else {
            return 31;
        }


    }
}
