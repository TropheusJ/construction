package io.github.tropheusj.construction.fabric;

import io.github.tropheusj.construction.Construction;
import net.minecraftforge.fml.common.Mod;

@Mod(Construction.MOD_ID)
public class ConstructionForge {
    public ConstructionForge() {
        Construction.init();
    }
}
