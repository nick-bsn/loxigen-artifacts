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
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnPortCounterStatsReplyVer14 implements OFBsnPortCounterStatsReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnPortCounterStatsReplyVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsReplyFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsReplyFlags>of();
        private final static List<OFBsnPortCounterStatsEntry> DEFAULT_ENTRIES = ImmutableList.<OFBsnPortCounterStatsEntry>of();

    // OF message fields
    private final long xid;
    private final Set<OFStatsReplyFlags> flags;
    private final List<OFBsnPortCounterStatsEntry> entries;
//
    // Immutable default instance
    final static OFBsnPortCounterStatsReplyVer14 DEFAULT = new OFBsnPortCounterStatsReplyVer14(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_ENTRIES
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnPortCounterStatsReplyVer14(long xid, Set<OFStatsReplyFlags> flags, List<OFBsnPortCounterStatsEntry> entries) {
        if(flags == null) {
            throw new NullPointerException("OFBsnPortCounterStatsReplyVer14: property flags cannot be null");
        }
        if(entries == null) {
            throw new NullPointerException("OFBsnPortCounterStatsReplyVer14: property entries cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.entries = entries;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x8L;
    }

    @Override
    public List<OFBsnPortCounterStatsEntry> getEntries() {
        return entries;
    }



    public OFBsnPortCounterStatsReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnPortCounterStatsReply.Builder {
        final OFBsnPortCounterStatsReplyVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean entriesSet;
        private List<OFBsnPortCounterStatsEntry> entries;

        BuilderWithParent(OFBsnPortCounterStatsReplyVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x8L;
    }

    @Override
    public List<OFBsnPortCounterStatsEntry> getEntries() {
        return entries;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setEntries(List<OFBsnPortCounterStatsEntry> entries) {
        this.entries = entries;
        this.entriesSet = true;
        return this;
    }


        @Override
        public OFBsnPortCounterStatsReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                List<OFBsnPortCounterStatsEntry> entries = this.entriesSet ? this.entries : parentMessage.entries;
                if(entries == null)
                    throw new NullPointerException("Property entries must not be null");

                //
                return new OFBsnPortCounterStatsReplyVer14(
                    xid,
                    flags,
                    entries
                );
        }

    }

    static class Builder implements OFBsnPortCounterStatsReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean entriesSet;
        private List<OFBsnPortCounterStatsEntry> entries;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.EXPERIMENTER;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x8L;
    }

    @Override
    public List<OFBsnPortCounterStatsEntry> getEntries() {
        return entries;
    }

    @Override
    public OFBsnPortCounterStatsReply.Builder setEntries(List<OFBsnPortCounterStatsEntry> entries) {
        this.entries = entries;
        this.entriesSet = true;
        return this;
    }
//
        @Override
        public OFBsnPortCounterStatsReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            List<OFBsnPortCounterStatsEntry> entries = this.entriesSet ? this.entries : DEFAULT_ENTRIES;
            if(entries == null)
                throw new NullPointerException("Property entries must not be null");


            return new OFBsnPortCounterStatsReplyVer14(
                    xid,
                    flags,
                    entries
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnPortCounterStatsReply> {
        @Override
        public OFBsnPortCounterStatsReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
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
            // fixed value property statsType == 65535
            short statsType = bb.readShort();
            if(statsType != (short) 0xffff)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.EXPERIMENTER(65535), got="+statsType);
            Set<OFStatsReplyFlags> flags = OFStatsReplyFlagsSerializerVer14.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x8L
            int subtype = bb.readInt();
            if(subtype != 0x8)
                throw new OFParseError("Wrong subtype: Expected=0x8L(0x8L), got="+subtype);
            List<OFBsnPortCounterStatsEntry> entries = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFBsnPortCounterStatsEntryVer14.READER);

            OFBsnPortCounterStatsReplyVer14 bsnPortCounterStatsReplyVer14 = new OFBsnPortCounterStatsReplyVer14(
                    xid,
                      flags,
                      entries
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnPortCounterStatsReplyVer14);
            return bsnPortCounterStatsReplyVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnPortCounterStatsReplyVer14Funnel FUNNEL = new OFBsnPortCounterStatsReplyVer14Funnel();
    static class OFBsnPortCounterStatsReplyVer14Funnel implements Funnel<OFBsnPortCounterStatsReplyVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnPortCounterStatsReplyVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 19
            sink.putByte((byte) 0x13);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property statsType = 65535
            sink.putShort((short) 0xffff);
            OFStatsReplyFlagsSerializerVer14.putTo(message.flags, sink);
            // skip pad (4 bytes)
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x8L
            sink.putInt(0x8);
            FunnelUtils.putList(message.entries, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnPortCounterStatsReplyVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnPortCounterStatsReplyVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 19
            bb.writeByte((byte) 0x13);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 65535
            bb.writeShort((short) 0xffff);
            OFStatsReplyFlagsSerializerVer14.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x8L
            bb.writeInt(0x8);
            ChannelUtils.writeList(bb, message.entries);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnPortCounterStatsReplyVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("entries=").append(entries);
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
        OFBsnPortCounterStatsReplyVer14 other = (OFBsnPortCounterStatsReplyVer14) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (entries == null) {
            if (other.entries != null)
                return false;
        } else if (!entries.equals(other.entries))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((entries == null) ? 0 : entries.hashCode());
        return result;
    }

}
