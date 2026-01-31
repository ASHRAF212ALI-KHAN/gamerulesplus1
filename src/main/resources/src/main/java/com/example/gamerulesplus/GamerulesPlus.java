package com.example.gamerulesplus;

import net.fabricmc.api.ModInitializer;
import net.minecraft.world.GameRules;

public class GamerulesPlus implements ModInitializer {

    public static GameRules.Key<GameRules.IntRule> ANIMAL_GROW;

    @Override
    public void onInitialize() {
        ANIMAL_GROW = GameRules.register(
            "animalBabyGrowTimeSeconds",
            GameRules.Category.MOBS,
            GameRules.IntRule.create(600)
        );
    }
}
