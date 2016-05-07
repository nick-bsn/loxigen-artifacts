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

class OFBsnFlowIdleVer15 implements OFBsnFlowIdle {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnFlowIdleVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 40;

        private final static long DEFAULT_XID = 0x0L;
        private final static U64 DEFAULT_COOKIE = U64.ZERO;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static Match DEFAULT_MATCH = OFFactoryVer15.MATCH_WILDCARD_ALL;

    // OF message fields
    private final long xid;
    private final U64 cookie;
    private final int priority;
    private final TableId tableId;
    private final Match match;
//
    // Immutable default instance
    final static OFBsnFlowIdleVer15 DEFAULT = new OFBsnFlowIdleVer15(
        DEFAULT_XID, DEFAULT_COOKIE, DEFAULT_PRIORITY, DEFAULT_TABLE_ID, DEFAULT_MATCH
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnFlowIdleVer15(long xid, U64 cookie, int priority, TableId tableId, Match match) {
        if(cookie == null) {
            throw new NullPointerException("OFBsnFlowIdleVer15: property cookie cannot be null");
        }
        if(tableId == null) {
            throw new NullPointerException("OFBsnFlowIdleVer15: property tableId cannot be null");
        }
        if(match == null) {
            throw new NullPointerException("OFBsnFlowIdleVer15: property match cannot be null");
        }
        this.xid = xid;
        this.cookie = cookie;
        this.priority = priority;
        this.tableId = tableId;
        this.match = match;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x28L;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public Match getMatch() {
        return match;
    }



    public OFBsnFlowIdle.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnFlowIdle.Builder {
        final OFBsnFlowIdleVer15 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean cookieSet;
        private U64 cookie;
        private boolean prioritySet;
        private int priority;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean matchSet;
        private Match match;

        BuilderWithParent(OFBsnFlowIdleVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnFlowIdle.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x28L;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFBsnFlowIdle.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFBsnFlowIdle.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnFlowIdle.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFBsnFlowIdle.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }


        @Override
        public OFBsnFlowIdle build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");

                //
                return new OFBsnFlowIdleVer15(
                    xid,
                    cookie,
                    priority,
                    tableId,
                    match
                );
        }

    }

    static class Builder implements OFBsnFlowIdle.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean cookieSet;
        private U64 cookie;
        private boolean prioritySet;
        private int priority;
        private boolean tableIdSet;
        private TableId tableId;
        private boolean matchSet;
        private Match match;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnFlowIdle.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x28L;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFBsnFlowIdle.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFBsnFlowIdle.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnFlowIdle.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFBsnFlowIdle.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
//
        @Override
        public OFBsnFlowIdle build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");


            return new OFBsnFlowIdleVer15(
                    xid,
                    cookie,
                    priority,
                    tableId,
                    match
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnFlowIdle> {
        @Override
        public OFBsnFlowIdle readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 6
            byte version = bb.readByte();
            if(version != (byte) 0x6)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_15(6), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
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
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x28L
            int subtype = bb.readInt();
            if(subtype != 0x28)
                throw new OFParseError("Wrong subtype: Expected=0x28L(0x28L), got="+subtype);
            U64 cookie = U64.ofRaw(bb.readLong());
            int priority = U16.f(bb.readShort());
            TableId tableId = TableId.readByte(bb);
            // pad: 5 bytes
            bb.skipBytes(5);
            Match match = ChannelUtilsVer15.readOFMatch(bb);

            OFBsnFlowIdleVer15 bsnFlowIdleVer15 = new OFBsnFlowIdleVer15(
                    xid,
                      cookie,
                      priority,
                      tableId,
                      match
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnFlowIdleVer15);
            return bsnFlowIdleVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnFlowIdleVer15Funnel FUNNEL = new OFBsnFlowIdleVer15Funnel();
    static class OFBsnFlowIdleVer15Funnel implements Funnel<OFBsnFlowIdleVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnFlowIdleVer15 message, PrimitiveSink sink) {
            // fixed value property version = 6
            sink.putByte((byte) 0x6);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x28L
            sink.putInt(0x28);
            message.cookie.putTo(sink);
            sink.putInt(message.priority);
            message.tableId.putTo(sink);
            // skip pad (5 bytes)
            message.match.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnFlowIdleVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnFlowIdleVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 6
            bb.writeByte((byte) 0x6);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x28L
            bb.writeInt(0x28);
            bb.writeLong(message.cookie.getValue());
            bb.writeShort(U16.t(message.priority));
            message.tableId.writeByte(bb);
            // pad: 5 bytes
            bb.writeZero(5);
            message.match.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnFlowIdleVer15(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("cookie=").append(cookie);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("tableId=").append(tableId);
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
        OFBsnFlowIdleVer15 other = (OFBsnFlowIdleVer15) obj;

        if( xid != other.xid)
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if( priority != other.priority)
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
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
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + priority;
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        return result;
    }

}
