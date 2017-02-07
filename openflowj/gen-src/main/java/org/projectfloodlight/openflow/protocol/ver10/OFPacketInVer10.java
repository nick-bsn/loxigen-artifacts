// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import java.util.Arrays;

class OFPacketInVer10 implements OFPacketIn {
    private static final Logger logger = LoggerFactory.getLogger(OFPacketInVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 18;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFBufferId DEFAULT_BUFFER_ID = OFBufferId.NO_BUFFER;
        private final static int DEFAULT_TOTAL_LEN = 0x0;
        private final static OFPort DEFAULT_IN_PORT = OFPort.ANY;
        private final static byte[] DEFAULT_DATA = new byte[0];

    // OF message fields
    private final long xid;
    private final OFBufferId bufferId;
    private final int totalLen;
    private final OFPort inPort;
    private final OFPacketInReason reason;
    private final byte[] data;
//

    // package private constructor - used by readers, builders, and factory
    OFPacketInVer10(long xid, OFBufferId bufferId, int totalLen, OFPort inPort, OFPacketInReason reason, byte[] data) {
        if(bufferId == null) {
            throw new NullPointerException("OFPacketInVer10: property bufferId cannot be null");
        }
        if(inPort == null) {
            throw new NullPointerException("OFPacketInVer10: property inPort cannot be null");
        }
        if(reason == null) {
            throw new NullPointerException("OFPacketInVer10: property reason cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFPacketInVer10: property data cannot be null");
        }
        this.xid = xid;
        this.bufferId = bufferId;
        this.totalLen = totalLen;
        this.inPort = inPort;
        this.reason = reason;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.0");
    }

    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.0");
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPort getInPhyPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property inPhyPort not supported in version 1.0");
    }



    public OFPacketIn.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPacketIn.Builder {
        final OFPacketInVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean totalLenSet;
        private int totalLen;
        private boolean inPortSet;
        private OFPort inPort;
        private boolean reasonSet;
        private OFPacketInReason reason;
        private boolean dataSet;
        private byte[] data;

        BuilderWithParent(OFPacketInVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPacketIn.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFPacketIn.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketIn.Builder setTotalLen(int totalLen) {
        this.totalLen = totalLen;
        this.totalLenSet = true;
        return this;
    }
    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public OFPacketIn.Builder setReason(OFPacketInReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setTableId(TableId tableId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }
    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setCookie(U64 cookie) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookie not supported in version 1.0");
    }
    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setMatch(Match match) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property match not supported in version 1.0");
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPacketIn.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPacketIn.Builder setInPort(OFPort inPort) {
        this.inPort = inPort;
        this.inPortSet = true;
        return this;
    }
    @Override
    public OFPort getInPhyPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property inPhyPort not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setInPhyPort(OFPort inPhyPort) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property inPhyPort not supported in version 1.0");
    }


        @Override
        public OFPacketIn build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFBufferId bufferId = this.bufferIdSet ? this.bufferId : parentMessage.bufferId;
                if(bufferId == null)
                    throw new NullPointerException("Property bufferId must not be null");
                int totalLen = this.totalLenSet ? this.totalLen : parentMessage.totalLen;
                OFPort inPort = this.inPortSet ? this.inPort : parentMessage.inPort;
                if(inPort == null)
                    throw new NullPointerException("Property inPort must not be null");
                OFPacketInReason reason = this.reasonSet ? this.reason : parentMessage.reason;
                if(reason == null)
                    throw new NullPointerException("Property reason must not be null");
                byte[] data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFPacketInVer10(
                    xid,
                    bufferId,
                    totalLen,
                    inPort,
                    reason,
                    data
                );
        }

    }

    static class Builder implements OFPacketIn.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean totalLenSet;
        private int totalLen;
        private boolean inPortSet;
        private OFPort inPort;
        private boolean reasonSet;
        private OFPacketInReason reason;
        private boolean dataSet;
        private byte[] data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.PACKET_IN;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPacketIn.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFPacketIn.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public int getTotalLen() {
        return totalLen;
    }

    @Override
    public OFPacketIn.Builder setTotalLen(int totalLen) {
        this.totalLen = totalLen;
        this.totalLenSet = true;
        return this;
    }
    @Override
    public OFPacketInReason getReason() {
        return reason;
    }

    @Override
    public OFPacketIn.Builder setReason(OFPacketInReason reason) {
        this.reason = reason;
        this.reasonSet = true;
        return this;
    }
    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setTableId(TableId tableId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }
    @Override
    public U64 getCookie()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookie not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setCookie(U64 cookie) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookie not supported in version 1.0");
    }
    @Override
    public Match getMatch()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property match not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setMatch(Match match) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property match not supported in version 1.0");
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFPacketIn.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
    @Override
    public OFPort getInPort() {
        return inPort;
    }

    @Override
    public OFPacketIn.Builder setInPort(OFPort inPort) {
        this.inPort = inPort;
        this.inPortSet = true;
        return this;
    }
    @Override
    public OFPort getInPhyPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property inPhyPort not supported in version 1.0");
    }

    @Override
    public OFPacketIn.Builder setInPhyPort(OFPort inPhyPort) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property inPhyPort not supported in version 1.0");
    }
