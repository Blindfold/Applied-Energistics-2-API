package appeng.api.implementations;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Implemented on a {@link Item}
 */
public interface IStorageComponent
{

	/**
	 * This isn't necessarily the same as if you make a storage cell out of it,
	 * but all of AE's default cells do it that way, its currently only used for
	 * the condenser.
	 * 
	 * @param cellItem
	 * @return numberofBytes
	 */
	int getBytes(ItemStack is);

	/**
	 * Just true or false for the item stack.
	 * 
	 * @param is
	 * @return
	 */
	boolean isStorageComponent(ItemStack is);

}