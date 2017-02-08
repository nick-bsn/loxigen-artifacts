// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFControllerStatusVer15 implements OFControllerStatus {
    private static final Logger logger = LoggerFactory.getLogger(OFControllerStatusVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;

    // OF message fields
    private final long xid;
    private final OFControllerStatusEntry entry;
//

    // package private constructor - used by readers, builders, and factory
    OFControllerStatusVer15(long xid, OFControllerStatusEntry entry) {
        if(entry == null) {
            throw new NullPointerException("OFControllerStatusVer15: property entry cannot be null");
        }
        this.xid = xid;
        this.entry = entry;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.CONTROLLER_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFControllerStatusEntry getEntry() {
        return entry;
    }



    public OFControllerStatus.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFControllerStatus.Builder {
        final OFControllerStatusVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean entrySet;
        private OFControllerStatusEntry entry;

        BuilderWithParent(OFControllerStatusVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.CONTROLLER_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFControllerStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFControllerStatusEntry getEntry() {
        return entry;
    }

    @Override
    public OFControllerStatus.Builder setEntry(OFControllerStatusEntry entry) {
        this.entry = entry;
        this.entrySet = true;
        return this;
    }


        @Override
        public OFControllerStatus build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFControllerStatusEntry entry = this.entrySet ? this.entry : parentMessage.entry;
                if(entry == null)
                    throw new NullPointerException("Property entry must not be null");

                //
                return new OFControllerStatusVer15(
                    xid,
                    entry
                );
        }

    }

    static class Builder implements OFControllerStatus.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean entrySet;
        private OFControllerStatusEntry entry;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.CONTROLLER_STATUS;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFControllerStatus.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFControllerStatusEntry getEntry() {
        return entry;
    }

    @Override
    public OFControllerStatus.Builder setEntry(OFControllerStatusEntry entry) {
        this.entry = entry;
        this.entrySet = true;
        return this;
    }
//
        @Override
        public OFControllerStatus build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.entrySet)
                throw new IllegalStateException("Property entry doesn't have default value -- must be set");
            if(entry == null)
                throw new NullPointerException("Property entry must not be null");


            return new OFControllerStatusVer15(
                    xid,
                    entry
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFControllerStatus> {
        @Override
        public OFControllerStatus readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 35
            byte type = bb.readByte();
            if(type != (byte) 0x23)
                throw new OFParseError("Wrong type: Expected=OFType.CONTROLLER_STATUS(35), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFControllerStatusEntry entry = OFControllerStatusEntryVer15.READER.readFrom(bb);

            OFControllerStatusVer15 controllerStatusVer15 = new OFControllerStatusVer15(
                    xid,
                      entry
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", controllerStatusVer15);
            return controllerStatusVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFControllerStatusVer15Funnel FUNNEL = new OFControllerStatusVer15Funnel();
    static class OFControllerStatusVer15Funnel implements Funnel<OFControllerStatusVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFControllerStatusVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 35
            sink.putByte((byte) 0x23);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.entry.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFControllerStatusVer15> {
        @Override
        public void write(ByteBuf bb, OFControllerStatusVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 35
            bb.writeByte((byte) 0x23);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            message.entry.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFControllerStatusVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("entry=").append(entry);
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
        OFControllerStatusVer15 other = (OFControllerStatusVer15) obj;

        if( xid != other.xid)
            return false;
        if (entry == null) {
            if (other.entry != null)
                return false;
        } else if (!entry.equals(other.entry))
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFControllerStatusVer15 other = (OFControllerStatusVer15) obj;

        // ignore XID
        if (entry == null) {
            if (other.entry != null)
                return false;
        } else if (!entry.equals(other.entry))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((entry == null) ? 0 : entry.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((entry == null) ? 0 : entry.hashCode());
        return result;
    }

}
