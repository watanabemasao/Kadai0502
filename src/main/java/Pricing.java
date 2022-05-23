package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.Math.round;

class Pricing {
    private static final String SEX_M = "男";
    private static final String SEX_F = "女";
//-----------------------必要に応じて条件を変更。-----------------------------//
    private static final  String SEX_SETTING = Pricing.SEX_M;

    private static final int AGE_SETTING = 13;
    private static final String EVENT_DAY = "土曜日";

    private static final int BASE_PRICE_SET = 2000;
//----------------------------------------------------------------------//
    private static String callDayWeek() {
         LocalDate localDate = LocalDate.now();
         DateTimeFormatter formatter
                 = DateTimeFormatter.ofPattern("EEEE", Locale.JAPANESE);
         String format = localDate.format(formatter);
    return format;
}
    static void info(final CustomerForm customerForm) {

        if (customerForm.getAge() < 0 || 199 <= customerForm.getAge()) {
            System.out.println("Error：年齢の値を正しく入力してください。"
                    + "（”0”〜”199”以上の値で入力してください）");
            return;
        }
        if (!(Pricing.SEX_M.equals(customerForm.getGender())
                || Pricing.SEX_F.equals(customerForm.getGender()))) {
            System.out.println("Error：性別の値が正しくありません。"
                    + "（”男”又は”女”で入力してください）");
            return;
        }

        if (Pricing.AGE_SETTING > customerForm.getAge()) {
            if (Pricing.SEX_M.equals(customerForm.getGender())) {
                System.out.println(customerForm.getName() + "くんは本日、半額で"
                        + round(Pricing.BASE_PRICE_SET * 0.5) + "円です。");
                return;
            }
            if (Pricing.SEX_F.equals(customerForm.getGender())) {
                System.out.println(customerForm.getName() + "ちゃんは本日、半額で"
                        + round(Pricing.BASE_PRICE_SET * 0.5) + "円です。");
                return;
            }
         }

        if (Pricing.SEX_SETTING.equals(customerForm.getGender())) {
            System.out.println(customerForm.getName() + "様は本日、"
                    + Pricing.BASE_PRICE_SET + "円です。");
            return;
        }
        if (Pricing.EVENT_DAY.equals(Pricing.callDayWeek())) {
            System.out.println(customerForm.getName() + "様は本日、"
                    + Pricing.callDayWeek() + "につき、3割引で"
                    + round(Pricing.BASE_PRICE_SET * 0.7) + "円です。");
            return;
        } else {
            System.out.println(customerForm.getName() + "様は本日、"
                    + Pricing.BASE_PRICE_SET + "円です。");
        }

    }

}
