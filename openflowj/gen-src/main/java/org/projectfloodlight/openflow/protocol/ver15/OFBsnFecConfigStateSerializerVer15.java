// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnFecConfigState;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBsnFecConfigStateSerializerVer15 {

    public final static short BSN_FEC_CONFIG_STATE_DEFAULT_VAL = (short) 0x0;
    public final static short BSN_FEC_CONFIG_STATE_ENABLED_VAL = (short) 0x1;
    public final static short BSN_FEC_CONFIG_STATE_DISABLED_VAL = (short) 0x2;

    public static OFBsnFecConfigState readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnFecConfigState e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBsnFecConfigState e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBsnFecConfigState ofWireValue(short val) {
        switch(val) {
            case BSN_FEC_CONFIG_STATE_DEFAULT_VAL:
                return OFBsnFecConfigState.BSN_FEC_CONFIG_STATE_DEFAULT;
            case BSN_FEC_CONFIG_STATE_ENABLED_VAL:
                return OFBsnFecConfigState.BSN_FEC_CONFIG_STATE_ENABLED;
            case BSN_FEC_CONFIG_STATE_DISABLED_VAL:
                return OFBsnFecConfigState.BSN_FEC_CONFIG_STATE_DISABLED;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnFecConfigState in version 1.5: " + val);
        }
    }


    public static short toWireValue(OFBsnFecConfigState e) {
        switch(e) {
            case BSN_FEC_CONFIG_STATE_DEFAULT:
                return BSN_FEC_CONFIG_STATE_DEFAULT_VAL;
            case BSN_FEC_CONFIG_STATE_ENABLED:
                return BSN_FEC_CONFIG_STATE_ENABLED_VAL;
            case BSN_FEC_CONFIG_STATE_DISABLED:
                return BSN_FEC_CONFIG_STATE_DISABLED_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnFecConfigState in version 1.5: " + e);
        }
    }

}
