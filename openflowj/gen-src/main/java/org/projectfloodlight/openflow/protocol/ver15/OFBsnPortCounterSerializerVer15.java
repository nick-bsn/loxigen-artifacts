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
import org.projectfloodlight.openflow.protocol.OFBsnPortCounter;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBsnPortCounterSerializerVer15 {

    public final static byte BSN_PORT_COUNTER_RX_BYTES_VAL = (byte) 0x0;
    public final static byte BSN_PORT_COUNTER_RX_PACKETS_UNICAST_VAL = (byte) 0x1;
    public final static byte BSN_PORT_COUNTER_RX_PACKETS_BROADCAST_VAL = (byte) 0x2;
    public final static byte BSN_PORT_COUNTER_RX_PACKETS_MULTICAST_VAL = (byte) 0x3;
    public final static byte BSN_PORT_COUNTER_RX_DROPPED_VAL = (byte) 0x4;
    public final static byte BSN_PORT_COUNTER_RX_ERRORS_VAL = (byte) 0x5;
    public final static byte BSN_PORT_COUNTER_TX_BYTES_VAL = (byte) 0x6;
    public final static byte BSN_PORT_COUNTER_TX_PACKETS_UNICAST_VAL = (byte) 0x7;
    public final static byte BSN_PORT_COUNTER_TX_PACKETS_BROADCAST_VAL = (byte) 0x8;
    public final static byte BSN_PORT_COUNTER_TX_PACKETS_MULTICAST_VAL = (byte) 0x9;
    public final static byte BSN_PORT_COUNTER_TX_DROPPED_VAL = (byte) 0xa;
    public final static byte BSN_PORT_COUNTER_TX_ERRORS_VAL = (byte) 0xb;
    public final static byte BSN_PORT_COUNTER_RX_RUNTS_VAL = (byte) 0xc;
    public final static byte BSN_PORT_COUNTER_RX_GIANTS_VAL = (byte) 0xd;
    public final static byte BSN_PORT_COUNTER_RX_CRC_ERRORS_VAL = (byte) 0xe;
    public final static byte BSN_PORT_COUNTER_RX_ALIGNMENT_ERRORS_VAL = (byte) 0xf;
    public final static byte BSN_PORT_COUNTER_RX_SYMBOL_ERRORS_VAL = (byte) 0x10;
    public final static byte BSN_PORT_COUNTER_RX_PAUSE_INPUT_VAL = (byte) 0x11;
    public final static byte BSN_PORT_COUNTER_TX_COLLISIONS_VAL = (byte) 0x12;
    public final static byte BSN_PORT_COUNTER_TX_LATE_COLLISIONS_VAL = (byte) 0x13;
    public final static byte BSN_PORT_COUNTER_TX_DEFERRED_VAL = (byte) 0x14;
    public final static byte BSN_PORT_COUNTER_TX_PAUSE_OUTPUT_VAL = (byte) 0x15;
    public final static byte BSN_PORT_COUNTER_RX_PACKETS_VAL = (byte) 0x16;
    public final static byte BSN_PORT_COUNTER_TX_PACKETS_VAL = (byte) 0x17;
    public final static byte BSN_PORT_COUNTER_RX_LENGTH_ERRORS_VAL = (byte) 0x18;
    public final static byte BSN_PORT_COUNTER_RX_OVERFLOW_ERRORS_VAL = (byte) 0x19;
    public final static byte BSN_PORT_COUNTER_TX_CARRIER_ERRORS_VAL = (byte) 0x1a;
    public final static byte BSN_PORT_COUNTER_RX_PACKETS_BAD_VLAN_VAL = (byte) 0x1b;
    public final static byte BSN_PORT_COUNTER_LINK_UP_VAL = (byte) 0x1c;
    public final static byte BSN_PORT_COUNTER_LINK_DOWN_VAL = (byte) 0x1d;
    public final static byte BSN_PORT_COUNTER_RX_PFC_CONTROL_FRAME_VAL = (byte) 0x1e;
    public final static byte BSN_PORT_COUNTER_TX_PFC_CONTROL_FRAME_VAL = (byte) 0x1f;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_0_VAL = (byte) 0x20;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_1_VAL = (byte) 0x21;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_2_VAL = (byte) 0x22;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_3_VAL = (byte) 0x23;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_4_VAL = (byte) 0x24;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_5_VAL = (byte) 0x25;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_6_VAL = (byte) 0x26;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_7_VAL = (byte) 0x27;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_0_VAL = (byte) 0x28;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_1_VAL = (byte) 0x29;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_2_VAL = (byte) 0x2a;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_3_VAL = (byte) 0x2b;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_4_VAL = (byte) 0x2c;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_5_VAL = (byte) 0x2d;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_6_VAL = (byte) 0x2e;
    public final static byte BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_7_VAL = (byte) 0x2f;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_0_VAL = (byte) 0x30;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_1_VAL = (byte) 0x31;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_2_VAL = (byte) 0x32;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_3_VAL = (byte) 0x33;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_4_VAL = (byte) 0x34;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_5_VAL = (byte) 0x35;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_6_VAL = (byte) 0x36;
    public final static byte BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_7_VAL = (byte) 0x37;

    public static OFBsnPortCounter readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnPortCounter e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFBsnPortCounter e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFBsnPortCounter ofWireValue(byte val) {
        switch(val) {
            case BSN_PORT_COUNTER_RX_BYTES_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_BYTES;
            case BSN_PORT_COUNTER_RX_PACKETS_UNICAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PACKETS_UNICAST;
            case BSN_PORT_COUNTER_RX_PACKETS_BROADCAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PACKETS_BROADCAST;
            case BSN_PORT_COUNTER_RX_PACKETS_MULTICAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PACKETS_MULTICAST;
            case BSN_PORT_COUNTER_RX_DROPPED_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_DROPPED;
            case BSN_PORT_COUNTER_RX_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_ERRORS;
            case BSN_PORT_COUNTER_TX_BYTES_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_BYTES;
            case BSN_PORT_COUNTER_TX_PACKETS_UNICAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PACKETS_UNICAST;
            case BSN_PORT_COUNTER_TX_PACKETS_BROADCAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PACKETS_BROADCAST;
            case BSN_PORT_COUNTER_TX_PACKETS_MULTICAST_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PACKETS_MULTICAST;
            case BSN_PORT_COUNTER_TX_DROPPED_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_DROPPED;
            case BSN_PORT_COUNTER_TX_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_ERRORS;
            case BSN_PORT_COUNTER_RX_RUNTS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_RUNTS;
            case BSN_PORT_COUNTER_RX_GIANTS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_GIANTS;
            case BSN_PORT_COUNTER_RX_CRC_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_CRC_ERRORS;
            case BSN_PORT_COUNTER_RX_ALIGNMENT_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_ALIGNMENT_ERRORS;
            case BSN_PORT_COUNTER_RX_SYMBOL_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_SYMBOL_ERRORS;
            case BSN_PORT_COUNTER_RX_PAUSE_INPUT_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PAUSE_INPUT;
            case BSN_PORT_COUNTER_TX_COLLISIONS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_COLLISIONS;
            case BSN_PORT_COUNTER_TX_LATE_COLLISIONS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_LATE_COLLISIONS;
            case BSN_PORT_COUNTER_TX_DEFERRED_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_DEFERRED;
            case BSN_PORT_COUNTER_TX_PAUSE_OUTPUT_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PAUSE_OUTPUT;
            case BSN_PORT_COUNTER_RX_PACKETS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PACKETS;
            case BSN_PORT_COUNTER_TX_PACKETS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PACKETS;
            case BSN_PORT_COUNTER_RX_LENGTH_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_LENGTH_ERRORS;
            case BSN_PORT_COUNTER_RX_OVERFLOW_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_OVERFLOW_ERRORS;
            case BSN_PORT_COUNTER_TX_CARRIER_ERRORS_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_CARRIER_ERRORS;
            case BSN_PORT_COUNTER_RX_PACKETS_BAD_VLAN_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PACKETS_BAD_VLAN;
            case BSN_PORT_COUNTER_LINK_UP_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_LINK_UP;
            case BSN_PORT_COUNTER_LINK_DOWN_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_LINK_DOWN;
            case BSN_PORT_COUNTER_RX_PFC_CONTROL_FRAME_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_CONTROL_FRAME;
            case BSN_PORT_COUNTER_TX_PFC_CONTROL_FRAME_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_CONTROL_FRAME;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_0_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_0;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_1_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_1;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_2_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_2;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_3_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_3;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_4_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_4;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_5_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_5;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_6_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_6;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_7_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_7;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_0_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_0;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_1_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_1;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_2_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_2;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_3_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_3;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_4_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_4;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_5_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_5;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_6_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_6;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_7_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_7;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_0_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_0;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_1_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_1;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_2_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_2;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_3_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_3;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_4_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_4;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_5_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_5;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_6_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_6;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_7_VAL:
                return OFBsnPortCounter.BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_7;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnPortCounter in version 1.5: " + val);
        }
    }


    public static byte toWireValue(OFBsnPortCounter e) {
        switch(e) {
            case BSN_PORT_COUNTER_RX_BYTES:
                return BSN_PORT_COUNTER_RX_BYTES_VAL;
            case BSN_PORT_COUNTER_RX_PACKETS_UNICAST:
                return BSN_PORT_COUNTER_RX_PACKETS_UNICAST_VAL;
            case BSN_PORT_COUNTER_RX_PACKETS_BROADCAST:
                return BSN_PORT_COUNTER_RX_PACKETS_BROADCAST_VAL;
            case BSN_PORT_COUNTER_RX_PACKETS_MULTICAST:
                return BSN_PORT_COUNTER_RX_PACKETS_MULTICAST_VAL;
            case BSN_PORT_COUNTER_RX_DROPPED:
                return BSN_PORT_COUNTER_RX_DROPPED_VAL;
            case BSN_PORT_COUNTER_RX_ERRORS:
                return BSN_PORT_COUNTER_RX_ERRORS_VAL;
            case BSN_PORT_COUNTER_TX_BYTES:
                return BSN_PORT_COUNTER_TX_BYTES_VAL;
            case BSN_PORT_COUNTER_TX_PACKETS_UNICAST:
                return BSN_PORT_COUNTER_TX_PACKETS_UNICAST_VAL;
            case BSN_PORT_COUNTER_TX_PACKETS_BROADCAST:
                return BSN_PORT_COUNTER_TX_PACKETS_BROADCAST_VAL;
            case BSN_PORT_COUNTER_TX_PACKETS_MULTICAST:
                return BSN_PORT_COUNTER_TX_PACKETS_MULTICAST_VAL;
            case BSN_PORT_COUNTER_TX_DROPPED:
                return BSN_PORT_COUNTER_TX_DROPPED_VAL;
            case BSN_PORT_COUNTER_TX_ERRORS:
                return BSN_PORT_COUNTER_TX_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_RUNTS:
                return BSN_PORT_COUNTER_RX_RUNTS_VAL;
            case BSN_PORT_COUNTER_RX_GIANTS:
                return BSN_PORT_COUNTER_RX_GIANTS_VAL;
            case BSN_PORT_COUNTER_RX_CRC_ERRORS:
                return BSN_PORT_COUNTER_RX_CRC_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_ALIGNMENT_ERRORS:
                return BSN_PORT_COUNTER_RX_ALIGNMENT_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_SYMBOL_ERRORS:
                return BSN_PORT_COUNTER_RX_SYMBOL_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_PAUSE_INPUT:
                return BSN_PORT_COUNTER_RX_PAUSE_INPUT_VAL;
            case BSN_PORT_COUNTER_TX_COLLISIONS:
                return BSN_PORT_COUNTER_TX_COLLISIONS_VAL;
            case BSN_PORT_COUNTER_TX_LATE_COLLISIONS:
                return BSN_PORT_COUNTER_TX_LATE_COLLISIONS_VAL;
            case BSN_PORT_COUNTER_TX_DEFERRED:
                return BSN_PORT_COUNTER_TX_DEFERRED_VAL;
            case BSN_PORT_COUNTER_TX_PAUSE_OUTPUT:
                return BSN_PORT_COUNTER_TX_PAUSE_OUTPUT_VAL;
            case BSN_PORT_COUNTER_RX_PACKETS:
                return BSN_PORT_COUNTER_RX_PACKETS_VAL;
            case BSN_PORT_COUNTER_TX_PACKETS:
                return BSN_PORT_COUNTER_TX_PACKETS_VAL;
            case BSN_PORT_COUNTER_RX_LENGTH_ERRORS:
                return BSN_PORT_COUNTER_RX_LENGTH_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_OVERFLOW_ERRORS:
                return BSN_PORT_COUNTER_RX_OVERFLOW_ERRORS_VAL;
            case BSN_PORT_COUNTER_TX_CARRIER_ERRORS:
                return BSN_PORT_COUNTER_TX_CARRIER_ERRORS_VAL;
            case BSN_PORT_COUNTER_RX_PACKETS_BAD_VLAN:
                return BSN_PORT_COUNTER_RX_PACKETS_BAD_VLAN_VAL;
            case BSN_PORT_COUNTER_LINK_UP:
                return BSN_PORT_COUNTER_LINK_UP_VAL;
            case BSN_PORT_COUNTER_LINK_DOWN:
                return BSN_PORT_COUNTER_LINK_DOWN_VAL;
            case BSN_PORT_COUNTER_RX_PFC_CONTROL_FRAME:
                return BSN_PORT_COUNTER_RX_PFC_CONTROL_FRAME_VAL;
            case BSN_PORT_COUNTER_TX_PFC_CONTROL_FRAME:
                return BSN_PORT_COUNTER_TX_PFC_CONTROL_FRAME_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_0:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_0_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_1:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_1_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_2:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_2_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_3:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_3_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_4:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_4_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_5:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_5_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_6:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_6_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_7:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_XON_PRIORITY_7_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_0:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_0_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_1:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_1_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_2:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_2_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_3:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_3_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_4:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_4_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_5:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_5_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_6:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_6_VAL;
            case BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_7:
                return BSN_PORT_COUNTER_RX_PFC_FRAME_PRIORITY_7_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_0:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_0_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_1:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_1_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_2:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_2_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_3:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_3_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_4:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_4_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_5:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_5_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_6:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_6_VAL;
            case BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_7:
                return BSN_PORT_COUNTER_TX_PFC_FRAME_PRIORITY_7_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnPortCounter in version 1.5: " + e);
        }
    }

}
