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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBucketVer15 implements OFBucket {
    private static final Logger logger = LoggerFactory.getLogger(OFBucketVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 8;

        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();
        private final static List<OFGroupBucketProp> DEFAULT_PROPERTIES = ImmutableList.<OFGroupBucketProp>of();

    // OF message fields
    private final OFGroupBucket bucketId;
    private final List<OFAction> actions;
    private final List<OFGroupBucketProp> properties;
//

    // package private constructor - used by readers, builders, and factory
    OFBucketVer15(OFGroupBucket bucketId, List<OFAction> actions, List<OFGroupBucketProp> properties) {
        if(bucketId == null) {
            throw new NullPointerException("OFBucketVer15: property bucketId cannot be null");
        }
        if(actions == null) {
            throw new NullPointerException("OFBucketVer15: property actions cannot be null");
        }
        if(properties == null) {
            throw new NullPointerException("OFBucketVer15: property properties cannot be null");
        }
        this.bucketId = bucketId;
        this.actions = actions;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public int getWeight()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property weight not supported in version 1.5");
    }

    @Override
    public OFPort getWatchPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchPort not supported in version 1.5");
    }

    @Override
    public OFGroup getWatchGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchGroup not supported in version 1.5");
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFGroupBucket getBucketId() {
        return bucketId;
    }

    @Override
    public List<OFGroupBucketProp> getProperties() {
        return properties;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBucket.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBucket.Builder {
        final OFBucketVer15 parentMessage;

        // OF message fields
        private boolean bucketIdSet;
        private OFGroupBucket bucketId;
        private boolean actionsSet;
        private List<OFAction> actions;
        private boolean propertiesSet;
        private List<OFGroupBucketProp> properties;

        BuilderWithParent(OFBucketVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getWeight()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property weight not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWeight(int weight) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property weight not supported in version 1.5");
    }
    @Override
    public OFPort getWatchPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchPort not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWatchPort(OFPort watchPort) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property watchPort not supported in version 1.5");
    }
    @Override
    public OFGroup getWatchGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchGroup not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWatchGroup(OFGroup watchGroup) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property watchGroup not supported in version 1.5");
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
    public OFGroupBucket getBucketId() {
        return bucketId;
    }

    @Override
    public OFBucket.Builder setBucketId(OFGroupBucket bucketId) {
        this.bucketId = bucketId;
        this.bucketIdSet = true;
        return this;
    }
    @Override
    public List<OFGroupBucketProp> getProperties() {
        return properties;
    }

    @Override
    public OFBucket.Builder setProperties(List<OFGroupBucketProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBucket build() {
                OFGroupBucket bucketId = this.bucketIdSet ? this.bucketId : parentMessage.bucketId;
                if(bucketId == null)
                    throw new NullPointerException("Property bucketId must not be null");
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");
                List<OFGroupBucketProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFBucketVer15(
                    bucketId,
                    actions,
                    properties
                );
        }

    }

    static class Builder implements OFBucket.Builder {
        // OF message fields
        private boolean bucketIdSet;
        private OFGroupBucket bucketId;
        private boolean actionsSet;
        private List<OFAction> actions;
        private boolean propertiesSet;
        private List<OFGroupBucketProp> properties;

    @Override
    public int getWeight()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property weight not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWeight(int weight) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property weight not supported in version 1.5");
    }
    @Override
    public OFPort getWatchPort()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchPort not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWatchPort(OFPort watchPort) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property watchPort not supported in version 1.5");
    }
    @Override
    public OFGroup getWatchGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property watchGroup not supported in version 1.5");
    }

    @Override
    public OFBucket.Builder setWatchGroup(OFGroup watchGroup) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property watchGroup not supported in version 1.5");
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
    public OFGroupBucket getBucketId() {
        return bucketId;
    }

    @Override
    public OFBucket.Builder setBucketId(OFGroupBucket bucketId) {
        this.bucketId = bucketId;
        this.bucketIdSet = true;
        return this;
    }
    @Override
    public List<OFGroupBucketProp> getProperties() {
        return properties;
    }

    @Override
    public OFBucket.Builder setProperties(List<OFGroupBucketProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBucket build() {
            if(!this.bucketIdSet)
                throw new IllegalStateException("Property bucketId doesn't have default value -- must be set");
            if(bucketId == null)
                throw new NullPointerException("Property bucketId must not be null");
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");
            List<OFGroupBucketProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFBucketVer15(
                    bucketId,
                    actions,
                    properties
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
            int actionArrayLen = U16.f(bb.readShort());
            OFGroupBucket bucketId = OFGroupBucketSerializerVer15.readFrom(bb);
            List<OFAction> actions = ChannelUtils.readList(bb, actionArrayLen, OFActionVer15.READER);
            List<OFGroupBucketProp> properties = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFGroupBucketPropVer15.READER);

            OFBucketVer15 bucketVer15 = new OFBucketVer15(
                    bucketId,
                      actions,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bucketVer15);
            return bucketVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBucketVer15Funnel FUNNEL = new OFBucketVer15Funnel();
    static class OFBucketVer15Funnel implements Funnel<OFBucketVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBucketVer15 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            // FIXME: skip funnel of actionArrayLen
            OFGroupBucketSerializerVer15.putTo(message.bucketId, sink);
            FunnelUtils.putList(message.actions, sink);
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBucketVer15> {
        @Override
        public void write(ByteBuf bb, OFBucketVer15 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // actionArrayLen is length indicator for actions, will be
            // udpated when actions has been written
            int actionArrayLenIndex = bb.writerIndex();
            bb.writeShort(0);
            OFGroupBucketSerializerVer15.writeTo(bb, message.bucketId);
            int actionsStartIndex = bb.writerIndex();
            ChannelUtils.writeList(bb, message.actions);
            // update field length member actionArrayLen
            int actionsLength = bb.writerIndex() - actionsStartIndex;
            bb.setShort(actionArrayLenIndex, actionsLength);
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBucketVer15(");
        b.append("bucketId=").append(bucketId);
        b.append(", ");
        b.append("actions=").append(actions);
        b.append(", ");
        b.append("properties=").append(properties);
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
        OFBucketVer15 other = (OFBucketVer15) obj;

        if (bucketId == null) {
            if (other.bucketId != null)
                return false;
        } else if (!bucketId.equals(other.bucketId))
            return false;
        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((bucketId == null) ? 0 : bucketId.hashCode());
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}