//
        @Override
        public OFPacketIn build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFBufferId bufferId = this.bufferIdSet ? this.bufferId : DEFAULT_BUFFER_ID;
            if(bufferId == null)
                throw new NullPointerException("Property bufferId must not be null");
            int totalLen = this.totalLenSet ? this.totalLen : DEFAULT_TOTAL_LEN;
            OFPort inPort = this.inPortSet ? this.inPort : DEFAULT_IN_PORT;
            if(inPort == null)
                throw new NullPointerException("Property inPort must not be null");
            if(!this.reasonSet)
                throw new IllegalStateException("Property reason doesn't have default value -- must be set");
            if(reason == null)
                throw new NullPointerException("Property reason must not be null");
            byte[] data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFPacketInVer10(
                    xid,
                    bufferId,
                    totalLen,
                    inPort,
                    reason,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPacketIn> {
        @Override
        public OFPacketIn readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 10
            byte type = bb.readByte();
            if(type != (byte) 0xa)
                throw new OFParseError("Wrong type: Expected=OFType.PACKET_IN(10), got="+type);
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
            OFBufferId bufferId = OFBufferId.of(bb.readInt());
            int totalLen = U16.f(bb.readShort());
            OFPort inPort = OFPort.read2Bytes(bb);
            OFPacketInReason reason = OFPacketInReasonSerializerVer10.readFrom(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            byte[] data = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFPacketInVer10 packetInVer10 = new OFPacketInVer10(
                    xid,
                      bufferId,
                      totalLen,
                      inPort,
                      reason,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", packetInVer10);
            return packetInVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPacketInVer10Funnel FUNNEL = new OFPacketInVer10Funnel();
    static class OFPacketInVer10Funnel implements Funnel<OFPacketInVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPacketInVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 10
            sink.putByte((byte) 0xa);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.bufferId.putTo(sink);
            sink.putInt(message.totalLen);
            message.inPort.putTo(sink);
            OFPacketInReasonSerializerVer10.putTo(message.reason, sink);
            // skip pad (1 bytes)
            sink.putBytes(message.data);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPacketInVer10> {
        @Override
        public void write(ByteBuf bb, OFPacketInVer10 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 10
            bb.writeByte((byte) 0xa);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            bb.writeInt(message.bufferId.getInt());
            bb.writeShort(U16.t(message.totalLen));
            message.inPort.write2Bytes(bb);
            OFPacketInReasonSerializerVer10.writeTo(bb, message.reason);
            // pad: 1 bytes
            bb.writeZero(1);
            bb.writeBytes(message.data);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPacketInVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("bufferId=").append(bufferId);
        b.append(", ");
        b.append("totalLen=").append(totalLen);
        b.append(", ");
        b.append("inPort=").append(inPort);
        b.append(", ");
        b.append("reason=").append(reason);
        b.append(", ");
        b.append("data=").append(Arrays.toString(data));
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
        OFPacketInVer10 other = (OFPacketInVer10) obj;

        if( xid != other.xid)
            return false;
        if (bufferId == null) {
            if (other.bufferId != null)
                return false;
        } else if (!bufferId.equals(other.bufferId))
            return false;
        if( totalLen != other.totalLen)
            return false;
        if (inPort == null) {
            if (other.inPort != null)
                return false;
        } else if (!inPort.equals(other.inPort))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (!Arrays.equals(data, other.data))
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
        OFPacketInVer10 other = (OFPacketInVer10) obj;

        // ignore XID
        if (bufferId == null) {
            if (other.bufferId != null)
                return false;
        } else if (!bufferId.equals(other.bufferId))
            return false;
        if( totalLen != other.totalLen)
            return false;
        if (inPort == null) {
            if (other.inPort != null)
                return false;
        } else if (!inPort.equals(other.inPort))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (!Arrays.equals(data, other.data))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((bufferId == null) ? 0 : bufferId.hashCode());
        result = prime * result + totalLen;
        result = prime * result + ((inPort == null) ? 0 : inPort.hashCode());
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((bufferId == null) ? 0 : bufferId.hashCode());
        result = prime * result + totalLen;
        result = prime * result + ((inPort == null) ? 0 : inPort.hashCode());
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

}
