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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionSetVlanVidVer10 implements OFActionSetVlanVid {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetVlanVidVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 8;

        private final static VlanVid DEFAULT_VLAN_VID = VlanVid.ZERO;

    // OF message fields
    private final VlanVid vlanVid;
//
    // Immutable default instance
    final static OFActionSetVlanVidVer10 DEFAULT = new OFActionSetVlanVidVer10(
        DEFAULT_VLAN_VID
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetVlanVidVer10(VlanVid vlanVid) {
        if(vlanVid == null) {
            throw new NullPointerException("OFActionSetVlanVidVer10: property vlanVid cannot be null");
        }
        this.vlanVid = vlanVid;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFActionSetVlanVid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetVlanVid.Builder {
        final OFActionSetVlanVidVer10 parentMessage;

        // OF message fields
        private boolean vlanVidSet;
        private VlanVid vlanVid;

        BuilderWithParent(OFActionSetVlanVidVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFActionSetVlanVid.Builder setVlanVid(VlanVid vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFActionSetVlanVid build() {
                VlanVid vlanVid = this.vlanVidSet ? this.vlanVid : parentMessage.vlanVid;
                if(vlanVid == null)
                    throw new NullPointerException("Property vlanVid must not be null");

                //
                return new OFActionSetVlanVidVer10(
                    vlanVid
                );
        }

    }

    static class Builder implements OFActionSetVlanVid.Builder {
        // OF message fields
        private boolean vlanVidSet;
        private VlanVid vlanVid;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_VLAN_VID;
    }

    @Override
    public VlanVid getVlanVid() {
        return vlanVid;
    }

    @Override
    public OFActionSetVlanVid.Builder setVlanVid(VlanVid vlanVid) {
        this.vlanVid = vlanVid;
        this.vlanVidSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFActionSetVlanVid build() {
            VlanVid vlanVid = this.vlanVidSet ? this.vlanVid : DEFAULT_VLAN_VID;
            if(vlanVid == null)
                throw new NullPointerException("Property vlanVid must not be null");


            return new OFActionSetVlanVidVer10(
                    vlanVid
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetVlanVid> {
        @Override
        public OFActionSetVlanVid readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_VLAN_VID(1), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            VlanVid vlanVid = VlanVid.read2Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);

            OFActionSetVlanVidVer10 actionSetVlanVidVer10 = new OFActionSetVlanVidVer10(
                    vlanVid
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetVlanVidVer10);
            return actionSetVlanVidVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetVlanVidVer10Funnel FUNNEL = new OFActionSetVlanVidVer10Funnel();
    static class OFActionSetVlanVidVer10Funnel implements Funnel<OFActionSetVlanVidVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetVlanVidVer10 message, PrimitiveSink sink) {
            // fixed value property type = 1
            sink.putShort((short) 0x1);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.vlanVid.putTo(sink);
            // skip pad (2 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetVlanVidVer10> {
        @Override
        public void write(ByteBuf bb, OFActionSetVlanVidVer10 message) {
            // fixed value property type = 1
            bb.writeShort((short) 0x1);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.vlanVid.write2Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetVlanVidVer10(");
        b.append("vlanVid=").append(vlanVid);
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
        OFActionSetVlanVidVer10 other = (OFActionSetVlanVidVer10) obj;

        if (vlanVid == null) {
            if (other.vlanVid != null)
                return false;
        } else if (!vlanVid.equals(other.vlanVid))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((vlanVid == null) ? 0 : vlanVid.hashCode());
        return result;
    }

}
