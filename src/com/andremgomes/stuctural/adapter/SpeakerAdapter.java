package com.andremgomes.stuctural.adapter;

public class SpeakerAdapter implements AudioDevice {
    private final Speaker speaker;

    public SpeakerAdapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void listen() {
        this.speaker.turnOn();
        this.speaker.setVolume();
        this.speaker.connect();
    }
}
