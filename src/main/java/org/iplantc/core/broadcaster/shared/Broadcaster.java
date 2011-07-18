package org.iplantc.core.broadcaster.shared;

/**
 * Adapter interface for facilitating communication between different components. There is a conceptual
 * channel where components for passing messages between adapters.
 * 
 * @author amuir
 * 
 */
public interface Broadcaster {
    void setBroadcastCommand(BroadcastCommand cmdBroadcast);
}
