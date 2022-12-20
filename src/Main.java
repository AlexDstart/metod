import java.time.LocalDate;

public class Main {
    private final static int CURRENTYEAR= LocalDate.now().getYear();
    public static void main(String[] args) {
        printLeapOrNotLeap(2024);
        //nexttask
        printVersionOS(2014,1);
        //nexttask
        printCalculateTimeDelivery(19);
        printCalculateTimeDelivery(21);
        printCalculateTimeDelivery(60);
        printCalculateTimeDelivery(800);
    }
public static boolean isleapYear(int year){
        return year % 4==0 && year%100 !=0||year %400==0;
}
public static void printLeapOrNotLeap(int year){
        if(isleapYear(year)){
            System.out.println(year+" Год високосный");
            return;
        }
    System.out.println(year+ " год не високосный ");


}
public static boolean isNowYear(int year){
        return year == CURRENTYEAR;
}
public static String getVersionOS(int versionOS){
        if(versionOS==0){
            return "IOS";
        }else if(versionOS==1) {
            return "Android";
        }
        return " Мы не знаем такой операционной системы ";
}
public static void printVersionOS(int year,int versionOS){
        if (isNowYear(year)){
            System.out.println(" Установите полную версию для вашего "+ getVersionOS(versionOS));
        }else {
            System.out.println(" Установите облегченную версию для вашего "+ getVersionOS(versionOS));
        }

}
public static void printCalculateTimeDelivery(int distance) {
    if (distance > 0 && distance < 700) {

        System.out.println(" Время доставки = " + ((distance + 19) / 40 + 1));
        return;
    }
    System.out.println("Доставка в другой регион не проводится");
}
}



