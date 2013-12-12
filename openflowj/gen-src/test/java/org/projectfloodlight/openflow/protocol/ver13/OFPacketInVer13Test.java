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



public class OFPacketInVer13Test {
    OFFactory factory;

    final static byte[] PACKET_IN_SERIALIZED =
        new byte[] { 0x4, 0xa, 0x0, 0x35, 0x12, 0x34, 0x56, 0x78, 0x0, 0x0, 0x0, 0x64, 0x42, 0x68, 0x1, 0x14, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, 0x0, 0x1, 0x0, 0x16, (byte) 0x80, 0x0, 0x1, 0x8, 0x0, 0x0, 0x0, 0x4, 0x0, 0x0, 0x0, 0x5, (byte) 0x80, 0x0, 0x2a, 0x2, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0, 0x61, 0x62, 0x63 };

    @Before
    public void setup() {
        factory = OFFactoryVer13.INSTANCE;
    }

    @Test
    public void testWrite() {
        OFPacketIn.Builder builder = factory.buildPacketIn();
        builder
   .setXid(0x12345678)
   .setBufferId(OFBufferId.of(100))
   .setTotalLen(17000)
   .setReason(OFPacketInReason.ACTION)
   .setTableId(TableId.of(20))
   .setCookie(U64.parseHex("FEDCBA9876543210"))
   .setMatch(
        factory.buildMatchV3()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ARP_OP, ArpOpcode.REQUEST)
        	.build()
    )
    .setData(new byte[] { 97, 98, 99 } );;
        OFPacketIn packetIn = builder.build();
        ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
        packetIn.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(PACKET_IN_SERIALIZED));
    }

    @Test
    public void testRead() throws Exception {
        OFPacketIn.Builder builder = factory.buildPacketIn();
        builder
   .setXid(0x12345678)
   .setBufferId(OFBufferId.of(100))
   .setTotalLen(17000)
   .setReason(OFPacketInReason.ACTION)
   .setTableId(TableId.of(20))
   .setCookie(U64.parseHex("FEDCBA9876543210"))
   .setMatch(
        factory.buildMatchV3()
            .setMasked(MatchField.IN_PORT, OFPort.of(4), OFPort.of(5))
            .setExact(MatchField.ARP_OP, ArpOpcode.REQUEST)
        	.build()
    )
    .setData(new byte[] { 97, 98, 99 } );;
        OFPacketIn packetInBuilt = builder.build();

        ChannelBuffer input = ChannelBuffers.copiedBuffer(PACKET_IN_SERIALIZED);

        // FIXME should invoke the overall reader once implemented
        OFPacketIn packetInRead = OFPacketInVer13.READER.readFrom(input);
        assertEquals(PACKET_IN_SERIALIZED.length, input.readerIndex());

        assertEquals(packetInBuilt, packetInRead);
   }

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(PACKET_IN_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFPacketIn packetIn = OFPacketInVer13.READER.readFrom(input);
       assertEquals(PACKET_IN_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       packetIn.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(PACKET_IN_SERIALIZED));
   }

}
