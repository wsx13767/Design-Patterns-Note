package com.siang.note.command;

import com.siang.note.command.light.Light;
import com.siang.note.command.light.LightOffCommand;
import com.siang.note.command.light.LightOnCommand;
import com.siang.note.command.tv.TV;
import com.siang.note.command.tv.TVOffCommand;
import com.siang.note.command.tv.TVOnCommand;

public class PartyControlTest {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        Command[] partyOn = { lightOnCommand, tvOnCommand };
        Command[] partyOff = { lightOffCommand, tvOffCommand };

        MacroCommand partyOnmacroCommand = new MacroCommand(partyOn);
        MacroCommand partyOffmacroCommand = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnmacroCommand, partyOffmacroCommand);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
