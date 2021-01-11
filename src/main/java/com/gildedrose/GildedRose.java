package com.gildedrose;

import static com.gildedrose.Constant.FIVE_DAY_BEFORE_THE_SHOW;
import static com.gildedrose.Constant.HIGHEST_QUALITY;
import static com.gildedrose.Constant.LOWEST_QUALITY;
import static com.gildedrose.Constant.QUALITY_UPDATE_EVERY_DAY;
import static com.gildedrose.Constant.TEN_DAY_BEFORE_THE_SHOW;

class GildedRose {


  Item[] mItems;

  public GildedRose(Item[] items) {
    mItems = items;
  }

  public void update_quality() {
    for (Item item : mItems) {
      updateQuality(item);
      updateSellIn(item);
      updateQualityWhenExpired(item);
    }
  }

  private void updateQuality(Item item) {
    if (item.isAgedBrie()) {
      if (item.mQuality < HIGHEST_QUALITY) {
        item.mQuality = item.mQuality + QUALITY_UPDATE_EVERY_DAY;
      }
      return;
    }
    if (item.isBackstagePassses()) {
      if (item.mQuality < HIGHEST_QUALITY) {
        item.mQuality = item.mQuality + QUALITY_UPDATE_EVERY_DAY;

        if (item.mSellIn <= TEN_DAY_BEFORE_THE_SHOW) {
          if (item.mQuality < HIGHEST_QUALITY) {
            item.mQuality = item.mQuality + QUALITY_UPDATE_EVERY_DAY;
          }
        }
        if (item.mSellIn <= FIVE_DAY_BEFORE_THE_SHOW) {
          if (item.mQuality < HIGHEST_QUALITY) {
            item.mQuality = item.mQuality + QUALITY_UPDATE_EVERY_DAY;
          }
        }
      }
      return;
    }
    if (item.isSulfuras()) {
      return;
    }
    if (item.mQuality <= LOWEST_QUALITY) {
      return;
    }
    item.mQuality = item.mQuality - QUALITY_UPDATE_EVERY_DAY;
  }

  protected void updateSellIn(Item item) {
    if (item.isSulfuras()) {
      return;
    }
    item.mSellIn = item.mSellIn - QUALITY_UPDATE_EVERY_DAY;
  }

  private void updateQualityWhenExpired(Item item) {
    if (item.mSellIn >= LOWEST_QUALITY) {
      return;
    }
    if (item.isAgedBrie()) {
      if (item.mQuality < HIGHEST_QUALITY) {
        item.mQuality = item.mQuality + QUALITY_UPDATE_EVERY_DAY;
      }
      return;
    }
    if (item.isBackstagePassses()) {
      item.mQuality = LOWEST_QUALITY;
      return;
    }
    if (item.isSulfuras()) {
      return;
    }
    if (item.mQuality <= LOWEST_QUALITY) {
      return;
    }
    item.mQuality = item.mQuality - QUALITY_UPDATE_EVERY_DAY;
  }
}
