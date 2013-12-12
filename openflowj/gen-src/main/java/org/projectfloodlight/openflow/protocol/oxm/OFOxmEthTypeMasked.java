// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.oxm;

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
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFOxmEthTypeMasked extends OFObject, OFOxm<EthType> {
    long getTypeLen();
    EthType getValue();
    EthType getMask();
    MatchField<EthType> getMatchField();
    boolean isMasked();
    OFOxm<EthType> getCanonical();
    OFVersion getVersion();

    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFOxm.Builder<EthType> {
        OFOxmEthTypeMasked build();
        long getTypeLen();
        EthType getValue();
        Builder setValue(EthType value);
        EthType getMask();
        Builder setMask(EthType mask);
        MatchField<EthType> getMatchField();
        boolean isMasked();
        OFOxm<EthType> getCanonical();
        OFVersion getVersion();
    }
}
