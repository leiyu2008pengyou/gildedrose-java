package com.gildedrose;

public class Constant {
  // 质量每天正常变化的值，每天减少1，或增加1
  public final static int QUALITY_UPDATE_EVERY_DAY = 1;
  // 商品的价值永远不会超过50
  public final static int HIGHEST_QUALITY = 50;
  // 商品的价值永远不会小于0
  public final static int LOWEST_QUALITY = 0;
  // 演出前10天，价值每天上升2点
  public final static int TEN_DAY_BEFORE_THE_SHOW = 10;
  // 演出前5天，价值每天上升3点
  public final static int FIVE_DAY_BEFORE_THE_SHOW = 5;

  public final static String AGED_BRIE = "Aged Brie";
  public final static String BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT =
      "Backstage passes to a TAFKAL80ETC concert";
  public final static String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
}
