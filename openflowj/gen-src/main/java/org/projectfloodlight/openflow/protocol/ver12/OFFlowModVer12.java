// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFFlowModVer12 {
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 56;


    public final static OFFlowModVer12.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFFlowMod> {
        @Override
        public OFFlowMod readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 14
            byte type = bb.readByte();
            if(type != (byte) 0xe)
                throw new OFParseError("Wrong type: Expected=OFType.FLOW_MOD(14), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            U64.ofRaw(bb.readLong());
            U64.ofRaw(bb.readLong());
            TableId.readByte(bb);
            short command = bb.readByte();
            bb.readerIndex(start);
            switch(command) {
               case (short) 0x0:
                   // discriminator value OFFlowModCommand.ADD=0 for class OFFlowAddVer12
                   return OFFlowAddVer12.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFFlowModCommand.DELETE=3 for class OFFlowDeleteVer12
                   return OFFlowDeleteVer12.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFFlowModCommand.DELETE_STRICT=4 for class OFFlowDeleteStrictVer12
                   return OFFlowDeleteStrictVer12.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFFlowModCommand.MODIFY=1 for class OFFlowModifyVer12
                   return OFFlowModifyVer12.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFFlowModCommand.MODIFY_STRICT=2 for class OFFlowModifyStrictVer12
                   return OFFlowModifyStrictVer12.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator command of class OFFlowModVer12: " + command);
            }
        }
    }
}
