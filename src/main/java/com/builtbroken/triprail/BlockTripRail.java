package com.builtbroken.triprail;

import net.minecraft.block.BlockRailDetector;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 6/22/2018.
 */
public class BlockTripRail extends BlockRailDetector
{
    public BlockTripRail()
    {
        super();
        setRegistryName(TripRail.DOMAIN, "tripwire_rail");
        setUnlocalizedName(TripRail.PREFIX + "rail.tripwire");
        setCreativeTab(CreativeTabs.TRANSPORTATION);
    }

    @Override
    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return 15 - super.getWeakPower(blockState, blockAccess, pos, side);
    }

    @Override
    public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return side == EnumFacing.UP ? 15 - super.getStrongPower(blockState, blockAccess, pos, side) : 0;
    }
}
