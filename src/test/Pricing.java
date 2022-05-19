package test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.lang.Math.round;

public class Pricing {
    private static final String sexM = "男";
    private static final String sexF = "女";
//----------必要に応じて条件を変更する際はSetの値を変更する。------------------//
    private static final  String sexSet = sexM;

    private static final int ageSet = 13;
    private static final String eventDaySet = "木曜日";

    private static final int basePriceSet = 2000;
//----------------------------------------------------------------------//
    private static String DayJpn() {
        LocalDate now = LocalDate.now();
        DayOfWeek day = now.getDayOfWeek();
        String dayJpn = "";
        if (day == DayOfWeek.MONDAY) {
            dayJpn = "月曜日";
        } else if (day == DayOfWeek.TUESDAY) {
            dayJpn = "火曜日";
        } else if (day == DayOfWeek.WEDNESDAY) {
            dayJpn = "水曜日";
        } else if (day == DayOfWeek.THURSDAY) {
            dayJpn = "木曜日";
        } else if (day == DayOfWeek.FRIDAY) {
            dayJpn = "金曜日";
        } else if (day == DayOfWeek.SATURDAY) {
            dayJpn = "土曜日";
        } else if (day == DayOfWeek.SUNDAY) {
            dayJpn = "日曜日";
        } return dayJpn;
    }

    public static void info(CustomerForm com) {

        if (0 > com.getAge()) {
            System.out.println("Error：年齢の値を正しく入力してください。（”0”以上の値で入力してください）");
        } else if (199 <= com.getAge()) {
            System.out.println("Error：年齢の値を正しく入力してください。（”199”以下の値で入力してください）");
        } else if (sexM.equals(com.getGender()) || sexF.equals(com.getGender())) {

            if (ageSet > com.getAge()) {
                if (sexM.equals(com.getGender())) {
                    System.out.println(com.getName() + "くんは本日、" + "半額で" + round(basePriceSet * 0.5) + "円です。");
                } else if(sexF.equals(com.getGender())) {
                    System.out.println(com.getName() + "ちゃんは本日、" + "半額で" + round(basePriceSet * 0.5) + "円です。");
                }
            } else if (sexSet.equals(com.getGender())) {
                    System.out.println(com.getName() + "様は本日、" + basePriceSet + "円です。");
            } else if (eventDaySet.equals(DayJpn())) {
                    System.out.println(com.getName() + "様は本日、" + DayJpn() + "につき、3割引で" + round(basePriceSet * 0.7) + "円です。");

            } else System.out.println(com.getName() + "様は本日、" + basePriceSet + "円です。");
        }else System.out.println("Error 性別の値が正しくありません。（”男”又は”女”で入力してください）");
    }
}
