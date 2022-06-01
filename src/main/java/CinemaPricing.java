package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.Math.round;

public class CinemaPricing {
    private static final String SEX_M = "男";
    private static final String SEX_F = "女";
    private static final int MINIMUM_AGE = 0;
    private static final int MAXIMUM_AGE = 199;

    //-----------------------必要に応じて条件を変更。-----------------------------//
    private static final String SEX_SETTING = CinemaPricing.SEX_M;

    private static final int AGE_SETTING = 13;
    private static final String CINEMA_EVENT_DAY = "土曜日";

    private static final int CINEMA_BASE_PRICE_SET = 2000;

    //----------------------------------------------------------------------//
    private static String callDayWeek() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("EEEE", Locale.JAPANESE);
        return localDate.format(formatter);
    }
    public String cinemaInfo(final CustomerForm customerForm) {

        if (customerForm.getAge() < MINIMUM_AGE || MAXIMUM_AGE <= customerForm.getAge()) {
            return ("Error：年齢の値を正しく入力してください。"
                    + "（”0”〜”199”以上の値で入力してください）");
        }
        if (!(CinemaPricing.SEX_M.equals(customerForm.getGender())
                || CinemaPricing.SEX_F.equals(customerForm.getGender()))) {
            return ("Error：性別の値が正しくありません。"
                    + "（”男”又は”女”で入力してください）");
        }
        if (CinemaPricing.AGE_SETTING > customerForm.getAge()) {
            if (CinemaPricing.SEX_M.equals(customerForm.getGender())) {
                return (customerForm.getName() + "くんは本日、半額で"
                        + cinemaHalfPricing() + "円です。");
            }
            return (customerForm.getName() + "ちゃんは本日、半額で"
                    + cinemaHalfPricing() + "円です。");
        }

        if (CinemaPricing.SEX_SETTING
                .equals(customerForm.getGender())) {
            return (customerForm.getName() + "様は本日、"
                    + cinemaBasePrice() + "円です。");
        }
        if (CinemaPricing.CINEMA_EVENT_DAY
                .equals(CinemaPricing.callDayWeek())) {
            return (customerForm.getName() + "様は本日、"
                    + CinemaPricing.callDayWeek() + "につき、3割引で"
                    + cinemaDiscountPrice() + "円です。");
        } else {
            return (customerForm.getName() + "様は本日、"
                    + cinemaBasePrice() + "円です。");
        }
    }
    public static int cinemaBasePrice() {
        return CinemaPricing.CINEMA_BASE_PRICE_SET;
    }
    public static int cinemaHalfPricing() {
        return (int) round(CinemaPricing.CINEMA_BASE_PRICE_SET * 0.5);
    }
    public static int cinemaDiscountPrice() {
        return (int) round(CinemaPricing.CINEMA_BASE_PRICE_SET * 0.7);
    }

}
