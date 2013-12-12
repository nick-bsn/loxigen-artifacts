// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import org.projectfloodlight.openflow.protocol.OFActionType;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFActionTypeSerializerVer10 {

    public final static short OUTPUT_VAL = (short) 0x0;
    public final static short SET_VLAN_VID_VAL = (short) 0x1;
    public final static short SET_VLAN_PCP_VAL = (short) 0x2;
    public final static short STRIP_VLAN_VAL = (short) 0x3;
    public final static short SET_DL_SRC_VAL = (short) 0x4;
    public final static short SET_DL_DST_VAL = (short) 0x5;
    public final static short SET_NW_SRC_VAL = (short) 0x6;
    public final static short SET_NW_DST_VAL = (short) 0x7;
    public final static short SET_NW_TOS_VAL = (short) 0x8;
    public final static short SET_TP_SRC_VAL = (short) 0x9;
    public final static short SET_TP_DST_VAL = (short) 0xa;
    public final static short ENQUEUE_VAL = (short) 0xb;
    public final static short EXPERIMENTER_VAL = (short) 0xffff;

    public static OFActionType readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFActionType e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFActionType e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFActionType ofWireValue(short val) {
        switch(val) {
            case OUTPUT_VAL:
                return OFActionType.OUTPUT;
            case SET_VLAN_VID_VAL:
                return OFActionType.SET_VLAN_VID;
            case SET_VLAN_PCP_VAL:
                return OFActionType.SET_VLAN_PCP;
            case STRIP_VLAN_VAL:
                return OFActionType.STRIP_VLAN;
            case SET_DL_SRC_VAL:
                return OFActionType.SET_DL_SRC;
            case SET_DL_DST_VAL:
                return OFActionType.SET_DL_DST;
            case SET_NW_SRC_VAL:
                return OFActionType.SET_NW_SRC;
            case SET_NW_DST_VAL:
                return OFActionType.SET_NW_DST;
            case SET_NW_TOS_VAL:
                return OFActionType.SET_NW_TOS;
            case SET_TP_SRC_VAL:
                return OFActionType.SET_TP_SRC;
            case SET_TP_DST_VAL:
                return OFActionType.SET_TP_DST;
            case ENQUEUE_VAL:
                return OFActionType.ENQUEUE;
            case EXPERIMENTER_VAL:
                return OFActionType.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFActionType in version 1.0: " + val);
        }
    }


    public static short toWireValue(OFActionType e) {
        switch(e) {
            case OUTPUT:
                return OUTPUT_VAL;
            case SET_VLAN_VID:
                return SET_VLAN_VID_VAL;
            case SET_VLAN_PCP:
                return SET_VLAN_PCP_VAL;
            case STRIP_VLAN:
                return STRIP_VLAN_VAL;
            case SET_DL_SRC:
                return SET_DL_SRC_VAL;
            case SET_DL_DST:
                return SET_DL_DST_VAL;
            case SET_NW_SRC:
                return SET_NW_SRC_VAL;
            case SET_NW_DST:
                return SET_NW_DST_VAL;
            case SET_NW_TOS:
                return SET_NW_TOS_VAL;
            case SET_TP_SRC:
                return SET_TP_SRC_VAL;
            case SET_TP_DST:
                return SET_TP_DST_VAL;
            case ENQUEUE:
                return ENQUEUE_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFActionType in version 1.0: " + e);
        }
    }

}
