package main.java;
import java.util.HashMap;
import java.util.Map;
public class MenuProduct {
    private static final String FOOD_PRICE = "フード";
    private static final String DRINK_PRICE = "ドリンク";
    private static final Map<String, Map<String, Integer>> MENU_MAP = new HashMap<>();
    public MenuProduct() {
        MENU_MAP.put(DRINK_PRICE, new HashMap<>());
        MENU_MAP.put(FOOD_PRICE, new HashMap<>());
        MENU_MAP.get(DRINK_PRICE).put("コーラ", 300);
        MENU_MAP.get(DRINK_PRICE).put("ファンタ", 300);
        MENU_MAP.get(DRINK_PRICE).put("オレンジジュース", 300);
        MENU_MAP.get(DRINK_PRICE).put("グレープフルーツジュース", 300);
        MENU_MAP.get(FOOD_PRICE).put("ポテト", 350);
        MENU_MAP.get(FOOD_PRICE).put("ポップコーン", 450);
        MENU_MAP.get(FOOD_PRICE).put("ホットドック", 500);
        MENU_MAP.get(FOOD_PRICE).put("サンドウィッチ", 500);
    }
    public static void productPriceOut(final String drinkMenu,
                                       final String foodMenu) {
        System.out.println("ドリンクの値段は"
                + MENU_MAP.get(DRINK_PRICE).get(drinkMenu) + "円。");
        System.out.println("フードの値段は"
                + MENU_MAP.get(FOOD_PRICE).get(foodMenu) + "円。");
    }
    public static void drinkPriceOut() {
        MENU_MAP.get(DRINK_PRICE).forEach((k, v) ->
                System.out.println(k + "　" + v + "円"));
    }
    public static void foodPriceOut() {
        MENU_MAP.get(FOOD_PRICE).forEach((k, v) ->
                System.out.println(k + "　" + v + "円"));
    }
}
