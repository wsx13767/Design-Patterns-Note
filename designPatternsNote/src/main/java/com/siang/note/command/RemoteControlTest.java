package com.siang.note.command;

import com.siang.note.command.ceilingFan.CeilingFan;
import com.siang.note.command.ceilingFan.CeilingFanOffCommand;
import com.siang.note.command.ceilingFan.CeilingFanOnCommand;
import com.siang.note.command.garage.GarageDoor;
import com.siang.note.command.garage.GarageDoorDownCommand;
import com.siang.note.command.garage.GarageDoorUpCommand;
import com.siang.note.command.light.Light;
import com.siang.note.command.light.LightOffCommand;
import com.siang.note.command.light.LightOnCommand;
import com.siang.note.command.stereo.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remoteControl.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommand(2, new CeilingFanOnCommand(ceilingFan), new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(3, new GarageDoorUpCommand(garageDoor), new GarageDoorDownCommand(garageDoor));

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
