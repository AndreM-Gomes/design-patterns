package com.andremgomes.stuctural.adapter;

public class BluetoothAdapter implements AudioDevice {
    private final BluetoothAudio bluetoothAudio;

    public BluetoothAdapter(BluetoothAudio bluetoothAudio) {
        this.bluetoothAudio = bluetoothAudio;
    }

    @Override
    public void listen() {
        bluetoothAudio.turnOn();
        bluetoothAudio.verifyBatteryLevel();
        bluetoothAudio.pair();
        bluetoothAudio.setVolume();
    }
}
