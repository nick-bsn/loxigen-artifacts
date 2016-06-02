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

class OFBsnTlvExternalGatewayMacVer14 implements OFBsnTlvExternalGatewayMac {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvExternalGatewayMacVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 10;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
//
    // Immutable default instance
    final static OFBsnTlvExternalGatewayMacVer14 DEFAULT = new OFBsnTlvExternalGatewayMacVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvExternalGatewayMacVer14(MacAddress value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvExternalGatewayMacVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1d;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvExternalGatewayMac.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvExternalGatewayMac.Builder {
        final OFBsnTlvExternalGatewayMacVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;

        BuilderWithParent(OFBsnTlvExternalGatewayMacVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1d;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvExternalGatewayMac.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvExternalGatewayMac build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvExternalGatewayMacVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvExternalGatewayMac.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;

    @Override
    public int getType() {
        return 0x1d;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFBsnTlvExternalGatewayMac.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvExternalGatewayMac build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvExternalGatewayMacVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvExternalGatewayMac> {
        @Override
        public OFBsnTlvExternalGatewayMac readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1d
            short type = bb.readShort();
            if(type != (short) 0x1d)
                throw new OFParseError("Wrong type: Expected=0x1d(0x1d), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 10)
                throw new OFParseError("Wrong length: Expected=10(10), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            MacAddress value = MacAddress.read6Bytes(bb);

            OFBsnTlvExternalGatewayMacVer14 bsnTlvExternalGatewayMacVer14 = new OFBsnTlvExternalGatewayMacVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvExternalGatewayMacVer14);
            return bsnTlvExternalGatewayMacVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvExternalGatewayMacVer14Funnel FUNNEL = new OFBsnTlvExternalGatewayMacVer14Funnel();
    static class OFBsnTlvExternalGatewayMacVer14Funnel implements Funnel<OFBsnTlvExternalGatewayMacVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvExternalGatewayMacVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x1d
            sink.putShort((short) 0x1d);
            // fixed value property length = 10
            sink.putShort((short) 0xa);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvExternalGatewayMacVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvExternalGatewayMacVer14 message) {
            // fixed value property type = 0x1d
            bb.writeShort((short) 0x1d);
            // fixed value property length = 10
            bb.writeShort((short) 0xa);
            message.value.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvExternalGatewayMacVer14(");
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
        OFBsnTlvExternalGatewayMacVer14 other = (OFBsnTlvExternalGatewayMacVer14) obj;

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

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
