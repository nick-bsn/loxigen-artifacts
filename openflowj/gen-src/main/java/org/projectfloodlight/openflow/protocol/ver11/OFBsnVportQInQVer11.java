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

class OFBsnVportQInQVer11 implements OFBsnVportQInQ {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnVportQInQVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 32;

        private final static long DEFAULT_PORT_NO = 0x0L;
        private final static int DEFAULT_INGRESS_TPID = 0x0;
        private final static int DEFAULT_INGRESS_VLAN_ID = 0x0;
        private final static int DEFAULT_EGRESS_TPID = 0x0;
        private final static int DEFAULT_EGRESS_VLAN_ID = 0x0;
        private final static String DEFAULT_IF_NAME = "";

    // OF message fields
    private final long portNo;
    private final int ingressTpid;
    private final int ingressVlanId;
    private final int egressTpid;
    private final int egressVlanId;
    private final String ifName;
//
    // Immutable default instance
    final static OFBsnVportQInQVer11 DEFAULT = new OFBsnVportQInQVer11(
        DEFAULT_PORT_NO, DEFAULT_INGRESS_TPID, DEFAULT_INGRESS_VLAN_ID, DEFAULT_EGRESS_TPID, DEFAULT_EGRESS_VLAN_ID, DEFAULT_IF_NAME
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnVportQInQVer11(long portNo, int ingressTpid, int ingressVlanId, int egressTpid, int egressVlanId, String ifName) {
        if(ifName == null) {
            throw new NullPointerException("OFBsnVportQInQVer11: property ifName cannot be null");
        }
        this.portNo = portNo;
        this.ingressTpid = ingressTpid;
        this.ingressVlanId = ingressVlanId;
        this.egressTpid = egressTpid;
        this.egressVlanId = egressVlanId;
        this.ifName = ifName;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getPortNo() {
        return portNo;
    }

    @Override
    public int getIngressTpid() {
        return ingressTpid;
    }

    @Override
    public int getIngressVlanId() {
        return ingressVlanId;
    }

    @Override
    public int getEgressTpid() {
        return egressTpid;
    }

    @Override
    public int getEgressVlanId() {
        return egressVlanId;
    }

    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFBsnVportQInQ.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnVportQInQ.Builder {
        final OFBsnVportQInQVer11 parentMessage;

        // OF message fields
        private boolean portNoSet;
        private long portNo;
        private boolean ingressTpidSet;
        private int ingressTpid;
        private boolean ingressVlanIdSet;
        private int ingressVlanId;
        private boolean egressTpidSet;
        private int egressTpid;
        private boolean egressVlanIdSet;
        private int egressVlanId;
        private boolean ifNameSet;
        private String ifName;

        BuilderWithParent(OFBsnVportQInQVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnVportQInQ.Builder setPortNo(long portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getIngressTpid() {
        return ingressTpid;
    }

    @Override
    public OFBsnVportQInQ.Builder setIngressTpid(int ingressTpid) {
        this.ingressTpid = ingressTpid;
        this.ingressTpidSet = true;
        return this;
    }
    @Override
    public int getIngressVlanId() {
        return ingressVlanId;
    }

    @Override
    public OFBsnVportQInQ.Builder setIngressVlanId(int ingressVlanId) {
        this.ingressVlanId = ingressVlanId;
        this.ingressVlanIdSet = true;
        return this;
    }
    @Override
    public int getEgressTpid() {
        return egressTpid;
    }

    @Override
    public OFBsnVportQInQ.Builder setEgressTpid(int egressTpid) {
        this.egressTpid = egressTpid;
        this.egressTpidSet = true;
        return this;
    }
    @Override
    public int getEgressVlanId() {
        return egressVlanId;
    }

    @Override
    public OFBsnVportQInQ.Builder setEgressVlanId(int egressVlanId) {
        this.egressVlanId = egressVlanId;
        this.egressVlanIdSet = true;
        return this;
    }
    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFBsnVportQInQ.Builder setIfName(String ifName) {
        this.ifName = ifName;
        this.ifNameSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFBsnVportQInQ build() {
                long portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                int ingressTpid = this.ingressTpidSet ? this.ingressTpid : parentMessage.ingressTpid;
                int ingressVlanId = this.ingressVlanIdSet ? this.ingressVlanId : parentMessage.ingressVlanId;
                int egressTpid = this.egressTpidSet ? this.egressTpid : parentMessage.egressTpid;
                int egressVlanId = this.egressVlanIdSet ? this.egressVlanId : parentMessage.egressVlanId;
                String ifName = this.ifNameSet ? this.ifName : parentMessage.ifName;
                if(ifName == null)
                    throw new NullPointerException("Property ifName must not be null");

                //
                return new OFBsnVportQInQVer11(
                    portNo,
                    ingressTpid,
                    ingressVlanId,
                    egressTpid,
                    egressVlanId,
                    ifName
                );
        }

    }

    static class Builder implements OFBsnVportQInQ.Builder {
        // OF message fields
        private boolean portNoSet;
        private long portNo;
        private boolean ingressTpidSet;
        private int ingressTpid;
        private boolean ingressVlanIdSet;
        private int ingressVlanId;
        private boolean egressTpidSet;
        private int egressTpid;
        private boolean egressVlanIdSet;
        private int egressVlanId;
        private boolean ifNameSet;
        private String ifName;

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnVportQInQ.Builder setPortNo(long portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public int getIngressTpid() {
        return ingressTpid;
    }

    @Override
    public OFBsnVportQInQ.Builder setIngressTpid(int ingressTpid) {
        this.ingressTpid = ingressTpid;
        this.ingressTpidSet = true;
        return this;
    }
    @Override
    public int getIngressVlanId() {
        return ingressVlanId;
    }

    @Override
    public OFBsnVportQInQ.Builder setIngressVlanId(int ingressVlanId) {
        this.ingressVlanId = ingressVlanId;
        this.ingressVlanIdSet = true;
        return this;
    }
    @Override
    public int getEgressTpid() {
        return egressTpid;
    }

    @Override
    public OFBsnVportQInQ.Builder setEgressTpid(int egressTpid) {
        this.egressTpid = egressTpid;
        this.egressTpidSet = true;
        return this;
    }
    @Override
    public int getEgressVlanId() {
        return egressVlanId;
    }

    @Override
    public OFBsnVportQInQ.Builder setEgressVlanId(int egressVlanId) {
        this.egressVlanId = egressVlanId;
        this.egressVlanIdSet = true;
        return this;
    }
    @Override
    public String getIfName() {
        return ifName;
    }

    @Override
    public OFBsnVportQInQ.Builder setIfName(String ifName) {
        this.ifName = ifName;
        this.ifNameSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFBsnVportQInQ build() {
            long portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            int ingressTpid = this.ingressTpidSet ? this.ingressTpid : DEFAULT_INGRESS_TPID;
            int ingressVlanId = this.ingressVlanIdSet ? this.ingressVlanId : DEFAULT_INGRESS_VLAN_ID;
            int egressTpid = this.egressTpidSet ? this.egressTpid : DEFAULT_EGRESS_TPID;
            int egressVlanId = this.egressVlanIdSet ? this.egressVlanId : DEFAULT_EGRESS_VLAN_ID;
            String ifName = this.ifNameSet ? this.ifName : DEFAULT_IF_NAME;
            if(ifName == null)
                throw new NullPointerException("Property ifName must not be null");


            return new OFBsnVportQInQVer11(
                    portNo,
                    ingressTpid,
                    ingressVlanId,
                    egressTpid,
                    egressVlanId,
                    ifName
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnVportQInQ> {
        @Override
        public OFBsnVportQInQ readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x0
            short type = bb.readShort();
            if(type != (short) 0x0)
                throw new OFParseError("Wrong type: Expected=0x0(0x0), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 32)
                throw new OFParseError("Wrong length: Expected=32(32), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long portNo = U32.f(bb.readInt());
            int ingressTpid = U16.f(bb.readShort());
            int ingressVlanId = U16.f(bb.readShort());
            int egressTpid = U16.f(bb.readShort());
            int egressVlanId = U16.f(bb.readShort());
            String ifName = ChannelUtils.readFixedLengthString(bb, 16);

            OFBsnVportQInQVer11 bsnVportQInQVer11 = new OFBsnVportQInQVer11(
                    portNo,
                      ingressTpid,
                      ingressVlanId,
                      egressTpid,
                      egressVlanId,
                      ifName
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnVportQInQVer11);
            return bsnVportQInQVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnVportQInQVer11Funnel FUNNEL = new OFBsnVportQInQVer11Funnel();
    static class OFBsnVportQInQVer11Funnel implements Funnel<OFBsnVportQInQVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnVportQInQVer11 message, PrimitiveSink sink) {
            // fixed value property type = 0x0
            sink.putShort((short) 0x0);
            // fixed value property length = 32
            sink.putShort((short) 0x20);
            sink.putLong(message.portNo);
            sink.putInt(message.ingressTpid);
            sink.putInt(message.ingressVlanId);
            sink.putInt(message.egressTpid);
            sink.putInt(message.egressVlanId);
            sink.putUnencodedChars(message.ifName);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnVportQInQVer11> {
        @Override
        public void write(ByteBuf bb, OFBsnVportQInQVer11 message) {
            // fixed value property type = 0x0
            bb.writeShort((short) 0x0);
            // fixed value property length = 32
            bb.writeShort((short) 0x20);
            bb.writeInt(U32.t(message.portNo));
            bb.writeShort(U16.t(message.ingressTpid));
            bb.writeShort(U16.t(message.ingressVlanId));
            bb.writeShort(U16.t(message.egressTpid));
            bb.writeShort(U16.t(message.egressVlanId));
            ChannelUtils.writeFixedLengthString(bb, message.ifName, 16);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnVportQInQVer11(");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("ingressTpid=").append(ingressTpid);
        b.append(", ");
        b.append("ingressVlanId=").append(ingressVlanId);
        b.append(", ");
        b.append("egressTpid=").append(egressTpid);
        b.append(", ");
        b.append("egressVlanId=").append(egressVlanId);
        b.append(", ");
        b.append("ifName=").append(ifName);
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
        OFBsnVportQInQVer11 other = (OFBsnVportQInQVer11) obj;

        if( portNo != other.portNo)
            return false;
        if( ingressTpid != other.ingressTpid)
            return false;
        if( ingressVlanId != other.ingressVlanId)
            return false;
        if( egressTpid != other.egressTpid)
            return false;
        if( egressVlanId != other.egressVlanId)
            return false;
        if (ifName == null) {
            if (other.ifName != null)
                return false;
        } else if (!ifName.equals(other.ifName))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (portNo ^ (portNo >>> 32));
        result = prime * result + ingressTpid;
        result = prime * result + ingressVlanId;
        result = prime * result + egressTpid;
        result = prime * result + egressVlanId;
        result = prime * result + ((ifName == null) ? 0 : ifName.hashCode());
        return result;
    }

}
