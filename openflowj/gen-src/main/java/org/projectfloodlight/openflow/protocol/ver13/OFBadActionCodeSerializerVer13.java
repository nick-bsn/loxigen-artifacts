// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBadActionCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFBadActionCodeSerializerVer13 {

    public final static short BAD_TYPE_VAL = (short) 0x0;
    public final static short BAD_LEN_VAL = (short) 0x1;
    public final static short BAD_EXPERIMENTER_VAL = (short) 0x2;
    public final static short BAD_EXPERIMENTER_TYPE_VAL = (short) 0x3;
    public final static short BAD_OUT_PORT_VAL = (short) 0x4;
    public final static short BAD_ARGUMENT_VAL = (short) 0x5;
    public final static short EPERM_VAL = (short) 0x6;
    public final static short TOO_MANY_VAL = (short) 0x7;
    public final static short BAD_QUEUE_VAL = (short) 0x8;
    public final static short BAD_OUT_GROUP_VAL = (short) 0x9;
    public final static short MATCH_INCONSISTENT_VAL = (short) 0xa;
    public final static short UNSUPPORTED_ORDER_VAL = (short) 0xb;
    public final static short BAD_TAG_VAL = (short) 0xc;
    public final static short BAD_SET_TYPE_VAL = (short) 0xd;
    public final static short BAD_SET_LEN_VAL = (short) 0xe;
    public final static short BAD_SET_ARGUMENT_VAL = (short) 0xf;

    public static OFBadActionCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFBadActionCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBadActionCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBadActionCode ofWireValue(short val) {
        switch(val) {
            case BAD_TYPE_VAL:
                return OFBadActionCode.BAD_TYPE;
            case BAD_LEN_VAL:
                return OFBadActionCode.BAD_LEN;
            case BAD_EXPERIMENTER_VAL:
                return OFBadActionCode.BAD_EXPERIMENTER;
            case BAD_EXPERIMENTER_TYPE_VAL:
                return OFBadActionCode.BAD_EXPERIMENTER_TYPE;
            case BAD_OUT_PORT_VAL:
                return OFBadActionCode.BAD_OUT_PORT;
            case BAD_ARGUMENT_VAL:
                return OFBadActionCode.BAD_ARGUMENT;
            case EPERM_VAL:
                return OFBadActionCode.EPERM;
            case TOO_MANY_VAL:
                return OFBadActionCode.TOO_MANY;
            case BAD_QUEUE_VAL:
                return OFBadActionCode.BAD_QUEUE;
            case BAD_OUT_GROUP_VAL:
                return OFBadActionCode.BAD_OUT_GROUP;
            case MATCH_INCONSISTENT_VAL:
                return OFBadActionCode.MATCH_INCONSISTENT;
            case UNSUPPORTED_ORDER_VAL:
                return OFBadActionCode.UNSUPPORTED_ORDER;
            case BAD_TAG_VAL:
                return OFBadActionCode.BAD_TAG;
            case BAD_SET_TYPE_VAL:
                return OFBadActionCode.BAD_SET_TYPE;
            case BAD_SET_LEN_VAL:
                return OFBadActionCode.BAD_SET_LEN;
            case BAD_SET_ARGUMENT_VAL:
                return OFBadActionCode.BAD_SET_ARGUMENT;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBadActionCode in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFBadActionCode e) {
        switch(e) {
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case BAD_EXPERIMENTER:
                return BAD_EXPERIMENTER_VAL;
            case BAD_EXPERIMENTER_TYPE:
                return BAD_EXPERIMENTER_TYPE_VAL;
            case BAD_OUT_PORT:
                return BAD_OUT_PORT_VAL;
            case BAD_ARGUMENT:
                return BAD_ARGUMENT_VAL;
            case EPERM:
                return EPERM_VAL;
            case TOO_MANY:
                return TOO_MANY_VAL;
            case BAD_QUEUE:
                return BAD_QUEUE_VAL;
            case BAD_OUT_GROUP:
                return BAD_OUT_GROUP_VAL;
            case MATCH_INCONSISTENT:
                return MATCH_INCONSISTENT_VAL;
            case UNSUPPORTED_ORDER:
                return UNSUPPORTED_ORDER_VAL;
            case BAD_TAG:
                return BAD_TAG_VAL;
            case BAD_SET_TYPE:
                return BAD_SET_TYPE_VAL;
            case BAD_SET_LEN:
                return BAD_SET_LEN_VAL;
            case BAD_SET_ARGUMENT:
                return BAD_SET_ARGUMENT_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBadActionCode in version 1.3: " + e);
        }
    }

}
