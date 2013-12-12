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

public enum OFPortFeatures {
     PF_10MB_HD(PortSpeed.SPEED_10MB),
     PF_10MB_FD(PortSpeed.SPEED_10MB),
     PF_100MB_HD(PortSpeed.SPEED_100MB),
     PF_100MB_FD(PortSpeed.SPEED_100MB),
     PF_1GB_HD(PortSpeed.SPEED_1GB),
     PF_1GB_FD(PortSpeed.SPEED_1GB),
     PF_10GB_FD(PortSpeed.SPEED_10GB),
     PF_COPPER(PortSpeed.SPEED_NONE),
     PF_FIBER(PortSpeed.SPEED_NONE),
     PF_AUTONEG(PortSpeed.SPEED_NONE),
     PF_PAUSE(PortSpeed.SPEED_NONE),
     PF_PAUSE_ASYM(PortSpeed.SPEED_NONE),
     PF_40GB_FD(PortSpeed.SPEED_40GB),
     PF_100GB_FD(PortSpeed.SPEED_100GB),
     PF_1TB_FD(PortSpeed.SPEED_1TB),
     PF_OTHER(PortSpeed.SPEED_NONE);

     private final PortSpeed portSpeed;

     private OFPortFeatures(PortSpeed portSpeed) {
        this.portSpeed = portSpeed;
     }

     public PortSpeed getPortSpeed() {
         return portSpeed;
     }
}
