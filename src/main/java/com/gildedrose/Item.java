package com.gildedrose;

import static com.gildedrose.Constant.LOWEST_QUALITY;
import static com.gildedrose.Constant.QUALITY_UPDATE_EVERY_DAY;

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

  public void updateQualityAndSellIn() {
    updateQuality();
    updateSellIn();
    updateQualityWhenExpired();
  }

  protected void updateQuality() {
    if (mQuality <= LOWEST_QUALITY) {
      return;
    }
    mQuality = mQuality - QUALITY_UPDATE_EVERY_DAY;
  }

  protected void updateSellIn() {
    mSellIn = mSellIn - QUALITY_UPDATE_EVERY_DAY;
  }

  protected void updateQualityWhenExpired() {
    if (mSellIn >= LOWEST_QUALITY) {
      return;
    }
    if (mQuality <= LOWEST_QUALITY) {
      return;
    }
    mQuality = mQuality - QUALITY_UPDATE_EVERY_DAY;
  }
}
