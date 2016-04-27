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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnGentableEntryAddVer14 implements OFBsnGentableEntryAdd {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGentableEntryAddVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 36;

        private final static long DEFAULT_XID = 0x0L;
        private final static U128 DEFAULT_CHECKSUM = U128.ZERO;
        private final static List<OFBsnTlv> DEFAULT_KEY = ImmutableList.<OFBsnTlv>of();
        private final static List<OFBsnTlv> DEFAULT_VALUE = ImmutableList.<OFBsnTlv>of();

    // OF message fields
    private final long xid;
    private final GenTableId tableId;
    private final U128 checksum;
    private final List<OFBsnTlv> key;
    private final List<OFBsnTlv> value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnGentableEntryAddVer14(long xid, GenTableId tableId, U128 checksum, List<OFBsnTlv> key, List<OFBsnTlv> value) {
        if(tableId == null) {
            throw new NullPointerException("OFBsnGentableEntryAddVer14: property tableId cannot be null");
        }
        if(checksum == null) {
            throw new NullPointerException("OFBsnGentableEntryAddVer14: property checksum cannot be null");
        }
        if(key == null) {
            throw new NullPointerException("OFBsnGentableEntryAddVer14: property key cannot be null");
        }
        if(value == null) {
            throw new NullPointerException("OFBsnGentableEntryAddVer14: property value cannot be null");
        }
        this.xid = xid;
        this.tableId = tableId;
        this.checksum = checksum;
        this.key = key;
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
        return 0x2eL;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }



    public OFBsnGentableEntryAdd.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGentableEntryAdd.Builder {
        final OFBsnGentableEntryAddVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean tableIdSet;
        private GenTableId tableId;
        private boolean checksumSet;
        private U128 checksum;
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean valueSet;
        private List<OFBsnTlv> value;

        BuilderWithParent(OFBsnGentableEntryAddVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnGentableEntryAdd.Builder setXid(long xid) {
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
        return 0x2eL;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setTableId(GenTableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setValue(List<OFBsnTlv> value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }


        @Override
        public OFBsnGentableEntryAdd build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                GenTableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                U128 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");
                List<OFBsnTlv> key = this.keySet ? this.key : parentMessage.key;
                if(key == null)
                    throw new NullPointerException("Property key must not be null");
                List<OFBsnTlv> value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnGentableEntryAddVer14(
                    xid,
                    tableId,
                    checksum,
                    key,
                    value
                );
        }

    }

    static class Builder implements OFBsnGentableEntryAdd.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean tableIdSet;
        private GenTableId tableId;
        private boolean checksumSet;
        private U128 checksum;
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean valueSet;
        private List<OFBsnTlv> value;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnGentableEntryAdd.Builder setXid(long xid) {
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
        return 0x2eL;
    }

    @Override
    public GenTableId getTableId() {
        return tableId;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setTableId(GenTableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }

    @Override
    public OFBsnGentableEntryAdd.Builder setValue(List<OFBsnTlv> value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
//
        @Override
        public OFBsnGentableEntryAdd build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.tableIdSet)
                throw new IllegalStateException("Property tableId doesn't have default value -- must be set");
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            U128 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");
            List<OFBsnTlv> key = this.keySet ? this.key : DEFAULT_KEY;
            if(key == null)
                throw new NullPointerException("Property key must not be null");
            List<OFBsnTlv> value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnGentableEntryAddVer14(
                    xid,
                    tableId,
                    checksum,
                    key,
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGentableEntryAdd> {
        @Override
        public OFBsnGentableEntryAdd readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
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
            // fixed value property subtype == 0x2eL
            int subtype = bb.readInt();
            if(subtype != 0x2e)
                throw new OFParseError("Wrong subtype: Expected=0x2eL(0x2eL), got="+subtype);
            GenTableId tableId = GenTableId.read2Bytes(bb);
            int keyLength = U16.f(bb.readShort());
            U128 checksum = U128.read16Bytes(bb);
            List<OFBsnTlv> key = ChannelUtils.readList(bb, keyLength, OFBsnTlvVer14.READER);
            List<OFBsnTlv> value = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFBsnTlvVer14.READER);

            OFBsnGentableEntryAddVer14 bsnGentableEntryAddVer14 = new OFBsnGentableEntryAddVer14(
                    xid,
                      tableId,
                      checksum,
                      key,
                      value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGentableEntryAddVer14);
            return bsnGentableEntryAddVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGentableEntryAddVer14Funnel FUNNEL = new OFBsnGentableEntryAddVer14Funnel();
    static class OFBsnGentableEntryAddVer14Funnel implements Funnel<OFBsnGentableEntryAddVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGentableEntryAddVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x2eL
            sink.putInt(0x2e);
            message.tableId.putTo(sink);
            // FIXME: skip funnel of keyLength
            message.checksum.putTo(sink);
            FunnelUtils.putList(message.key, sink);
            FunnelUtils.putList(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGentableEntryAddVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnGentableEntryAddVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x2eL
            bb.writeInt(0x2e);
            message.tableId.write2Bytes(bb);
            // keyLength is length indicator for key, will be
            // udpated when key has been written
            int keyLengthIndex = bb.writerIndex();
            bb.writeShort(0);
            message.checksum.write16Bytes(bb);
            int keyStartIndex = bb.writerIndex();
            ChannelUtils.writeList(bb, message.key);
            // update field length member keyLength
            int keyLength = bb.writerIndex() - keyStartIndex;
            bb.setShort(keyLengthIndex, keyLength);
            ChannelUtils.writeList(bb, message.value);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGentableEntryAddVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("checksum=").append(checksum);
        b.append(", ");
        b.append("key=").append(key);
        b.append(", ");
        b.append("value=").append(value);
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
        OFBsnGentableEntryAddVer14 other = (OFBsnGentableEntryAddVer14) obj;

        if( xid != other.xid)
            return false;
        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
