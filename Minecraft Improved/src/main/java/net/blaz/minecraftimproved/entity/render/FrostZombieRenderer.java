package net.blaz.minecraftimproved.entity.render;

import net.blaz.minecraftimproved.entity.customentity.FrostZombieEntity;
import net.blaz.minecraftimproved.entity.model.FrostZombieModel;
import net.blaz.minecraftimproved.minecraftimproved;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FrostZombieRenderer extends MobRenderer<FrostZombieEntity, FrostZombieModel<FrostZombieEntity>> {

    {
        protected static final ResourceLocation TEXTURE =
                new ResourceLocation(minecraftimproved.MOD_ID, "textures/entity/frost_zombie.png");

        public FrostZombieRenderer(EntityRendererProvider renderprovider) {
            super(renderManagerIn, new FrostZombieModel<>(), 0.7F);
        }

        @Override
        public ResourceLocation getEntityTexture(FrostZombieModel entity) {
            return TEXTURE;
        }
    }
}
