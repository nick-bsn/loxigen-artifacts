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

class OFPortDescPropBsnBreakoutVer15 implements OFPortDescPropBsnBreakout {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropBsnBreakoutVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 16;

        private final static int DEFAULT_SUB_INTERFACE_COUNT = 0x0;
        private final static int DEFAULT_SUB_INTERFACE_SPEED_GBPS = 0x0;

    // OF message fields
    private final int subInterfaceCount;
    private final int subInterfaceSpeedGbps;
//
    // Immutable default instance
    final static OFPortDescPropBsnBreakoutVer15 DEFAULT = new OFPortDescPropBsnBreakoutVer15(
        DEFAULT_SUB_INTERFACE_COUNT, DEFAULT_SUB_INTERFACE_SPEED_GBPS
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropBsnBreakoutVer15(int subInterfaceCount, int subInterfaceSpeedGbps) {
        this.subInterfaceCount = subInterfaceCount;
        this.subInterfaceSpeedGbps = subInterfaceSpeedGbps;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x3L;
    }

    @Override
    public int getSubInterfaceCount() {
        return subInterfaceCount;
    }

    @Override
    public int getSubInterfaceSpeedGbps() {
        return subInterfaceSpeedGbps;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFPortDescPropBsnBreakout.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropBsnBreakout.Builder {
        final OFPortDescPropBsnBreakoutVer15 parentMessage;

        // OF message fields
        private boolean subInterfaceCountSet;
        private int subInterfaceCount;
        private boolean subInterfaceSpeedGbpsSet;
        private int subInterfaceSpeedGbps;

        BuilderWithParent(OFPortDescPropBsnBreakoutVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x3L;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public int getSubInterfaceCount() {
        return subInterfaceCount;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setSubInterfaceCount(int subInterfaceCount) {
        this.subInterfaceCount = subInterfaceCount;
        this.subInterfaceCountSet = true;
        return this;
    }
    @Override
    public int getSubInterfaceSpeedGbps() {
        return subInterfaceSpeedGbps;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setSubInterfaceSpeedGbps(int subInterfaceSpeedGbps) {
        this.subInterfaceSpeedGbps = subInterfaceSpeedGbps;
        this.subInterfaceSpeedGbpsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFPortDescPropBsnBreakout build() {
                int subInterfaceCount = this.subInterfaceCountSet ? this.subInterfaceCount : parentMessage.subInterfaceCount;
                int subInterfaceSpeedGbps = this.subInterfaceSpeedGbpsSet ? this.subInterfaceSpeedGbps : parentMessage.subInterfaceSpeedGbps;

                //
                return new OFPortDescPropBsnBreakoutVer15(
                    subInterfaceCount,
                    subInterfaceSpeedGbps
                );
        }

    }

    static class Builder implements OFPortDescPropBsnBreakout.Builder {
        // OF message fields
        private boolean subInterfaceCountSet;
        private int subInterfaceCount;
        private boolean subInterfaceSpeedGbpsSet;
        private int subInterfaceSpeedGbps;

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getExpType() {
        return 0x3L;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setExpType(long expType) {
            throw new UnsupportedOperationException("Property expType is not writeable");
    }
    @Override
    public int getSubInterfaceCount() {
        return subInterfaceCount;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setSubInterfaceCount(int subInterfaceCount) {
        this.subInterfaceCount = subInterfaceCount;
        this.subInterfaceCountSet = true;
        return this;
    }
    @Override
    public int getSubInterfaceSpeedGbps() {
        return subInterfaceSpeedGbps;
    }

    @Override
    public OFPortDescPropBsnBreakout.Builder setSubInterfaceSpeedGbps(int subInterfaceSpeedGbps) {
        this.subInterfaceSpeedGbps = subInterfaceSpeedGbps;
        this.subInterfaceSpeedGbpsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFPortDescPropBsnBreakout build() {
            int subInterfaceCount = this.subInterfaceCountSet ? this.subInterfaceCount : DEFAULT_SUB_INTERFACE_COUNT;
            int subInterfaceSpeedGbps = this.subInterfaceSpeedGbpsSet ? this.subInterfaceSpeedGbps : DEFAULT_SUB_INTERFACE_SPEED_GBPS;


            return new OFPortDescPropBsnBreakoutVer15(
                    subInterfaceCount,
                    subInterfaceSpeedGbps
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortDescPropBsnBreakout> {
        @Override
        public OFPortDescPropBsnBreakout readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property expType == 0x3L
            int expType = bb.readInt();
            if(expType != 0x3)
                throw new OFParseError("Wrong expType: Expected=0x3L(0x3L), got="+expType);
            int subInterfaceCount = U16.f(bb.readShort());
            int subInterfaceSpeedGbps = U16.f(bb.readShort());

            OFPortDescPropBsnBreakoutVer15 portDescPropBsnBreakoutVer15 = new OFPortDescPropBsnBreakoutVer15(
                    subInterfaceCount,
                      subInterfaceSpeedGbps
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropBsnBreakoutVer15);
            return portDescPropBsnBreakoutVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropBsnBreakoutVer15Funnel FUNNEL = new OFPortDescPropBsnBreakoutVer15Funnel();
    static class OFPortDescPropBsnBreakoutVer15Funnel implements Funnel<OFPortDescPropBsnBreakoutVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropBsnBreakoutVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property expType = 0x3L
            sink.putInt(0x3);
            sink.putInt(message.subInterfaceCount);
            sink.putInt(message.subInterfaceSpeedGbps);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropBsnBreakoutVer15> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropBsnBreakoutVer15 message) {
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property expType = 0x3L
            bb.writeInt(0x3);
            bb.writeShort(U16.t(message.subInterfaceCount));
            bb.writeShort(U16.t(message.subInterfaceSpeedGbps));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropBsnBreakoutVer15(");
        b.append("subInterfaceCount=").append(subInterfaceCount);
        b.append(", ");
        b.append("subInterfaceSpeedGbps=").append(subInterfaceSpeedGbps);
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
        OFPortDescPropBsnBreakoutVer15 other = (OFPortDescPropBsnBreakoutVer15) obj;

        if( subInterfaceCount != other.subInterfaceCount)
            return false;
        if( subInterfaceSpeedGbps != other.subInterfaceSpeedGbps)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + subInterfaceCount;
        result = prime * result + subInterfaceSpeedGbps;
        return result;
    }

}