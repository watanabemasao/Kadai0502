package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.Math.round;

public class Pricing {
    private static final String sexM = "男";
    private static final String sexF = "女";
//----------必要に応じて条件を変更する際はSetの値を変更する。------------------//
    private static final  String sexSet = sexM;

    private static final int ageSet = 13;
    private static final String eventDaySet = "土曜日";

    private static final int basePriceSet = 2000;
//----------------------------------------------------------------------//
    private static String CallDayWeek() {
         LocalDate localDate = LocalDate.now();
         DateTimeFormatter formmater = DateTimeFormatter.ofPattern("EEEE", Locale.JAPANESE);
         String format = localDate.format(formmater);
    return format;
}
    public static void info(CustomerForm com) {

        if (199 <= com.getAge() || 0 > com.getAge()) {
            System.out.println("Error：年齢の値を正しく入力してください。（”0”〜”199”以上の値で入力してください）");
            return;
        }
        if (!(sexM.equals(com.getGender()) || sexF.equals(com.getGender()))) {
            System.out.println("Error：性別の値が正しくありません。（”男”又は”女”で入力してください）");
            return;
        }

        if (ageSet > com.getAge()) {
            if (sexM.equals(com.getGender())) {
                System.out.println(com.getName() + "くんは本日、" + "半額で" + round(basePriceSet * 0.5) + "円です。");
                return;
            }
            if (sexF.equals(com.getGender())) {
                System.out.println(com.getName() + "ちゃんは本日、" + "半額で" + round(basePriceSet * 0.5) + "円です。");
                return;
            }
        }

        if (sexSet.equals(com.getGender())) {
            System.out.println(com.getName() + "様は本日、" + basePriceSet + "円です。");
            return;
            }
        if (eventDaySet.equals(CallDayWeek())) {
            System.out.println(com.getName() + "様は本日、" + CallDayWeek() + "につき、3割引で" + round(basePriceSet * 0.7) + "円です。");
            return;
        }
        else {System.out.println(com.getName() + "様は本日、" + basePriceSet + "円です。");
        }

    }

}
