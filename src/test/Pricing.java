package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.Math.round;

public class Pricing {
    private static final String SEX_M = "男";
    private static final String SEX_F = "女";
//-----------------------必要に応じて条件を変更。-----------------------------//
    private static final  String SEX_SETTING = SEX_M;

    private static final int AGE_SETTING = 13;
    private static final String EVENT_DAY = "土曜日";

    private static final int BASE_PRICE_SET = 2000;
//----------------------------------------------------------------------//
    private static String CallDayWeek() {
         LocalDate localDate = LocalDate.now();
         DateTimeFormatter formmater = DateTimeFormatter.ofPattern("EEEE", Locale.JAPANESE);
         String format = localDate.format(formmater);
    return format;
}
    public static void info(CustomerForm Classify) {

        if (Classify.getAge() < 0 || 199 <= Classify.getAge()) {
            System.out.println("Error：年齢の値を正しく入力してください。（”0”〜”199”以上の値で入力してください）");
            return;
        }
        if (!(SEX_M.equals(Classify.getGender()) || SEX_F.equals(Classify.getGender()))) {
            System.out.println("Error：性別の値が正しくありません。（”男”又は”女”で入力してください）");
            return;
        }

        if (AGE_SETTING > Classify.getAge()) {
            if (SEX_M.equals(Classify.getGender())) {
                System.out.println(Classify.getName() + "くんは本日、" + "半額で" + round(BASE_PRICE_SET * 0.5) + "円です。");
                return;
            }
            if (SEX_F.equals(Classify.getGender())) {
                System.out.println(Classify.getName() + "ちゃんは本日、" + "半額で" + round(BASE_PRICE_SET * 0.5) + "円です。");
                return;
            }
        }

        if (SEX_SETTING.equals(Classify.getGender())) {
            System.out.println(Classify.getName() + "様は本日、" + BASE_PRICE_SET + "円です。");
            return;
            }
        if (EVENT_DAY.equals(CallDayWeek())) {
            System.out.println(Classify.getName() + "様は本日、" + CallDayWeek() + "につき、3割引で" + round(BASE_PRICE_SET * 0.7) + "円です。");
            return;
        }
        else {System.out.println(Classify.getName() + "様は本日、" + BASE_PRICE_SET + "円です。");
        }

    }

}
