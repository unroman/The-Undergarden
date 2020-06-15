package quek.undergarden.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.data.LanguageProvider;
import quek.undergarden.UndergardenMod;
import quek.undergarden.registry.*;

public class UndergardenLang extends LanguageProvider {

    public UndergardenLang(DataGenerator gen) {
        super(gen, UndergardenMod.MODID, "en_us");
    }

    protected void addItemGroup(ItemGroup group, String name) {
        add(group.getTranslationKey(), name);
    }

    @Override
    protected void addTranslations() {
        addBlock(UndergardenBlocks.undergarden_portal, "Undergarden Portal");
        addBlock(UndergardenBlocks.catalyst_slot, "Catalyst Slot");
        addBlock(UndergardenBlocks.deepsoil, "Deepsoil");
        addBlock(UndergardenBlocks.deepsoil_farmland, "Deepsoil Farmland");
        addBlock(UndergardenBlocks.deepturf_block, "Deepturf Block");
        addBlock(UndergardenBlocks.ashen_deepturf, "Ashen Deepturf Block");
        addBlock(UndergardenBlocks.depthrock, "Depthrock");
        addBlock(UndergardenBlocks.cobbled_depthrock, "Cobbled Depthrock");
        addBlock(UndergardenBlocks.smogstem_planks, "Smogstem Planks");
        addBlock(UndergardenBlocks.wigglewood_planks, "Wigglewood Planks");
        addBlock(UndergardenBlocks.depthrock_bricks, "Depthrock Bricks");
        addBlock(UndergardenBlocks.cracked_depthrock_bricks, "Cracked Depthrock Bricks");
        addBlock(UndergardenBlocks.shiverstone, "Shiverstone");
        addBlock(UndergardenBlocks.goo, "Scintling Goo");
        addBlock(UndergardenBlocks.smog_vent, "Smog Vent");

        addBlock(UndergardenBlocks.underbean_bush, "Underbean Bush");
        addBlock(UndergardenBlocks.blisterberry_bush, "Blisterberry Bush");
        addBlock(UndergardenBlocks.smogstem_sapling, "Smogstem Sapling");
        addBlock(UndergardenBlocks.smogstem_log, "Smogstem Log");
        addBlock(UndergardenBlocks.smogstem_leaves, "Smogstem Leaves");
        addBlock(UndergardenBlocks.wigglewood_sapling, "Wigglewood Sapling");
        addBlock(UndergardenBlocks.wigglewood_log, "Wigglewood Log");
        addBlock(UndergardenBlocks.wigglewood_leaves, "Wigglewood Leaves");
        addBlock(UndergardenBlocks.tall_deepturf, "Deepturf");
        addBlock(UndergardenBlocks.ashen_tall_deepturf, "Ashen Deepturf");
        addBlock(UndergardenBlocks.double_deepturf, "Tall Deepturf");
        addBlock(UndergardenBlocks.shimmerweed, "Shimmerweed");
        addBlock(UndergardenBlocks.double_shimmerweed, "Tall Shimmerweed");
        addBlock(UndergardenBlocks.ditchbulb_plant, "Ditchbulb Plant");
        addBlock(UndergardenBlocks.indigo_mushroom, "Indigo Mushroom");
        addBlock(UndergardenBlocks.veil_mushroom, "Veiled Mushroom");
        addBlock(UndergardenBlocks.ink_mushroom, "Ink Mushroom");
        addBlock(UndergardenBlocks.blood_mushroom, "Blood Mushroom");
        addBlock(UndergardenBlocks.gloomgourd, "Gloomgourd");
        addBlock(UndergardenBlocks.carved_gloomgourd, "Carved Gloomgourd");
        addBlock(UndergardenBlocks.gloomgourd_stem, "Gloomgourd Stem");
        addBlock(UndergardenBlocks.depthrock_pebbles, "Depthrock Pebbles");
        addBlock(UndergardenBlocks.glowing_kelp, "Glitterkelp");
        addBlock(UndergardenBlocks.glowing_kelp_plant, "Glitterkelp");
        addBlock(UndergardenBlocks.glowing_sea_grass, "Glowing Seagrass");

        addBlock(UndergardenBlocks.coal_ore, "Coal Ore");
        addBlock(UndergardenBlocks.cloggrum_ore, "Cloggrum Ore");
        addBlock(UndergardenBlocks.froststeel_ore, "Froststeel Ore");
        addBlock(UndergardenBlocks.utherium_ore, "Utherium Ore");
        addBlock(UndergardenBlocks.regalium_ore, "Regalium Ore");

        addBlock(UndergardenBlocks.cloggrum_block, "Cloggrum Block");
        addBlock(UndergardenBlocks.froststeel_block, "Froststeel Block");
        addBlock(UndergardenBlocks.utherium_block, "Utherium Block");
        addBlock(UndergardenBlocks.gloom_o_lantern, "Gloom o'Lantern");
        addBlock(UndergardenBlocks.cloggrum_bars, "Cloggrum Bars");
        addBlock(UndergardenBlocks.wigglewood_scaffolding, "Wigglewood Scaffolding");

        addBlock(UndergardenBlocks.depthrock_stairs, "Depthrock Stairs");
        addBlock(UndergardenBlocks.cobbled_depthrock_stairs, "Cobbled Depthrock Stairs");
        addBlock(UndergardenBlocks.depthrock_brick_stairs, "Depthrock Brick Stairs");
        addBlock(UndergardenBlocks.smogstem_stairs, "Smogstem Stairs");
        addBlock(UndergardenBlocks.wigglewood_stairs, "Wigglewood Stairs");

        addBlock(UndergardenBlocks.depthrock_slab, "Depthrock Slab");
        addBlock(UndergardenBlocks.cobbled_depthrock_slab, "Cobbled Depthrock Slab");
        addBlock(UndergardenBlocks.depthrock_brick_slab, "Depthrock Brick Slab");
        addBlock(UndergardenBlocks.smogstem_slab, "Smogstem Slab");
        addBlock(UndergardenBlocks.wigglewood_slab, "Wigglewood Slab");

        addBlock(UndergardenBlocks.cobbled_depthrock_wall, "Cobbled Depthrock Wall");
        addBlock(UndergardenBlocks.depthrock_brick_wall, "Depthrock Brick Wall");

        addBlock(UndergardenBlocks.smogstem_fence, "Smogstem Fence");
        addBlock(UndergardenBlocks.wigglewood_fence, "Wigglewood Fence");

        addBlock(UndergardenBlocks.smogstem_door, "Smogstem Door");
        addBlock(UndergardenBlocks.wigglewood_door, "Wigglewood Door");

        addBlock(UndergardenBlocks.smogstem_trapdoor, "Smogstem Trapdoor");
        addBlock(UndergardenBlocks.wigglewood_trapdoor, "Wigglewood Trapdoor");

        addItem(UndergardenItems.catalyst_item, "Catalyst");
        addItem(UndergardenItems.depthrock_pebble, "Depthrock Pebble");
        addItem(UndergardenItems.smogstem_stick, "Smogstem Stick");
        addItem(UndergardenItems.twistytwig, "Twistytwig");
        addItem(UndergardenItems.cloggrum_ingot, "Cloggrum Ingot");
        addItem(UndergardenItems.cloggrum_nugget, "Cloggrum Nugget");
        addItem(UndergardenItems.froststeel_ingot, "Froststeel Ingot");
        addItem(UndergardenItems.froststeel_nugget, "Froststeel Nugget");
        addItem(UndergardenItems.utheric_shard, "Utheric Shard");
        addItem(UndergardenItems.utherium_ingot, "Utherium Ingot");
        addItem(UndergardenItems.utherium_chunk, "Utherium Chunk");
        addItem(UndergardenItems.regalium_ingot, "Regalium Ingot");
        addItem(UndergardenItems.regalium_nugget, "Regalium Nugget");
        addItem(UndergardenItems.smogstem_torch, "Smogstem Torch");
        addItem(UndergardenItems.gloomgourd_seeds, "Gloomgourd Seeds");
        addItem(UndergardenItems.ditchbulb, "Ditchbulb");
        addItem(UndergardenItems.brute_tusk, "Brute Tusk");
        addItem(UndergardenItems.goo_ball, "Scintling Goo Ball");
        addItem(UndergardenItems.rotten_blisterberry, "Rotten Blisterberry");
        addItem(UndergardenItems.blisterbomb, "Blisterbomb");

        addItem(UndergardenItems.masticator_scales, "Masticator Scales");
        addItem(UndergardenItems.masticated_shield, "Masticated Shield");
        addItem(UndergardenItems.masticated_chestplate, "Masticated Chestplate");

        addItem(UndergardenItems.smogstem_sword, "Smogstem Sword");
        addItem(UndergardenItems.smogstem_pickaxe, "Smogstem Pickaxe");
        addItem(UndergardenItems.smogstem_axe, "Smogstem Axe");
        addItem(UndergardenItems.smogstem_shovel, "Smogstem Shovel");

        addItem(UndergardenItems.cloggrum_sword, "Cloggrum Sword");
        addItem(UndergardenItems.cloggrum_pickaxe, "Cloggrum Pickaxe");
        addItem(UndergardenItems.cloggrum_axe, "Cloggrum Axe");
        addItem(UndergardenItems.cloggrum_shovel, "Cloggrum Shovel");
        addItem(UndergardenItems.cloggrum_shield, "Cloggrum Shield");

        addItem(UndergardenItems.froststeel_sword, "Froststeel Sword");
        addItem(UndergardenItems.froststeel_pickaxe, "Froststeel Pickaxe");
        addItem(UndergardenItems.froststeel_axe, "Froststeel Axe");
        addItem(UndergardenItems.froststeel_shovel, "Froststeel Shovel");

        addItem(UndergardenItems.utheric_sword, "Utherium Sword");
        addItem(UndergardenItems.utheric_pickaxe, "Utherium Pickaxe");
        addItem(UndergardenItems.utheric_axe, "Utherium Axe");
        addItem(UndergardenItems.utheric_shovel, "Utherium Shovel");

        addItem(UndergardenItems.slingshot, "Slingshot");
        addItem(UndergardenItems.cloggrum_shears, "Cloggrum Shears");

        addItem(UndergardenItems.cloggrum_helmet, "Cloggrum Helmet");
        addItem(UndergardenItems.cloggrum_chestplate, "Cloggrum Chestplate");
        addItem(UndergardenItems.cloggrum_leggings, "Cloggrum Leggings");
        addItem(UndergardenItems.cloggrum_boots, "Cloggrum Boots");

        addItem(UndergardenItems.froststeel_helmet, "Froststeel Helmet");
        addItem(UndergardenItems.froststeel_chestplate, "Froststeel Chestplate");
        addItem(UndergardenItems.froststeel_leggings, "Froststeel Leggings");
        addItem(UndergardenItems.froststeel_boots, "Froststeel Boots");

        addItem(UndergardenItems.utheric_helmet, "Utherium Helmet");
        addItem(UndergardenItems.utheric_chestplate, "Utherium Chestplate");
        addItem(UndergardenItems.utheric_leggings, "Utherium Leggings");
        addItem(UndergardenItems.utheric_boots, "Utherium Boots");

        addItem(UndergardenItems.underbeans, "Underbeans");
        addItem(UndergardenItems.blisterberry, "Blisterberry");
        addItem(UndergardenItems.gloomgourd_pie, "Gloomgourd Pie");
        addItem(UndergardenItems.raw_dweller_meat, "Raw Dweller Meat");
        addItem(UndergardenItems.dweller_steak, "Dweller Steak");

        addItem(UndergardenItems.dweller_spawn_egg, "Dweller Spawn Egg");
        addItem(UndergardenItems.gwibling_spawn_egg, "Gwibling Spawn Egg");
        addItem(UndergardenItems.rotdweller_spawn_egg, "Rotdweller Spawn Egg");
        addItem(UndergardenItems.rotwalker_spawn_egg, "Rotwalker Spawn Egg");
        addItem(UndergardenItems.rotbeast_spawn_egg, "Rotbeast Spawn Egg");
        addItem(UndergardenItems.brute_spawn_egg, "Brute Spawn Egg");
        addItem(UndergardenItems.scintling_spawn_egg, "Scintling Spawn Egg");
        addItem(UndergardenItems.blisterbomber_spawn_egg, "Blisterbomber Spawn Egg");

        addItem(UndergardenItems.masticator_spawn_egg, "Masticator Spawn Egg");

        addBiome(UndergardenBiomes.FORGOTTEN_FIELD, "Forgotten Field");
        addBiome(UndergardenBiomes.SMOGSTEM_FOREST, "Smogstem Forest");
        addBiome(UndergardenBiomes.BARREN_ABYSS, "Barren Abyss");
        addBiome(UndergardenBiomes.WIGGLEWOOD_FOREST, "Wigglewood Forest");
        addBiome(UndergardenBiomes.DENSE_FOREST, "Dense Forest");
        addBiome(UndergardenBiomes.SMOG_SPIRES, "Smog Spires");

        addEntityType(UndergardenEntities.DWELLER, "Dweller");
        addEntityType(UndergardenEntities.ROTDWELLER, "Rotdweller");
        addEntityType(UndergardenEntities.GWIBLING, "Gwibling");
        addEntityType(UndergardenEntities.ROTWALKER, "Rotwalker");
        addEntityType(UndergardenEntities.ROTBEAST, "Rotbeast");
        addEntityType(UndergardenEntities.SKIZ_SWARMER, "Skiz Swarmer");
        addEntityType(UndergardenEntities.BRUTE, "Brute");
        addEntityType(UndergardenEntities.SCINTLING, "Scintling");
        addEntityType(UndergardenEntities.BLISTERBOMBER, "Blisterbomber");

        addEntityType(UndergardenEntities.MASTICATOR, "Masticator");

        addItemGroup(UndergardenItemGroups.UNDERGARDEN_BLOCKS, "Undergarden Blocks");
        addItemGroup(UndergardenItemGroups.UNDERGARDEN_GEAR, "Undergarden Tools & Combat");
        addItemGroup(UndergardenItemGroups.UNDERGARDEN_ITEMS, "Undergarden Items");

        add("advancement.undergarden.title", "The Undergarden");
        add("advancement.undergarden.desc", "Enter the Undergarden. The forgotten land awaits...");

        add("advancement.gourd_lord.title", "Gourd Lord");
        add("advancement.gourd_lord.desc", "You've done it. You've acquired a stack of Gloomgourds.");

        add("advancement.slay_rotwalker.title", "Slay Rotwalker");
        add("advancement.slay_rotwalker.desc", "Slay the weakest of the Rotspawn, the Rotwalker.");

        add("advancement.rotbane.title", "Rotbane");
        add("advancement.rotbane.desc", "Slay all kinds of Rotspawn.");

        add("advancement.subterranean_cartographer.title", "Subterranean Cartographer");
        add("advancement.subterranean_cartographer.desc", "Discover every Undergarden biome.");

        add("advancement.deep_extraction.title", "Deep Extraction");
        add("advancement.deep_extraction.desc", "Acquire a Cloggrum Ingot.");

        add("advancement.catalyst.title", "Create the Catalysts");
        add("advancement.catalyst.desc", "Craft 12 Catalysts using Iron and Gold to activate the Undergarden portal found in mountain biomes.");

        add("advancement.glorious_beans.title", "Glorious Beans!");
        add("advancement.glorious_beans.desc", "Find and pick an Underbean bush.");

        add("advancement.slay_masticator.title", "Sprankton");
        add("advancement.slay_masticator.desc", "Slay the Masticator.");

        add("advancement.masticated_armory.title", "Masticated Armory");
        add("advancement.masticated_armory.desc", "Craft both the Masticated Chestplate and Shield.");

        add("tooltip.cloggrum_sword", "High damage, low durability.");
        add("tooltip.froststeel_sword", "Slows targets.");
        add("tooltip.utheric_sword", "Deals 10 damage to Rotspawn.");
        add("tooltip.utheric_axe", "Bonus damage to passive animals.");
        add("tooltip.slingshot", "Uses Depthrock Pebbles as ammo.");
        add("tooltip.cloggrum_boots", "Scintling Goo doesn't slow you down when worn.");
    }
}