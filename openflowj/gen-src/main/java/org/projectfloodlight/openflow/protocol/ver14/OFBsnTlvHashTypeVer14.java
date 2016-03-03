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

class OFBsnTlvHashTypeVer14 implements OFBsnTlvHashType {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvHashTypeVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 5;


    // OF message fields
    private final OFBsnHashType value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvHashTypeVer14(OFBsnHashType value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvHashTypeVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x65;
    }

    @Override
    public OFBsnHashType getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvHashType.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvHashType.Builder {
        final OFBsnTlvHashTypeVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnHashType value;

        BuilderWithParent(OFBsnTlvHashTypeVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x65;
    }

    @Override
    public OFBsnHashType getValue() {
        return value;
    }

    @Override
    public OFBsnTlvHashType.Builder setValue(OFBsnHashType value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvHashType build() {
                OFBsnHashType value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvHashTypeVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvHashType.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnHashType value;

    @Override
    public int getType() {
        return 0x65;
    }

    @Override
    public OFBsnHashType getValue() {
        return value;
    }

    @Override
    public OFBsnTlvHashType.Builder setValue(OFBsnHashType value) {
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
        public OFBsnTlvHashType build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvHashTypeVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvHashType> {
        @Override
        public OFBsnTlvHashType readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x65
            short type = bb.readShort();
            if(type != (short) 0x65)
                throw new OFParseError("Wrong type: Expected=0x65(0x65), got="+type);
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
            OFBsnHashType value = OFBsnHashTypeSerializerVer14.readFrom(bb);

            OFBsnTlvHashTypeVer14 bsnTlvHashTypeVer14 = new OFBsnTlvHashTypeVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvHashTypeVer14);
            return bsnTlvHashTypeVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvHashTypeVer14Funnel FUNNEL = new OFBsnTlvHashTypeVer14Funnel();
    static class OFBsnTlvHashTypeVer14Funnel implements Funnel<OFBsnTlvHashTypeVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvHashTypeVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x65
            sink.putShort((short) 0x65);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            OFBsnHashTypeSerializerVer14.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvHashTypeVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvHashTypeVer14 message) {
            // fixed value property type = 0x65
            bb.writeShort((short) 0x65);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            OFBsnHashTypeSerializerVer14.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvHashTypeVer14(");
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
        OFBsnTlvHashTypeVer14 other = (OFBsnTlvHashTypeVer14) obj;

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
