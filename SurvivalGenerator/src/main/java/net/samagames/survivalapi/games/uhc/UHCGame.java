package net.samagames.survivalapi.games.uhc;

import net.samagames.survivalapi.SurvivalGenerator;
import net.samagames.survivalapi.games.AbstractGame;
import org.bukkit.event.world.WorldInitEvent;

public class UHCGame extends AbstractGame
{
    public UHCGame(SurvivalGenerator plugin)
    {
        super(plugin);
    }

    @Override
    public void preInit() {}

    @Override
    public void init(WorldInitEvent event) {}
}
