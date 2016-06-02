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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortModVer12 implements OFPortMod {
    private static final Logger logger = LoggerFactory.getLogger(OFPortModVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 40;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static MacAddress DEFAULT_HW_ADDR = MacAddress.NONE;
        private final static Set<OFPortConfig> DEFAULT_CONFIG = ImmutableSet.<OFPortConfig>of();
        private final static Set<OFPortConfig> DEFAULT_MASK = ImmutableSet.<OFPortConfig>of();
        private final static long DEFAULT_ADVERTISE = 0x0L;

    // OF message fields
    private final long xid;
    private final OFPort portNo;
    private final MacAddress hwAddr;
    private final Set<OFPortConfig> config;
    private final Set<OFPortConfig> mask;
    private final long advertise;
//
    // Immutable default instance
    final static OFPortModVer12 DEFAULT = new OFPortModVer12(
        DEFAULT_XID, DEFAULT_PORT_NO, DEFAULT_HW_ADDR, DEFAULT_CONFIG, DEFAULT_MASK, DEFAULT_ADVERTISE
    );

    // package private constructor - used by readers, builders, and factory
    OFPortModVer12(long xid, OFPort portNo, MacAddress hwAddr, Set<OFPortConfig> config, Set<OFPortConfig> mask, long advertise) {
        if(portNo == null) {
            throw new NullPointerException("OFPortModVer12: property portNo cannot be null");
        }
        if(hwAddr == null) {
            throw new NullPointerException("OFPortModVer12: property hwAddr cannot be null");
        }
        if(config == null) {
            throw new NullPointerException("OFPortModVer12: property config cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFPortModVer12: property mask cannot be null");
        }
        this.xid = xid;
        this.portNo = portNo;
        this.hwAddr = hwAddr;
        this.config = config;
        this.mask = mask;
        this.advertise = advertise;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.2");
    }



    public OFPortMod.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortMod.Builder {
        final OFPortModVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean maskSet;
        private Set<OFPortConfig> mask;
        private boolean advertiseSet;
        private long advertise;

        BuilderWithParent(OFPortModVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(Set<OFPortConfig> mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.2");
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.2");
    }


        @Override
        public OFPortMod build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : parentMessage.hwAddr;
                if(hwAddr == null)
                    throw new NullPointerException("Property hwAddr must not be null");
                Set<OFPortConfig> config = this.configSet ? this.config : parentMessage.config;
                if(config == null)
                    throw new NullPointerException("Property config must not be null");
                Set<OFPortConfig> mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");
                long advertise = this.advertiseSet ? this.advertise : parentMessage.advertise;

                //
                return new OFPortModVer12(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    advertise
                );
        }

    }

    static class Builder implements OFPortMod.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private Set<OFPortConfig> config;
        private boolean maskSet;
        private Set<OFPortConfig> mask;
        private boolean advertiseSet;
        private long advertise;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(Set<OFPortConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public Set<OFPortConfig> getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(Set<OFPortConfig> mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.2");
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.2");
    }
//
        @Override
        public OFPortMod build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : DEFAULT_HW_ADDR;
            if(hwAddr == null)
                throw new NullPointerException("Property hwAddr must not be null");
            Set<OFPortConfig> config = this.configSet ? this.config : DEFAULT_CONFIG;
            if(config == null)
                throw new NullPointerException("Property config must not be null");
            Set<OFPortConfig> mask = this.maskSet ? this.mask : DEFAULT_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");
            long advertise = this.advertiseSet ? this.advertise : DEFAULT_ADVERTISE;


            return new OFPortModVer12(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    advertise
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortMod> {
        @Override
        public OFPortMod readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 16
            byte type = bb.readByte();
            if(type != (byte) 0x10)
                throw new OFParseError("Wrong type: Expected=OFType.PORT_MOD(16), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 40)
                throw new OFParseError("Wrong length: Expected=40(40), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            MacAddress hwAddr = MacAddress.read6Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            Set<OFPortConfig> config = OFPortConfigSerializerVer12.readFrom(bb);
            Set<OFPortConfig> mask = OFPortConfigSerializerVer12.readFrom(bb);
            long advertise = U32.f(bb.readInt());
            // pad: 4 bytes
            bb.skipBytes(4);

            OFPortModVer12 portModVer12 = new OFPortModVer12(
                    xid,
                      portNo,
                      hwAddr,
                      config,
                      mask,
                      advertise
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portModVer12);
            return portModVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortModVer12Funnel FUNNEL = new OFPortModVer12Funnel();
    static class OFPortModVer12Funnel implements Funnel<OFPortModVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortModVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 16
            sink.putByte((byte) 0x10);
            // fixed value property length = 40
            sink.putShort((short) 0x28);
            sink.putLong(message.xid);
            message.portNo.putTo(sink);
            // skip pad (4 bytes)
            message.hwAddr.putTo(sink);
            // skip pad (2 bytes)
            OFPortConfigSerializerVer12.putTo(message.config, sink);
            OFPortConfigSerializerVer12.putTo(message.mask, sink);
            sink.putLong(message.advertise);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortModVer12> {
        @Override
        public void write(ByteBuf bb, OFPortModVer12 message) {
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 16
            bb.writeByte((byte) 0x10);
            // fixed value property length = 40
            bb.writeShort((short) 0x28);
            bb.writeInt(U32.t(message.xid));
            message.portNo.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            message.hwAddr.write6Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            OFPortConfigSerializerVer12.writeTo(bb, message.config);
            OFPortConfigSerializerVer12.writeTo(bb, message.mask);
            bb.writeInt(U32.t(message.advertise));
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortModVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("hwAddr=").append(hwAddr);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("mask=").append(mask);
        b.append(", ");
        b.append("advertise=").append(advertise);
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
        OFPortModVer12 other = (OFPortModVer12) obj;

        if( xid != other.xid)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        if( advertise != other.advertise)
            return false;
        return true;
    }

    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFPortModVer12 other = (OFPortModVer12) obj;

        // ignore XID
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        if( advertise != other.advertise)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime * result + ((config == null) ? 0 : config.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        result = prime *  (int) (advertise ^ (advertise >>> 32));
        return result;
    }

}
