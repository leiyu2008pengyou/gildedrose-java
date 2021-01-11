package com.gildedrose;

import static com.gildedrose.Constant.HIGHEST_QUALITY;
import static com.gildedrose.Constant.LOWEST_QUALITY;
import static com.gildedrose.Constant.QUALITY_UPDATE_EVERY_DAY;

public class AgedBrieItem extends Item {
  public AgedBrieItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void updateQuality() {
    if (mQuality < HIGHEST_QUALITY) {
      mQuality = mQuality + QUALITY_UPDATE_EVERY_DAY;
    }
  }

  @Override
  protected void updateQualityWhenExpired() {
    if (mSellIn >= LOWEST_QUALITY) {
      return;
    }
    if (mQuality < HIGHEST_QUALITY) {
      mQuality = mQuality + QUALITY_UPDATE_EVERY_DAY;
    }
  }
}
