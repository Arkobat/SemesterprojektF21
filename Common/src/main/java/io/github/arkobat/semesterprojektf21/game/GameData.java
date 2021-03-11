package io.github.arkobat.semesterprojektf21.game;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class GameData {

    private final float delta;
    private final int displayWidth;
    private final int displayHeight;
    private final Set<Key> keys;

    public boolean isPressed(Key key) {
        return keys.contains(key);
    }

    public float getDelta() {
        return delta;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public int getDisplayHeight() {
        return displayHeight;
    }

}
