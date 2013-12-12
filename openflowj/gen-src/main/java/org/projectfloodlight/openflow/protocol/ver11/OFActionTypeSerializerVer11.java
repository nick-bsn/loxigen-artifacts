// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFActionType;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFActionTypeSerializerVer11 {

    public final static short OUTPUT_VAL = (short) 0x0;
    public final static short SET_VLAN_VID_VAL = (short) 0x1;
    public final static short SET_VLAN_PCP_VAL = (short) 0x2;
    public final static short SET_DL_SRC_VAL = (short) 0x3;
    public final static short SET_DL_DST_VAL = (short) 0x4;
    public final static short SET_NW_SRC_VAL = (short) 0x5;
    public final static short SET_NW_DST_VAL = (short) 0x6;
    public final static short SET_NW_TOS_VAL = (short) 0x7;
    public final static short SET_NW_ECN_VAL = (short) 0x8;
    public final static short SET_TP_SRC_VAL = (short) 0x9;
    public final static short SET_TP_DST_VAL = (short) 0xa;
    public final static short COPY_TTL_OUT_VAL = (short) 0xb;
    public final static short COPY_TTL_IN_VAL = (short) 0xc;
    public final static short SET_MPLS_LABEL_VAL = (short) 0xd;
    public final static short SET_MPLS_TC_VAL = (short) 0xe;
    public final static short SET_MPLS_TTL_VAL = (short) 0xf;
    public final static short DEC_MPLS_TTL_VAL = (short) 0x10;
    public final static short PUSH_VLAN_VAL = (short) 0x11;
    public final static short POP_VLAN_VAL = (short) 0x12;
    public final static short PUSH_MPLS_VAL = (short) 0x13;
    public final static short POP_MPLS_VAL = (short) 0x14;
    public final static short SET_QUEUE_VAL = (short) 0x15;
    public final static short GROUP_VAL = (short) 0x16;
    public final static short SET_NW_TTL_VAL = (short) 0x17;
    public final static short DEC_NW_TTL_VAL = (short) 0x18;
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
            case SET_NW_ECN_VAL:
                return OFActionType.SET_NW_ECN;
            case SET_TP_SRC_VAL:
                return OFActionType.SET_TP_SRC;
            case SET_TP_DST_VAL:
                return OFActionType.SET_TP_DST;
            case COPY_TTL_OUT_VAL:
                return OFActionType.COPY_TTL_OUT;
            case COPY_TTL_IN_VAL:
                return OFActionType.COPY_TTL_IN;
            case SET_MPLS_LABEL_VAL:
                return OFActionType.SET_MPLS_LABEL;
            case SET_MPLS_TC_VAL:
                return OFActionType.SET_MPLS_TC;
            case SET_MPLS_TTL_VAL:
                return OFActionType.SET_MPLS_TTL;
            case DEC_MPLS_TTL_VAL:
                return OFActionType.DEC_MPLS_TTL;
            case PUSH_VLAN_VAL:
                return OFActionType.PUSH_VLAN;
            case POP_VLAN_VAL:
                return OFActionType.POP_VLAN;
            case PUSH_MPLS_VAL:
                return OFActionType.PUSH_MPLS;
            case POP_MPLS_VAL:
                return OFActionType.POP_MPLS;
            case SET_QUEUE_VAL:
                return OFActionType.SET_QUEUE;
            case GROUP_VAL:
                return OFActionType.GROUP;
            case SET_NW_TTL_VAL:
                return OFActionType.SET_NW_TTL;
            case DEC_NW_TTL_VAL:
                return OFActionType.DEC_NW_TTL;
            case EXPERIMENTER_VAL:
                return OFActionType.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFActionType in version 1.1: " + val);
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
            case SET_NW_ECN:
                return SET_NW_ECN_VAL;
            case SET_TP_SRC:
                return SET_TP_SRC_VAL;
            case SET_TP_DST:
                return SET_TP_DST_VAL;
            case COPY_TTL_OUT:
                return COPY_TTL_OUT_VAL;
            case COPY_TTL_IN:
                return COPY_TTL_IN_VAL;
            case SET_MPLS_LABEL:
                return SET_MPLS_LABEL_VAL;
            case SET_MPLS_TC:
                return SET_MPLS_TC_VAL;
            case SET_MPLS_TTL:
                return SET_MPLS_TTL_VAL;
            case DEC_MPLS_TTL:
                return DEC_MPLS_TTL_VAL;
            case PUSH_VLAN:
                return PUSH_VLAN_VAL;
            case POP_VLAN:
                return POP_VLAN_VAL;
            case PUSH_MPLS:
                return PUSH_MPLS_VAL;
            case POP_MPLS:
                return POP_MPLS_VAL;
            case SET_QUEUE:
                return SET_QUEUE_VAL;
            case GROUP:
                return GROUP_VAL;
            case SET_NW_TTL:
                return SET_NW_TTL_VAL;
            case DEC_NW_TTL:
                return DEC_NW_TTL_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFActionType in version 1.1: " + e);
        }
    }

}
