package com.blaz.mcimproved.worldgen.ores;



import net.minecraftforge.common.ForgeConfigSpec;

public class OresConfig {


    public static ForgeConfigSpec.IntValue OVERWORLD_VEINSIZE;
    public static ForgeConfigSpec.IntValue OVERWORLD_AMOUNT;
    public static ForgeConfigSpec.IntValue DEEPSLATE_VEINSIZE;
    public static ForgeConfigSpec.IntValue DEEPSLATE_AMOUNT;
    public static ForgeConfigSpec.IntValue NETHER_VEINSIZE;
    public static ForgeConfigSpec.IntValue NETHER_AMOUNT;
    public static ForgeConfigSpec.IntValue END_VEINSIZE;
    public static ForgeConfigSpec.IntValue END_AMOUNT;


    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.push("ores");

        OVERWORLD_VEINSIZE = COMMON_BUILDER
                .defineInRange("overworldVeinsize", 5, 1, Integer.MAX_VALUE);
        OVERWORLD_AMOUNT = COMMON_BUILDER
                .defineInRange("overworldAmount", 100, 1, Integer.MAX_VALUE);
        DEEPSLATE_VEINSIZE = COMMON_BUILDER
                .defineInRange("deepslateVeinsize", 5, 1, Integer.MAX_VALUE);
        DEEPSLATE_AMOUNT = COMMON_BUILDER
                .defineInRange("deepslateAmount", 3, 1, Integer.MAX_VALUE);
        NETHER_VEINSIZE = COMMON_BUILDER
                .defineInRange("netherVeinsize", 5, 1, Integer.MAX_VALUE);
        NETHER_AMOUNT = COMMON_BUILDER
                .defineInRange("netherAmount", 3, 1, Integer.MAX_VALUE);
        END_VEINSIZE = COMMON_BUILDER
                .defineInRange("endVeinsize", 10, 1, Integer.MAX_VALUE);
        END_AMOUNT = COMMON_BUILDER
                .defineInRange("endAmount", 6, 1, Integer.MAX_VALUE);


        COMMON_BUILDER.pop();
    }

}
