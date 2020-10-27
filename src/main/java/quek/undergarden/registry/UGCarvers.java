package quek.undergarden.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.carver.ICarverConfig;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import quek.undergarden.UGMod;
import quek.undergarden.world.gen.carver.UGCaveWorldCarver;

public class UGCarvers {

    public static final DeferredRegister<WorldCarver<?>> CARVERS = DeferredRegister.create(ForgeRegistries.WORLD_CARVERS, UGMod.MODID);

    public static final RegistryObject<WorldCarver<ProbabilityConfig>> undergarden_cave = CARVERS.register(
            "undergarden_cave", () -> new UGCaveWorldCarver(ProbabilityConfig.field_236576_b_));

    public static void registerConfiguredCarvers() {
        register("undergarden_cave", undergarden_cave.get().func_242761_a(new ProbabilityConfig(0.5F)));
    }

    private static <WC extends ICarverConfig> ConfiguredCarver<WC> register(String name, ConfiguredCarver<WC> carver) {
        return Registry.register(WorldGenRegistries.CONFIGURED_CARVER, new ResourceLocation(UGMod.MODID, name), carver);
        //return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_CARVER, name, carver);
    }
}