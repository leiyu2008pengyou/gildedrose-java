package com.gildedrose;

class GildedRose {
  private static String AGED_BRIE = "Aged Brie";
  private static String BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT =
      "Backstage passes to a TAFKAL80ETC concert";
  private static String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

  Item[] mItems;

  public GildedRose(Item[] items) {
    mItems = items;
  }

  public void update_quality() {
    for (Item item : mItems) {
      if (!item.mName.equals(AGED_BRIE)
          && !item.mName.equals(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT)) {
        if (item.mQuality > 0) {
          if (!item.mName.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            item.mQuality = item.mQuality - 1;
          }
        }
      } else {
        if (item.mQuality < 50) {
          item.mQuality = item.mQuality + 1;

          if (item.mName.equals(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT)) {
            if (item.mSellIn < 11) {
              if (item.mQuality < 50) {
                item.mQuality = item.mQuality + 1;
              }
            }

            if (item.mSellIn < 6) {
              if (item.mQuality < 50) {
                item.mQuality = item.mQuality + 1;
              }
            }
          }
        }
      }

      if (!item.mName.equals(SULFURAS_HAND_OF_RAGNAROS)) {
        item.mSellIn = item.mSellIn - 1;
      }

      if (item.mSellIn < 0) {
        if (!item.mName.equals(AGED_BRIE)) {
          if (!item.mName.equals(BACKSTAGE_PASSSES_TO_A_TAFKAL80ETC_CONCERT)) {
            if (item.mQuality > 0) {
              if (!item.mName.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                item.mQuality = item.mQuality - 1;
              }
            }
          } else {
            item.mQuality = 0;
          }
        } else {
          if (item.mQuality < 50) {
            item.mQuality = item.mQuality + 1;
          }
        }
      }
    }
  }

  private void resizeQualityIfNecessary() {

  }
}
