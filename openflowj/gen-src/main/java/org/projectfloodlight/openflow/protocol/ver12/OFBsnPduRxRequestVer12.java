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
import java.util.Arrays;

class OFBsnPduRxRequestVer12 implements OFBsnPduRxRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnPduRxRequestVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 28;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_TIMEOUT_MS = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static short DEFAULT_SLOT_NUM = (short) 0x0;
        private final static byte[] DEFAULT_DATA = new byte[0];

    // OF message fields
    private final long xid;
    private final long timeoutMs;
    private final OFPort portNo;
    private final short slotNum;
    private final byte[] data;
//
    // Immutable default instance
    final static OFBsnPduRxRequestVer12 DEFAULT = new OFBsnPduRxRequestVer12(
        DEFAULT_XID, DEFAULT_TIMEOUT_MS, DEFAULT_PORT_NO, DEFAULT_SLOT_NUM, DEFAULT_DATA
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnPduRxRequestVer12(long xid, long timeoutMs, OFPort portNo, short slotNum, byte[] data) {
        this.xid = xid;
        this.timeoutMs = timeoutMs;
        this.portNo = portNo;
        this.slotNum = slotNum;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public byte[] getData() {
        return data;
    }



    public OFBsnPduRxRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnPduRxRequest.Builder {
        final OFBsnPduRxRequestVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeoutMsSet;
        private long timeoutMs;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;
        private boolean dataSet;
        private byte[] data;

        BuilderWithParent(OFBsnPduRxRequestVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
    public OFBsnPduRxRequest.Builder setXid(long xid) {
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFBsnPduRxRequest.Builder setTimeoutMs(long timeoutMs) {
        this.timeoutMs = timeoutMs;
        this.timeoutMsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxRequest.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFBsnPduRxRequest.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBsnPduRxRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long timeoutMs = this.timeoutMsSet ? this.timeoutMs : parentMessage.timeoutMs;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                short slotNum = this.slotNumSet ? this.slotNum : parentMessage.slotNum;
                byte[] data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBsnPduRxRequestVer12(
                    xid,
                    timeoutMs,
                    portNo,
                    slotNum,
                    data
                );
        }

    }

    static class Builder implements OFBsnPduRxRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeoutMsSet;
        private long timeoutMs;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;
        private boolean dataSet;
        private byte[] data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
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
    public OFBsnPduRxRequest.Builder setXid(long xid) {
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFBsnPduRxRequest.Builder setTimeoutMs(long timeoutMs) {
        this.timeoutMs = timeoutMs;
        this.timeoutMsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxRequest.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFBsnPduRxRequest.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBsnPduRxRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long timeoutMs = this.timeoutMsSet ? this.timeoutMs : DEFAULT_TIMEOUT_MS;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            short slotNum = this.slotNumSet ? this.slotNum : DEFAULT_SLOT_NUM;
            byte[] data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBsnPduRxRequestVer12(
                    xid,
                    timeoutMs,
                    portNo,
                    slotNum,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnPduRxRequest> {
        @Override
        public OFBsnPduRxRequest readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
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
            // fixed value property subtype == 0x21L
            int subtype = bb.readInt();
            if(subtype != 0x21)
                throw new OFParseError("Wrong subtype: Expected=0x21L(0x21L), got="+subtype);
            long timeoutMs = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            short slotNum = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            byte[] data = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFBsnPduRxRequestVer12 bsnPduRxRequestVer12 = new OFBsnPduRxRequestVer12(
                    xid,
                      timeoutMs,
                      portNo,
                      slotNum,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnPduRxRequestVer12);
            return bsnPduRxRequestVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnPduRxRequestVer12Funnel FUNNEL = new OFBsnPduRxRequestVer12Funnel();
    static class OFBsnPduRxRequestVer12Funnel implements Funnel<OFBsnPduRxRequestVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnPduRxRequestVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x21L
            sink.putInt(0x21);
            sink.putLong(message.timeoutMs);
            message.portNo.putTo(sink);
            sink.putShort(message.slotNum);
            // skip pad (3 bytes)
            sink.putBytes(message.data);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnPduRxRequestVer12> {
        @Override
        public void write(ChannelBuffer bb, OFBsnPduRxRequestVer12 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x21L
            bb.writeInt(0x21);
            bb.writeInt(U32.t(message.timeoutMs));
            message.portNo.write4Bytes(bb);
            bb.writeByte(U8.t(message.slotNum));
            // pad: 3 bytes
            bb.writeZero(3);
            bb.writeBytes(message.data);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnPduRxRequestVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("timeoutMs=").append(timeoutMs);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("slotNum=").append(slotNum);
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
        OFBsnPduRxRequestVer12 other = (OFBsnPduRxRequestVer12) obj;

        if( xid != other.xid)
            return false;
        if( timeoutMs != other.timeoutMs)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( slotNum != other.slotNum)
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
        result = prime *  (int) (timeoutMs ^ (timeoutMs >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + slotNum;
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

}
