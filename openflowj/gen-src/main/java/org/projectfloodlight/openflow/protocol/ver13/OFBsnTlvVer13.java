// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;
import java.util.Set;
import java.util.List;

abstract class OFBsnTlvVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;


    public final static OFBsnTlvVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFBsnTlv> {
        @Override
        public OFBsnTlv readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0x2c:
                   // discriminator value 0x2c=0x2c for class OFBsnTlvActorKeyVer13
                   return OFBsnTlvActorKeyVer13.READER.readFrom(bb);
               case (short) 0x2b:
                   // discriminator value 0x2b=0x2b for class OFBsnTlvActorPortNumVer13
                   return OFBsnTlvActorPortNumVer13.READER.readFrom(bb);
               case (short) 0x2a:
                   // discriminator value 0x2a=0x2a for class OFBsnTlvActorPortPriorityVer13
                   return OFBsnTlvActorPortPriorityVer13.READER.readFrom(bb);
               case (short) 0x35:
                   // discriminator value 0x35=0x35 for class OFBsnTlvActorStateVer13
                   return OFBsnTlvActorStateVer13.READER.readFrom(bb);
               case (short) 0x29:
                   // discriminator value 0x29=0x29 for class OFBsnTlvActorSystemMacVer13
                   return OFBsnTlvActorSystemMacVer13.READER.readFrom(bb);
               case (short) 0x28:
                   // discriminator value 0x28=0x28 for class OFBsnTlvActorSystemPriorityVer13
                   return OFBsnTlvActorSystemPriorityVer13.READER.readFrom(bb);
               case (short) 0x51:
                   // discriminator value 0x51=0x51 for class OFBsnTlvAnchorVer13
                   return OFBsnTlvAnchorVer13.READER.readFrom(bb);
               case (short) 0x82:
                   // discriminator value 0x82=0x82 for class OFBsnTlvApplyBytesVer13
                   return OFBsnTlvApplyBytesVer13.READER.readFrom(bb);
               case (short) 0x81:
                   // discriminator value 0x81=0x81 for class OFBsnTlvApplyPacketsVer13
                   return OFBsnTlvApplyPacketsVer13.READER.readFrom(bb);
               case (short) 0x90:
                   // discriminator value 0x90=0x90 for class OFBsnTlvAutoNegotiationVer13
                   return OFBsnTlvAutoNegotiationVer13.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value 0xa=0xa for class OFBsnTlvBroadcastQueryTimeoutVer13
                   return OFBsnTlvBroadcastQueryTimeoutVer13.READER.readFrom(bb);
               case (short) 0x5a:
                   // discriminator value 0x5a=0x5a for class OFBsnTlvBroadcastRateVer13
                   return OFBsnTlvBroadcastRateVer13.READER.readFrom(bb);
               case (short) 0x40:
                   // discriminator value 0x40=0x40 for class OFBsnTlvBucketVer13
                   return OFBsnTlvBucketVer13.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value 0xe=0xe for class OFBsnTlvCircuitIdVer13
                   return OFBsnTlvCircuitIdVer13.READER.readFrom(bb);
               case (short) 0x2d:
                   // discriminator value 0x2d=0x2d for class OFBsnTlvConvergenceStatusVer13
                   return OFBsnTlvConvergenceStatusVer13.READER.readFrom(bb);
               case (short) 0x76:
                   // discriminator value 0x76=0x76 for class OFBsnTlvCpuLagVer13
                   return OFBsnTlvCpuLagVer13.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value 0x16=0x16 for class OFBsnTlvCrcEnabledVer13
                   return OFBsnTlvCrcEnabledVer13.READER.readFrom(bb);
               case (short) 0x37:
                   // discriminator value 0x37=0x37 for class OFBsnTlvDataVer13
                   return OFBsnTlvDataVer13.READER.readFrom(bb);
               case (short) 0x8c:
                   // discriminator value 0x8c=0x8c for class OFBsnTlvDataMaskVer13
                   return OFBsnTlvDataMaskVer13.READER.readFrom(bb);
               case (short) 0x55:
                   // discriminator value 0x55=0x55 for class OFBsnTlvDecapVer13
                   return OFBsnTlvDecapVer13.READER.readFrom(bb);
               case (short) 0x78:
                   // discriminator value 0x78=0x78 for class OFBsnTlvDisableSrcMacCheckVer13
                   return OFBsnTlvDisableSrcMacCheckVer13.READER.readFrom(bb);
               case (short) 0x79:
                   // discriminator value 0x79=0x79 for class OFBsnTlvDropVer13
                   return OFBsnTlvDropVer13.READER.readFrom(bb);
               case (short) 0x70:
                   // discriminator value 0x70=0x70 for class OFBsnTlvDscpVer13
                   return OFBsnTlvDscpVer13.READER.readFrom(bb);
               case (short) 0x84:
                   // discriminator value 0x84=0x84 for class OFBsnTlvEcnVer13
                   return OFBsnTlvEcnVer13.READER.readFrom(bb);
               case (short) 0x89:
                   // discriminator value 0x89=0x89 for class OFBsnTlvEgressOnlyVer13
                   return OFBsnTlvEgressOnlyVer13.READER.readFrom(bb);
               case (short) 0x8b:
                   // discriminator value 0x8b=0x8b for class OFBsnTlvEgressPortGroupIdVer13
                   return OFBsnTlvEgressPortGroupIdVer13.READER.readFrom(bb);
               case (short) 0x8f:
                   // discriminator value 0x8f=0x8f for class OFBsnTlvEnhancedHashCapabilityVer13
                   return OFBsnTlvEnhancedHashCapabilityVer13.READER.readFrom(bb);
               case (short) 0x21:
                   // discriminator value 0x21=0x21 for class OFBsnTlvEthDstVer13
                   return OFBsnTlvEthDstVer13.READER.readFrom(bb);
               case (short) 0x20:
                   // discriminator value 0x20=0x20 for class OFBsnTlvEthSrcVer13
                   return OFBsnTlvEthSrcVer13.READER.readFrom(bb);
               case (short) 0x83:
                   // discriminator value 0x83=0x83 for class OFBsnTlvEthTypeVer13
                   return OFBsnTlvEthTypeVer13.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value 0x1a=0x1a for class OFBsnTlvExternalGatewayIpVer13
                   return OFBsnTlvExternalGatewayIpVer13.READER.readFrom(bb);
               case (short) 0x1d:
                   // discriminator value 0x1d=0x1d for class OFBsnTlvExternalGatewayMacVer13
                   return OFBsnTlvExternalGatewayMacVer13.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value 0x17=0x17 for class OFBsnTlvExternalIpVer13
                   return OFBsnTlvExternalIpVer13.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value 0x18=0x18 for class OFBsnTlvExternalMacVer13
                   return OFBsnTlvExternalMacVer13.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value 0x19=0x19 for class OFBsnTlvExternalNetmaskVer13
                   return OFBsnTlvExternalNetmaskVer13.READER.readFrom(bb);
               case (short) 0x95:
                   // discriminator value 0x95=0x95 for class OFBsnTlvForwardErrorCorrectionVer13
                   return OFBsnTlvForwardErrorCorrectionVer13.READER.readFrom(bb);
               case (short) 0x50:
                   // discriminator value 0x50=0x50 for class OFBsnTlvGenerationIdVer13
                   return OFBsnTlvGenerationIdVer13.READER.readFrom(bb);
               case (short) 0x91:
                   // discriminator value 0x91=0x91 for class OFBsnTlvHashAlgorithmVer13
                   return OFBsnTlvHashAlgorithmVer13.READER.readFrom(bb);
               case (short) 0x68:
                   // discriminator value 0x68=0x68 for class OFBsnTlvHashGtpHeaderMatchVer13
                   return OFBsnTlvHashGtpHeaderMatchVer13.READER.readFrom(bb);
               case (short) 0x69:
                   // discriminator value 0x69=0x69 for class OFBsnTlvHashGtpPortMatchVer13
                   return OFBsnTlvHashGtpPortMatchVer13.READER.readFrom(bb);
               case (short) 0x67:
                   // discriminator value 0x67=0x67 for class OFBsnTlvHashPacketFieldVer13
                   return OFBsnTlvHashPacketFieldVer13.READER.readFrom(bb);
               case (short) 0x66:
                   // discriminator value 0x66=0x66 for class OFBsnTlvHashPacketTypeVer13
                   return OFBsnTlvHashPacketTypeVer13.READER.readFrom(bb);
               case (short) 0x64:
                   // discriminator value 0x64=0x64 for class OFBsnTlvHashSeedVer13
                   return OFBsnTlvHashSeedVer13.READER.readFrom(bb);
               case (short) 0x65:
                   // discriminator value 0x65=0x65 for class OFBsnTlvHashTypeVer13
                   return OFBsnTlvHashTypeVer13.READER.readFrom(bb);
               case (short) 0x1f:
                   // discriminator value 0x1f=0x1f for class OFBsnTlvHeaderSizeVer13
                   return OFBsnTlvHeaderSizeVer13.READER.readFrom(bb);
               case (short) 0x45:
                   // discriminator value 0x45=0x45 for class OFBsnTlvIcmpCodeVer13
                   return OFBsnTlvIcmpCodeVer13.READER.readFrom(bb);
               case (short) 0x46:
                   // discriminator value 0x46=0x46 for class OFBsnTlvIcmpIdVer13
                   return OFBsnTlvIcmpIdVer13.READER.readFrom(bb);
               case (short) 0x44:
                   // discriminator value 0x44=0x44 for class OFBsnTlvIcmpTypeVer13
                   return OFBsnTlvIcmpTypeVer13.READER.readFrom(bb);
               case (short) 0x7d:
                   // discriminator value 0x7d=0x7d for class OFBsnTlvIcmpv6ChksumVer13
                   return OFBsnTlvIcmpv6ChksumVer13.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value 0x7=0x7 for class OFBsnTlvIdleNotificationVer13
                   return OFBsnTlvIdleNotificationVer13.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value 0x5=0x5 for class OFBsnTlvIdleTimeVer13
                   return OFBsnTlvIdleTimeVer13.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value 0x8=0x8 for class OFBsnTlvIdleTimeoutVer13
                   return OFBsnTlvIdleTimeoutVer13.READER.readFrom(bb);
               case (short) 0x4e:
                   // discriminator value 0x4e=0x4e for class OFBsnTlvIgmpSnoopingVer13
                   return OFBsnTlvIgmpSnoopingVer13.READER.readFrom(bb);
               case (short) 0x8a:
                   // discriminator value 0x8a=0x8a for class OFBsnTlvIngressPortGroupIdVer13
                   return OFBsnTlvIngressPortGroupIdVer13.READER.readFrom(bb);
               case (short) 0x1c:
                   // discriminator value 0x1c=0x1c for class OFBsnTlvInternalGatewayMacVer13
                   return OFBsnTlvInternalGatewayMacVer13.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value 0x1b=0x1b for class OFBsnTlvInternalMacVer13
                   return OFBsnTlvInternalMacVer13.READER.readFrom(bb);
               case (short) 0x3a:
                   // discriminator value 0x3a=0x3a for class OFBsnTlvIntervalVer13
                   return OFBsnTlvIntervalVer13.READER.readFrom(bb);
               case (short) 0x43:
                   // discriminator value 0x43=0x43 for class OFBsnTlvIpProtoVer13
                   return OFBsnTlvIpProtoVer13.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value 0x4=0x4 for class OFBsnTlvIpv4Ver13
                   return OFBsnTlvIpv4Ver13.READER.readFrom(bb);
               case (short) 0x23:
                   // discriminator value 0x23=0x23 for class OFBsnTlvIpv4DstVer13
                   return OFBsnTlvIpv4DstVer13.READER.readFrom(bb);
               case (short) 0x3c:
                   // discriminator value 0x3c=0x3c for class OFBsnTlvIpv4NetmaskVer13
                   return OFBsnTlvIpv4NetmaskVer13.READER.readFrom(bb);
               case (short) 0x22:
                   // discriminator value 0x22=0x22 for class OFBsnTlvIpv4SrcVer13
                   return OFBsnTlvIpv4SrcVer13.READER.readFrom(bb);
               case (short) 0x54:
                   // discriminator value 0x54=0x54 for class OFBsnTlvIpv6Ver13
                   return OFBsnTlvIpv6Ver13.READER.readFrom(bb);
               case (short) 0x7f:
                   // discriminator value 0x7f=0x7f for class OFBsnTlvIpv6DstVer13
                   return OFBsnTlvIpv6DstVer13.READER.readFrom(bb);
               case (short) 0x7a:
                   // discriminator value 0x7a=0x7a for class OFBsnTlvIpv6PrefixVer13
                   return OFBsnTlvIpv6PrefixVer13.READER.readFrom(bb);
               case (short) 0x7e:
                   // discriminator value 0x7e=0x7e for class OFBsnTlvIpv6SrcVer13
                   return OFBsnTlvIpv6SrcVer13.READER.readFrom(bb);
               case (short) 0x5b:
                   // discriminator value 0x5b=0x5b for class OFBsnTlvKnownMulticastRateVer13
                   return OFBsnTlvKnownMulticastRateVer13.READER.readFrom(bb);
               case (short) 0x4f:
                   // discriminator value 0x4f=0x4f for class OFBsnTlvL2MulticastLookupVer13
                   return OFBsnTlvL2MulticastLookupVer13.READER.readFrom(bb);
               case (short) 0x88:
                   // discriminator value 0x88=0x88 for class OFBsnTlvL3DstClassIdVer13
                   return OFBsnTlvL3DstClassIdVer13.READER.readFrom(bb);
               case (short) 0x86:
                   // discriminator value 0x86=0x86 for class OFBsnTlvL3InterfaceClassIdVer13
                   return OFBsnTlvL3InterfaceClassIdVer13.READER.readFrom(bb);
               case (short) 0x87:
                   // discriminator value 0x87=0x87 for class OFBsnTlvL3SrcClassIdVer13
                   return OFBsnTlvL3SrcClassIdVer13.READER.readFrom(bb);
               case (short) 0x92:
                   // discriminator value 0x92=0x92 for class OFBsnTlvLoopbackModeVer13
                   return OFBsnTlvLoopbackModeVer13.READER.readFrom(bb);
               case (short) 0x6e:
                   // discriminator value 0x6e=0x6e for class OFBsnTlvLoopbackPortVer13
                   return OFBsnTlvLoopbackPortVer13.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFBsnTlvMacVer13
                   return OFBsnTlvMacVer13.READER.readFrom(bb);
               case (short) 0x38:
                   // discriminator value 0x38=0x38 for class OFBsnTlvMacMaskVer13
                   return OFBsnTlvMacMaskVer13.READER.readFrom(bb);
               case (short) 0x57:
                   // discriminator value 0x57=0x57 for class OFBsnTlvMcgTypeVxlanVer13
                   return OFBsnTlvMcgTypeVxlanVer13.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value 0xd=0xd for class OFBsnTlvMissPacketsVer13
                   return OFBsnTlvMissPacketsVer13.READER.readFrom(bb);
               case (short) 0x3e:
                   // discriminator value 0x3e=0x3e for class OFBsnTlvMplsControlWordVer13
                   return OFBsnTlvMplsControlWordVer13.READER.readFrom(bb);
               case (short) 0x3d:
                   // discriminator value 0x3d=0x3d for class OFBsnTlvMplsLabelVer13
                   return OFBsnTlvMplsLabelVer13.READER.readFrom(bb);
               case (short) 0x3f:
                   // discriminator value 0x3f=0x3f for class OFBsnTlvMplsSequencedVer13
                   return OFBsnTlvMplsSequencedVer13.READER.readFrom(bb);
               case (short) 0x5f:
                   // discriminator value 0x5f=0x5f for class OFBsnTlvMulticastInterfaceIdVer13
                   return OFBsnTlvMulticastInterfaceIdVer13.READER.readFrom(bb);
               case (short) 0x34:
                   // discriminator value 0x34=0x34 for class OFBsnTlvNameVer13
                   return OFBsnTlvNameVer13.READER.readFrom(bb);
               case (short) 0x7b:
                   // discriminator value 0x7b=0x7b for class OFBsnTlvNdpOffloadVer13
                   return OFBsnTlvNdpOffloadVer13.READER.readFrom(bb);
               case (short) 0x7c:
                   // discriminator value 0x7c=0x7c for class OFBsnTlvNdpStaticVer13
                   return OFBsnTlvNdpStaticVer13.READER.readFrom(bb);
               case (short) 0x53:
                   // discriminator value 0x53=0x53 for class OFBsnTlvNegateVer13
                   return OFBsnTlvNegateVer13.READER.readFrom(bb);
               case (short) 0x73:
                   // discriminator value 0x73=0x73 for class OFBsnTlvNextHopIpv4Ver13
                   return OFBsnTlvNextHopIpv4Ver13.READER.readFrom(bb);
               case (short) 0x72:
                   // discriminator value 0x72=0x72 for class OFBsnTlvNextHopMacVer13
                   return OFBsnTlvNextHopMacVer13.READER.readFrom(bb);
               case (short) 0x5e:
                   // discriminator value 0x5e=0x5e for class OFBsnTlvNexthopTypeVxlanVer13
                   return OFBsnTlvNexthopTypeVxlanVer13.READER.readFrom(bb);
               case (short) 0x93:
                   // discriminator value 0x93=0x93 for class OFBsnTlvNoArpResponseVer13
                   return OFBsnTlvNoArpResponseVer13.READER.readFrom(bb);
               case (short) 0x94:
                   // discriminator value 0x94=0x94 for class OFBsnTlvNoNsResponseVer13
                   return OFBsnTlvNoNsResponseVer13.READER.readFrom(bb);
               case (short) 0x52:
                   // discriminator value 0x52=0x52 for class OFBsnTlvOffsetVer13
                   return OFBsnTlvOffsetVer13.READER.readFrom(bb);
               case (short) 0x96:
                   // discriminator value 0x96=0x96 for class OFBsnTlvOpticsAlwaysEnabledVer13
                   return OFBsnTlvOpticsAlwaysEnabledVer13.READER.readFrom(bb);
               case (short) 0x6d:
                   // discriminator value 0x6d=0x6d for class OFBsnTlvParentPortVer13
                   return OFBsnTlvParentPortVer13.READER.readFrom(bb);
               case (short) 0x33:
                   // discriminator value 0x33=0x33 for class OFBsnTlvPartnerKeyVer13
                   return OFBsnTlvPartnerKeyVer13.READER.readFrom(bb);
               case (short) 0x32:
                   // discriminator value 0x32=0x32 for class OFBsnTlvPartnerPortNumVer13
                   return OFBsnTlvPartnerPortNumVer13.READER.readFrom(bb);
               case (short) 0x31:
                   // discriminator value 0x31=0x31 for class OFBsnTlvPartnerPortPriorityVer13
                   return OFBsnTlvPartnerPortPriorityVer13.READER.readFrom(bb);
               case (short) 0x36:
                   // discriminator value 0x36=0x36 for class OFBsnTlvPartnerStateVer13
                   return OFBsnTlvPartnerStateVer13.READER.readFrom(bb);
               case (short) 0x30:
                   // discriminator value 0x30=0x30 for class OFBsnTlvPartnerSystemMacVer13
                   return OFBsnTlvPartnerSystemMacVer13.READER.readFrom(bb);
               case (short) 0x2f:
                   // discriminator value 0x2f=0x2f for class OFBsnTlvPartnerSystemPriorityVer13
                   return OFBsnTlvPartnerSystemPriorityVer13.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFBsnTlvPortVer13
                   return OFBsnTlvPortVer13.READER.readFrom(bb);
               case (short) 0x8d:
                   // discriminator value 0x8d=0x8d for class OFBsnTlvPortUsageVer13
                   return OFBsnTlvPortUsageVer13.READER.readFrom(bb);
               case (short) 0x58:
                   // discriminator value 0x58=0x58 for class OFBsnTlvPortVxlanModeVer13
                   return OFBsnTlvPortVxlanModeVer13.READER.readFrom(bb);
               case (short) 0x39:
                   // discriminator value 0x39=0x39 for class OFBsnTlvPriorityVer13
                   return OFBsnTlvPriorityVer13.READER.readFrom(bb);
               case (short) 0x80:
                   // discriminator value 0x80=0x80 for class OFBsnTlvPushVlanOnIngressVer13
                   return OFBsnTlvPushVlanOnIngressVer13.READER.readFrom(bb);
               case (short) 0x6c:
                   // discriminator value 0x6c=0x6c for class OFBsnTlvQosPriorityVer13
                   return OFBsnTlvQosPriorityVer13.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value 0x14=0x14 for class OFBsnTlvQueueIdVer13
                   return OFBsnTlvQueueIdVer13.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value 0x15=0x15 for class OFBsnTlvQueueWeightVer13
                   return OFBsnTlvQueueWeightVer13.READER.readFrom(bb);
               case (short) 0x74:
                   // discriminator value 0x74=0x74 for class OFBsnTlvRateLimitVer13
                   return OFBsnTlvRateLimitVer13.READER.readFrom(bb);
               case (short) 0x59:
                   // discriminator value 0x59=0x59 for class OFBsnTlvRateUnitVer13
                   return OFBsnTlvRateUnitVer13.READER.readFrom(bb);
               case (short) 0x3b:
                   // discriminator value 0x3b=0x3b for class OFBsnTlvReferenceVer13
                   return OFBsnTlvReferenceVer13.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value 0xc=0xc for class OFBsnTlvReplyPacketsVer13
                   return OFBsnTlvReplyPacketsVer13.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value 0xb=0xb for class OFBsnTlvRequestPacketsVer13
                   return OFBsnTlvRequestPacketsVer13.READER.readFrom(bb);
               case (short) 0x47:
                   // discriminator value 0x47=0x47 for class OFBsnTlvRxBytesVer13
                   return OFBsnTlvRxBytesVer13.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value 0x2=0x2 for class OFBsnTlvRxPacketsVer13
                   return OFBsnTlvRxPacketsVer13.READER.readFrom(bb);
               case (short) 0x1e:
                   // discriminator value 0x1e=0x1e for class OFBsnTlvSamplingRateVer13
                   return OFBsnTlvSamplingRateVer13.READER.readFrom(bb);
               case (short) 0x4a:
                   // discriminator value 0x4a=0x4a for class OFBsnTlvSetLoopbackModeVer13
                   return OFBsnTlvSetLoopbackModeVer13.READER.readFrom(bb);
               case (short) 0x61:
                   // discriminator value 0x61=0x61 for class OFBsnTlvStatusVer13
                   return OFBsnTlvStatusVer13.READER.readFrom(bb);
               case (short) 0x4b:
                   // discriminator value 0x4b=0x4b for class OFBsnTlvStripMplsL2OnIngressVer13
                   return OFBsnTlvStripMplsL2OnIngressVer13.READER.readFrom(bb);
               case (short) 0x4c:
                   // discriminator value 0x4c=0x4c for class OFBsnTlvStripMplsL3OnIngressVer13
                   return OFBsnTlvStripMplsL3OnIngressVer13.READER.readFrom(bb);
               case (short) 0x49:
                   // discriminator value 0x49=0x49 for class OFBsnTlvStripVlanOnEgressVer13
                   return OFBsnTlvStripVlanOnEgressVer13.READER.readFrom(bb);
               case (short) 0x26:
                   // discriminator value 0x26=0x26 for class OFBsnTlvSubAgentIdVer13
                   return OFBsnTlvSubAgentIdVer13.READER.readFrom(bb);
               case (short) 0x42:
                   // discriminator value 0x42=0x42 for class OFBsnTlvTcpDstVer13
                   return OFBsnTlvTcpDstVer13.READER.readFrom(bb);
               case (short) 0x85:
                   // discriminator value 0x85=0x85 for class OFBsnTlvTcpFlagsVer13
                   return OFBsnTlvTcpFlagsVer13.READER.readFrom(bb);
               case (short) 0x41:
                   // discriminator value 0x41=0x41 for class OFBsnTlvTcpSrcVer13
                   return OFBsnTlvTcpSrcVer13.READER.readFrom(bb);
               case (short) 0x71:
                   // discriminator value 0x71=0x71 for class OFBsnTlvTtlVer13
                   return OFBsnTlvTtlVer13.READER.readFrom(bb);
               case (short) 0x8e:
                   // discriminator value 0x8e=0x8e for class OFBsnTlvTunnelCapabilityVer13
                   return OFBsnTlvTunnelCapabilityVer13.READER.readFrom(bb);
               case (short) 0x27:
                   // discriminator value 0x27=0x27 for class OFBsnTlvTxBytesVer13
                   return OFBsnTlvTxBytesVer13.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value 0x3=0x3 for class OFBsnTlvTxPacketsVer13
                   return OFBsnTlvTxPacketsVer13.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value 0x10=0x10 for class OFBsnTlvUdfAnchorVer13
                   return OFBsnTlvUdfAnchorVer13.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value 0xf=0xf for class OFBsnTlvUdfIdVer13
                   return OFBsnTlvUdfIdVer13.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value 0x12=0x12 for class OFBsnTlvUdfLengthVer13
                   return OFBsnTlvUdfLengthVer13.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value 0x11=0x11 for class OFBsnTlvUdfOffsetVer13
                   return OFBsnTlvUdfOffsetVer13.READER.readFrom(bb);
               case (short) 0x25:
                   // discriminator value 0x25=0x25 for class OFBsnTlvUdpDstVer13
                   return OFBsnTlvUdpDstVer13.READER.readFrom(bb);
               case (short) 0x24:
                   // discriminator value 0x24=0x24 for class OFBsnTlvUdpSrcVer13
                   return OFBsnTlvUdpSrcVer13.READER.readFrom(bb);
               case (short) 0x77:
                   // discriminator value 0x77=0x77 for class OFBsnTlvUint64ListVer13
                   return OFBsnTlvUint64ListVer13.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value 0x9=0x9 for class OFBsnTlvUnicastQueryTimeoutVer13
                   return OFBsnTlvUnicastQueryTimeoutVer13.READER.readFrom(bb);
               case (short) 0x5d:
                   // discriminator value 0x5d=0x5d for class OFBsnTlvUnicastRateVer13
                   return OFBsnTlvUnicastRateVer13.READER.readFrom(bb);
               case (short) 0x5c:
                   // discriminator value 0x5c=0x5c for class OFBsnTlvUnknownMulticastRateVer13
                   return OFBsnTlvUnknownMulticastRateVer13.READER.readFrom(bb);
               case (short) 0x6a:
                   // discriminator value 0x6a=0x6a for class OFBsnTlvUntaggedVer13
                   return OFBsnTlvUntaggedVer13.READER.readFrom(bb);
               case (short) 0x60:
                   // discriminator value 0x60=0x60 for class OFBsnTlvUsePacketStateVer13
                   return OFBsnTlvUsePacketStateVer13.READER.readFrom(bb);
               case (short) 0x63:
                   // discriminator value 0x63=0x63 for class OFBsnTlvVfiVer13
                   return OFBsnTlvVfiVer13.READER.readFrom(bb);
               case (short) 0x6b:
                   // discriminator value 0x6b=0x6b for class OFBsnTlvVfpClassIdVer13
                   return OFBsnTlvVfpClassIdVer13.READER.readFrom(bb);
               case (short) 0x62:
                   // discriminator value 0x62=0x62 for class OFBsnTlvVlanMacListVer13
                   return OFBsnTlvVlanMacListVer13.READER.readFrom(bb);
               case (short) 0x48:
                   // discriminator value 0x48=0x48 for class OFBsnTlvVlanPcpVer13
                   return OFBsnTlvVlanPcpVer13.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value 0x6=0x6 for class OFBsnTlvVlanVidVer13
                   return OFBsnTlvVlanVidVer13.READER.readFrom(bb);
               case (short) 0x4d:
                   // discriminator value 0x4d=0x4d for class OFBsnTlvVlanVidMaskVer13
                   return OFBsnTlvVlanVidMaskVer13.READER.readFrom(bb);
               case (short) 0x56:
                   // discriminator value 0x56=0x56 for class OFBsnTlvVniVer13
                   return OFBsnTlvVniVer13.READER.readFrom(bb);
               case (short) 0x6f:
                   // discriminator value 0x6f=0x6f for class OFBsnTlvVpnKeyVer13
                   return OFBsnTlvVpnKeyVer13.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value 0x13=0x13 for class OFBsnTlvVrfVer13
                   return OFBsnTlvVrfVer13.READER.readFrom(bb);
               case (short) 0x75:
                   // discriminator value 0x75=0x75 for class OFBsnTlvVxlanEgressLagVer13
                   return OFBsnTlvVxlanEgressLagVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFBsnTlvVer13: " + type);
            }
        }
    }
}
