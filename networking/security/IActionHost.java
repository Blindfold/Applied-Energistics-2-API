package appeng.api.networking.security;

import appeng.api.networking.IGridHost;
import appeng.api.networking.IGridNode;

public interface IActionHost extends IGridHost
{

	IGridNode getActionableNode();

}
