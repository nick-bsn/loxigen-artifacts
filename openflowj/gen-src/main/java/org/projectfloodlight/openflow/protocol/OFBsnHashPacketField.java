// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const.java
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

public enum OFBsnHashPacketField {
     BSN_HASH_FIELD_DST_MAC,
     BSN_HASH_FIELD_SRC_MAC,
     BSN_HASH_FIELD_ETH_TYPE,
     BSN_HASH_FIELD_VLAN_ID,
     BSN_HASH_FIELD_INNER_L2,
     BSN_HASH_FIELD_INNER_L3,
     BSN_HASH_FIELD_SRC_IP,
     BSN_HASH_FIELD_DST_IP,
     BSN_HASH_FIELD_IP_PROTO,
     BSN_HASH_FIELD_SRC_L4_PORT,
     BSN_HASH_FIELD_DST_L4_PORT,
     BSN_HASH_FIELD_MPLS_LABEL1,
     BSN_HASH_FIELD_MPLS_LABEL2,
     BSN_HASH_FIELD_MPLS_LABEL3,
     BSN_HASH_FIELD_MPLS_LABEL_HI_BITS,
     BSN_HASH_FIELD_MPLS_PAYLOAD_SRC_IP,
     BSN_HASH_FIELD_MPLS_PAYLOAD_DST_IP,
     BSN_HASH_FIELD_SYMMETRIC;
}
