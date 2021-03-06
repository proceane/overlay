package com.jcs.overlay.websocket.messages.J2W;

import java.util.Map;

public class PlayerNamesMessage {
    private final Map<Integer, String> players;
    private final String messageType = "PlayerNames";

    public PlayerNamesMessage(Map<Integer, String> players) {
        this.players = players;
    }
}
