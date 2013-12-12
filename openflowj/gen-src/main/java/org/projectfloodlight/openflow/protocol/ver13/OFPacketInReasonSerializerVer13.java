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
import org.projectfloodlight.openflow.protocol.OFPacketInReason;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFPacketInReasonSerializerVer13 {

    public final static byte NO_MATCH_VAL = (byte) 0x0;
    public final static byte ACTION_VAL = (byte) 0x1;
    public final static byte INVALID_TTL_VAL = (byte) 0x2;
    public final static byte BSN_NEW_HOST_VAL = (byte) 0x80;
    public final static byte BSN_STATION_MOVE_VAL = (byte) 0x81;
    public final static byte BSN_BAD_VLAN_VAL = (byte) 0x82;
    public final static byte BSN_DESTINATION_LOOKUP_FAILURE_VAL = (byte) 0x83;

    public static OFPacketInReason readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFPacketInReason e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFPacketInReason e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFPacketInReason ofWireValue(byte val) {
        switch(val) {
            case NO_MATCH_VAL:
                return OFPacketInReason.NO_MATCH;
            case ACTION_VAL:
                return OFPacketInReason.ACTION;
            case INVALID_TTL_VAL:
                return OFPacketInReason.INVALID_TTL;
            case BSN_NEW_HOST_VAL:
                return OFPacketInReason.BSN_NEW_HOST;
            case BSN_STATION_MOVE_VAL:
                return OFPacketInReason.BSN_STATION_MOVE;
            case BSN_BAD_VLAN_VAL:
                return OFPacketInReason.BSN_BAD_VLAN;
            case BSN_DESTINATION_LOOKUP_FAILURE_VAL:
                return OFPacketInReason.BSN_DESTINATION_LOOKUP_FAILURE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFPacketInReason in version 1.3: " + val);
        }
    }


    public static byte toWireValue(OFPacketInReason e) {
        switch(e) {
            case NO_MATCH:
                return NO_MATCH_VAL;
            case ACTION:
                return ACTION_VAL;
            case INVALID_TTL:
                return INVALID_TTL_VAL;
            case BSN_NEW_HOST:
                return BSN_NEW_HOST_VAL;
            case BSN_STATION_MOVE:
                return BSN_STATION_MOVE_VAL;
            case BSN_BAD_VLAN:
                return BSN_BAD_VLAN_VAL;
            case BSN_DESTINATION_LOOKUP_FAILURE:
                return BSN_DESTINATION_LOOKUP_FAILURE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFPacketInReason in version 1.3: " + e);
        }
    }

}
