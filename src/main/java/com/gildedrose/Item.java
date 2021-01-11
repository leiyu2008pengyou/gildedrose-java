package com.gildedrose;

public class Item {
  private static String AGED_BRIE = "Aged Brie";
  private static String BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT =
      "Backstage passes to a TAFKAL80ETC concert";
  private static String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

  public String mName;

  public int mSellIn;

  public int mQuality;

  public Item(String name, int sellIn, int quality) {
    mName = name;
    mSellIn = sellIn;
    mQuality = quality;
  }

  @Override
  public String toString() {
    return mName + ", " + mSellIn + ", " + mQuality;
  }

  public boolean isAgedBrie() {
    return mName.equals(AGED_BRIE);
  }

  public boolean isBackstagePassses() {
    return mName.equals(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT);
  }

  public boolean isSulfuras() {
    return mName.equals(SULFURAS_HAND_OF_RAGNAROS);
  }
}
