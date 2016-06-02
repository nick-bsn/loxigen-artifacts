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

class OFOxmSctpDstMaskedVer15 implements OFOxmSctpDstMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmSctpDstMaskedVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 8;

        private final static TransportPort DEFAULT_VALUE = TransportPort.NONE;
        private final static TransportPort DEFAULT_VALUE_MASK = TransportPort.NONE;

    // OF message fields
    private final TransportPort value;
    private final TransportPort mask;
//
    // Immutable default instance
    final static OFOxmSctpDstMaskedVer15 DEFAULT = new OFOxmSctpDstMaskedVer15(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmSctpDstMaskedVer15(TransportPort value, TransportPort mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmSctpDstMaskedVer15: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmSctpDstMaskedVer15: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80002504L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public TransportPort getMask() {
        return mask;
    }

    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_DST;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<TransportPort> getCanonical() {
        if (TransportPort.NO_MASK.equals(mask)) {
            return new OFOxmSctpDstVer15(value);
        } else if(TransportPort.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmSctpDstMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmSctpDstMasked.Builder {
        final OFOxmSctpDstMaskedVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private TransportPort value;
        private boolean maskSet;
        private TransportPort mask;

        BuilderWithParent(OFOxmSctpDstMaskedVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80002504L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public OFOxmSctpDstMasked.Builder setValue(TransportPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public TransportPort getMask() {
        return mask;
    }

    @Override
    public OFOxmSctpDstMasked.Builder setMask(TransportPort mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_DST;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<TransportPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmSctpDstMasked build() {
                TransportPort value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                TransportPort mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmSctpDstMaskedVer15(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmSctpDstMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private TransportPort value;
        private boolean maskSet;
        private TransportPort mask;

    @Override
    public long getTypeLen() {
        return 0x80002504L;
    }

    @Override
    public TransportPort getValue() {
        return value;
    }

    @Override
    public OFOxmSctpDstMasked.Builder setValue(TransportPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public TransportPort getMask() {
        return mask;
    }

    @Override
    public OFOxmSctpDstMasked.Builder setMask(TransportPort mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<TransportPort> getMatchField() {
        return MatchField.SCTP_DST;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<TransportPort> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmSctpDstMasked build() {
            TransportPort value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            TransportPort mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmSctpDstMaskedVer15(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmSctpDstMasked> {
        @Override
        public OFOxmSctpDstMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80002504L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80002504)
                throw new OFParseError("Wrong typeLen: Expected=0x80002504L(0x80002504L), got="+typeLen);
            TransportPort value = TransportPort.read2Bytes(bb);
            TransportPort mask = TransportPort.read2Bytes(bb);

            OFOxmSctpDstMaskedVer15 oxmSctpDstMaskedVer15 = new OFOxmSctpDstMaskedVer15(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmSctpDstMaskedVer15);
            return oxmSctpDstMaskedVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmSctpDstMaskedVer15Funnel FUNNEL = new OFOxmSctpDstMaskedVer15Funnel();
    static class OFOxmSctpDstMaskedVer15Funnel implements Funnel<OFOxmSctpDstMaskedVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmSctpDstMaskedVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80002504L
            sink.putInt((int) 0x80002504);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmSctpDstMaskedVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmSctpDstMaskedVer15 message) {
            // fixed value property typeLen = 0x80002504L
            bb.writeInt((int) 0x80002504);
            message.value.write2Bytes(bb);
            message.mask.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmSctpDstMaskedVer15(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmSctpDstMaskedVer15 other = (OFOxmSctpDstMaskedVer15) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
