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

abstract class OFBsnVportVer11 {
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 4;


    public final static OFBsnVportVer11.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnVport> {
        @Override
        public OFBsnVport readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFBsnVportQInQVer11
                   return OFBsnVportQInQVer11.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFBsnVportVer11: " + type);
            }
        }
    }
}
