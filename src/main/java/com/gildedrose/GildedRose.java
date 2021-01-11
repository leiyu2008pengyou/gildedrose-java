package com.gildedrose;

class GildedRose {
  Item[] mItems;

  public GildedRose(Item[] items) {
    mItems = items;
  }

  public void updateQuality() {
    for (Item item : mItems) {
      item.updateQualityAndSellIn();
    }
  }
}
