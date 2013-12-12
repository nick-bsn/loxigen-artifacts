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

abstract class OFActionVer11 {
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 8;


    public final static OFActionVer11.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFAction> {
        @Override
        public OFAction readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0xffff:
                   // discriminator value OFActionType.EXPERIMENTER=65535 for class OFActionExperimenterVer11
                   return OFActionExperimenterVer11.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFActionType.OUTPUT=0 for class OFActionOutputVer11
                   return OFActionOutputVer11.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFActionType.SET_DL_DST=4 for class OFActionSetDlDstVer11
                   return OFActionSetDlDstVer11.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFActionType.SET_DL_SRC=3 for class OFActionSetDlSrcVer11
                   return OFActionSetDlSrcVer11.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value OFActionType.SET_NW_DST=6 for class OFActionSetNwDstVer11
                   return OFActionSetNwDstVer11.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFActionType.SET_NW_SRC=5 for class OFActionSetNwSrcVer11
                   return OFActionSetNwSrcVer11.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value OFActionType.SET_NW_TOS=7 for class OFActionSetNwTosVer11
                   return OFActionSetNwTosVer11.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value OFActionType.SET_TP_DST=10 for class OFActionSetTpDstVer11
                   return OFActionSetTpDstVer11.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value OFActionType.SET_TP_SRC=9 for class OFActionSetTpSrcVer11
                   return OFActionSetTpSrcVer11.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFActionType.SET_VLAN_PCP=2 for class OFActionSetVlanPcpVer11
                   return OFActionSetVlanPcpVer11.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFActionType.SET_VLAN_VID=1 for class OFActionSetVlanVidVer11
                   return OFActionSetVlanVidVer11.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value OFActionType.COPY_TTL_IN=12 for class OFActionCopyTtlInVer11
                   return OFActionCopyTtlInVer11.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value OFActionType.COPY_TTL_OUT=11 for class OFActionCopyTtlOutVer11
                   return OFActionCopyTtlOutVer11.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value OFActionType.DEC_MPLS_TTL=16 for class OFActionDecMplsTtlVer11
                   return OFActionDecMplsTtlVer11.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value OFActionType.DEC_NW_TTL=24 for class OFActionDecNwTtlVer11
                   return OFActionDecNwTtlVer11.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value OFActionType.GROUP=22 for class OFActionGroupVer11
                   return OFActionGroupVer11.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value OFActionType.POP_MPLS=20 for class OFActionPopMplsVer11
                   return OFActionPopMplsVer11.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value OFActionType.POP_VLAN=18 for class OFActionPopVlanVer11
                   return OFActionPopVlanVer11.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value OFActionType.PUSH_MPLS=19 for class OFActionPushMplsVer11
                   return OFActionPushMplsVer11.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value OFActionType.PUSH_VLAN=17 for class OFActionPushVlanVer11
                   return OFActionPushVlanVer11.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value OFActionType.SET_MPLS_LABEL=13 for class OFActionSetMplsLabelVer11
                   return OFActionSetMplsLabelVer11.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value OFActionType.SET_MPLS_TC=14 for class OFActionSetMplsTcVer11
                   return OFActionSetMplsTcVer11.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value OFActionType.SET_MPLS_TTL=15 for class OFActionSetMplsTtlVer11
                   return OFActionSetMplsTtlVer11.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value OFActionType.SET_NW_ECN=8 for class OFActionSetNwEcnVer11
                   return OFActionSetNwEcnVer11.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value OFActionType.SET_NW_TTL=23 for class OFActionSetNwTtlVer11
                   return OFActionSetNwTtlVer11.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value OFActionType.SET_QUEUE=21 for class OFActionSetQueueVer11
                   return OFActionSetQueueVer11.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFActionVer11: " + type);
            }
        }
    }
}
