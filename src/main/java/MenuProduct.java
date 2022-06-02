package main.java;
import java.util.HashMap;
import java.util.Map;
public class MenuProduct {
    private static final String FOOD_PRICE = "フード";
    private static final String DRINK_PRICE = "ドリンク";
    private final Map<String, Map<String, Integer>> mapMap = new HashMap<>();
    public MenuProduct() {
        mapMap.put(DRINK_PRICE, new HashMap<>());
        mapMap.put(FOOD_PRICE, new HashMap<>());
        mapMap.get(DRINK_PRICE).put("コーラ", 300);
        mapMap.get(DRINK_PRICE).put("ファンタ", 300);
        mapMap.get(DRINK_PRICE).put("オレンジジュース", 300);
        mapMap.get(DRINK_PRICE).put("グレープフルーツジュース", 300);
        mapMap.get(FOOD_PRICE).put("ポテト", 350);
        mapMap.get(FOOD_PRICE).put("ポップコーン", 450);
        mapMap.get(FOOD_PRICE).put("ホットドック", 500);
        mapMap.get(FOOD_PRICE).put("サンドウィッチ", 500);
    }
    public void productPriceOut(final String drinkMenu, final String foodMenu) {
        System.out.println("ドリンクの値段は"
                + mapMap.get(DRINK_PRICE).get(drinkMenu) + "円。");
        System.out.println("フードの値段は"
                + mapMap.get(FOOD_PRICE).get(foodMenu) + "円。");
    }
    public void drinkPriceOut() {
        mapMap.get(DRINK_PRICE).forEach((k, v) ->
                System.out.println(k + "　" + v + "円"));
    }
    public void foodPriceOut() {
        mapMap.get(FOOD_PRICE).forEach((k, v) ->
                System.out.println(k + "　" + v + "円"));
    }
}
