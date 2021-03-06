package com.zsmartsystems.zwave.transaction;

/**
 *
 * @author Chris Jackson
 *
 */
public class ZWaveTransactionResponse {
    public enum State {
        CANCELLED,
        TIMEOUT_WAITING_FOR_CONTROLLER,
        TIMEOUT_WAITING_FOR_RESPONSE,
        TIMEOUT_WAITING_FOR_DATA,
        COMPLETE
    };

    private State state;

    ZWaveTransactionResponse(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
