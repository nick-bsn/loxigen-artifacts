// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import io.netty.buffer.ByteBuf;

abstract class OFPortDescPropBsnVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 12;


    public final static OFPortDescPropBsnVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFPortDescPropBsn> {
        @Override
        public OFPortDescPropBsn readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            int expType = bb.readInt();
            bb.readerIndex(start);
            switch(expType) {
               case 0x3:
                   // discriminator value 0x3L=0x3L for class OFPortDescPropBsnBreakoutVer14
                   return OFPortDescPropBsnBreakoutVer14.READER.readFrom(bb);
               case 0x2:
                   // discriminator value 0x2L=0x2L for class OFPortDescPropBsnForwardErrorCorrectionVer14
                   return OFPortDescPropBsnForwardErrorCorrectionVer14.READER.readFrom(bb);
               case 0x1:
                   // discriminator value 0x1L=0x1L for class OFPortDescPropBsnGenerationIdVer14
                   return OFPortDescPropBsnGenerationIdVer14.READER.readFrom(bb);
               case 0x0:
                   // discriminator value 0x0L=0x0L for class OFPortDescPropBsnUplinkVer14
                   return OFPortDescPropBsnUplinkVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator expType of class OFPortDescPropBsnVer14: " + expType);
            }
        }
    }
}
