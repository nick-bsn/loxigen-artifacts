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



public class OFFlowModifyVer13Test {
    OFFactory factory;

    final static byte[] FLOW_MODIFY_SERIALIZED =
        new byte[] { 0x4, 0xe, 0x0, (byte) 0x80, 0x12, 0x34, 0x56, 0x78, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, (byte) 0xff, 0x0, (byte) 0xff, 0x0, (byte) 0xff, 0x0, (byte) 0xff, 0x0, 0x3, 0x1, 0x0, 0x5, 0x0, 0xa, 0x17, 0x70, 0x0, 0x0, 0x0, 0x32, 0x0, 0x0, 0x0, 0x6, 0x0, 0x0, 0x0, 0x8, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x3f, (byte) 0x80, 0x0, 0x1, 0x8, 0x0, 0x0, 0x0, 0x4, 0x0, 0x0, 0x0, 0x5, (byte) 0x80, 0x0, 0xa, 0x2, (byte) 0x86, (byte) 0xdd, (byte) 0x80, 0x0, 0x14, 0x1, 0x6, (byte) 0x80, 0x0, 0x35, 0x20, 0x1c, (byte) 0xca, (byte) 0xfe, 0x1c, (byte) 0xb1, 0x10, 0x1c, 0x0, 0x0, 0x28, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xf0, (byte) 0xff, (byte) 0xff, 0x1c, 0x2c, 0x3c, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x8, 0x4, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x8, 0x7, 0x0, 0x0, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFFlowModify.Builder builder = factory.buildFlowModify();
        builder.setXid(0x12345678)
    .setCookie(U64.parseHex("FEDCBA9876543210"))
    .setCookieMask(U64.parseHex("FF00FF00FF00FF00"))
    .setTableId(TableId.of(3))
    .setIdleTimeout(5)
    .setHardTimeout(10)
    .setPriority(6000)
    .setBufferId(OFBufferId.of(50))
    .setOutPort(OFPort.of(6))
    .setOutGroup(OFGroup.of(8))
    .setFlags(ImmutableSet.<OFFlowModFlags>of())
    .setMatch(
        factory.buildMatch()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ETH_TYPE, EthType.IPv6)
            .setExact(MatchField.IP_PROTO, IpProtocol.TCP)
            .setMasked(MatchField.IPV6_SRC,
                       IPv6Address.of(0x1CCAFE1CB1101C00l, 0x0028000000000000l),
                       IPv6Address.of(0xFFFFFFFFFFF0FFFFl, 0x1C2C3C0000000000l))
        	.build()
    )
    .setInstructions(
        ImmutableList.<OFInstruction>of(
                factory.instructions().gotoTable(TableId.of(4)),
                factory.instructions().gotoTable(TableId.of(7))
        )
    );;
        OFFlowModify flowModify = builder.build();
        ByteBuf bb = Unpooled.buffer();
        flowModify.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(FLOW_MODIFY_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFFlowModify.Builder builder = factory.buildFlowModify();
        builder.setXid(0x12345678)
    .setCookie(U64.parseHex("FEDCBA9876543210"))
    .setCookieMask(U64.parseHex("FF00FF00FF00FF00"))
    .setTableId(TableId.of(3))
    .setIdleTimeout(5)
    .setHardTimeout(10)
    .setPriority(6000)
    .setBufferId(OFBufferId.of(50))
    .setOutPort(OFPort.of(6))
    .setOutGroup(OFGroup.of(8))
    .setFlags(ImmutableSet.<OFFlowModFlags>of())
    .setMatch(
        factory.buildMatch()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ETH_TYPE, EthType.IPv6)
            .setExact(MatchField.IP_PROTO, IpProtocol.TCP)
            .setMasked(MatchField.IPV6_SRC,
                       IPv6Address.of(0x1CCAFE1CB1101C00l, 0x0028000000000000l),
                       IPv6Address.of(0xFFFFFFFFFFF0FFFFl, 0x1C2C3C0000000000l))
        	.build()
    )
    .setInstructions(
        ImmutableList.<OFInstruction>of(
                factory.instructions().gotoTable(TableId.of(4)),
                factory.instructions().gotoTable(TableId.of(7))
        )
    );;
        OFFlowModify flowModifyBuilt = builder.build();

        ByteBuf input = Unpooled.copiedBuffer(FLOW_MODIFY_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFFlowModify flowModifyRead = OFFlowModifyVer13.READER.readFrom(input);
        assertEquals(FLOW_MODIFY_SERIALIZED.length, input.readerIndex());

        assertEquals(flowModifyBuilt, flowModifyRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(FLOW_MODIFY_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFFlowModify flowModify = OFFlowModifyVer13.READER.readFrom(input);
       assertEquals(FLOW_MODIFY_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       flowModify.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(FLOW_MODIFY_SERIALIZED));
   }

}
