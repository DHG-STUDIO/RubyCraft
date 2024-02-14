package itemgroup;

import com.ptk671.rubycraft.Items;
import com.ptk671.rubycraft.Rubycraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.ptk671.rubycraft.Items.*;
import static com.ptk671.rubycraft.Rubycraft.id;


public class RubyCraftMenu {
    public static final ItemGroup rubycraft_menu = FabricItemGroupBuilder.build(
            id( "all"),
            //icon
            () -> new ItemStack(Ruby));

}