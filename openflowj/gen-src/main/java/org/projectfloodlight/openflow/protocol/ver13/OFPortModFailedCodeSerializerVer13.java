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
import org.projectfloodlight.openflow.protocol.OFPortModFailedCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFPortModFailedCodeSerializerVer13 {

    public final static short BAD_PORT_VAL = (short) 0x0;
    public final static short BAD_HW_ADDR_VAL = (short) 0x1;
    public final static short BAD_CONFIG_VAL = (short) 0x2;
    public final static short BAD_ADVERTISE_VAL = (short) 0x3;
    public final static short EPERM_VAL = (short) 0x4;

    public static OFPortModFailedCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFPortModFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFPortModFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFPortModFailedCode ofWireValue(short val) {
        switch(val) {
            case BAD_PORT_VAL:
                return OFPortModFailedCode.BAD_PORT;
            case BAD_HW_ADDR_VAL:
                return OFPortModFailedCode.BAD_HW_ADDR;
            case BAD_CONFIG_VAL:
                return OFPortModFailedCode.BAD_CONFIG;
            case BAD_ADVERTISE_VAL:
                return OFPortModFailedCode.BAD_ADVERTISE;
            case EPERM_VAL:
                return OFPortModFailedCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFPortModFailedCode in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFPortModFailedCode e) {
        switch(e) {
            case BAD_PORT:
                return BAD_PORT_VAL;
            case BAD_HW_ADDR:
                return BAD_HW_ADDR_VAL;
            case BAD_CONFIG:
                return BAD_CONFIG_VAL;
            case BAD_ADVERTISE:
                return BAD_ADVERTISE_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFPortModFailedCode in version 1.3: " + e);
        }
    }

}
