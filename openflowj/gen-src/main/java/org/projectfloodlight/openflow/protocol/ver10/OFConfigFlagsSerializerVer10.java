// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFConfigFlags;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFConfigFlagsSerializerVer10 {

    public final static short FRAG_NORMAL_VAL = (short) 0x0;
    public final static short FRAG_DROP_VAL = (short) 0x1;
    public final static short FRAG_REASM_VAL = (short) 0x2;
    public final static short FRAG_MASK_VAL = (short) 0x3;

    public static Set<OFConfigFlags> readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, Set<OFConfigFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFConfigFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFConfigFlags> ofWireValue(short val) {
        EnumSet<OFConfigFlags> set = EnumSet.noneOf(OFConfigFlags.class);

        if((val & FRAG_MASK_VAL) == FRAG_NORMAL_VAL)
            set.add(OFConfigFlags.FRAG_NORMAL);
        else if((val & FRAG_MASK_VAL) == FRAG_DROP_VAL)
            set.add(OFConfigFlags.FRAG_DROP);
        else if((val & FRAG_MASK_VAL) == FRAG_REASM_VAL)
            set.add(OFConfigFlags.FRAG_REASM);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFConfigFlags> set) {
        short wireValue = 0;

        for(OFConfigFlags e: set) {
            switch(e) {
                case FRAG_NORMAL:
                    wireValue |= FRAG_NORMAL_VAL;
                    break;
                case FRAG_DROP:
                    wireValue |= FRAG_DROP_VAL;
                    break;
                case FRAG_REASM:
                    wireValue |= FRAG_REASM_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFConfigFlags in version 1.0: " + e);
            }
        }
        return wireValue;
    }

}