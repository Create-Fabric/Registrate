package com.tterrag.registrate.util.entry;

import com.tterrag.registrate.AbstractRegistrate;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ItemEntry<T extends Item> extends ItemProviderEntry<Item, T> {

    public ItemEntry(AbstractRegistrate<?> owner, ResourceKey<Item> key) {
        super(owner, key);
    }
    
    public static <T extends Item> ItemEntry<T> cast(RegistryEntry<Item, T> entry) {
        return RegistryEntry.cast(ItemEntry.class, entry);
    }
}
