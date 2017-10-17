package shoarmakarma.theuselessmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import shoarmakarma.theuselessmod.objects.armour.ArmourBase;
import shoarmakarma.theuselessmod.objects.items.ItemBase;
import shoarmakarma.theuselessmod.objects.tools.ToolAxe;
import shoarmakarma.theuselessmod.objects.tools.ToolHoe;
import shoarmakarma.theuselessmod.objects.tools.ToolPickaxe;
import shoarmakarma.theuselessmod.objects.tools.ToolShovel;
import shoarmakarma.theuselessmod.objects.tools.ToolSword;
import shoarmakarma.theuselessmod.util.Reference;

public class ItemInit {

	//List of all CUSTOM items
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_EPIDOTE = EnumHelper.addToolMaterial("tool_epidote", 4, 2271, 9.5F, 4.0F, 15);
	public static final ArmorMaterial ARMOUR_EPIDOTE = EnumHelper.addArmorMaterial("armour_epidote", Reference.MODID + ":epidote", 36, new int[]{4, 9, 7, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	//Items
	public static final Item INGOT_EPIDOTE = new ItemBase("ingot_epidote");
	
	
	//Tools
	public static final Item AXE_EPIDOTE = new ToolAxe("axe_epidote", TOOL_EPIDOTE);
	public static final Item HOE_EPIDOTE = new ToolHoe("hoe_epidote", TOOL_EPIDOTE);
	public static final Item SWORD_EPIDOTE = new ToolSword("sword_epidote", TOOL_EPIDOTE);
	public static final Item SHOVEL_EPIDOTE = new ToolShovel("shovel_epidote", TOOL_EPIDOTE);
	public static final Item PICKAXE_EPIDOTE = new ToolPickaxe("pickaxe_epidote", TOOL_EPIDOTE);
	
	
	//Armour
	public static final Item HELMET_EPIDOTE = new ArmourBase("helmet_epidote", ARMOUR_EPIDOTE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_EPIDOTE = new ArmourBase("chestplate_epidote", ARMOUR_EPIDOTE, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_EPIDOTE = new ArmourBase("leggings_epidote", ARMOUR_EPIDOTE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_EPIDOTE = new ArmourBase("boots_epidote", ARMOUR_EPIDOTE, 1, EntityEquipmentSlot.FEET);
}
