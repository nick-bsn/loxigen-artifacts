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

class OFOxmArpSpaVer12 implements OFOxmArpSpa {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmArpSpaVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 8;

        private final static IPv4Address DEFAULT_VALUE = IPv4Address.NONE;

    // OF message fields
    private final IPv4Address value;
//
    // Immutable default instance
    final static OFOxmArpSpaVer12 DEFAULT = new OFOxmArpSpaVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmArpSpaVer12(IPv4Address value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80002c04L;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public MatchField<IPv4Address> getMatchField() {
        return MatchField.ARP_SPA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<IPv4Address> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public IPv4Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmArpSpa.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmArpSpa.Builder {
        final OFOxmArpSpaVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

        BuilderWithParent(OFOxmArpSpaVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80002c04L;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFOxmArpSpa.Builder setValue(IPv4Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv4Address> getMatchField() {
        return MatchField.ARP_SPA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv4Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public IPv4Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmArpSpa build() {
                IPv4Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmArpSpaVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmArpSpa.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv4Address value;

    @Override
    public long getTypeLen() {
        return 0x80002c04L;
    }

    @Override
    public IPv4Address getValue() {
        return value;
    }

    @Override
    public OFOxmArpSpa.Builder setValue(IPv4Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<IPv4Address> getMatchField() {
        return MatchField.ARP_SPA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<IPv4Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public IPv4Address getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmArpSpa build() {
            IPv4Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmArpSpaVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmArpSpa> {
        @Override
        public OFOxmArpSpa readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80002c04L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80002c04)
                throw new OFParseError("Wrong typeLen: Expected=0x80002c04L(0x80002c04L), got="+typeLen);
            IPv4Address value = IPv4Address.read4Bytes(bb);

            OFOxmArpSpaVer12 oxmArpSpaVer12 = new OFOxmArpSpaVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmArpSpaVer12);
            return oxmArpSpaVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmArpSpaVer12Funnel FUNNEL = new OFOxmArpSpaVer12Funnel();
    static class OFOxmArpSpaVer12Funnel implements Funnel<OFOxmArpSpaVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmArpSpaVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80002c04L
            sink.putInt((int) 0x80002c04);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmArpSpaVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmArpSpaVer12 message) {
            // fixed value property typeLen = 0x80002c04L
            bb.writeInt((int) 0x80002c04);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmArpSpaVer12(");
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
        OFOxmArpSpaVer12 other = (OFOxmArpSpaVer12) obj;

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
