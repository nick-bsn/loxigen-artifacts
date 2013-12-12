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
import org.projectfloodlight.openflow.protocol.OFNiciraControllerRole;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFNiciraControllerRoleSerializerVer10 {

    public final static int ROLE_OTHER_VAL = 0x0;
    public final static int ROLE_MASTER_VAL = 0x1;
    public final static int ROLE_SLAVE_VAL = 0x2;

    public static OFNiciraControllerRole readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFNiciraControllerRole e) {
        bb.writeInt(toWireValue(e));
    }

    public static void putTo(OFNiciraControllerRole e, PrimitiveSink sink) {
        sink.putInt(toWireValue(e));
    }

    public static OFNiciraControllerRole ofWireValue(int val) {
        switch(val) {
            case ROLE_OTHER_VAL:
                return OFNiciraControllerRole.ROLE_OTHER;
            case ROLE_MASTER_VAL:
                return OFNiciraControllerRole.ROLE_MASTER;
            case ROLE_SLAVE_VAL:
                return OFNiciraControllerRole.ROLE_SLAVE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFNiciraControllerRole in version 1.0: " + val);
        }
    }


    public static int toWireValue(OFNiciraControllerRole e) {
        switch(e) {
            case ROLE_OTHER:
                return ROLE_OTHER_VAL;
            case ROLE_MASTER:
                return ROLE_MASTER_VAL;
            case ROLE_SLAVE:
                return ROLE_SLAVE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFNiciraControllerRole in version 1.0: " + e);
        }
    }

}
