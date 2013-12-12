// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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
import java.util.Set;

abstract class OFBsnHeaderVer11 {
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 16;


    public final static OFBsnHeaderVer11.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnHeader> {
        @Override
        public OFBsnHeader readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int subtype = bb.readInt();
            bb.readerIndex(start);
            switch(subtype) {
               case 0x16:
                   // discriminator value 0x16L=0x16L for class OFBsnBwClearDataReplyVer11
                   return OFBsnBwClearDataReplyVer11.READER.readFrom(bb);
               case 0x15:
                   // discriminator value 0x15L=0x15L for class OFBsnBwClearDataRequestVer11
                   return OFBsnBwClearDataRequestVer11.READER.readFrom(bb);
               case 0x14:
                   // discriminator value 0x14L=0x14L for class OFBsnBwEnableGetReplyVer11
                   return OFBsnBwEnableGetReplyVer11.READER.readFrom(bb);
               case 0x13:
                   // discriminator value 0x13L=0x13L for class OFBsnBwEnableGetRequestVer11
                   return OFBsnBwEnableGetRequestVer11.READER.readFrom(bb);
               case 0x17:
                   // discriminator value 0x17L=0x17L for class OFBsnBwEnableSetReplyVer11
                   return OFBsnBwEnableSetReplyVer11.READER.readFrom(bb);
               case 0x12:
                   // discriminator value 0x12L=0x12L for class OFBsnBwEnableSetRequestVer11
                   return OFBsnBwEnableSetRequestVer11.READER.readFrom(bb);
               case 0xa:
                   // discriminator value 0xaL=0xaL for class OFBsnGetInterfacesReplyVer11
                   return OFBsnGetInterfacesReplyVer11.READER.readFrom(bb);
               case 0x9:
                   // discriminator value 0x9L=0x9L for class OFBsnGetInterfacesRequestVer11
                   return OFBsnGetInterfacesRequestVer11.READER.readFrom(bb);
               case 0x5:
                   // discriminator value 0x5L=0x5L for class OFBsnGetMirroringReplyVer11
                   return OFBsnGetMirroringReplyVer11.READER.readFrom(bb);
               case 0x4:
                   // discriminator value 0x4L=0x4L for class OFBsnGetMirroringRequestVer11
                   return OFBsnGetMirroringRequestVer11.READER.readFrom(bb);
               case 0x22:
                   // discriminator value 0x22L=0x22L for class OFBsnPduRxReplyVer11
                   return OFBsnPduRxReplyVer11.READER.readFrom(bb);
               case 0x21:
                   // discriminator value 0x21L=0x21L for class OFBsnPduRxRequestVer11
                   return OFBsnPduRxRequestVer11.READER.readFrom(bb);
               case 0x23:
                   // discriminator value 0x23L=0x23L for class OFBsnPduRxTimeoutVer11
                   return OFBsnPduRxTimeoutVer11.READER.readFrom(bb);
               case 0x20:
                   // discriminator value 0x20L=0x20L for class OFBsnPduTxReplyVer11
                   return OFBsnPduTxReplyVer11.READER.readFrom(bb);
               case 0x1f:
                   // discriminator value 0x1fL=0x1fL for class OFBsnPduTxRequestVer11
                   return OFBsnPduTxRequestVer11.READER.readFrom(bb);
               case 0x3:
                   // discriminator value 0x3L=0x3L for class OFBsnSetMirroringVer11
                   return OFBsnSetMirroringVer11.READER.readFrom(bb);
               case 0x19:
                   // discriminator value 0x19L=0x19L for class OFBsnSetPktinSuppressionReplyVer11
                   return OFBsnSetPktinSuppressionReplyVer11.READER.readFrom(bb);
               case 0xb:
                   // discriminator value 0xbL=0xbL for class OFBsnSetPktinSuppressionRequestVer11
                   return OFBsnSetPktinSuppressionRequestVer11.READER.readFrom(bb);
               case 0x10:
                   // discriminator value 0x10L=0x10L for class OFBsnVirtualPortCreateReplyVer11
                   return OFBsnVirtualPortCreateReplyVer11.READER.readFrom(bb);
               case 0xf:
                   // discriminator value 0xfL=0xfL for class OFBsnVirtualPortCreateRequestVer11
                   return OFBsnVirtualPortCreateRequestVer11.READER.readFrom(bb);
               case 0x1a:
                   // discriminator value 0x1aL=0x1aL for class OFBsnVirtualPortRemoveReplyVer11
                   return OFBsnVirtualPortRemoveReplyVer11.READER.readFrom(bb);
               case 0x11:
                   // discriminator value 0x11L=0x11L for class OFBsnVirtualPortRemoveRequestVer11
                   return OFBsnVirtualPortRemoveRequestVer11.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator subtype of class OFBsnHeaderVer11: " + subtype);
            }
        }
    }
}
