// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
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
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvStatusVer13 implements OFBsnTlvStatus {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvStatusVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 5;


    // OF message fields
    private final OFBsnStatus value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvStatusVer13(OFBsnStatus value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvStatusVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x61;
    }

    @Override
    public OFBsnStatus getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvStatus.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvStatus.Builder {
        final OFBsnTlvStatusVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnStatus value;

        BuilderWithParent(OFBsnTlvStatusVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x61;
    }

    @Override
    public OFBsnStatus getValue() {
        return value;
    }

    @Override
    public OFBsnTlvStatus.Builder setValue(OFBsnStatus value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvStatus build() {
                OFBsnStatus value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvStatusVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvStatus.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnStatus value;

    @Override
    public int getType() {
        return 0x61;
    }

    @Override
    public OFBsnStatus getValue() {
        return value;
    }

    @Override
    public OFBsnTlvStatus.Builder setValue(OFBsnStatus value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvStatus build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvStatusVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvStatus> {
        @Override
        public OFBsnTlvStatus readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x61
            short type = bb.readShort();
            if(type != (short) 0x61)
                throw new OFParseError("Wrong type: Expected=0x61(0x61), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 5)
                throw new OFParseError("Wrong length: Expected=5(5), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            OFBsnStatus value = OFBsnStatusSerializerVer13.readFrom(bb);

            OFBsnTlvStatusVer13 bsnTlvStatusVer13 = new OFBsnTlvStatusVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvStatusVer13);
            return bsnTlvStatusVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvStatusVer13Funnel FUNNEL = new OFBsnTlvStatusVer13Funnel();
    static class OFBsnTlvStatusVer13Funnel implements Funnel<OFBsnTlvStatusVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvStatusVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x61
            sink.putShort((short) 0x61);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            OFBsnStatusSerializerVer13.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvStatusVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvStatusVer13 message) {
            // fixed value property type = 0x61
            bb.writeShort((short) 0x61);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            OFBsnStatusSerializerVer13.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvStatusVer13(");
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
        OFBsnTlvStatusVer13 other = (OFBsnTlvStatusVer13) obj;

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
