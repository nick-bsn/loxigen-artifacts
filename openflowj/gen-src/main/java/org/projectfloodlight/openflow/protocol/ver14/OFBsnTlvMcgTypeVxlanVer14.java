// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvMcgTypeVxlanVer14 implements OFBsnTlvMcgTypeVxlan {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvMcgTypeVxlanVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 4;


    // OF message fields
//
    // Immutable default instance
    final static OFBsnTlvMcgTypeVxlanVer14 DEFAULT = new OFBsnTlvMcgTypeVxlanVer14(

    );

    final static OFBsnTlvMcgTypeVxlanVer14 INSTANCE = new OFBsnTlvMcgTypeVxlanVer14();
    // private empty constructor - use shared instance!
    private OFBsnTlvMcgTypeVxlanVer14() {
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x57;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    // no data members - do not support builder
    public OFBsnTlvMcgTypeVxlan.Builder createBuilder() {
        throw new UnsupportedOperationException("OFBsnTlvMcgTypeVxlanVer14 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvMcgTypeVxlan> {
        @Override
        public OFBsnTlvMcgTypeVxlan readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x57
            short type = bb.readShort();
            if(type != (short) 0x57)
                throw new OFParseError("Wrong type: Expected=0x57(0x57), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 4)
                throw new OFParseError("Wrong length: Expected=4(4), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvMcgTypeVxlanVer14Funnel FUNNEL = new OFBsnTlvMcgTypeVxlanVer14Funnel();
    static class OFBsnTlvMcgTypeVxlanVer14Funnel implements Funnel<OFBsnTlvMcgTypeVxlanVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvMcgTypeVxlanVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x57
            sink.putShort((short) 0x57);
            // fixed value property length = 4
            sink.putShort((short) 0x4);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvMcgTypeVxlanVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvMcgTypeVxlanVer14 message) {
            // fixed value property type = 0x57
            bb.writeShort((short) 0x57);
            // fixed value property length = 4
            bb.writeShort((short) 0x4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvMcgTypeVxlanVer14(");
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
