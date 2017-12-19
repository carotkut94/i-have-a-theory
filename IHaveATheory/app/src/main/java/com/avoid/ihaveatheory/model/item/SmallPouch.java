package com.avoid.ihaveatheory.model.item;

import com.avoid.ihaveatheory.R;

public class SmallPouch extends Item {
    public SmallPouch() {
        itemType = ItemType.SMALL_POUCH;
        name = R.string.item_small_pouch_name;
        description = R.string.item_small_pouch_des;
        image = R.drawable.default_icon_png;
    }
}
