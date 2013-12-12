// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFGetConfigRequestVer12 implements OFGetConfigRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFGetConfigRequestVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 8;

        private final static long DEFAULT_XID = 0x0L;

    // OF message fields
    private final long xid;
//
    // Immutable default instance
    final static OFGetConfigRequestVer12 DEFAULT = new OFGetConfigRequestVer12(
        DEFAULT_XID
    );

    // package private constructor - used by readers, builders, and factory
    OFGetConfigRequestVer12(long xid) {
        this.xid = xid;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }



    public OFGetConfigRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGetConfigRequest.Builder {
        final OFGetConfigRequestVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;

        BuilderWithParent(OFGetConfigRequestVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGetConfigRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }


        @Override
        public OFGetConfigRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;

                //
                return new OFGetConfigRequestVer12(
                    xid
                );
        }

    }

    static class Builder implements OFGetConfigRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.GET_CONFIG_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGetConfigRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
//
        @Override
        public OFGetConfigRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;


            return new OFGetConfigRequestVer12(
                    xid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFGetConfigRequest> {
        @Override
        public OFGetConfigRequest readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 7
            byte type = bb.readByte();
            if(type != (byte) 0x7)
                throw new OFParseError("Wrong type: Expected=OFType.GET_CONFIG_REQUEST(7), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());

            OFGetConfigRequestVer12 getConfigRequestVer12 = new OFGetConfigRequestVer12(
                    xid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", getConfigRequestVer12);
            return getConfigRequestVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGetConfigRequestVer12Funnel FUNNEL = new OFGetConfigRequestVer12Funnel();
    static class OFGetConfigRequestVer12Funnel implements Funnel<OFGetConfigRequestVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGetConfigRequestVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 7
            sink.putByte((byte) 0x7);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.xid);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGetConfigRequestVer12> {
        @Override
        public void write(ChannelBuffer bb, OFGetConfigRequestVer12 message) {
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 7
            bb.writeByte((byte) 0x7);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.xid));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGetConfigRequestVer12(");
        b.append("xid=").append(xid);
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
        OFGetConfigRequestVer12 other = (OFGetConfigRequestVer12) obj;

        if( xid != other.xid)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        return result;
    }

}
