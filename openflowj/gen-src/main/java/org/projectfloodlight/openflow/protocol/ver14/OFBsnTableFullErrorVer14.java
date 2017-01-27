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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTableFullErrorVer14 implements OFBsnTableFullError {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTableFullErrorVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 272;

        private final static long DEFAULT_XID = 0x0L;
        private final static String DEFAULT_ERR_MSG = "";
        private final static OFErrorCauseData DEFAULT_DATA = OFErrorCauseData.NONE;

    // OF message fields
    private final long xid;
    private final String errMsg;
    private final OFErrorCauseData data;
//
    // Immutable default instance
    final static OFBsnTableFullErrorVer14 DEFAULT = new OFBsnTableFullErrorVer14(
        DEFAULT_XID, DEFAULT_ERR_MSG, DEFAULT_DATA
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTableFullErrorVer14(long xid, String errMsg, OFErrorCauseData data) {
        if(errMsg == null) {
            throw new NullPointerException("OFBsnTableFullErrorVer14: property errMsg cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFBsnTableFullErrorVer14: property data cannot be null");
        }
        this.xid = xid;
        this.errMsg = errMsg;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
        return 0x2;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFErrorCauseData getData() {
        return data;
    }



    public OFBsnTableFullError.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTableFullError.Builder {
        final OFBsnTableFullErrorVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean errMsgSet;
        private String errMsg;
        private boolean dataSet;
        private OFErrorCauseData data;

        BuilderWithParent(OFBsnTableFullErrorVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnTableFullError.Builder setXid(long xid) {
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
        return 0x2;
    }

    @Override
    public OFBsnTableFullError.Builder setSubtype(int subtype) {
            throw new UnsupportedOperationException("Property subtype is not writeable");
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFBsnTableFullError.Builder setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        this.errMsgSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBsnTableFullError.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBsnTableFullError build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                String errMsg = this.errMsgSet ? this.errMsg : parentMessage.errMsg;
                if(errMsg == null)
                    throw new NullPointerException("Property errMsg must not be null");
                OFErrorCauseData data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBsnTableFullErrorVer14(
                    xid,
                    errMsg,
                    data
                );
        }

    }

    static class Builder implements OFBsnTableFullError.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean errMsgSet;
        private String errMsg;
        private boolean dataSet;
        private OFErrorCauseData data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnTableFullError.Builder setXid(long xid) {
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
        return 0x2;
    }

    @Override
    public OFBsnTableFullError.Builder setSubtype(int subtype) {
            throw new UnsupportedOperationException("Property subtype is not writeable");
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFBsnTableFullError.Builder setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        this.errMsgSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBsnTableFullError.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBsnTableFullError build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            String errMsg = this.errMsgSet ? this.errMsg : DEFAULT_ERR_MSG;
            if(errMsg == null)
                throw new NullPointerException("Property errMsg must not be null");
            OFErrorCauseData data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBsnTableFullErrorVer14(
                    xid,
                    errMsg,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTableFullError> {
        @Override
        public OFBsnTableFullError readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
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
            // fixed value property subtype == 0x2
            short subtype = bb.readShort();
            if(subtype != (short) 0x2)
                throw new OFParseError("Wrong subtype: Expected=0x2(0x2), got="+subtype);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            String errMsg = ChannelUtils.readFixedLengthString(bb, 256);
            OFErrorCauseData data = OFErrorCauseData.read(bb, length - (bb.readerIndex() - start), OFVersion.OF_14);

            OFBsnTableFullErrorVer14 bsnTableFullErrorVer14 = new OFBsnTableFullErrorVer14(
                    xid,
                      errMsg,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTableFullErrorVer14);
            return bsnTableFullErrorVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTableFullErrorVer14Funnel FUNNEL = new OFBsnTableFullErrorVer14Funnel();
    static class OFBsnTableFullErrorVer14Funnel implements Funnel<OFBsnTableFullErrorVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTableFullErrorVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 1
            sink.putByte((byte) 0x1);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property errType = 65535
            sink.putShort((short) 0xffff);
            // fixed value property subtype = 0x2
            sink.putShort((short) 0x2);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            sink.putUnencodedChars(message.errMsg);
            message.data.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTableFullErrorVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTableFullErrorVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 1
            bb.writeByte((byte) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property errType = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property subtype = 0x2
            bb.writeShort((short) 0x2);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            ChannelUtils.writeFixedLengthString(bb, message.errMsg, 256);
            message.data.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTableFullErrorVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("errMsg=").append(errMsg);
        b.append(", ");
        b.append("data=").append(data);
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
        OFBsnTableFullErrorVer14 other = (OFBsnTableFullErrorVer14) obj;

        if( xid != other.xid)
            return false;
        if (errMsg == null) {
            if (other.errMsg != null)
                return false;
        } else if (!errMsg.equals(other.errMsg))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
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
        OFBsnTableFullErrorVer14 other = (OFBsnTableFullErrorVer14) obj;

        // ignore XID
        if (errMsg == null) {
            if (other.errMsg != null)
                return false;
        } else if (!errMsg.equals(other.errMsg))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((errMsg == null) ? 0 : errMsg.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((errMsg == null) ? 0 : errMsg.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

}
