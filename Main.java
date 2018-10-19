import java.util.Scanner;

public class Main {


    public static int worldTime;
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the World Time: ");
        worldTime = sc.nextInt();


        System.out.printf("It is %d:%d on day %d of the year %d.",calcHours(worldTime), calcMinutes(worldTime), calcDays(worldTime) + 1, calcYear(worldTime) + 1);
        System.out.printf("\nTrammel is in day %d of its 9 day phase.",1 + calcTrammel(worldTime));
        System.out.printf("\nFelucca is in day %d of its 14 day phase.",1 + calcFelucca(worldTime));

    }

    public static int calcYear(int year) {
        year = worldTime/525600;
        return year;
    }

    public static int calcDays(int days) {
        days = (days - calcYear(worldTime)*525600)/1440;
        return days;
    }

    public static int calcHours(int hours) {
        hours = (hours - (calcYear(worldTime) * 525600 + calcDays(worldTime) * 1440))/60;
        return hours;

    }

    public static int calcMinutes(int minutes) {
        minutes = (minutes - (calcYear(worldTime) * 525600 + calcDays(worldTime) * 1440 + calcHours(worldTime) * 60));
        return minutes;
    }

    public static int calcTrammel(int Trammel) {
        int cycle = Trammel / 12960;
        int minLeft = Trammel - cycle * 12960;
        Trammel = minLeft/1440;
        return Trammel;
    }

    public static int calcFelucca(int Felucca) {
        int cycle = Felucca / 20160;
        int minLeft = Felucca - cycle * 20160;
        Felucca = minLeft/1440;
        return Felucca;
    }

}
