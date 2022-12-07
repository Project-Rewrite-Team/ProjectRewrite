package net.havenselph.projectrewrite.block.entity;

import net.havenselph.projectrewrite.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType YUCCA_PALM =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("yucca_palm"));
}
