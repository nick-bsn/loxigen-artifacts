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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBucketVer14 implements OFBucket {
    private static final Logger logger = LoggerFactory.getLogger(OFBucketVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 16;

        private final static int DEFAULT_WEIGHT = 0x0;
        private final static OFPort DEFAULT_WATCH_PORT = OFPort.ANY;
        private final static OFGroup DEFAULT_WATCH_GROUP = OFGroup.ALL;
        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();

    // OF message fields
    private final int weight;
    private final OFPort watchPort;
    private final OFGroup watchGroup;
    private final List<OFAction> actions;
//
    // Immutable default instance
    final static OFBucketVer14 DEFAULT = new OFBucketVer14(
        DEFAULT_WEIGHT, DEFAULT_WATCH_PORT, DEFAULT_WATCH_GROUP, DEFAULT_ACTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFBucketVer14(int weight, OFPort watchPort, OFGroup watchGroup, List<OFAction> actions) {
        if(watchPort == null) {
            throw new NullPointerException("OFBucketVer14: property watchPort cannot be null");
        }
        if(watchGroup == null) {
            throw new NullPointerException("OFBucketVer14: property watchGroup cannot be null");
        }
        if(actions == null) {
            throw new NullPointerException("OFBucketVer14: property actions cannot be null");
        }
        this.weight = weight;
        this.watchPort = watchPort;
        this.watchGroup = watchGroup;
        this.actions = actions;
    }

    // Accessors for OF message fields
    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public OFPort getWatchPort() {
        return watchPort;
    }

    @Override
    public OFGroup getWatchGroup() {
        return watchGroup;
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFGroupBucket getBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property bucketId not supported in version 1.4");
    }

    @Override
    public List<OFGroupBucketProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBucket.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBucket.Builder {
        final OFBucketVer14 parentMessage;

        // OF message fields
        private boolean weightSet;
        private int weight;
        private boolean watchPortSet;
        private OFPort watchPort;
        private boolean watchGroupSet;
        private OFGroup watchGroup;
        private boolean actionsSet;
        private List<OFAction> actions;

        BuilderWithParent(OFBucketVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public OFBucket.Builder setWeight(int weight) {
        this.weight = weight;
        this.weightSet = true;
        return this;
    }
    @Override
    public OFPort getWatchPort() {
        return watchPort;
    }

    @Override
    public OFBucket.Builder setWatchPort(OFPort watchPort) {
        this.watchPort = watchPort;
        this.watchPortSet = true;
        return this;
    }
    @Override
    public OFGroup getWatchGroup() {
        return watchGroup;
    }

    @Override
    public OFBucket.Builder setWatchGroup(OFGroup watchGroup) {
        this.watchGroup = watchGroup;
        this.watchGroupSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFBucket.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property bucketId not supported in version 1.4");
    }

    @Override
    public OFBucket.Builder setBucketId(OFGroupBucket bucketId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property bucketId not supported in version 1.4");
    }
    @Override
    public List<OFGroupBucketProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }

    @Override
    public OFBucket.Builder setProperties(List<OFGroupBucketProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBucket build() {
                int weight = this.weightSet ? this.weight : parentMessage.weight;
                OFPort watchPort = this.watchPortSet ? this.watchPort : parentMessage.watchPort;
                if(watchPort == null)
                    throw new NullPointerException("Property watchPort must not be null");
                OFGroup watchGroup = this.watchGroupSet ? this.watchGroup : parentMessage.watchGroup;
                if(watchGroup == null)
                    throw new NullPointerException("Property watchGroup must not be null");
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");

                //
                return new OFBucketVer14(
                    weight,
                    watchPort,
                    watchGroup,
                    actions
                );
        }

    }

    static class Builder implements OFBucket.Builder {
        // OF message fields
        private boolean weightSet;
        private int weight;
        private boolean watchPortSet;
        private OFPort watchPort;
        private boolean watchGroupSet;
        private OFGroup watchGroup;
        private boolean actionsSet;
        private List<OFAction> actions;

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public OFBucket.Builder setWeight(int weight) {
        this.weight = weight;
        this.weightSet = true;
        return this;
    }
    @Override
    public OFPort getWatchPort() {
        return watchPort;
    }

    @Override
    public OFBucket.Builder setWatchPort(OFPort watchPort) {
        this.watchPort = watchPort;
        this.watchPortSet = true;
        return this;
    }
    @Override
    public OFGroup getWatchGroup() {
        return watchGroup;
    }

    @Override
    public OFBucket.Builder setWatchGroup(OFGroup watchGroup) {
        this.watchGroup = watchGroup;
        this.watchGroupSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFBucket.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFGroupBucket getBucketId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property bucketId not supported in version 1.4");
    }

    @Override
    public OFBucket.Builder setBucketId(OFGroupBucket bucketId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property bucketId not supported in version 1.4");
    }
    @Override
    public List<OFGroupBucketProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }

    @Override
    public OFBucket.Builder setProperties(List<OFGroupBucketProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.4");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBucket build() {
            int weight = this.weightSet ? this.weight : DEFAULT_WEIGHT;
            OFPort watchPort = this.watchPortSet ? this.watchPort : DEFAULT_WATCH_PORT;
            if(watchPort == null)
                throw new NullPointerException("Property watchPort must not be null");
            OFGroup watchGroup = this.watchGroupSet ? this.watchGroup : DEFAULT_WATCH_GROUP;
            if(watchGroup == null)
                throw new NullPointerException("Property watchGroup must not be null");
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");


            return new OFBucketVer14(
                    weight,
                    watchPort,
                    watchGroup,
                    actions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBucket> {
        @Override
        public OFBucket readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
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
            int weight = U16.f(bb.readShort());
            OFPort watchPort = OFPort.read4Bytes(bb);
            OFGroup watchGroup = OFGroup.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            List<OFAction> actions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFActionVer14.READER);

            OFBucketVer14 bucketVer14 = new OFBucketVer14(
                    weight,
                      watchPort,
                      watchGroup,
                      actions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bucketVer14);
            return bucketVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBucketVer14Funnel FUNNEL = new OFBucketVer14Funnel();
    static class OFBucketVer14Funnel implements Funnel<OFBucketVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBucketVer14 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            sink.putInt(message.weight);
            message.watchPort.putTo(sink);
            message.watchGroup.putTo(sink);
            // skip pad (4 bytes)
            FunnelUtils.putList(message.actions, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBucketVer14> {
        @Override
        public void write(ByteBuf bb, OFBucketVer14 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeShort(U16.t(message.weight));
            message.watchPort.write4Bytes(bb);
            message.watchGroup.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            ChannelUtils.writeList(bb, message.actions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBucketVer14(");
        b.append("weight=").append(weight);
        b.append(", ");
        b.append("watchPort=").append(watchPort);
        b.append(", ");
        b.append("watchGroup=").append(watchGroup);
        b.append(", ");
        b.append("actions=").append(actions);
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
        OFBucketVer14 other = (OFBucketVer14) obj;

        if( weight != other.weight)
            return false;
        if (watchPort == null) {
            if (other.watchPort != null)
                return false;
        } else if (!watchPort.equals(other.watchPort))
            return false;
        if (watchGroup == null) {
            if (other.watchGroup != null)
                return false;
        } else if (!watchGroup.equals(other.watchGroup))
            return false;
        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + weight;
        result = prime * result + ((watchPort == null) ? 0 : watchPort.hashCode());
        result = prime * result + ((watchGroup == null) ? 0 : watchGroup.hashCode());
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        return result;
    }

}
