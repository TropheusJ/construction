package io.github.tropheusj.construction.fabric;

import io.github.tropheusj.construction.Construction;
import net.fabricmc.api.ModInitializer;

public class ConstructionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Construction.init();
    }
}
