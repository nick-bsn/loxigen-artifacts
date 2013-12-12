// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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

abstract class OFTableFeaturePropVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;


    public final static OFTableFeaturePropVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFTableFeatureProp> {
        @Override
        public OFTableFeatureProp readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0x6:
                   // discriminator value 0x6=0x6 for class OFTableFeaturePropApplyActionsVer13
                   return OFTableFeaturePropApplyActionsVer13.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value 0x7=0x7 for class OFTableFeaturePropApplyActionsMissVer13
                   return OFTableFeaturePropApplyActionsMissVer13.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value 0xe=0xe for class OFTableFeaturePropApplySetfieldVer13
                   return OFTableFeaturePropApplySetfieldVer13.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value 0xf=0xf for class OFTableFeaturePropApplySetfieldMissVer13
                   return OFTableFeaturePropApplySetfieldMissVer13.READER.readFrom(bb);
               case (short) 0xffff:
                   // discriminator value 0xffff=0xffff for class OFTableFeaturePropExperimenterVer13
                   return OFTableFeaturePropExperimenterVer13.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFTableFeaturePropInstructionsVer13
                   return OFTableFeaturePropInstructionsVer13.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFTableFeaturePropInstructionsMissVer13
                   return OFTableFeaturePropInstructionsMissVer13.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value 0x8=0x8 for class OFTableFeaturePropMatchVer13
                   return OFTableFeaturePropMatchVer13.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value 0x2=0x2 for class OFTableFeaturePropNextTablesVer13
                   return OFTableFeaturePropNextTablesVer13.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value 0x3=0x3 for class OFTableFeaturePropNextTablesMissVer13
                   return OFTableFeaturePropNextTablesMissVer13.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value 0xa=0xa for class OFTableFeaturePropWildcardsVer13
                   return OFTableFeaturePropWildcardsVer13.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value 0x4=0x4 for class OFTableFeaturePropWriteActionsVer13
                   return OFTableFeaturePropWriteActionsVer13.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value 0x5=0x5 for class OFTableFeaturePropWriteActionsMissVer13
                   return OFTableFeaturePropWriteActionsMissVer13.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value 0xc=0xc for class OFTableFeaturePropWriteSetfieldVer13
                   return OFTableFeaturePropWriteSetfieldVer13.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value 0xd=0xd for class OFTableFeaturePropWriteSetfieldMissVer13
                   return OFTableFeaturePropWriteSetfieldMissVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFTableFeaturePropVer13: " + type);
            }
        }
    }
}
