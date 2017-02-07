// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFGroupFeaturesStatsRequestVer15Test {
    OFFactory factory;

    final static byte[] GROUP_FEATURES_STATS_REQUEST_SERIALIZED =
        new byte[] { 0x6, 0x12, 0x0, 0x10, 0x12, 0x34, 0x56, 0x78, 0x0, 0x8, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer15.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFGroupFeaturesStatsRequest.Builder builder = factory.buildGroupFeaturesStatsRequest();
        builder
        .setXid(0x12345678)
        .setFlags(ImmutableSet.<OFStatsRequestFlags>of(OFStatsRequestFlags.REQ_MORE))
        .build();
        OFGroupFeaturesStatsRequest groupFeaturesStatsRequest = builder.build();
        ByteBuf bb = Unpooled.buffer();
        groupFeaturesStatsRequest.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(GROUP_FEATURES_STATS_REQUEST_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFGroupFeaturesStatsRequest.Builder builder = factory.buildGroupFeaturesStatsRequest();
        builder
        .setXid(0x12345678)
        .setFlags(ImmutableSet.<OFStatsRequestFlags>of(OFStatsRequestFlags.REQ_MORE))
        .build();
        OFGroupFeaturesStatsRequest groupFeaturesStatsRequestBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(GROUP_FEATURES_STATS_REQUEST_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFGroupFeaturesStatsRequest groupFeaturesStatsRequestRead = OFGroupFeaturesStatsRequestVer15.READER.readFrom(input);
        assertEquals(GROUP_FEATURES_STATS_REQUEST_SERIALIZED.length, input.readerIndex());

        assertEquals(groupFeaturesStatsRequestBuilt, groupFeaturesStatsRequestRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(GROUP_FEATURES_STATS_REQUEST_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFGroupFeaturesStatsRequest groupFeaturesStatsRequest = OFGroupFeaturesStatsRequestVer15.READER.readFrom(input);
       assertEquals(GROUP_FEATURES_STATS_REQUEST_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       groupFeaturesStatsRequest.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(GROUP_FEATURES_STATS_REQUEST_SERIALIZED));
   }

}
