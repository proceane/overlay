package com.jcs.overlay.websocket.messages.J2W;

public class SetSummonerSpellsMessage {
    private final String messageType = "SetSummonerSpells";
    private final long cellId;
    private final int spellSlot;
    private final Long spellId;

    public SetSummonerSpellsMessage(long adjustedCellId, int spellSlot, Long spellId) {
        this.cellId = adjustedCellId;
        this.spellSlot = spellSlot;
        this.spellId = spellId;
    }
}
