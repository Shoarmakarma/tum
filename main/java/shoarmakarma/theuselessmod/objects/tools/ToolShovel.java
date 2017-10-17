package shoarmakarma.theuselessmod.objects.tools;

import net.minecraft.item.ItemSpade;
import shoarmakarma.theuselessmod.Main;
import shoarmakarma.theuselessmod.init.ItemInit;
import shoarmakarma.theuselessmod.util.interfaces.IHasModel;

public class ToolShovel extends ItemSpade implements IHasModel {

	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tumtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


	
}
