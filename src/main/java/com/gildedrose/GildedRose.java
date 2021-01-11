package com.gildedrose;

class GildedRose {


  Item[] mItems;

  public GildedRose(Item[] items) {
    mItems = items;
  }

  public void update_quality() {
    for (Item item : mItems) {
      item.updateQualityAndSellIn();
    }
  }
}
