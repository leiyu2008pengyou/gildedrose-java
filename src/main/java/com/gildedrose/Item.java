package com.gildedrose;

import static com.gildedrose.Constant.*;
public class Item {

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
