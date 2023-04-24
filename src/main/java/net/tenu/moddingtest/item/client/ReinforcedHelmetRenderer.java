package net.tenu.moddingtest.item.client;

import net.tenu.moddingtest.item.custom.ReinforcedHelmetItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ReinforcedHelmetRenderer extends GeoArmorRenderer<ReinforcedHelmetItem> {
    public ReinforcedHelmetRenderer() {
        super(new ReinforcedHelmetModel());
    }
}
