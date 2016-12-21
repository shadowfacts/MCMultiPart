package mcmultipart.api.capability;

import java.util.Optional;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class CapabilityHelper {

    public static <T> Optional<T> optional(ICapabilityProvider provider, Capability<T> capability, EnumFacing facing) {
        return provider.hasCapability(capability, facing) ? Optional.ofNullable(provider.getCapability(capability, facing)) : Optional.empty();
    }

}
