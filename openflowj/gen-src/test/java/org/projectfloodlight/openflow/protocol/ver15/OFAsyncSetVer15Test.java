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
import java.util.Set;
import org.junit.Test;
import org.junit.Before;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFAsyncSetVer15Test {
    OFFactory factory;

    final static byte[] ASYNC_SET_SERIALIZED =
        new byte[] { 0x6, 0x1c, 0x0, 0x10, 0x12, 0x34, 0x56, 0x78, 0x0, 0x1, 0x0, 0x8, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer15.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFAsyncSet.Builder builder = factory.buildAsyncSet();
        builder
        .setXid(0x12345678)
        .setProperties(ImmutableList.<OFAsyncConfigProp>of(factory.buildAsyncConfigPropPacketInMaster().setMask(0).build()))
        .build();
        OFAsyncSet asyncSet = builder.build();
        ByteBuf bb = Unpooled.buffer();
        asyncSet.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(ASYNC_SET_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFAsyncSet.Builder builder = factory.buildAsyncSet();
        builder
        .setXid(0x12345678)
        .setProperties(ImmutableList.<OFAsyncConfigProp>of(factory.buildAsyncConfigPropPacketInMaster().setMask(0).build()))
        .build();
        OFAsyncSet asyncSetBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(ASYNC_SET_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFAsyncSet asyncSetRead = OFAsyncSetVer15.READER.readFrom(input);
        assertEquals(ASYNC_SET_SERIALIZED.length, input.readerIndex());

        assertEquals(asyncSetBuilt, asyncSetRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(ASYNC_SET_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFAsyncSet asyncSet = OFAsyncSetVer15.READER.readFrom(input);
       assertEquals(ASYNC_SET_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       asyncSet.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(ASYNC_SET_SERIALIZED));
   }

}
