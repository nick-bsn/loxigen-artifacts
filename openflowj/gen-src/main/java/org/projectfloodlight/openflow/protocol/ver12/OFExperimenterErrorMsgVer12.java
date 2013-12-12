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

class OFExperimenterErrorMsgVer12 implements OFExperimenterErrorMsg {
    private static final Logger logger = LoggerFactory.getLogger(OFExperimenterErrorMsgVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 16;

        private final static long DEFAULT_XID = 0x0L;
        private final static int DEFAULT_SUBTYPE = 0x0;
        private final static long DEFAULT_EXPERIMENTER = 0x0L;
        private final static byte[] DEFAULT_DATA = new byte[0];

    // OF message fields
    private final long xid;
    private final int subtype;
    private final long experimenter;
    private final byte[] data;
//
    // Immutable default instance
    final static OFExperimenterErrorMsgVer12 DEFAULT = new OFExperimenterErrorMsgVer12(
        DEFAULT_XID, DEFAULT_SUBTYPE, DEFAULT_EXPERIMENTER, DEFAULT_DATA
    );

    // package private constructor - used by readers, builders, and factory
    OFExperimenterErrorMsgVer12(long xid, int subtype, long experimenter, byte[] data) {
        this.xid = xid;
        this.subtype = subtype;
        this.experimenter = experimenter;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return subtype;
    }

    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public byte[] getData() {
        return data;
    }



    public OFExperimenterErrorMsg.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFExperimenterErrorMsg.Builder {
        final OFExperimenterErrorMsgVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean subtypeSet;
        private int subtype;
        private boolean experimenterSet;
        private long experimenter;
        private boolean dataSet;
        private byte[] data;

        BuilderWithParent(OFExperimenterErrorMsgVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return subtype;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setSubtype(int subtype) {
        this.subtype = subtype;
        this.subtypeSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setExperimenter(long experimenter) {
        this.experimenter = experimenter;
        this.experimenterSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFExperimenterErrorMsg build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                int subtype = this.subtypeSet ? this.subtype : parentMessage.subtype;
                long experimenter = this.experimenterSet ? this.experimenter : parentMessage.experimenter;
                byte[] data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFExperimenterErrorMsgVer12(
                    xid,
                    subtype,
                    experimenter,
                    data
                );
        }

    }

    static class Builder implements OFExperimenterErrorMsg.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean subtypeSet;
        private int subtype;
        private boolean experimenterSet;
        private long experimenter;
        private boolean dataSet;
        private byte[] data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return subtype;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setSubtype(int subtype) {
        this.subtype = subtype;
        this.subtypeSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setExperimenter(long experimenter) {
        this.experimenter = experimenter;
        this.experimenterSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFExperimenterErrorMsg.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFExperimenterErrorMsg build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            int subtype = this.subtypeSet ? this.subtype : DEFAULT_SUBTYPE;
            long experimenter = this.experimenterSet ? this.experimenter : DEFAULT_EXPERIMENTER;
            byte[] data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFExperimenterErrorMsgVer12(
                    xid,
                    subtype,
                    experimenter,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFExperimenterErrorMsg> {
        @Override
        public OFExperimenterErrorMsg readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 1
            byte type = bb.readByte();
            if(type != (byte) 0x1)
                throw new OFParseError("Wrong type: Expected=OFType.ERROR(1), got="+type);
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
            // fixed value property errType == 65535
            short errType = bb.readShort();
            if(errType != (short) 0xffff)
                throw new OFParseError("Wrong errType: Expected=OFErrorType.EXPERIMENTER(65535), got="+errType);
            int subtype = U16.f(bb.readShort());
            long experimenter = U32.f(bb.readInt());
            byte[] data = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFExperimenterErrorMsgVer12 experimenterErrorMsgVer12 = new OFExperimenterErrorMsgVer12(
                    xid,
                      subtype,
                      experimenter,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", experimenterErrorMsgVer12);
            return experimenterErrorMsgVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFExperimenterErrorMsgVer12Funnel FUNNEL = new OFExperimenterErrorMsgVer12Funnel();
    static class OFExperimenterErrorMsgVer12Funnel implements Funnel<OFExperimenterErrorMsgVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFExperimenterErrorMsgVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 1
            sink.putByte((byte) 0x1);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property errType = 65535
            sink.putShort((short) 0xffff);
            sink.putInt(message.subtype);
            sink.putLong(message.experimenter);
            sink.putBytes(message.data);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFExperimenterErrorMsgVer12> {
        @Override
        public void write(ChannelBuffer bb, OFExperimenterErrorMsgVer12 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 1
            bb.writeByte((byte) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property errType = 65535
            bb.writeShort((short) 0xffff);
            bb.writeShort(U16.t(message.subtype));
            bb.writeInt(U32.t(message.experimenter));
            bb.writeBytes(message.data);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFExperimenterErrorMsgVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("subtype=").append(subtype);
        b.append(", ");
        b.append("experimenter=").append(experimenter);
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
        OFExperimenterErrorMsgVer12 other = (OFExperimenterErrorMsgVer12) obj;

        if( xid != other.xid)
            return false;
        if( subtype != other.subtype)
            return false;
        if( experimenter != other.experimenter)
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
        result = prime * result + subtype;
        result = prime *  (int) (experimenter ^ (experimenter >>> 32));
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

}
