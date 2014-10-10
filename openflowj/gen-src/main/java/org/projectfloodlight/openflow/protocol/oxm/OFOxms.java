// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.oxm;

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

public interface OFOxms {
    // Subfactories

    OFOxmArpOp.Builder buildArpOp() throws UnsupportedOperationException;
    OFOxmArpOp arpOp(ArpOpcode value);
    OFOxmArpOpMasked.Builder buildArpOpMasked() throws UnsupportedOperationException;
    OFOxmArpOpMasked arpOpMasked(ArpOpcode value, ArpOpcode mask);
    OFOxmArpSha.Builder buildArpSha() throws UnsupportedOperationException;
    OFOxmArpSha arpSha(MacAddress value);
    OFOxmArpShaMasked.Builder buildArpShaMasked() throws UnsupportedOperationException;
    OFOxmArpShaMasked arpShaMasked(MacAddress value, MacAddress mask);
    OFOxmArpSpa.Builder buildArpSpa() throws UnsupportedOperationException;
    OFOxmArpSpa arpSpa(IPv4Address value);
    OFOxmArpSpaMasked.Builder buildArpSpaMasked() throws UnsupportedOperationException;
    OFOxmArpSpaMasked arpSpaMasked(IPv4Address value, IPv4Address mask);
    OFOxmArpTha.Builder buildArpTha() throws UnsupportedOperationException;
    OFOxmArpTha arpTha(MacAddress value);
    OFOxmArpThaMasked.Builder buildArpThaMasked() throws UnsupportedOperationException;
    OFOxmArpThaMasked arpThaMasked(MacAddress value, MacAddress mask);
    OFOxmArpTpa.Builder buildArpTpa() throws UnsupportedOperationException;
    OFOxmArpTpa arpTpa(IPv4Address value);
    OFOxmArpTpaMasked.Builder buildArpTpaMasked() throws UnsupportedOperationException;
    OFOxmArpTpaMasked arpTpaMasked(IPv4Address value, IPv4Address mask);
    OFOxmBsnEgrPortGroupId.Builder buildBsnEgrPortGroupId() throws UnsupportedOperationException;
    OFOxmBsnEgrPortGroupId bsnEgrPortGroupId(ClassId value);
    OFOxmBsnEgrPortGroupIdMasked.Builder buildBsnEgrPortGroupIdMasked() throws UnsupportedOperationException;
    OFOxmBsnEgrPortGroupIdMasked bsnEgrPortGroupIdMasked(ClassId value, ClassId mask);
    OFOxmBsnGlobalVrfAllowed.Builder buildBsnGlobalVrfAllowed() throws UnsupportedOperationException;
    OFOxmBsnGlobalVrfAllowed bsnGlobalVrfAllowed(OFBooleanValue value);
    OFOxmBsnGlobalVrfAllowedMasked.Builder buildBsnGlobalVrfAllowedMasked() throws UnsupportedOperationException;
    OFOxmBsnGlobalVrfAllowedMasked bsnGlobalVrfAllowedMasked(OFBooleanValue value, OFBooleanValue mask);
    OFOxmBsnInPorts128.Builder buildBsnInPorts128() throws UnsupportedOperationException;
    OFOxmBsnInPorts128 bsnInPorts128(OFBitMask128 value);
    OFOxmBsnInPorts128Masked.Builder buildBsnInPorts128Masked() throws UnsupportedOperationException;
    OFOxmBsnInPorts128Masked bsnInPorts128Masked(OFBitMask128 value, OFBitMask128 mask);
    OFOxmBsnL3DstClassId.Builder buildBsnL3DstClassId() throws UnsupportedOperationException;
    OFOxmBsnL3DstClassId bsnL3DstClassId(ClassId value);
    OFOxmBsnL3DstClassIdMasked.Builder buildBsnL3DstClassIdMasked() throws UnsupportedOperationException;
    OFOxmBsnL3DstClassIdMasked bsnL3DstClassIdMasked(ClassId value, ClassId mask);
    OFOxmBsnL3InterfaceClassId.Builder buildBsnL3InterfaceClassId() throws UnsupportedOperationException;
    OFOxmBsnL3InterfaceClassId bsnL3InterfaceClassId(ClassId value);
    OFOxmBsnL3InterfaceClassIdMasked.Builder buildBsnL3InterfaceClassIdMasked() throws UnsupportedOperationException;
    OFOxmBsnL3InterfaceClassIdMasked bsnL3InterfaceClassIdMasked(ClassId value, ClassId mask);
    OFOxmBsnL3SrcClassId.Builder buildBsnL3SrcClassId() throws UnsupportedOperationException;
    OFOxmBsnL3SrcClassId bsnL3SrcClassId(ClassId value);
    OFOxmBsnL3SrcClassIdMasked.Builder buildBsnL3SrcClassIdMasked() throws UnsupportedOperationException;
    OFOxmBsnL3SrcClassIdMasked bsnL3SrcClassIdMasked(ClassId value, ClassId mask);
    OFOxmBsnLagId.Builder buildBsnLagId() throws UnsupportedOperationException;
    OFOxmBsnLagId bsnLagId(LagId value);
    OFOxmBsnLagIdMasked.Builder buildBsnLagIdMasked() throws UnsupportedOperationException;
    OFOxmBsnLagIdMasked bsnLagIdMasked(LagId value, LagId mask);
    OFOxmBsnTcpFlags.Builder buildBsnTcpFlags() throws UnsupportedOperationException;
    OFOxmBsnTcpFlags bsnTcpFlags(U16 value);
    OFOxmBsnTcpFlagsMasked.Builder buildBsnTcpFlagsMasked() throws UnsupportedOperationException;
    OFOxmBsnTcpFlagsMasked bsnTcpFlagsMasked(U16 value, U16 mask);
    OFOxmBsnUdf0.Builder buildBsnUdf0() throws UnsupportedOperationException;
    OFOxmBsnUdf0 bsnUdf0(UDF value);
    OFOxmBsnUdf0Masked.Builder buildBsnUdf0Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf0Masked bsnUdf0Masked(UDF value, UDF mask);
    OFOxmBsnUdf1.Builder buildBsnUdf1() throws UnsupportedOperationException;
    OFOxmBsnUdf1 bsnUdf1(UDF value);
    OFOxmBsnUdf1Masked.Builder buildBsnUdf1Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf1Masked bsnUdf1Masked(UDF value, UDF mask);
    OFOxmBsnUdf2.Builder buildBsnUdf2() throws UnsupportedOperationException;
    OFOxmBsnUdf2 bsnUdf2(UDF value);
    OFOxmBsnUdf2Masked.Builder buildBsnUdf2Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf2Masked bsnUdf2Masked(UDF value, UDF mask);
    OFOxmBsnUdf3.Builder buildBsnUdf3() throws UnsupportedOperationException;
    OFOxmBsnUdf3 bsnUdf3(UDF value);
    OFOxmBsnUdf3Masked.Builder buildBsnUdf3Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf3Masked bsnUdf3Masked(UDF value, UDF mask);
    OFOxmBsnUdf4.Builder buildBsnUdf4() throws UnsupportedOperationException;
    OFOxmBsnUdf4 bsnUdf4(UDF value);
    OFOxmBsnUdf4Masked.Builder buildBsnUdf4Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf4Masked bsnUdf4Masked(UDF value, UDF mask);
    OFOxmBsnUdf5.Builder buildBsnUdf5() throws UnsupportedOperationException;
    OFOxmBsnUdf5 bsnUdf5(UDF value);
    OFOxmBsnUdf5Masked.Builder buildBsnUdf5Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf5Masked bsnUdf5Masked(UDF value, UDF mask);
    OFOxmBsnUdf6.Builder buildBsnUdf6() throws UnsupportedOperationException;
    OFOxmBsnUdf6 bsnUdf6(UDF value);
    OFOxmBsnUdf6Masked.Builder buildBsnUdf6Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf6Masked bsnUdf6Masked(UDF value, UDF mask);
    OFOxmBsnUdf7.Builder buildBsnUdf7() throws UnsupportedOperationException;
    OFOxmBsnUdf7 bsnUdf7(UDF value);
    OFOxmBsnUdf7Masked.Builder buildBsnUdf7Masked() throws UnsupportedOperationException;
    OFOxmBsnUdf7Masked bsnUdf7Masked(UDF value, UDF mask);
    OFOxmBsnVlanXlatePortGroupId.Builder buildBsnVlanXlatePortGroupId() throws UnsupportedOperationException;
    OFOxmBsnVlanXlatePortGroupId bsnVlanXlatePortGroupId(ClassId value);
    OFOxmBsnVlanXlatePortGroupIdMasked.Builder buildBsnVlanXlatePortGroupIdMasked() throws UnsupportedOperationException;
    OFOxmBsnVlanXlatePortGroupIdMasked bsnVlanXlatePortGroupIdMasked(ClassId value, ClassId mask);
    OFOxmBsnVrf.Builder buildBsnVrf() throws UnsupportedOperationException;
    OFOxmBsnVrf bsnVrf(VRF value);
    OFOxmBsnVrfMasked.Builder buildBsnVrfMasked() throws UnsupportedOperationException;
    OFOxmBsnVrfMasked bsnVrfMasked(VRF value, VRF mask);
    OFOxmEthDst.Builder buildEthDst() throws UnsupportedOperationException;
    OFOxmEthDst ethDst(MacAddress value);
    OFOxmEthDstMasked.Builder buildEthDstMasked() throws UnsupportedOperationException;
    OFOxmEthDstMasked ethDstMasked(MacAddress value, MacAddress mask);
    OFOxmEthSrc.Builder buildEthSrc() throws UnsupportedOperationException;
    OFOxmEthSrc ethSrc(MacAddress value);
    OFOxmEthSrcMasked.Builder buildEthSrcMasked() throws UnsupportedOperationException;
    OFOxmEthSrcMasked ethSrcMasked(MacAddress value, MacAddress mask);
    OFOxmEthType.Builder buildEthType() throws UnsupportedOperationException;
    OFOxmEthType ethType(EthType value);
    OFOxmEthTypeMasked.Builder buildEthTypeMasked() throws UnsupportedOperationException;
    OFOxmEthTypeMasked ethTypeMasked(EthType value, EthType mask);
    OFOxmIcmpv4Code.Builder buildIcmpv4Code() throws UnsupportedOperationException;
    OFOxmIcmpv4Code icmpv4Code(ICMPv4Code value);
    OFOxmIcmpv4CodeMasked.Builder buildIcmpv4CodeMasked() throws UnsupportedOperationException;
    OFOxmIcmpv4CodeMasked icmpv4CodeMasked(ICMPv4Code value, ICMPv4Code mask);
    OFOxmIcmpv4Type.Builder buildIcmpv4Type() throws UnsupportedOperationException;
    OFOxmIcmpv4Type icmpv4Type(ICMPv4Type value);
    OFOxmIcmpv4TypeMasked.Builder buildIcmpv4TypeMasked() throws UnsupportedOperationException;
    OFOxmIcmpv4TypeMasked icmpv4TypeMasked(ICMPv4Type value, ICMPv4Type mask);
    OFOxmIcmpv6Code.Builder buildIcmpv6Code() throws UnsupportedOperationException;
    OFOxmIcmpv6Code icmpv6Code(U8 value);
    OFOxmIcmpv6CodeMasked.Builder buildIcmpv6CodeMasked() throws UnsupportedOperationException;
    OFOxmIcmpv6CodeMasked icmpv6CodeMasked(U8 value, U8 mask);
    OFOxmIcmpv6Type.Builder buildIcmpv6Type() throws UnsupportedOperationException;
    OFOxmIcmpv6Type icmpv6Type(U8 value);
    OFOxmIcmpv6TypeMasked.Builder buildIcmpv6TypeMasked() throws UnsupportedOperationException;
    OFOxmIcmpv6TypeMasked icmpv6TypeMasked(U8 value, U8 mask);
    OFOxmInPhyPort.Builder buildInPhyPort() throws UnsupportedOperationException;
    OFOxmInPhyPort inPhyPort(OFPort value);
    OFOxmInPhyPortMasked.Builder buildInPhyPortMasked() throws UnsupportedOperationException;
    OFOxmInPhyPortMasked inPhyPortMasked(OFPort value, OFPort mask);
    OFOxmInPort.Builder buildInPort() throws UnsupportedOperationException;
    OFOxmInPort inPort(OFPort value);
    OFOxmInPortMasked.Builder buildInPortMasked() throws UnsupportedOperationException;
    OFOxmInPortMasked inPortMasked(OFPort value, OFPort mask);
    OFOxmIpDscp.Builder buildIpDscp() throws UnsupportedOperationException;
    OFOxmIpDscp ipDscp(IpDscp value);
    OFOxmIpDscpMasked.Builder buildIpDscpMasked() throws UnsupportedOperationException;
    OFOxmIpDscpMasked ipDscpMasked(IpDscp value, IpDscp mask);
    OFOxmIpEcn.Builder buildIpEcn() throws UnsupportedOperationException;
    OFOxmIpEcn ipEcn(IpEcn value);
    OFOxmIpEcnMasked.Builder buildIpEcnMasked() throws UnsupportedOperationException;
    OFOxmIpEcnMasked ipEcnMasked(IpEcn value, IpEcn mask);
    OFOxmIpProto.Builder buildIpProto() throws UnsupportedOperationException;
    OFOxmIpProto ipProto(IpProtocol value);
    OFOxmIpProtoMasked.Builder buildIpProtoMasked() throws UnsupportedOperationException;
    OFOxmIpProtoMasked ipProtoMasked(IpProtocol value, IpProtocol mask);
    OFOxmIpv4Dst.Builder buildIpv4Dst() throws UnsupportedOperationException;
    OFOxmIpv4Dst ipv4Dst(IPv4Address value);
    OFOxmIpv4DstMasked.Builder buildIpv4DstMasked() throws UnsupportedOperationException;
    OFOxmIpv4DstMasked ipv4DstMasked(IPv4Address value, IPv4Address mask);
    OFOxmIpv4Src.Builder buildIpv4Src() throws UnsupportedOperationException;
    OFOxmIpv4Src ipv4Src(IPv4Address value);
    OFOxmIpv4SrcMasked.Builder buildIpv4SrcMasked() throws UnsupportedOperationException;
    OFOxmIpv4SrcMasked ipv4SrcMasked(IPv4Address value, IPv4Address mask);
    OFOxmIpv6Dst.Builder buildIpv6Dst() throws UnsupportedOperationException;
    OFOxmIpv6Dst ipv6Dst(IPv6Address value);
    OFOxmIpv6DstMasked.Builder buildIpv6DstMasked() throws UnsupportedOperationException;
    OFOxmIpv6DstMasked ipv6DstMasked(IPv6Address value, IPv6Address mask);
    OFOxmIpv6Flabel.Builder buildIpv6Flabel() throws UnsupportedOperationException;
    OFOxmIpv6Flabel ipv6Flabel(IPv6FlowLabel value);
    OFOxmIpv6FlabelMasked.Builder buildIpv6FlabelMasked() throws UnsupportedOperationException;
    OFOxmIpv6FlabelMasked ipv6FlabelMasked(IPv6FlowLabel value, IPv6FlowLabel mask);
    OFOxmIpv6NdSll.Builder buildIpv6NdSll() throws UnsupportedOperationException;
    OFOxmIpv6NdSll ipv6NdSll(MacAddress value);
    OFOxmIpv6NdSllMasked.Builder buildIpv6NdSllMasked() throws UnsupportedOperationException;
    OFOxmIpv6NdSllMasked ipv6NdSllMasked(MacAddress value, MacAddress mask);
    OFOxmIpv6NdTarget.Builder buildIpv6NdTarget() throws UnsupportedOperationException;
    OFOxmIpv6NdTarget ipv6NdTarget(IPv6Address value);
    OFOxmIpv6NdTargetMasked.Builder buildIpv6NdTargetMasked() throws UnsupportedOperationException;
    OFOxmIpv6NdTargetMasked ipv6NdTargetMasked(IPv6Address value, IPv6Address mask);
    OFOxmIpv6NdTll.Builder buildIpv6NdTll() throws UnsupportedOperationException;
    OFOxmIpv6NdTll ipv6NdTll(MacAddress value);
    OFOxmIpv6NdTllMasked.Builder buildIpv6NdTllMasked() throws UnsupportedOperationException;
    OFOxmIpv6NdTllMasked ipv6NdTllMasked(MacAddress value, MacAddress mask);
    OFOxmIpv6Src.Builder buildIpv6Src() throws UnsupportedOperationException;
    OFOxmIpv6Src ipv6Src(IPv6Address value);
    OFOxmIpv6SrcMasked.Builder buildIpv6SrcMasked() throws UnsupportedOperationException;
    OFOxmIpv6SrcMasked ipv6SrcMasked(IPv6Address value, IPv6Address mask);
    OFOxmMetadata.Builder buildMetadata() throws UnsupportedOperationException;
    OFOxmMetadata metadata(OFMetadata value);
    OFOxmMetadataMasked.Builder buildMetadataMasked() throws UnsupportedOperationException;
    OFOxmMetadataMasked metadataMasked(OFMetadata value, OFMetadata mask);
    OFOxmMplsLabel.Builder buildMplsLabel() throws UnsupportedOperationException;
    OFOxmMplsLabel mplsLabel(U32 value);
    OFOxmMplsLabelMasked.Builder buildMplsLabelMasked() throws UnsupportedOperationException;
    OFOxmMplsLabelMasked mplsLabelMasked(U32 value, U32 mask);
    OFOxmMplsTc.Builder buildMplsTc() throws UnsupportedOperationException;
    OFOxmMplsTc mplsTc(U8 value);
    OFOxmMplsTcMasked.Builder buildMplsTcMasked() throws UnsupportedOperationException;
    OFOxmMplsTcMasked mplsTcMasked(U8 value, U8 mask);
    OFOxmSctpDst.Builder buildSctpDst() throws UnsupportedOperationException;
    OFOxmSctpDst sctpDst(TransportPort value);
    OFOxmSctpDstMasked.Builder buildSctpDstMasked() throws UnsupportedOperationException;
    OFOxmSctpDstMasked sctpDstMasked(TransportPort value, TransportPort mask);
    OFOxmSctpSrc.Builder buildSctpSrc() throws UnsupportedOperationException;
    OFOxmSctpSrc sctpSrc(TransportPort value);
    OFOxmSctpSrcMasked.Builder buildSctpSrcMasked() throws UnsupportedOperationException;
    OFOxmSctpSrcMasked sctpSrcMasked(TransportPort value, TransportPort mask);
    OFOxmTcpDst.Builder buildTcpDst() throws UnsupportedOperationException;
    OFOxmTcpDst tcpDst(TransportPort value);
    OFOxmTcpDstMasked.Builder buildTcpDstMasked() throws UnsupportedOperationException;
    OFOxmTcpDstMasked tcpDstMasked(TransportPort value, TransportPort mask);
    OFOxmTcpSrc.Builder buildTcpSrc() throws UnsupportedOperationException;
    OFOxmTcpSrc tcpSrc(TransportPort value);
    OFOxmTcpSrcMasked.Builder buildTcpSrcMasked() throws UnsupportedOperationException;
    OFOxmTcpSrcMasked tcpSrcMasked(TransportPort value, TransportPort mask);
    OFOxmUdpDst.Builder buildUdpDst() throws UnsupportedOperationException;
    OFOxmUdpDst udpDst(TransportPort value);
    OFOxmUdpDstMasked.Builder buildUdpDstMasked() throws UnsupportedOperationException;
    OFOxmUdpDstMasked udpDstMasked(TransportPort value, TransportPort mask);
    OFOxmUdpSrc.Builder buildUdpSrc() throws UnsupportedOperationException;
    OFOxmUdpSrc udpSrc(TransportPort value);
    OFOxmUdpSrcMasked.Builder buildUdpSrcMasked() throws UnsupportedOperationException;
    OFOxmUdpSrcMasked udpSrcMasked(TransportPort value, TransportPort mask);
    OFOxmVlanPcp.Builder buildVlanPcp() throws UnsupportedOperationException;
    OFOxmVlanPcp vlanPcp(VlanPcp value);
    OFOxmVlanPcpMasked.Builder buildVlanPcpMasked() throws UnsupportedOperationException;
    OFOxmVlanPcpMasked vlanPcpMasked(VlanPcp value, VlanPcp mask);
    OFOxmVlanVid.Builder buildVlanVid() throws UnsupportedOperationException;
    OFOxmVlanVid vlanVid(OFVlanVidMatch value);
    OFOxmVlanVidMasked.Builder buildVlanVidMasked() throws UnsupportedOperationException;
    OFOxmVlanVidMasked vlanVidMasked(OFVlanVidMatch value, OFVlanVidMatch mask);
    OFOxmMplsBos.Builder buildMplsBos() throws UnsupportedOperationException;
    OFOxmMplsBos mplsBos(OFBooleanValue value);
    OFOxmMplsBosMasked.Builder buildMplsBosMasked() throws UnsupportedOperationException;
    OFOxmMplsBosMasked mplsBosMasked(OFBooleanValue value, OFBooleanValue mask);
    OFOxmTunnelId.Builder buildTunnelId() throws UnsupportedOperationException;
    OFOxmTunnelId tunnelId(U64 value);
    OFOxmTunnelIdMasked.Builder buildTunnelIdMasked() throws UnsupportedOperationException;
    OFOxmTunnelIdMasked tunnelIdMasked(U64 value, U64 mask);

    OFMessageReader<OFOxm<?>> getReader();
    OFVersion getVersion();

    public <F extends OFValueType<F>> OFOxm<F> fromValue(F value, MatchField<F> field);
    public <F extends OFValueType<F>> OFOxm<F> fromValueAndMask(F value, F mask, MatchField<F> field);
    public <F extends OFValueType<F>> OFOxm<F> fromMasked(Masked<F> masked, MatchField<F> field);
}
