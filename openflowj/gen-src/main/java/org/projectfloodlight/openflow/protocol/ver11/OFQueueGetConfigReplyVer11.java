// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver11;

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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFQueueGetConfigReplyVer11 implements OFQueueGetConfigReply {
    private static final Logger logger = LoggerFactory.getLogger(OFQueueGetConfigReplyVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFPort DEFAULT_PORT = OFPort.ANY;
        private final static List<OFPacketQueue> DEFAULT_QUEUES = ImmutableList.<OFPacketQueue>of();

    // OF message fields
    private final long xid;
    private final OFPort port;
    private final List<OFPacketQueue> queues;
//
    // Immutable default instance
    final static OFQueueGetConfigReplyVer11 DEFAULT = new OFQueueGetConfigReplyVer11(
        DEFAULT_XID, DEFAULT_PORT, DEFAULT_QUEUES
    );

    // package private constructor - used by readers, builders, and factory
    OFQueueGetConfigReplyVer11(long xid, OFPort port, List<OFPacketQueue> queues) {
        this.xid = xid;
        this.port = port;
        this.queues = queues;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.QUEUE_GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPort getPort() {
        return port;
    }

    @Override
    public List<OFPacketQueue> getQueues() {
        return queues;
    }



    public OFQueueGetConfigReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFQueueGetConfigReply.Builder {
        final OFQueueGetConfigReplyVer11 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portSet;
        private OFPort port;
        private boolean queuesSet;
        private List<OFPacketQueue> queues;

        BuilderWithParent(OFQueueGetConfigReplyVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.QUEUE_GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFQueueGetConfigReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPort() {
        return port;
    }

    @Override
    public OFQueueGetConfigReply.Builder setPort(OFPort port) {
        this.port = port;
        this.portSet = true;
        return this;
    }
    @Override
    public List<OFPacketQueue> getQueues() {
        return queues;
    }

    @Override
    public OFQueueGetConfigReply.Builder setQueues(List<OFPacketQueue> queues) {
        this.queues = queues;
        this.queuesSet = true;
        return this;
    }


        @Override
        public OFQueueGetConfigReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFPort port = this.portSet ? this.port : parentMessage.port;
                if(port == null)
                    throw new NullPointerException("Property port must not be null");
                List<OFPacketQueue> queues = this.queuesSet ? this.queues : parentMessage.queues;
                if(queues == null)
                    throw new NullPointerException("Property queues must not be null");

                //
                return new OFQueueGetConfigReplyVer11(
                    xid,
                    port,
                    queues
                );
        }

    }

    static class Builder implements OFQueueGetConfigReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portSet;
        private OFPort port;
        private boolean queuesSet;
        private List<OFPacketQueue> queues;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.QUEUE_GET_CONFIG_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFQueueGetConfigReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPort() {
        return port;
    }

    @Override
    public OFQueueGetConfigReply.Builder setPort(OFPort port) {
        this.port = port;
        this.portSet = true;
        return this;
    }
    @Override
    public List<OFPacketQueue> getQueues() {
        return queues;
    }

    @Override
    public OFQueueGetConfigReply.Builder setQueues(List<OFPacketQueue> queues) {
        this.queues = queues;
        this.queuesSet = true;
        return this;
    }
//
        @Override
        public OFQueueGetConfigReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFPort port = this.portSet ? this.port : DEFAULT_PORT;
            if(port == null)
                throw new NullPointerException("Property port must not be null");
            List<OFPacketQueue> queues = this.queuesSet ? this.queues : DEFAULT_QUEUES;
            if(queues == null)
                throw new NullPointerException("Property queues must not be null");


            return new OFQueueGetConfigReplyVer11(
                    xid,
                    port,
                    queues
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFQueueGetConfigReply> {
        @Override
        public OFQueueGetConfigReply readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            // fixed value property type == 23
            byte type = bb.readByte();
            if(type != (byte) 0x17)
                throw new OFParseError("Wrong type: Expected=OFType.QUEUE_GET_CONFIG_REPLY(23), got="+type);
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
            OFPort port = OFPort.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            List<OFPacketQueue> queues = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFPacketQueueVer11.READER);

            OFQueueGetConfigReplyVer11 queueGetConfigReplyVer11 = new OFQueueGetConfigReplyVer11(
                    xid,
                      port,
                      queues
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", queueGetConfigReplyVer11);
            return queueGetConfigReplyVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFQueueGetConfigReplyVer11Funnel FUNNEL = new OFQueueGetConfigReplyVer11Funnel();
    static class OFQueueGetConfigReplyVer11Funnel implements Funnel<OFQueueGetConfigReplyVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFQueueGetConfigReplyVer11 message, PrimitiveSink sink) {
            // fixed value property version = 2
            sink.putByte((byte) 0x2);
            // fixed value property type = 23
            sink.putByte((byte) 0x17);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.port.putTo(sink);
            // skip pad (4 bytes)
            FunnelUtils.putList(message.queues, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFQueueGetConfigReplyVer11> {
        @Override
        public void write(ChannelBuffer bb, OFQueueGetConfigReplyVer11 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 2
            bb.writeByte((byte) 0x2);
            // fixed value property type = 23
            bb.writeByte((byte) 0x17);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            message.port.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            ChannelUtils.writeList(bb, message.queues);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFQueueGetConfigReplyVer11(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("port=").append(port);
        b.append(", ");
        b.append("queues=").append(queues);
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
        OFQueueGetConfigReplyVer11 other = (OFQueueGetConfigReplyVer11) obj;

        if( xid != other.xid)
            return false;
        if (port == null) {
            if (other.port != null)
                return false;
        } else if (!port.equals(other.port))
            return false;
        if (queues == null) {
            if (other.queues != null)
                return false;
        } else if (!queues.equals(other.queues))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((port == null) ? 0 : port.hashCode());
        result = prime * result + ((queues == null) ? 0 : queues.hashCode());
        return result;
    }

}
