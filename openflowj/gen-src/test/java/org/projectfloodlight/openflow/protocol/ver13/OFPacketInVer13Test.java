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
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.runners.Parameterized.Parameters;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.hamcrest.CoreMatchers;


@RunWith(Parameterized.class)
public class OFPacketInVer13Test {
    OFFactory factory;

    final static byte[] PACKET_IN_SERIALIZED =
        new byte[] { 0x4, 0xa, 0x0, 0x35, 0x12, 0x34, 0x56, 0x78, 0x0, 0x0, 0x0, 0x64, 0x42, 0x68, 0x1, 0x14, (byte) 0xfe, (byte) 0xdc, (byte) 0xba, (byte) 0x98, 0x76, 0x54, 0x32, 0x10, 0x0, 0x1, 0x0, 0x16, (byte) 0x80, 0x0, 0x1, 0x8, 0x0, 0x0, 0x0, 0x4, 0x0, 0x0, 0x0, 0x5, (byte) 0x80, 0x0, 0x2a, 0x2, 0x0, 0x1, 0x0, 0x0, 0x0, 0x0, 0x61, 0x62, 0x63 };


    private final static int[] PREFIX_BYTES = { 0, 1, 4, 255, 65335 };
    private final static ByteBuf EMPTY_BUFFER = Unpooled.wrappedBuffer(new byte[65535]);

    private final OFMessageReader<?> messageReader;

    @Parameters(name="{index}.MessageReader={0}")
    public static Iterable<Object> data() {
        return ImmutableList.<Object>of(
                OFPacketInVer13.READER, OFMessageVer13.READER
        );
    }

    public OFPacketInVer13Test(OFMessageReader<?> messageReader) {
        this.messageReader = messageReader;
    }

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
        ByteBuf bb = Unpooled.buffer();
        packetIn.writeTo(bb);
        byte[] written = new byte[bb.readableBytes()];
        bb.readBytes(written);

        assertThat(written, CoreMatchers.equalTo(PACKET_IN_SERIALIZED));
    }


    @Test
    public void testRead() throws Exception {
        ByteBuf input = Unpooled.copiedBuffer(PACKET_IN_SERIALIZED);

        Object packetInRead = messageReader.readFrom(input);
        assertThat(packetInRead, CoreMatchers.instanceOf(OFPacketInVer13.class));
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

        assertEquals(PACKET_IN_SERIALIZED.length, input.readerIndex());

        assertEquals(packetInBuilt, packetInRead);
        // FIXME: No java stanza in test_data for this class. Add to enable validation of read message
   }

    /**
     * Validates Reader handling of partial messages in the buffer.
     *
     * Ensures that readers deal with partially available messages, and that buffers
     * are returned unmodified. Also checks compatibility when the data is not at the start of
     * the buffer (readerIndex=0), but somewhere else (with the readerIndex appropriately set).
     */
   @Test
   public void testPartialRead() throws Exception {
       ByteBuf msgBuffer = Unpooled.copiedBuffer(PACKET_IN_SERIALIZED);
        for(int prefixLength: PREFIX_BYTES) {
            ByteBuf prefixBuffer = EMPTY_BUFFER.slice(0, prefixLength);
            ByteBuf wholeBuffer = Unpooled.wrappedBuffer(prefixBuffer, msgBuffer);
            for(int partialLength = 0; partialLength < PACKET_IN_SERIALIZED.length - 1; partialLength++) {
                int length = prefixLength + partialLength;
                ByteBuf slice = wholeBuffer.slice(0, length);
                slice.readerIndex(prefixLength);

                Object read = messageReader.readFrom(slice);

                assertNull("partial message should not be read", read);
                assertEquals("Reader index should be back at the start", prefixLength, slice.readerIndex());
            }

        }
   }

   @Test
   public void testReadWrite() throws Exception {
       ByteBuf input = Unpooled.copiedBuffer(PACKET_IN_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFPacketIn packetIn = (OFPacketIn) messageReader.readFrom(input);
       assertEquals(PACKET_IN_SERIALIZED.length, input.readerIndex());

       // write message again
       ByteBuf bb = Unpooled.buffer();
       packetIn.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(PACKET_IN_SERIALIZED));
   }

}