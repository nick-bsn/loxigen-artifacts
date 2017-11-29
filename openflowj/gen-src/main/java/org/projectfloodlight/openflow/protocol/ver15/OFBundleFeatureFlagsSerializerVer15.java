// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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
import org.projectfloodlight.openflow.protocol.OFBundleFeatureFlags;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBundleFeatureFlagsSerializerVer15 {

    public final static int TIMESTAMP_VAL = 0x1;
    public final static int TIME_SET_SCHED_VAL = 0x2;

    public static Set<OFBundleFeatureFlags> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBundleFeatureFlags> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFBundleFeatureFlags> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFBundleFeatureFlags> ofWireValue(int val) {
        EnumSet<OFBundleFeatureFlags> set = EnumSet.noneOf(OFBundleFeatureFlags.class);

        if((val & TIMESTAMP_VAL) != 0)
            set.add(OFBundleFeatureFlags.TIMESTAMP);
        if((val & TIME_SET_SCHED_VAL) != 0)
            set.add(OFBundleFeatureFlags.TIME_SET_SCHED);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFBundleFeatureFlags> set) {
        int wireValue = 0;

        for(OFBundleFeatureFlags e: set) {
            switch(e) {
                case TIMESTAMP:
                    wireValue |= TIMESTAMP_VAL;
                    break;
                case TIME_SET_SCHED:
                    wireValue |= TIME_SET_SCHED_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBundleFeatureFlags in version 1.5: " + e);
            }
        }
        return wireValue;
    }

}