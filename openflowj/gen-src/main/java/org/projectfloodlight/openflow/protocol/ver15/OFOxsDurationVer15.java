// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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

class OFOxsDurationVer15 implements OFOxsDuration {
    private static final Logger logger = LoggerFactory.getLogger(OFOxsDurationVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 12;

        private final static U64 DEFAULT_VALUE = U64.ZERO;

    // OF message fields
    private final U64 value;
//
    // Immutable default instance
    final static OFOxsDurationVer15 DEFAULT = new OFOxsDurationVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxsDurationVer15(U64 value) {
        if(value == null) {
            throw new NullPointerException("OFOxsDurationVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80020008L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public StatField<U64> getStatField() {
        return StatField.DURATION;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxs<U64> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxsDuration.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxsDuration.Builder {
        final OFOxsDurationVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U64 value;

        BuilderWithParent(OFOxsDurationVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80020008L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxsDuration.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public StatField<U64> getStatField() {
        return StatField.DURATION;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxs<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxsDuration build() {
                U64 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxsDurationVer15(
                    value
                );
        }

    }

    static class Builder implements OFOxsDuration.Builder {
        // OF message fields
        private boolean valueSet;
        private U64 value;

    @Override
    public long getTypeLen() {
        return 0x80020008L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxsDuration.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public StatField<U64> getStatField() {
        return StatField.DURATION;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxs<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public U64 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxsDuration build() {
            U64 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxsDurationVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxsDuration> {
        @Override
        public OFOxsDuration readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80020008L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80020008)
                throw new OFParseError("Wrong typeLen: Expected=0x80020008L(0x80020008L), got="+typeLen);
            U64 value = U64.ofRaw(bb.readLong());

            OFOxsDurationVer15 oxsDurationVer15 = new OFOxsDurationVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxsDurationVer15);
            return oxsDurationVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxsDurationVer15Funnel FUNNEL = new OFOxsDurationVer15Funnel();
    static class OFOxsDurationVer15Funnel implements Funnel<OFOxsDurationVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxsDurationVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80020008L
            sink.putInt((int) 0x80020008);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxsDurationVer15> {
        @Override
        public void write(ByteBuf bb, OFOxsDurationVer15 message) {
            // fixed value property typeLen = 0x80020008L
            bb.writeInt((int) 0x80020008);
            bb.writeLong(message.value.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxsDurationVer15(");
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
        OFOxsDurationVer15 other = (OFOxsDurationVer15) obj;

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
