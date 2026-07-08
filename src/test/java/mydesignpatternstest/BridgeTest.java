package mydesignpatternstest;

import mydesignpatterns.strutturali.bridge.RemoteControl;
import mydesignpatterns.strutturali.bridge.TV;

public class BridgeTest {
    public static void main(String[] args){

        RemoteControl remote = new RemoteControl(new TV());
        remote.powerOn();
        remote.powerOff();
    }
}
