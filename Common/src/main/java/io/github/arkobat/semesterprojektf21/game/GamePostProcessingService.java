package io.github.arkobat.semesterprojektf21.game;

import io.github.arkobat.semesterprojektf21.World;

public interface GamePostProcessingService {

    void process(GameData gameData, World world);
}
