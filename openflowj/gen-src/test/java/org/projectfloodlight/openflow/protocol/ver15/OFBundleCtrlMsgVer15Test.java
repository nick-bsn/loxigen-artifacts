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
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.hamcrest.CoreMatchers;



public class OFBundleCtrlMsgVer15Test {
    OFFactory factory;

    final static byte[] BUNDLE_CTRL_MSG_SERIALIZED =
        new byte[] { 0x6, 0x21, 0x0, 0x28, 0x12, 0x34, 0x56, 0x78, 0x0, 0x0, 0x0, 0x1, 0x0, 0x0, 0x0, 0x1, 0x0, 0x1, 0x0, 0x18, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x3b, (byte) 0x9a, (byte) 0xca, 0x0, 0x0, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer15.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFBundleCtrlMsg.Builder builder = factory.buildBundleCtrlMsg();
        builder
        .setXid(0x12345678)
        .setBundleId(BundleId.of(1))
        .setBundleCtrlType(OFBundleCtrlType.OPEN_REQUEST)
        .setFlags(ImmutableSet.<OFBundleFlags>of(OFBundleFlags.ATOMIC))
        .setProperties(ImmutableList.<OFBundleProp>of(factory.buildBundlePropTime().setScheduledTime(ImmutableList.<OFTime>of(factory.buildTime().setSeconds(U64.of(1)).setNanoseconds(1000000000L).build())).build()))
        .build();
        OFBundleCtrlMsg bundleCtrlMsg = builder.build();
        ByteBuf bb = Unpooled.buffer();
        bundleCtrlMsg.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(BUNDLE_CTRL_MSG_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFBundleCtrlMsg.Builder builder = factory.buildBundleCtrlMsg();
        builder
        .setXid(0x12345678)
        .setBundleId(BundleId.of(1))
        .setBundleCtrlType(OFBundleCtrlType.OPEN_REQUEST)
        .setFlags(ImmutableSet.<OFBundleFlags>of(OFBundleFlags.ATOMIC))
        .setProperties(ImmutableList.<OFBundleProp>of(factory.buildBundlePropTime().setScheduledTime(ImmutableList.<OFTime>of(factory.buildTime().setSeconds(U64.of(1)).setNanoseconds(1000000000L).build())).build()))
        .build();
        OFBundleCtrlMsg bundleCtrlMsgBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(BUNDLE_CTRL_MSG_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFBundleCtrlMsg bundleCtrlMsgRead = OFBundleCtrlMsgVer15.READER.readFrom(input);
        assertEquals(BUNDLE_CTRL_MSG_SERIALIZED.length, input.readerIndex());

        assertEquals(bundleCtrlMsgBuilt, bundleCtrlMsgRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(BUNDLE_CTRL_MSG_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFBundleCtrlMsg bundleCtrlMsg = OFBundleCtrlMsgVer15.READER.readFrom(input);
       assertEquals(BUNDLE_CTRL_MSG_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       bundleCtrlMsg.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(BUNDLE_CTRL_MSG_SERIALIZED));
   }

}
