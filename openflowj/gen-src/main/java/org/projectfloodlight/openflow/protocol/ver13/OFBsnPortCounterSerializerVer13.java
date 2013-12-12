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
import org.projectfloodlight.openflow.protocol.OFBsnPortCounter;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFBsnPortCounterSerializerVer13 {

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

    public static OFBsnPortCounter readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFBsnPortCounter e) {
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
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnPortCounter in version 1.3: " + val);
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
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnPortCounter in version 1.3: " + e);
        }
    }

}
