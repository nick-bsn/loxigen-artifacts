// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
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
import java.util.Set;
import java.util.List;


public class OFBsnTlvsVer13 implements OFBsnTlvs {
    public final static OFBsnTlvsVer13 INSTANCE = new OFBsnTlvsVer13();




    public OFBsnTlvActorKey.Builder buildActorKey() {
        return new OFBsnTlvActorKeyVer13.Builder();
    }
    public OFBsnTlvActorKey actorKey(int value) {
        return new OFBsnTlvActorKeyVer13(
                value
                    );
    }

    public OFBsnTlvActorPortNum.Builder buildActorPortNum() {
        return new OFBsnTlvActorPortNumVer13.Builder();
    }
    public OFBsnTlvActorPortNum actorPortNum(int value) {
        return new OFBsnTlvActorPortNumVer13(
                value
                    );
    }

    public OFBsnTlvActorPortPriority.Builder buildActorPortPriority() {
        return new OFBsnTlvActorPortPriorityVer13.Builder();
    }
    public OFBsnTlvActorPortPriority actorPortPriority(int value) {
        return new OFBsnTlvActorPortPriorityVer13(
                value
                    );
    }

    public OFBsnTlvActorState.Builder buildActorState() {
        return new OFBsnTlvActorStateVer13.Builder();
    }
    public OFBsnTlvActorState actorState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvActorStateVer13(
                value
                    );
    }

    public OFBsnTlvActorSystemMac.Builder buildActorSystemMac() {
        return new OFBsnTlvActorSystemMacVer13.Builder();
    }
    public OFBsnTlvActorSystemMac actorSystemMac(MacAddress value) {
        return new OFBsnTlvActorSystemMacVer13(
                value
                    );
    }

    public OFBsnTlvActorSystemPriority.Builder buildActorSystemPriority() {
        return new OFBsnTlvActorSystemPriorityVer13.Builder();
    }
    public OFBsnTlvActorSystemPriority actorSystemPriority(int value) {
        return new OFBsnTlvActorSystemPriorityVer13(
                value
                    );
    }

    public OFBsnTlvAnchor.Builder buildAnchor() {
        return new OFBsnTlvAnchorVer13.Builder();
    }
    public OFBsnTlvAnchor anchor(OFBsnAnchor value) {
        return new OFBsnTlvAnchorVer13(
                value
                    );
    }

    public OFBsnTlvApplyBytes.Builder buildApplyBytes() {
        return new OFBsnTlvApplyBytesVer13.Builder();
    }
    public OFBsnTlvApplyBytes applyBytes(U64 value) {
        return new OFBsnTlvApplyBytesVer13(
                value
                    );
    }

    public OFBsnTlvApplyPackets.Builder buildApplyPackets() {
        return new OFBsnTlvApplyPacketsVer13.Builder();
    }
    public OFBsnTlvApplyPackets applyPackets(U64 value) {
        return new OFBsnTlvApplyPacketsVer13(
                value
                    );
    }

    public OFBsnTlvBroadcastQueryTimeout.Builder buildBroadcastQueryTimeout() {
        return new OFBsnTlvBroadcastQueryTimeoutVer13.Builder();
    }
    public OFBsnTlvBroadcastQueryTimeout broadcastQueryTimeout(long value) {
        return new OFBsnTlvBroadcastQueryTimeoutVer13(
                value
                    );
    }

    public OFBsnTlvBroadcastRate.Builder buildBroadcastRate() {
        return new OFBsnTlvBroadcastRateVer13.Builder();
    }
    public OFBsnTlvBroadcastRate broadcastRate(long value) {
        return new OFBsnTlvBroadcastRateVer13(
                value
                    );
    }

    public OFBsnTlvBucket.Builder buildBucket() {
        return new OFBsnTlvBucketVer13.Builder();
    }
    public OFBsnTlvBucket bucket(List<OFBsnTlv> value) {
        return new OFBsnTlvBucketVer13(
                value
                    );
    }

    public OFBsnTlvCircuitId.Builder buildCircuitId() {
        return new OFBsnTlvCircuitIdVer13.Builder();
    }
    public OFBsnTlvCircuitId circuitId(byte[] value) {
        return new OFBsnTlvCircuitIdVer13(
                value
                    );
    }

    public OFBsnTlvConvergenceStatus.Builder buildConvergenceStatus() {
        return new OFBsnTlvConvergenceStatusVer13.Builder();
    }
    public OFBsnTlvConvergenceStatus convergenceStatus(short value) {
        return new OFBsnTlvConvergenceStatusVer13(
                value
                    );
    }

    public OFBsnTlvCpuLag cpuLag() {
        return OFBsnTlvCpuLagVer13.INSTANCE;
    }

    public OFBsnTlvCrcEnabled.Builder buildCrcEnabled() {
        return new OFBsnTlvCrcEnabledVer13.Builder();
    }
    public OFBsnTlvCrcEnabled crcEnabled(short value) {
        return new OFBsnTlvCrcEnabledVer13(
                value
                    );
    }

    public OFBsnTlvData.Builder buildData() {
        return new OFBsnTlvDataVer13.Builder();
    }
    public OFBsnTlvData data(byte[] value) {
        return new OFBsnTlvDataVer13(
                value
                    );
    }

    public OFBsnTlvDecap.Builder buildDecap() {
        return new OFBsnTlvDecapVer13.Builder();
    }
    public OFBsnTlvDecap decap(OFBsnDecap value) {
        return new OFBsnTlvDecapVer13(
                value
                    );
    }

    public OFBsnTlvDisableSrcMacCheck disableSrcMacCheck() {
        return OFBsnTlvDisableSrcMacCheckVer13.INSTANCE;
    }

    public OFBsnTlvDrop drop() {
        return OFBsnTlvDropVer13.INSTANCE;
    }

    public OFBsnTlvDscp.Builder buildDscp() {
        return new OFBsnTlvDscpVer13.Builder();
    }
    public OFBsnTlvDscp dscp(int value) {
        return new OFBsnTlvDscpVer13(
                value
                    );
    }

    public OFBsnTlvEcn.Builder buildEcn() {
        return new OFBsnTlvEcnVer13.Builder();
    }
    public OFBsnTlvEcn ecn(short value) {
        return new OFBsnTlvEcnVer13(
                value
                    );
    }

    public OFBsnTlvEthDst.Builder buildEthDst() {
        return new OFBsnTlvEthDstVer13.Builder();
    }
    public OFBsnTlvEthDst ethDst(MacAddress value) {
        return new OFBsnTlvEthDstVer13(
                value
                    );
    }

    public OFBsnTlvEthSrc.Builder buildEthSrc() {
        return new OFBsnTlvEthSrcVer13.Builder();
    }
    public OFBsnTlvEthSrc ethSrc(MacAddress value) {
        return new OFBsnTlvEthSrcVer13(
                value
                    );
    }

    public OFBsnTlvEthType.Builder buildEthType() {
        return new OFBsnTlvEthTypeVer13.Builder();
    }
    public OFBsnTlvEthType ethType(int value) {
        return new OFBsnTlvEthTypeVer13(
                value
                    );
    }

    public OFBsnTlvExternalGatewayIp.Builder buildExternalGatewayIp() {
        return new OFBsnTlvExternalGatewayIpVer13.Builder();
    }
    public OFBsnTlvExternalGatewayIp externalGatewayIp(IPv4Address value) {
        return new OFBsnTlvExternalGatewayIpVer13(
                value
                    );
    }

    public OFBsnTlvExternalGatewayMac.Builder buildExternalGatewayMac() {
        return new OFBsnTlvExternalGatewayMacVer13.Builder();
    }
    public OFBsnTlvExternalGatewayMac externalGatewayMac(MacAddress value) {
        return new OFBsnTlvExternalGatewayMacVer13(
                value
                    );
    }

    public OFBsnTlvExternalIp.Builder buildExternalIp() {
        return new OFBsnTlvExternalIpVer13.Builder();
    }
    public OFBsnTlvExternalIp externalIp(IPv4Address value) {
        return new OFBsnTlvExternalIpVer13(
                value
                    );
    }

    public OFBsnTlvExternalMac.Builder buildExternalMac() {
        return new OFBsnTlvExternalMacVer13.Builder();
    }
    public OFBsnTlvExternalMac externalMac(MacAddress value) {
        return new OFBsnTlvExternalMacVer13(
                value
                    );
    }

    public OFBsnTlvExternalNetmask.Builder buildExternalNetmask() {
        return new OFBsnTlvExternalNetmaskVer13.Builder();
    }
    public OFBsnTlvExternalNetmask externalNetmask(IPv4Address value) {
        return new OFBsnTlvExternalNetmaskVer13(
                value
                    );
    }

    public OFBsnTlvGenerationId.Builder buildGenerationId() {
        return new OFBsnTlvGenerationIdVer13.Builder();
    }
    public OFBsnTlvGenerationId generationId(U64 value) {
        return new OFBsnTlvGenerationIdVer13(
                value
                    );
    }

    public OFBsnTlvHashGtpHeaderMatch.Builder buildHashGtpHeaderMatch() {
        return new OFBsnTlvHashGtpHeaderMatchVer13.Builder();
    }
    public OFBsnTlvHashGtpHeaderMatch hashGtpHeaderMatch(short firstHeaderByte, short firstHeaderMask) {
        return new OFBsnTlvHashGtpHeaderMatchVer13(
                firstHeaderByte,
                      firstHeaderMask
                    );
    }

    public OFBsnTlvHashGtpPortMatch.Builder buildHashGtpPortMatch() {
        return new OFBsnTlvHashGtpPortMatchVer13.Builder();
    }

    public OFBsnTlvHashPacketField.Builder buildHashPacketField() {
        return new OFBsnTlvHashPacketFieldVer13.Builder();
    }
    public OFBsnTlvHashPacketField hashPacketField(Set<OFBsnHashPacketField> value) {
        return new OFBsnTlvHashPacketFieldVer13(
                value
                    );
    }

    public OFBsnTlvHashPacketType.Builder buildHashPacketType() {
        return new OFBsnTlvHashPacketTypeVer13.Builder();
    }
    public OFBsnTlvHashPacketType hashPacketType(OFBsnHashPacketType value) {
        return new OFBsnTlvHashPacketTypeVer13(
                value
                    );
    }

    public OFBsnTlvHashSeed.Builder buildHashSeed() {
        return new OFBsnTlvHashSeedVer13.Builder();
    }
    public OFBsnTlvHashSeed hashSeed(long seed1, long seed2) {
        return new OFBsnTlvHashSeedVer13(
                seed1,
                      seed2
                    );
    }

    public OFBsnTlvHashType.Builder buildHashType() {
        return new OFBsnTlvHashTypeVer13.Builder();
    }
    public OFBsnTlvHashType hashType(OFBsnHashType value) {
        return new OFBsnTlvHashTypeVer13(
                value
                    );
    }

    public OFBsnTlvHeaderSize.Builder buildHeaderSize() {
        return new OFBsnTlvHeaderSizeVer13.Builder();
    }
    public OFBsnTlvHeaderSize headerSize(long value) {
        return new OFBsnTlvHeaderSizeVer13(
                value
                    );
    }

    public OFBsnTlvIcmpCode.Builder buildIcmpCode() {
        return new OFBsnTlvIcmpCodeVer13.Builder();
    }
    public OFBsnTlvIcmpCode icmpCode(short value) {
        return new OFBsnTlvIcmpCodeVer13(
                value
                    );
    }

    public OFBsnTlvIcmpId.Builder buildIcmpId() {
        return new OFBsnTlvIcmpIdVer13.Builder();
    }
    public OFBsnTlvIcmpId icmpId(int value) {
        return new OFBsnTlvIcmpIdVer13(
                value
                    );
    }

    public OFBsnTlvIcmpType.Builder buildIcmpType() {
        return new OFBsnTlvIcmpTypeVer13.Builder();
    }
    public OFBsnTlvIcmpType icmpType(short value) {
        return new OFBsnTlvIcmpTypeVer13(
                value
                    );
    }

    public OFBsnTlvIcmpv6Chksum.Builder buildIcmpv6Chksum() {
        return new OFBsnTlvIcmpv6ChksumVer13.Builder();
    }
    public OFBsnTlvIcmpv6Chksum icmpv6Chksum(int value) {
        return new OFBsnTlvIcmpv6ChksumVer13(
                value
                    );
    }

    public OFBsnTlvIdleNotification idleNotification() {
        return OFBsnTlvIdleNotificationVer13.INSTANCE;
    }

    public OFBsnTlvIdleTime.Builder buildIdleTime() {
        return new OFBsnTlvIdleTimeVer13.Builder();
    }
    public OFBsnTlvIdleTime idleTime(U64 value) {
        return new OFBsnTlvIdleTimeVer13(
                value
                    );
    }

    public OFBsnTlvIdleTimeout.Builder buildIdleTimeout() {
        return new OFBsnTlvIdleTimeoutVer13.Builder();
    }
    public OFBsnTlvIdleTimeout idleTimeout(long value) {
        return new OFBsnTlvIdleTimeoutVer13(
                value
                    );
    }

    public OFBsnTlvIgmpSnooping igmpSnooping() {
        return OFBsnTlvIgmpSnoopingVer13.INSTANCE;
    }

    public OFBsnTlvInternalGatewayMac.Builder buildInternalGatewayMac() {
        return new OFBsnTlvInternalGatewayMacVer13.Builder();
    }
    public OFBsnTlvInternalGatewayMac internalGatewayMac(MacAddress value) {
        return new OFBsnTlvInternalGatewayMacVer13(
                value
                    );
    }

    public OFBsnTlvInternalMac.Builder buildInternalMac() {
        return new OFBsnTlvInternalMacVer13.Builder();
    }
    public OFBsnTlvInternalMac internalMac(MacAddress value) {
        return new OFBsnTlvInternalMacVer13(
                value
                    );
    }

    public OFBsnTlvInterval.Builder buildInterval() {
        return new OFBsnTlvIntervalVer13.Builder();
    }
    public OFBsnTlvInterval interval(long value) {
        return new OFBsnTlvIntervalVer13(
                value
                    );
    }

    public OFBsnTlvIpProto.Builder buildIpProto() {
        return new OFBsnTlvIpProtoVer13.Builder();
    }
    public OFBsnTlvIpProto ipProto(short value) {
        return new OFBsnTlvIpProtoVer13(
                value
                    );
    }

    public OFBsnTlvIpv4.Builder buildIpv4() {
        return new OFBsnTlvIpv4Ver13.Builder();
    }
    public OFBsnTlvIpv4 ipv4(IPv4Address value) {
        return new OFBsnTlvIpv4Ver13(
                value
                    );
    }

    public OFBsnTlvIpv4Dst.Builder buildIpv4Dst() {
        return new OFBsnTlvIpv4DstVer13.Builder();
    }
    public OFBsnTlvIpv4Dst ipv4Dst(IPv4Address value) {
        return new OFBsnTlvIpv4DstVer13(
                value
                    );
    }

    public OFBsnTlvIpv4Netmask.Builder buildIpv4Netmask() {
        return new OFBsnTlvIpv4NetmaskVer13.Builder();
    }
    public OFBsnTlvIpv4Netmask ipv4Netmask(IPv4Address value) {
        return new OFBsnTlvIpv4NetmaskVer13(
                value
                    );
    }

    public OFBsnTlvIpv4Src.Builder buildIpv4Src() {
        return new OFBsnTlvIpv4SrcVer13.Builder();
    }
    public OFBsnTlvIpv4Src ipv4Src(IPv4Address value) {
        return new OFBsnTlvIpv4SrcVer13(
                value
                    );
    }

    public OFBsnTlvIpv6.Builder buildIpv6() {
        return new OFBsnTlvIpv6Ver13.Builder();
    }
    public OFBsnTlvIpv6 ipv6(IPv6Address value) {
        return new OFBsnTlvIpv6Ver13(
                value
                    );
    }

    public OFBsnTlvIpv6Dst.Builder buildIpv6Dst() {
        return new OFBsnTlvIpv6DstVer13.Builder();
    }
    public OFBsnTlvIpv6Dst ipv6Dst(IPv6Address value) {
        return new OFBsnTlvIpv6DstVer13(
                value
                    );
    }

    public OFBsnTlvIpv6Prefix.Builder buildIpv6Prefix() {
        return new OFBsnTlvIpv6PrefixVer13.Builder();
    }
    public OFBsnTlvIpv6Prefix ipv6Prefix(IPv6Address value, short prefixLength) {
        return new OFBsnTlvIpv6PrefixVer13(
                value,
                      prefixLength
                    );
    }

    public OFBsnTlvIpv6Src.Builder buildIpv6Src() {
        return new OFBsnTlvIpv6SrcVer13.Builder();
    }
    public OFBsnTlvIpv6Src ipv6Src(IPv6Address value) {
        return new OFBsnTlvIpv6SrcVer13(
                value
                    );
    }

    public OFBsnTlvKnownMulticastRate.Builder buildKnownMulticastRate() {
        return new OFBsnTlvKnownMulticastRateVer13.Builder();
    }
    public OFBsnTlvKnownMulticastRate knownMulticastRate(long value) {
        return new OFBsnTlvKnownMulticastRateVer13(
                value
                    );
    }

    public OFBsnTlvL2MulticastLookup l2MulticastLookup() {
        return OFBsnTlvL2MulticastLookupVer13.INSTANCE;
    }

    public OFBsnTlvL3DstClassId.Builder buildL3DstClassId() {
        return new OFBsnTlvL3DstClassIdVer13.Builder();
    }
    public OFBsnTlvL3DstClassId l3DstClassId(long value) {
        return new OFBsnTlvL3DstClassIdVer13(
                value
                    );
    }

    public OFBsnTlvL3InterfaceClassId.Builder buildL3InterfaceClassId() {
        return new OFBsnTlvL3InterfaceClassIdVer13.Builder();
    }
    public OFBsnTlvL3InterfaceClassId l3InterfaceClassId(long value) {
        return new OFBsnTlvL3InterfaceClassIdVer13(
                value
                    );
    }

    public OFBsnTlvL3SrcClassId.Builder buildL3SrcClassId() {
        return new OFBsnTlvL3SrcClassIdVer13.Builder();
    }
    public OFBsnTlvL3SrcClassId l3SrcClassId(long value) {
        return new OFBsnTlvL3SrcClassIdVer13(
                value
                    );
    }

    public OFBsnTlvLoopbackPort.Builder buildLoopbackPort() {
        return new OFBsnTlvLoopbackPortVer13.Builder();
    }
    public OFBsnTlvLoopbackPort loopbackPort(OFPort value) {
        return new OFBsnTlvLoopbackPortVer13(
                value
                    );
    }

    public OFBsnTlvMac.Builder buildMac() {
        return new OFBsnTlvMacVer13.Builder();
    }
    public OFBsnTlvMac mac(MacAddress value) {
        return new OFBsnTlvMacVer13(
                value
                    );
    }

    public OFBsnTlvMacMask.Builder buildMacMask() {
        return new OFBsnTlvMacMaskVer13.Builder();
    }
    public OFBsnTlvMacMask macMask(MacAddress value) {
        return new OFBsnTlvMacMaskVer13(
                value
                    );
    }

    public OFBsnTlvMcgTypeVxlan mcgTypeVxlan() {
        return OFBsnTlvMcgTypeVxlanVer13.INSTANCE;
    }

    public OFBsnTlvMissPackets.Builder buildMissPackets() {
        return new OFBsnTlvMissPacketsVer13.Builder();
    }
    public OFBsnTlvMissPackets missPackets(U64 value) {
        return new OFBsnTlvMissPacketsVer13(
                value
                    );
    }

    public OFBsnTlvMplsControlWord.Builder buildMplsControlWord() {
        return new OFBsnTlvMplsControlWordVer13.Builder();
    }
    public OFBsnTlvMplsControlWord mplsControlWord(short value) {
        return new OFBsnTlvMplsControlWordVer13(
                value
                    );
    }

    public OFBsnTlvMplsLabel.Builder buildMplsLabel() {
        return new OFBsnTlvMplsLabelVer13.Builder();
    }
    public OFBsnTlvMplsLabel mplsLabel(long value) {
        return new OFBsnTlvMplsLabelVer13(
                value
                    );
    }

    public OFBsnTlvMplsSequenced.Builder buildMplsSequenced() {
        return new OFBsnTlvMplsSequencedVer13.Builder();
    }
    public OFBsnTlvMplsSequenced mplsSequenced(short value) {
        return new OFBsnTlvMplsSequencedVer13(
                value
                    );
    }

    public OFBsnTlvMulticastInterfaceId.Builder buildMulticastInterfaceId() {
        return new OFBsnTlvMulticastInterfaceIdVer13.Builder();
    }
    public OFBsnTlvMulticastInterfaceId multicastInterfaceId(long value) {
        return new OFBsnTlvMulticastInterfaceIdVer13(
                value
                    );
    }

    public OFBsnTlvName.Builder buildName() {
        return new OFBsnTlvNameVer13.Builder();
    }
    public OFBsnTlvName name(byte[] value) {
        return new OFBsnTlvNameVer13(
                value
                    );
    }

    public OFBsnTlvNdpOffload ndpOffload() {
        return OFBsnTlvNdpOffloadVer13.INSTANCE;
    }

    public OFBsnTlvNdpStatic ndpStatic() {
        return OFBsnTlvNdpStaticVer13.INSTANCE;
    }

    public OFBsnTlvNegate negate() {
        return OFBsnTlvNegateVer13.INSTANCE;
    }

    public OFBsnTlvNextHopIpv4.Builder buildNextHopIpv4() {
        return new OFBsnTlvNextHopIpv4Ver13.Builder();
    }
    public OFBsnTlvNextHopIpv4 nextHopIpv4(IPv4Address value) {
        return new OFBsnTlvNextHopIpv4Ver13(
                value
                    );
    }

    public OFBsnTlvNextHopMac.Builder buildNextHopMac() {
        return new OFBsnTlvNextHopMacVer13.Builder();
    }
    public OFBsnTlvNextHopMac nextHopMac(MacAddress value) {
        return new OFBsnTlvNextHopMacVer13(
                value
                    );
    }

    public OFBsnTlvNexthopTypeVxlan nexthopTypeVxlan() {
        return OFBsnTlvNexthopTypeVxlanVer13.INSTANCE;
    }

    public OFBsnTlvOffset.Builder buildOffset() {
        return new OFBsnTlvOffsetVer13.Builder();
    }
    public OFBsnTlvOffset offset(int value) {
        return new OFBsnTlvOffsetVer13(
                value
                    );
    }

    public OFBsnTlvParentPort.Builder buildParentPort() {
        return new OFBsnTlvParentPortVer13.Builder();
    }
    public OFBsnTlvParentPort parentPort(OFPort value) {
        return new OFBsnTlvParentPortVer13(
                value
                    );
    }

    public OFBsnTlvPartnerKey.Builder buildPartnerKey() {
        return new OFBsnTlvPartnerKeyVer13.Builder();
    }
    public OFBsnTlvPartnerKey partnerKey(int value) {
        return new OFBsnTlvPartnerKeyVer13(
                value
                    );
    }

    public OFBsnTlvPartnerPortNum.Builder buildPartnerPortNum() {
        return new OFBsnTlvPartnerPortNumVer13.Builder();
    }
    public OFBsnTlvPartnerPortNum partnerPortNum(int value) {
        return new OFBsnTlvPartnerPortNumVer13(
                value
                    );
    }

    public OFBsnTlvPartnerPortPriority.Builder buildPartnerPortPriority() {
        return new OFBsnTlvPartnerPortPriorityVer13.Builder();
    }
    public OFBsnTlvPartnerPortPriority partnerPortPriority(int value) {
        return new OFBsnTlvPartnerPortPriorityVer13(
                value
                    );
    }

    public OFBsnTlvPartnerState.Builder buildPartnerState() {
        return new OFBsnTlvPartnerStateVer13.Builder();
    }
    public OFBsnTlvPartnerState partnerState(Set<OFBsnLacpState> value) {
        return new OFBsnTlvPartnerStateVer13(
                value
                    );
    }

    public OFBsnTlvPartnerSystemMac.Builder buildPartnerSystemMac() {
        return new OFBsnTlvPartnerSystemMacVer13.Builder();
    }
    public OFBsnTlvPartnerSystemMac partnerSystemMac(MacAddress value) {
        return new OFBsnTlvPartnerSystemMacVer13(
                value
                    );
    }

    public OFBsnTlvPartnerSystemPriority.Builder buildPartnerSystemPriority() {
        return new OFBsnTlvPartnerSystemPriorityVer13.Builder();
    }
    public OFBsnTlvPartnerSystemPriority partnerSystemPriority(int value) {
        return new OFBsnTlvPartnerSystemPriorityVer13(
                value
                    );
    }

    public OFBsnTlvPort.Builder buildPort() {
        return new OFBsnTlvPortVer13.Builder();
    }
    public OFBsnTlvPort port(OFPort value) {
        return new OFBsnTlvPortVer13(
                value
                    );
    }

    public OFBsnTlvPortVxlanMode.Builder buildPortVxlanMode() {
        return new OFBsnTlvPortVxlanModeVer13.Builder();
    }
    public OFBsnTlvPortVxlanMode portVxlanMode(OFBsnPortVxlanMode value) {
        return new OFBsnTlvPortVxlanModeVer13(
                value
                    );
    }

    public OFBsnTlvPriority.Builder buildPriority() {
        return new OFBsnTlvPriorityVer13.Builder();
    }
    public OFBsnTlvPriority priority(long value) {
        return new OFBsnTlvPriorityVer13(
                value
                    );
    }

    public OFBsnTlvPushVlanOnIngress pushVlanOnIngress() {
        return OFBsnTlvPushVlanOnIngressVer13.INSTANCE;
    }

    public OFBsnTlvQosPriority.Builder buildQosPriority() {
        return new OFBsnTlvQosPriorityVer13.Builder();
    }
    public OFBsnTlvQosPriority qosPriority(long value) {
        return new OFBsnTlvQosPriorityVer13(
                value
                    );
    }

    public OFBsnTlvQueueId.Builder buildQueueId() {
        return new OFBsnTlvQueueIdVer13.Builder();
    }
    public OFBsnTlvQueueId queueId(long value) {
        return new OFBsnTlvQueueIdVer13(
                value
                    );
    }

    public OFBsnTlvQueueWeight.Builder buildQueueWeight() {
        return new OFBsnTlvQueueWeightVer13.Builder();
    }
    public OFBsnTlvQueueWeight queueWeight(long value) {
        return new OFBsnTlvQueueWeightVer13(
                value
                    );
    }

    public OFBsnTlvRateLimit.Builder buildRateLimit() {
        return new OFBsnTlvRateLimitVer13.Builder();
    }
    public OFBsnTlvRateLimit rateLimit(long value) {
        return new OFBsnTlvRateLimitVer13(
                value
                    );
    }

    public OFBsnTlvRateUnit.Builder buildRateUnit() {
        return new OFBsnTlvRateUnitVer13.Builder();
    }
    public OFBsnTlvRateUnit rateUnit(OFBsnRateUnit value) {
        return new OFBsnTlvRateUnitVer13(
                value
                    );
    }

    public OFBsnTlvReference.Builder buildReference() {
        return new OFBsnTlvReferenceVer13.Builder();
    }
    public OFBsnTlvReference reference(int tableId, List<OFBsnTlv> key) {
        return new OFBsnTlvReferenceVer13(
                tableId,
                      key
                    );
    }

    public OFBsnTlvReplyPackets.Builder buildReplyPackets() {
        return new OFBsnTlvReplyPacketsVer13.Builder();
    }
    public OFBsnTlvReplyPackets replyPackets(U64 value) {
        return new OFBsnTlvReplyPacketsVer13(
                value
                    );
    }

    public OFBsnTlvRequestPackets.Builder buildRequestPackets() {
        return new OFBsnTlvRequestPacketsVer13.Builder();
    }
    public OFBsnTlvRequestPackets requestPackets(U64 value) {
        return new OFBsnTlvRequestPacketsVer13(
                value
                    );
    }

    public OFBsnTlvRxBytes.Builder buildRxBytes() {
        return new OFBsnTlvRxBytesVer13.Builder();
    }
    public OFBsnTlvRxBytes rxBytes(U64 value) {
        return new OFBsnTlvRxBytesVer13(
                value
                    );
    }

    public OFBsnTlvRxPackets.Builder buildRxPackets() {
        return new OFBsnTlvRxPacketsVer13.Builder();
    }
    public OFBsnTlvRxPackets rxPackets(U64 value) {
        return new OFBsnTlvRxPacketsVer13(
                value
                    );
    }

    public OFBsnTlvSamplingRate.Builder buildSamplingRate() {
        return new OFBsnTlvSamplingRateVer13.Builder();
    }
    public OFBsnTlvSamplingRate samplingRate(long value) {
        return new OFBsnTlvSamplingRateVer13(
                value
                    );
    }

    public OFBsnTlvSetLoopbackMode setLoopbackMode() {
        return OFBsnTlvSetLoopbackModeVer13.INSTANCE;
    }

    public OFBsnTlvStatus.Builder buildStatus() {
        return new OFBsnTlvStatusVer13.Builder();
    }
    public OFBsnTlvStatus status(OFBsnStatus value) {
        return new OFBsnTlvStatusVer13(
                value
                    );
    }

    public OFBsnTlvStripMplsL2OnIngress stripMplsL2OnIngress() {
        return OFBsnTlvStripMplsL2OnIngressVer13.INSTANCE;
    }

    public OFBsnTlvStripMplsL3OnIngress stripMplsL3OnIngress() {
        return OFBsnTlvStripMplsL3OnIngressVer13.INSTANCE;
    }

    public OFBsnTlvStripVlanOnEgress stripVlanOnEgress() {
        return OFBsnTlvStripVlanOnEgressVer13.INSTANCE;
    }

    public OFBsnTlvSubAgentId.Builder buildSubAgentId() {
        return new OFBsnTlvSubAgentIdVer13.Builder();
    }
    public OFBsnTlvSubAgentId subAgentId(long value) {
        return new OFBsnTlvSubAgentIdVer13(
                value
                    );
    }

    public OFBsnTlvTcpDst.Builder buildTcpDst() {
        return new OFBsnTlvTcpDstVer13.Builder();
    }
    public OFBsnTlvTcpDst tcpDst(int value) {
        return new OFBsnTlvTcpDstVer13(
                value
                    );
    }

    public OFBsnTlvTcpFlags.Builder buildTcpFlags() {
        return new OFBsnTlvTcpFlagsVer13.Builder();
    }
    public OFBsnTlvTcpFlags tcpFlags(int value) {
        return new OFBsnTlvTcpFlagsVer13(
                value
                    );
    }

    public OFBsnTlvTcpSrc.Builder buildTcpSrc() {
        return new OFBsnTlvTcpSrcVer13.Builder();
    }
    public OFBsnTlvTcpSrc tcpSrc(int value) {
        return new OFBsnTlvTcpSrcVer13(
                value
                    );
    }

    public OFBsnTlvTtl.Builder buildTtl() {
        return new OFBsnTlvTtlVer13.Builder();
    }
    public OFBsnTlvTtl ttl(int value) {
        return new OFBsnTlvTtlVer13(
                value
                    );
    }

    public OFBsnTlvTxBytes.Builder buildTxBytes() {
        return new OFBsnTlvTxBytesVer13.Builder();
    }
    public OFBsnTlvTxBytes txBytes(U64 value) {
        return new OFBsnTlvTxBytesVer13(
                value
                    );
    }

    public OFBsnTlvTxPackets.Builder buildTxPackets() {
        return new OFBsnTlvTxPacketsVer13.Builder();
    }
    public OFBsnTlvTxPackets txPackets(U64 value) {
        return new OFBsnTlvTxPacketsVer13(
                value
                    );
    }

    public OFBsnTlvUdfAnchor.Builder buildUdfAnchor() {
        return new OFBsnTlvUdfAnchorVer13.Builder();
    }
    public OFBsnTlvUdfAnchor udfAnchor(OFBsnUdfAnchor value) {
        return new OFBsnTlvUdfAnchorVer13(
                value
                    );
    }

    public OFBsnTlvUdfId.Builder buildUdfId() {
        return new OFBsnTlvUdfIdVer13.Builder();
    }
    public OFBsnTlvUdfId udfId(int value) {
        return new OFBsnTlvUdfIdVer13(
                value
                    );
    }

    public OFBsnTlvUdfLength.Builder buildUdfLength() {
        return new OFBsnTlvUdfLengthVer13.Builder();
    }
    public OFBsnTlvUdfLength udfLength(int value) {
        return new OFBsnTlvUdfLengthVer13(
                value
                    );
    }

    public OFBsnTlvUdfOffset.Builder buildUdfOffset() {
        return new OFBsnTlvUdfOffsetVer13.Builder();
    }
    public OFBsnTlvUdfOffset udfOffset(int value) {
        return new OFBsnTlvUdfOffsetVer13(
                value
                    );
    }

    public OFBsnTlvUdpDst.Builder buildUdpDst() {
        return new OFBsnTlvUdpDstVer13.Builder();
    }
    public OFBsnTlvUdpDst udpDst(int value) {
        return new OFBsnTlvUdpDstVer13(
                value
                    );
    }

    public OFBsnTlvUdpSrc.Builder buildUdpSrc() {
        return new OFBsnTlvUdpSrcVer13.Builder();
    }
    public OFBsnTlvUdpSrc udpSrc(int value) {
        return new OFBsnTlvUdpSrcVer13(
                value
                    );
    }

    public OFBsnTlvUint64List.Builder buildUint64List() {
        return new OFBsnTlvUint64ListVer13.Builder();
    }
    public OFBsnTlvUint64List uint64List(List<U64> value) {
        return new OFBsnTlvUint64ListVer13(
                value
                    );
    }

    public OFBsnTlvUnicastQueryTimeout.Builder buildUnicastQueryTimeout() {
        return new OFBsnTlvUnicastQueryTimeoutVer13.Builder();
    }
    public OFBsnTlvUnicastQueryTimeout unicastQueryTimeout(long value) {
        return new OFBsnTlvUnicastQueryTimeoutVer13(
                value
                    );
    }

    public OFBsnTlvUnicastRate.Builder buildUnicastRate() {
        return new OFBsnTlvUnicastRateVer13.Builder();
    }
    public OFBsnTlvUnicastRate unicastRate(long value) {
        return new OFBsnTlvUnicastRateVer13(
                value
                    );
    }

    public OFBsnTlvUnknownMulticastRate.Builder buildUnknownMulticastRate() {
        return new OFBsnTlvUnknownMulticastRateVer13.Builder();
    }
    public OFBsnTlvUnknownMulticastRate unknownMulticastRate(long value) {
        return new OFBsnTlvUnknownMulticastRateVer13(
                value
                    );
    }

    public OFBsnTlvUntagged untagged() {
        return OFBsnTlvUntaggedVer13.INSTANCE;
    }

    public OFBsnTlvUsePacketState.Builder buildUsePacketState() {
        return new OFBsnTlvUsePacketStateVer13.Builder();
    }
    public OFBsnTlvUsePacketState usePacketState(short value) {
        return new OFBsnTlvUsePacketStateVer13(
                value
                    );
    }

    public OFBsnTlvVfi.Builder buildVfi() {
        return new OFBsnTlvVfiVer13.Builder();
    }
    public OFBsnTlvVfi vfi(int value) {
        return new OFBsnTlvVfiVer13(
                value
                    );
    }

    public OFBsnTlvVfpClassId.Builder buildVfpClassId() {
        return new OFBsnTlvVfpClassIdVer13.Builder();
    }
    public OFBsnTlvVfpClassId vfpClassId(long value) {
        return new OFBsnTlvVfpClassIdVer13(
                value
                    );
    }

    public OFBsnTlvVlanMacList.Builder buildVlanMacList() {
        return new OFBsnTlvVlanMacListVer13.Builder();
    }
    public OFBsnTlvVlanMacList vlanMacList(List<OFBsnVlanMac> key) {
        return new OFBsnTlvVlanMacListVer13(
                key
                    );
    }

    public OFBsnTlvVlanPcp.Builder buildVlanPcp() {
        return new OFBsnTlvVlanPcpVer13.Builder();
    }
    public OFBsnTlvVlanPcp vlanPcp(short value) {
        return new OFBsnTlvVlanPcpVer13(
                value
                    );
    }

    public OFBsnTlvVlanVid.Builder buildVlanVid() {
        return new OFBsnTlvVlanVidVer13.Builder();
    }
    public OFBsnTlvVlanVid vlanVid(VlanVid value) {
        return new OFBsnTlvVlanVidVer13(
                value
                    );
    }

    public OFBsnTlvVlanVidMask.Builder buildVlanVidMask() {
        return new OFBsnTlvVlanVidMaskVer13.Builder();
    }
    public OFBsnTlvVlanVidMask vlanVidMask(int value) {
        return new OFBsnTlvVlanVidMaskVer13(
                value
                    );
    }

    public OFBsnTlvVni.Builder buildVni() {
        return new OFBsnTlvVniVer13.Builder();
    }
    public OFBsnTlvVni vni(long value) {
        return new OFBsnTlvVniVer13(
                value
                    );
    }

    public OFBsnTlvVpnKey.Builder buildVpnKey() {
        return new OFBsnTlvVpnKeyVer13.Builder();
    }
    public OFBsnTlvVpnKey vpnKey(long value) {
        return new OFBsnTlvVpnKeyVer13(
                value
                    );
    }

    public OFBsnTlvVrf.Builder buildVrf() {
        return new OFBsnTlvVrfVer13.Builder();
    }
    public OFBsnTlvVrf vrf(long value) {
        return new OFBsnTlvVrfVer13(
                value
                    );
    }

    public OFBsnTlvVxlanEgressLag vxlanEgressLag() {
        return OFBsnTlvVxlanEgressLagVer13.INSTANCE;
    }

    public OFMessageReader<OFBsnTlv> getReader() {
        return OFBsnTlvVer13.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_13;
    }
}
