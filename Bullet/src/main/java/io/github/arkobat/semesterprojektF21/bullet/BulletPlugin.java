package io.github.arkobat.semesterprojektF21.bullet;

import io.github.arkobat.semesterprojektF21.common.World;
import io.github.arkobat.semesterprojektF21.common.entity.Entity;
import io.github.arkobat.semesterprojektF21.common.event.EventManager;
import io.github.arkobat.semesterprojektF21.common.game.GameData;
import io.github.arkobat.semesterprojektF21.common.game.GamePluginService;
import io.github.arkobat.semesterprojektF21.common.weapon.Bullet;
import io.github.arkobat.semesterprojektF21.bullet.listener.ShootListener;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BulletPlugin implements GamePluginService {

   public static final String MODULE_NAME = "Bullet";

    @Override
    public void start(@NotNull GameData gameData, @NotNull World world) {
        EventManager.registerListener(new ShootListener());
    }

    @Override
    public void stop(@NotNull GameData gameData, @NotNull World world) {
        List<Entity> bullets = new ArrayList<>(world.getEntities(Bullet.class));
        for (Entity entity : bullets) {
            world.removeEntity(entity);
        }
    }

}
