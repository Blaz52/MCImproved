package net.blaz.minecraftimproved.world.features.tree;

import net.blaz.minecraftimproved.world.features.ModConfiguredFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
        public static final PlacedFeature REDWOOD_PLACED = PlacementUtils.register("redwood_placed",
                ModConfiguredFeatures.REDWOOD_TREE_CHECKED.placed(VegetationPlacements.treePlacement(
                        PlacementUtils.countExtra(1, 0.1f, 2))));
}
