// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template unit_test.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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



public class OFPortDescVer10Test {
    OFFactory factory;

    final static byte[] PORT_DESC_SERIALIZED =
        new byte[] { (byte) 0xff, (byte) 0xfd, 0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x66, 0x6f, 0x6f, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x10, 0x0, 0x0, 0x2, 0x0, 0x0, 0x0, 0x0, 0x1, 0x0, 0x0, 0x0, 0x20, 0x0, 0x0, 0x2, 0x0, 0x0, 0x0, 0x8, 0x0 };

    @Before
    public void setup() {
        factory = OFFactoryVer10.INSTANCE;
    }

   // FIXME: No java stanza in test_data for this class. Add for more comprehensive unit testing

   @Test
   public void testReadWrite() throws Exception {
       ChannelBuffer input = ChannelBuffers.copiedBuffer(PORT_DESC_SERIALIZED);

       // FIXME should invoke the overall reader once implemented
       OFPortDesc portDesc = OFPortDescVer10.READER.readFrom(input);
       assertEquals(PORT_DESC_SERIALIZED.length, input.readerIndex());

       // write message again
       ChannelBuffer bb = ChannelBuffers.dynamicBuffer();
       portDesc.writeTo(bb);
       byte[] written = new byte[bb.readableBytes()];
       bb.readBytes(written);

       assertThat(written, CoreMatchers.equalTo(PORT_DESC_SERIALIZED));
   }

}
