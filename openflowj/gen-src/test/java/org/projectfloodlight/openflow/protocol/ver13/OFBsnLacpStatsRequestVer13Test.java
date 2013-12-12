// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
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
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.hamcrest.CoreMatchers;



public class OFBsnLacpStatsRequestVer13Test {
    OFFactory factory;

    final static byte[] BSN_LACP_STATS_REQUEST_SERIALIZED =
        new byte[] { 0x4, 0x12, 0x0, 0x18, 0x12, 0x34, 0x56, 0x78, (byte) 0xff, (byte) 0xff, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x5c, 0x16, (byte) 0xc7, 0x0, 0x0, 0x0, 0x1 };

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFBsnLacpStatsRequest.Builder builder = factory.buildBsnLacpStatsRequest();
        builder.setXid(0x12345678);
        OFBsnLacpStatsRequest bsnLacpStatsRequest = builder.build();
        ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
        bsnLacpStatsRequest.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(BSN_LACP_STATS_REQUEST_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFBsnLacpStatsRequest.Builder builder = factory.buildBsnLacpStatsRequest();
        builder.setXid(0x12345678);
        OFBsnLacpStatsRequest bsnLacpStatsRequestBuilt = builder.build();

        ChannelBuffer input = ChannelBuffers.copiedBuffer(BSN_LACP_STATS_REQUEST_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFBsnLacpStatsRequest bsnLacpStatsRequestRead = OFBsnLacpStatsRequestVer13.READER.readFrom(input);
        assertEquals(BSN_LACP_STATS_REQUEST_SERIALIZED.length, input.readerIndex());

        assertEquals(bsnLacpStatsRequestBuilt, bsnLacpStatsRequestRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(BSN_LACP_STATS_REQUEST_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFBsnLacpStatsRequest bsnLacpStatsRequest = OFBsnLacpStatsRequestVer13.READER.readFrom(input);
       assertEquals(BSN_LACP_STATS_REQUEST_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       bsnLacpStatsRequest.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(BSN_LACP_STATS_REQUEST_SERIALIZED));
   }

}
