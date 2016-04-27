// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import io.netty.buffer.ByteBuf;

public interface OFMatchV1 extends OFObject, Match {
    int getWildcards();
    OFPort getInPort();
    MacAddress getEthSrc();
    MacAddress getEthDst();
    OFVlanVidMatch getVlanVid();
    VlanPcp getVlanPcp();
    EthType getEthType();
    IpDscp getIpDscp();
    IpProtocol getIpProto();
    IPv4Address getIpv4Src();
    IPv4Address getIpv4Dst();
    TransportPort getTcpSrc();
    TransportPort getTcpDst();
    OFVersion getVersion();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends Match.Builder {
        OFMatchV1 build();
        int getWildcards();
        Builder setWildcards(int wildcards);
        OFPort getInPort();
        Builder setInPort(OFPort inPort);
        MacAddress getEthSrc();
        Builder setEthSrc(MacAddress ethSrc);
        MacAddress getEthDst();
        Builder setEthDst(MacAddress ethDst);
        OFVlanVidMatch getVlanVid();
        Builder setVlanVid(OFVlanVidMatch vlanVid);
        VlanPcp getVlanPcp();
        Builder setVlanPcp(VlanPcp vlanPcp);
        EthType getEthType();
        Builder setEthType(EthType ethType);
        IpDscp getIpDscp();
        Builder setIpDscp(IpDscp ipDscp);
        IpProtocol getIpProto();
        Builder setIpProto(IpProtocol ipProto);
        IPv4Address getIpv4Src();
        Builder setIpv4Src(IPv4Address ipv4Src);
        IPv4Address getIpv4Dst();
        Builder setIpv4Dst(IPv4Address ipv4Dst);
        TransportPort getTcpSrc();
        Builder setTcpSrc(TransportPort tcpSrc);
        TransportPort getTcpDst();
        Builder setTcpDst(TransportPort tcpDst);
        OFVersion getVersion();
    }
}
