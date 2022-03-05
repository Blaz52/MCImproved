package net.blaz.minecraftimproved.entity;

import net.blaz.minecraftimproved.entity.customentity.FrostZombieEntity;
import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, minecraftimproved.MOD_ID);

    public static final RegistryObject<EntityType<FrostZombieEntity>> FROST_ZOMBIE =
            ENTITY_TYPES.register("frost_zombie", () -> EntityType.Builder.of(FrostZombieEntity::new, MobCategory.MONSTER).sized(1f,3f).build);


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

