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

class OFOxmBsnVrfVer12 implements OFOxmBsnVrf {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnVrfVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 8;

        private final static VRF DEFAULT_VALUE = VRF.ZERO;

    // OF message fields
    private final VRF value;
//
    // Immutable default instance
    final static OFOxmBsnVrfVer12 DEFAULT = new OFOxmBsnVrfVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnVrfVer12(VRF value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<VRF> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmBsnVrf.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnVrf.Builder {
        final OFOxmBsnVrfVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VRF value;

        BuilderWithParent(OFOxmBsnVrfVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVrf.Builder setValue(VRF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VRF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmBsnVrf build() {
                VRF value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnVrfVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnVrf.Builder {
        // OF message fields
        private boolean valueSet;
        private VRF value;

    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVrf.Builder setValue(VRF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VRF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmBsnVrf build() {
            VRF value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnVrfVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnVrf> {
        @Override
        public OFOxmBsnVrf readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x30404L
            int typeLen = bb.readInt();
            if(typeLen != 0x30404)
                throw new OFParseError("Wrong typeLen: Expected=0x30404L(0x30404L), got="+typeLen);
            VRF value = VRF.read4Bytes(bb);

            OFOxmBsnVrfVer12 oxmBsnVrfVer12 = new OFOxmBsnVrfVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnVrfVer12);
            return oxmBsnVrfVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnVrfVer12Funnel FUNNEL = new OFOxmBsnVrfVer12Funnel();
    static class OFOxmBsnVrfVer12Funnel implements Funnel<OFOxmBsnVrfVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnVrfVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30404L
            sink.putInt(0x30404);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnVrfVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmBsnVrfVer12 message) {
            // fixed value property typeLen = 0x30404L
            bb.writeInt(0x30404);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnVrfVer12(");
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
        OFOxmBsnVrfVer12 other = (OFOxmBsnVrfVer12) obj;

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
