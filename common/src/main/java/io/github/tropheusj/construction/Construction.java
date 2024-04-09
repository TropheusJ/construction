package io.github.tropheusj.construction;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Construction {
    public static final String MOD_ID = "construction";
    public static final String NAME = "Construction";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
