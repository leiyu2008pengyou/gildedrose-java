package com.gildedrose;

import static com.gildedrose.Constant.FIVE_DAY_BEFORE_THE_SHOW;
import static com.gildedrose.Constant.HIGHEST_QUALITY;
import static com.gildedrose.Constant.LOWEST_QUALITY;
import static com.gildedrose.Constant.QUALITY_UPDATE_EVERY_DAY;
import static com.gildedrose.Constant.TEN_DAY_BEFORE_THE_SHOW;

public class BackstagePasssesItem extends Item{
  public BackstagePasssesItem(String name, int sellIn, int quality) {
    super(name, sellIn, quality);
  }

  @Override
  protected void updateQuality() {
    if (mQuality < HIGHEST_QUALITY) {
      mQuality = mQuality + QUALITY_UPDATE_EVERY_DAY;

      if (mSellIn <= TEN_DAY_BEFORE_THE_SHOW) {
        if (mQuality < HIGHEST_QUALITY) {
          mQuality = mQuality + QUALITY_UPDATE_EVERY_DAY;
        }
      }
      if (mSellIn <= FIVE_DAY_BEFORE_THE_SHOW) {
        if (mQuality < HIGHEST_QUALITY) {
          mQuality = mQuality + QUALITY_UPDATE_EVERY_DAY;
        }
      }
    }
  }

  @Override
  protected void updateQualityWhenExpired() {
    if (mSellIn >= LOWEST_QUALITY) {
      return;
    }
    mQuality = LOWEST_QUALITY;
  }
}
