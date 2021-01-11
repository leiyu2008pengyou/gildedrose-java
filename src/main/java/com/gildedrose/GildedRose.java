package com.gildedrose;

class GildedRose {
  public final static int QUALITY_DECREASE_EVERY_DAY = 1;
  public final static int QUALITY_INCREASE_EVERY_DAY = 1;
  public final static int HIGHEST_QUALITY = 50;
  public final static int LOWEST_QUALITY = 0;
  public final static int TEN_DAY_BEFORE_THE_SHOW = 10;
  public final static int FIVE_DAY_BEFORE_THE_SHOW = 5;

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
    if (!item.isAgedBrie() && !item.isBackstagePassses()) {
      if (item.mQuality > LOWEST_QUALITY) {
        if (!item.isSulfuras()) {
          item.mQuality = item.mQuality - QUALITY_DECREASE_EVERY_DAY;
        }
      }
    } else {
      if (item.mQuality < HIGHEST_QUALITY) {
        item.mQuality = item.mQuality + QUALITY_INCREASE_EVERY_DAY;

        if (item.isBackstagePassses()) {
          if (item.mSellIn <= TEN_DAY_BEFORE_THE_SHOW) {
            if (item.mQuality < HIGHEST_QUALITY) {
              item.mQuality = item.mQuality + QUALITY_INCREASE_EVERY_DAY;
            }
          }

          if (item.mSellIn <= FIVE_DAY_BEFORE_THE_SHOW) {
            if (item.mQuality < HIGHEST_QUALITY) {
              item.mQuality = item.mQuality + QUALITY_INCREASE_EVERY_DAY;
            }
          }
        }
      }
    }
  }

  private void updateSellIn(Item item) {
    if (!item.isSulfuras()) {
      item.mSellIn = item.mSellIn - QUALITY_DECREASE_EVERY_DAY;
    }
  }

  private void updateQualityWhenExpired(Item item) {
    if (item.mSellIn < LOWEST_QUALITY) {
      if (!item.isAgedBrie()) {
        if (!item.isBackstagePassses()) {
          if (item.mQuality > LOWEST_QUALITY) {
            if (!item.isSulfuras()) {
              item.mQuality = item.mQuality - QUALITY_DECREASE_EVERY_DAY;
            }
          }
        } else {
          item.mQuality = LOWEST_QUALITY;
        }
      } else {
        if (item.mQuality < HIGHEST_QUALITY) {
          item.mQuality = item.mQuality + QUALITY_INCREASE_EVERY_DAY;
        }
      }
    }
  }
}
