package io.github.arkobat.semesterprojektF21;

import io.github.arkobat.semesterprojektF21.common.World;
import io.github.arkobat.semesterprojektF21.common.entity.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class TempWorld implements World {

    private final List<Entity> entities = new LinkedList<>();

    @NotNull
    @Override
    public Collection<Entity> getEntities() {
        return this.entities;
    }

    @SafeVarargs
    @NotNull
    @Override
    public final <E extends Entity> Collection<Entity> getEntities(@NotNull Class<E>... entityTypes) {
        List<Entity> list = new ArrayList<>();
        for (Entity entity : entities) {
            for (Class<E> clazz : entityTypes) {
                if (clazz == entity.getClass()) {
                    list.add(entity);
                    break;
                }
            }
        }
        return list;
    }

    @Override
    public void addEntity(@NotNull Entity entity) {
        this.entities.add(entity);
    }

    @Override
    public void removeEntity(@NotNull Entity entity) {
        this.entities.remove(entity);
    }

}
