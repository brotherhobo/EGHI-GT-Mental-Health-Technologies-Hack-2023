package com.mentalab.packets.info;

import com.mentalab.exception.InvalidDataException;
import com.mentalab.packets.PacketUtils;

public class ImpedanceInfoPacket_USBC extends ImpedanceInfoPacket {
    public ImpedanceInfoPacket_USBC(double timeStamp) {
        super(timeStamp);
    }

    public void populate(byte[] byteBuffer) throws InvalidDataException {
        super.populate(byteBuffer);
        this.offset = PacketUtils.bytesToInt(byteBuffer[2], byteBuffer[3]) * 0.01d;
    }
}
