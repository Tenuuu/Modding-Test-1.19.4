package net.tenu.moddingtest.item.client;

import net.minecraft.util.Identifier;
import net.tenu.moddingtest.ModdingTest;
import net.tenu.moddingtest.item.custom.ReinforcedHelmetItem;
import software.bernie.geckolib.model.GeoModel;

public class ReinforcedHelmetModel extends GeoModel<ReinforcedHelmetItem> {
    @Override
    public Identifier getModelResource(ReinforcedHelmetItem animatable) {
        return new Identifier(ModdingTest.MOD_ID, "geo/reinforced_helmet.geo.json");
    }

    @Override
    public Identifier getTextureResource(ReinforcedHelmetItem animatable) {
        return new Identifier(ModdingTest.MOD_ID, "textures/armor/reinforced_helmet_texture.png");
    }

    @Override
    public Identifier getAnimationResource(ReinforcedHelmetItem animatable) {
        return new Identifier(ModdingTest.MOD_ID, "reinforced_helmet.animation.json");
    }
}
