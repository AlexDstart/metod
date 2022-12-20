
public class Main {
    public static void main(String[] args) {
        printLeapOrNotLeap(2024);
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
}
