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
import org.projectfloodlight.openflow.protocol.OFHelloElemType;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFHelloElemTypeSerializerVer13 {

    public final static short VERSIONBITMAP_VAL = (short) 0x1;

    public static OFHelloElemType readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFHelloElemType e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFHelloElemType e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFHelloElemType ofWireValue(short val) {
        switch(val) {
            case VERSIONBITMAP_VAL:
                return OFHelloElemType.VERSIONBITMAP;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFHelloElemType in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFHelloElemType e) {
        switch(e) {
            case VERSIONBITMAP:
                return VERSIONBITMAP_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFHelloElemType in version 1.3: " + e);
        }
    }

}
