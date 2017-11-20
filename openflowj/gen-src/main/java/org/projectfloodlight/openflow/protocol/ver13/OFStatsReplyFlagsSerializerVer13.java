// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
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
import org.projectfloodlight.openflow.protocol.OFStatsReplyFlags;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFStatsReplyFlagsSerializerVer13 {

    public final static short REPLY_MORE_VAL = (short) 0x1;

    public static Set<OFStatsReplyFlags> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFStatsReplyFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFStatsReplyFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFStatsReplyFlags> ofWireValue(short val) {
        EnumSet<OFStatsReplyFlags> set = EnumSet.noneOf(OFStatsReplyFlags.class);

        if((val & REPLY_MORE_VAL) != 0)
            set.add(OFStatsReplyFlags.REPLY_MORE);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFStatsReplyFlags> set) {
        short wireValue = 0;

        for(OFStatsReplyFlags e: set) {
            switch(e) {
                case REPLY_MORE:
                    wireValue |= REPLY_MORE_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFStatsReplyFlags in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}