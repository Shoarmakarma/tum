package shoarmakarma.theuselessmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import shoarmakarma.theuselessmod.init.ItemInit;

public class TumTab extends CreativeTabs {

	public TumTab(String label) {
		super("tumtab");
		this.setBackgroundImageName("tumtab.png");
		
	}

	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemInit.INGOT_EPIDOTE);
	}
	

}
