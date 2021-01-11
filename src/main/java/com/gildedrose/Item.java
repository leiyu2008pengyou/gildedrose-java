package com.gildedrose;

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
}
