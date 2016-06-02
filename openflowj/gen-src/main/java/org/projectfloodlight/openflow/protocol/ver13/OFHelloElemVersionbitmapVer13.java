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
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFHelloElemVersionbitmapVer13 implements OFHelloElemVersionbitmap {
    private static final Logger logger = LoggerFactory.getLogger(OFHelloElemVersionbitmapVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;

        private final static List<U32> DEFAULT_BITMAPS = ImmutableList.<U32>of();

    // OF message fields
    private final List<U32> bitmaps;
//
    // Immutable default instance
    final static OFHelloElemVersionbitmapVer13 DEFAULT = new OFHelloElemVersionbitmapVer13(
        DEFAULT_BITMAPS
    );

    // package private constructor - used by readers, builders, and factory
    OFHelloElemVersionbitmapVer13(List<U32> bitmaps) {
        if(bitmaps == null) {
            throw new NullPointerException("OFHelloElemVersionbitmapVer13: property bitmaps cannot be null");
        }
        this.bitmaps = bitmaps;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<U32> getBitmaps() {
        return bitmaps;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFHelloElemVersionbitmap.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFHelloElemVersionbitmap.Builder {
        final OFHelloElemVersionbitmapVer13 parentMessage;

        // OF message fields
        private boolean bitmapsSet;
        private List<U32> bitmaps;

        BuilderWithParent(OFHelloElemVersionbitmapVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<U32> getBitmaps() {
        return bitmaps;
    }

    @Override
    public OFHelloElemVersionbitmap.Builder setBitmaps(List<U32> bitmaps) {
        this.bitmaps = bitmaps;
        this.bitmapsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFHelloElemVersionbitmap build() {
                List<U32> bitmaps = this.bitmapsSet ? this.bitmaps : parentMessage.bitmaps;
                if(bitmaps == null)
                    throw new NullPointerException("Property bitmaps must not be null");

                //
                return new OFHelloElemVersionbitmapVer13(
                    bitmaps
                );
        }

    }

    static class Builder implements OFHelloElemVersionbitmap.Builder {
        // OF message fields
        private boolean bitmapsSet;
        private List<U32> bitmaps;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public List<U32> getBitmaps() {
        return bitmaps;
    }

    @Override
    public OFHelloElemVersionbitmap.Builder setBitmaps(List<U32> bitmaps) {
        this.bitmaps = bitmaps;
        this.bitmapsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFHelloElemVersionbitmap build() {
            List<U32> bitmaps = this.bitmapsSet ? this.bitmaps : DEFAULT_BITMAPS;
            if(bitmaps == null)
                throw new NullPointerException("Property bitmaps must not be null");


            return new OFHelloElemVersionbitmapVer13(
                    bitmaps
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFHelloElemVersionbitmap> {
        @Override
        public OFHelloElemVersionbitmap readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            List<U32> bitmaps = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), U32.READER);

            OFHelloElemVersionbitmapVer13 helloElemVersionbitmapVer13 = new OFHelloElemVersionbitmapVer13(
                    bitmaps
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", helloElemVersionbitmapVer13);
            return helloElemVersionbitmapVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFHelloElemVersionbitmapVer13Funnel FUNNEL = new OFHelloElemVersionbitmapVer13Funnel();
    static class OFHelloElemVersionbitmapVer13Funnel implements Funnel<OFHelloElemVersionbitmapVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFHelloElemVersionbitmapVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // FIXME: skip funnel of length
            FunnelUtils.putList(message.bitmaps, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFHelloElemVersionbitmapVer13> {
        @Override
        public void write(ByteBuf bb, OFHelloElemVersionbitmapVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            ChannelUtils.writeList(bb, message.bitmaps);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFHelloElemVersionbitmapVer13(");
        b.append("bitmaps=").append(bitmaps);
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
        OFHelloElemVersionbitmapVer13 other = (OFHelloElemVersionbitmapVer13) obj;

        if (bitmaps == null) {
            if (other.bitmaps != null)
                return false;
        } else if (!bitmaps.equals(other.bitmaps))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((bitmaps == null) ? 0 : bitmaps.hashCode());
        return result;
    }

}
