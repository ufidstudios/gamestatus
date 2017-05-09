package com.ufidstudios.igt.gamestatus.model;

import com.ufidstudios.igt.gamestatus.model.valueobjects.GameData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class GameDataCollection {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<GameData> ITEMS = new ArrayList<GameData>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, GameData> ITEM_MAP = new HashMap<String, GameData>();

    private static int mCount;


    private static void addItem(GameData item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    private static GameData createGameInfo(int position) {
        return null;//new GameData(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}


