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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFAggregateStatsRequestVer14 implements OFAggregateStatsRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFAggregateStatsRequestVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 56;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsRequestFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsRequestFlags>of();
        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static OFPort DEFAULT_OUT_PORT = OFPort.ANY;
        private final static OFGroup DEFAULT_OUT_GROUP = OFGroup.ANY;
        private final static U64 DEFAULT_COOKIE = U64.ZERO;
        private final static U64 DEFAULT_COOKIE_MASK = U64.ZERO;
        private final static Match DEFAULT_MATCH = OFFactoryVer14.MATCH_WILDCARD_ALL;

    // OF message fields
    private final long xid;
    private final Set<OFStatsRequestFlags> flags;
    private final TableId tableId;
    private final OFPort outPort;
    private final OFGroup outGroup;
    private final U64 cookie;
    private final U64 cookieMask;
    private final Match match;
//
    // Immutable default instance
    final static OFAggregateStatsRequestVer14 DEFAULT = new OFAggregateStatsRequestVer14(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_TABLE_ID, DEFAULT_OUT_PORT, DEFAULT_OUT_GROUP, DEFAULT_COOKIE, DEFAULT_COOKIE_MASK, DEFAULT_MATCH
    );

    // package private constructor - used by readers, builders, and factory
    OFAggregateStatsRequestVer14(long xid, Set<OFStatsRequestFlags> flags, TableId tableId, OFPort outPort, OFGroup outGroup, U64 cookie, U64 cookieMask, Match match) {
        if(flags == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property flags cannot be null");
        }
        if(tableId == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property tableId cannot be null");
        }
        if(outPort == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property outPort cannot be null");
        }
        if(outGroup == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property outGroup cannot be null");
        }
        if(cookie == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property cookie cannot be null");
        }
        if(cookieMask == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property cookieMask cannot be null");
        }
        if(match == null) {
            throw new NullPointerException("OFAggregateStatsRequestVer14: property match cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.tableId = tableId;
        this.outPort = outPort;
        this.outGroup = outGroup;
        this.cookie = cookie;
        this.cookieMask = cookieMask;
        this.match = match;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public OFGroup getOutGroup() {
        return outGroup;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public U64 getCookieMask() {
        return cookieMask;
    }

    @Override
    public Match getMatch() {
        return match;
    }



    public OFAggregateStatsRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFAggregateStatsRequest.Builder {
        final OFAggregateStatsRequestVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean outPortSet;
        private OFPort outPort;
        private boolean outGroupSet;
        private OFGroup outGroup;
        private boolean cookieSet;
        private U64 cookie;
        private boolean cookieMaskSet;
        private U64 cookieMask;
        private boolean matchSet;
        private Match match;

        BuilderWithParent(OFAggregateStatsRequestVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAggregateStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFAggregateStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFAggregateStatsRequest.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public OFAggregateStatsRequest.Builder setOutPort(OFPort outPort) {
        this.outPort = outPort;
        this.outPortSet = true;
        return this;
    }
    @Override
    public OFGroup getOutGroup() {
        return outGroup;
    }

    @Override
    public OFAggregateStatsRequest.Builder setOutGroup(OFGroup outGroup) {
        this.outGroup = outGroup;
        this.outGroupSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFAggregateStatsRequest.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getCookieMask() {
        return cookieMask;
    }

    @Override
    public OFAggregateStatsRequest.Builder setCookieMask(U64 cookieMask) {
        this.cookieMask = cookieMask;
        this.cookieMaskSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFAggregateStatsRequest.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }


        @Override
        public OFAggregateStatsRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                OFPort outPort = this.outPortSet ? this.outPort : parentMessage.outPort;
                if(outPort == null)
                    throw new NullPointerException("Property outPort must not be null");
                OFGroup outGroup = this.outGroupSet ? this.outGroup : parentMessage.outGroup;
                if(outGroup == null)
                    throw new NullPointerException("Property outGroup must not be null");
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");
                U64 cookieMask = this.cookieMaskSet ? this.cookieMask : parentMessage.cookieMask;
                if(cookieMask == null)
                    throw new NullPointerException("Property cookieMask must not be null");
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");

                //
                return new OFAggregateStatsRequestVer14(
                    xid,
                    flags,
                    tableId,
                    outPort,
                    outGroup,
                    cookie,
                    cookieMask,
                    match
                );
        }

    }

    static class Builder implements OFAggregateStatsRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean outPortSet;
        private OFPort outPort;
        private boolean outGroupSet;
        private OFGroup outGroup;
        private boolean cookieSet;
        private U64 cookie;
        private boolean cookieMaskSet;
        private U64 cookieMask;
        private boolean matchSet;
        private Match match;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAggregateStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFAggregateStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFAggregateStatsRequest.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public OFAggregateStatsRequest.Builder setOutPort(OFPort outPort) {
        this.outPort = outPort;
        this.outPortSet = true;
        return this;
    }
    @Override
    public OFGroup getOutGroup() {
        return outGroup;
    }

    @Override
    public OFAggregateStatsRequest.Builder setOutGroup(OFGroup outGroup) {
        this.outGroup = outGroup;
        this.outGroupSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFAggregateStatsRequest.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getCookieMask() {
        return cookieMask;
    }

    @Override
    public OFAggregateStatsRequest.Builder setCookieMask(U64 cookieMask) {
        this.cookieMask = cookieMask;
        this.cookieMaskSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFAggregateStatsRequest.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
//
        @Override
        public OFAggregateStatsRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            OFPort outPort = this.outPortSet ? this.outPort : DEFAULT_OUT_PORT;
            if(outPort == null)
                throw new NullPointerException("Property outPort must not be null");
            OFGroup outGroup = this.outGroupSet ? this.outGroup : DEFAULT_OUT_GROUP;
            if(outGroup == null)
                throw new NullPointerException("Property outGroup must not be null");
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");
            U64 cookieMask = this.cookieMaskSet ? this.cookieMask : DEFAULT_COOKIE_MASK;
            if(cookieMask == null)
                throw new NullPointerException("Property cookieMask must not be null");
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");


            return new OFAggregateStatsRequestVer14(
                    xid,
                    flags,
                    tableId,
                    outPort,
                    outGroup,
                    cookie,
                    cookieMask,
                    match
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFAggregateStatsRequest> {
        @Override
        public OFAggregateStatsRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 18
            byte type = bb.readByte();
            if(type != (byte) 0x12)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REQUEST(18), got="+type);
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
            // fixed value property statsType == 2
            short statsType = bb.readShort();
            if(statsType != (short) 0x2)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.AGGREGATE(2), got="+statsType);
            Set<OFStatsRequestFlags> flags = OFStatsRequestFlagsSerializerVer14.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            TableId tableId = TableId.readByte(bb);
            // pad: 3 bytes
            bb.skipBytes(3);
            OFPort outPort = OFPort.read4Bytes(bb);
            OFGroup outGroup = OFGroup.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 cookie = U64.ofRaw(bb.readLong());
            U64 cookieMask = U64.ofRaw(bb.readLong());
            Match match = ChannelUtilsVer14.readOFMatch(bb);

            OFAggregateStatsRequestVer14 aggregateStatsRequestVer14 = new OFAggregateStatsRequestVer14(
                    xid,
                      flags,
                      tableId,
                      outPort,
                      outGroup,
                      cookie,
                      cookieMask,
                      match
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", aggregateStatsRequestVer14);
            return aggregateStatsRequestVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFAggregateStatsRequestVer14Funnel FUNNEL = new OFAggregateStatsRequestVer14Funnel();
    static class OFAggregateStatsRequestVer14Funnel implements Funnel<OFAggregateStatsRequestVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFAggregateStatsRequestVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 18
            sink.putByte((byte) 0x12);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property statsType = 2
            sink.putShort((short) 0x2);
            OFStatsRequestFlagsSerializerVer14.putTo(message.flags, sink);
            // skip pad (4 bytes)
            message.tableId.putTo(sink);
            // skip pad (3 bytes)
            message.outPort.putTo(sink);
            message.outGroup.putTo(sink);
            // skip pad (4 bytes)
            message.cookie.putTo(sink);
            message.cookieMask.putTo(sink);
            message.match.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFAggregateStatsRequestVer14> {
        @Override
        public void write(ByteBuf bb, OFAggregateStatsRequestVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 18
            bb.writeByte((byte) 0x12);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 2
            bb.writeShort((short) 0x2);
            OFStatsRequestFlagsSerializerVer14.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            message.tableId.writeByte(bb);
            // pad: 3 bytes
            bb.writeZero(3);
            message.outPort.write4Bytes(bb);
            message.outGroup.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.cookie.getValue());
            bb.writeLong(message.cookieMask.getValue());
            message.match.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFAggregateStatsRequestVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("outPort=").append(outPort);
        b.append(", ");
        b.append("outGroup=").append(outGroup);
        b.append(", ");
        b.append("cookie=").append(cookie);
        b.append(", ");
        b.append("cookieMask=").append(cookieMask);
        b.append(", ");
        b.append("match=").append(match);
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
        OFAggregateStatsRequestVer14 other = (OFAggregateStatsRequestVer14) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (outPort == null) {
            if (other.outPort != null)
                return false;
        } else if (!outPort.equals(other.outPort))
            return false;
        if (outGroup == null) {
            if (other.outGroup != null)
                return false;
        } else if (!outGroup.equals(other.outGroup))
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if (cookieMask == null) {
            if (other.cookieMask != null)
                return false;
        } else if (!cookieMask.equals(other.cookieMask))
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
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
        OFAggregateStatsRequestVer14 other = (OFAggregateStatsRequestVer14) obj;

        // ignore XID
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (outPort == null) {
            if (other.outPort != null)
                return false;
        } else if (!outPort.equals(other.outPort))
            return false;
        if (outGroup == null) {
            if (other.outGroup != null)
                return false;
        } else if (!outGroup.equals(other.outGroup))
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if (cookieMask == null) {
            if (other.cookieMask != null)
                return false;
        } else if (!cookieMask.equals(other.cookieMask))
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((outPort == null) ? 0 : outPort.hashCode());
        result = prime * result + ((outGroup == null) ? 0 : outGroup.hashCode());
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + ((cookieMask == null) ? 0 : cookieMask.hashCode());
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((outPort == null) ? 0 : outPort.hashCode());
        result = prime * result + ((outGroup == null) ? 0 : outGroup.hashCode());
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + ((cookieMask == null) ? 0 : cookieMask.hashCode());
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        return result;
    }

}
