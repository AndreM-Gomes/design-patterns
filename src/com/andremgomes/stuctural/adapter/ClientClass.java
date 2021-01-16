package com.andremgomes.stuctural.adapter;

public class ClientClass {
    public static void main(){
        AudioDevice bluetoothDevice = new BluetoothAdapter(new BluetoothAudio());
        AudioDevice speaker = new SpeakerAdapter(new Speaker());
        bluetoothDevice.listen();
        speaker.listen();
    }
}
