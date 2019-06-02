package com.jcs.overlay.websocket;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

public class WSServer extends WebSocketServer {
    private final Logger logger = LoggerFactory.getLogger(WSServer.class);

    public WSServer(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        this.logger.info("Connecté à la page CEF !");
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        this.logger.info("Déconnecté de la page CEF.");
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        this.logger.info("Message reçu : " + message);
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        this.logger.error("Une erreur s'est produite.", ex);
    }

    @Override
    public void onStart() {
        this.logger.info("Serveur WebSocket démarré avec succès.");
    }
}