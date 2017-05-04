package com.ufidstudios.igt.gamestatus.model;

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
public class GameInfoCollection {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<GameInfo> ITEMS = new ArrayList<GameInfo>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, GameInfo> ITEM_MAP = new HashMap<String, GameInfo>();

    private static int mCount;


    private static void addItem(GameInfo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    private static GameInfo createGameInfo(int position) {
        return new GameInfo(String.valueOf(position), "Item " + position, makeDetails(position));
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


