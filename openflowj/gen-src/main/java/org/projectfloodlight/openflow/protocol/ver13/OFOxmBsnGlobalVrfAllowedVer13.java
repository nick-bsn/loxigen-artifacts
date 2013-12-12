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
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmBsnGlobalVrfAllowedVer13 implements OFOxmBsnGlobalVrfAllowed {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnGlobalVrfAllowedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 5;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
//
    // Immutable default instance
    final static OFOxmBsnGlobalVrfAllowedVer13 DEFAULT = new OFOxmBsnGlobalVrfAllowedVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnGlobalVrfAllowedVer13(OFBooleanValue value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30601L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnGlobalVrfAllowed.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnGlobalVrfAllowed.Builder {
        final OFOxmBsnGlobalVrfAllowedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

        BuilderWithParent(OFOxmBsnGlobalVrfAllowedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30601L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowed.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnGlobalVrfAllowed build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnGlobalVrfAllowedVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnGlobalVrfAllowed.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

    @Override
    public long getTypeLen() {
        return 0x30601L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnGlobalVrfAllowed.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_GLOBAL_VRF_ALLOWED;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnGlobalVrfAllowed build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnGlobalVrfAllowedVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnGlobalVrfAllowed> {
        @Override
        public OFOxmBsnGlobalVrfAllowed readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x30601L
            int typeLen = bb.readInt();
            if(typeLen != 0x30601)
                throw new OFParseError("Wrong typeLen: Expected=0x30601L(0x30601L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmBsnGlobalVrfAllowedVer13 oxmBsnGlobalVrfAllowedVer13 = new OFOxmBsnGlobalVrfAllowedVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnGlobalVrfAllowedVer13);
            return oxmBsnGlobalVrfAllowedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnGlobalVrfAllowedVer13Funnel FUNNEL = new OFOxmBsnGlobalVrfAllowedVer13Funnel();
    static class OFOxmBsnGlobalVrfAllowedVer13Funnel implements Funnel<OFOxmBsnGlobalVrfAllowedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnGlobalVrfAllowedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30601L
            sink.putInt(0x30601);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnGlobalVrfAllowedVer13> {
        @Override
        public void write(ChannelBuffer bb, OFOxmBsnGlobalVrfAllowedVer13 message) {
            // fixed value property typeLen = 0x30601L
            bb.writeInt(0x30601);
            bb.writeByte(message.value.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnGlobalVrfAllowedVer13(");
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
        OFOxmBsnGlobalVrfAllowedVer13 other = (OFOxmBsnGlobalVrfAllowedVer13) obj;

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
