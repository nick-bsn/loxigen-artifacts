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
import java.util.Set;


public class OFActionIdsVer13 implements OFActionIds {
    public final static OFActionIdsVer13 INSTANCE = new OFActionIdsVer13();




    public OFActionIdBsnMirror bsnMirror() {
        return OFActionIdBsnMirrorVer13.INSTANCE;
    }

    public OFActionIdBsnSetTunnelDst bsnSetTunnelDst() {
        return OFActionIdBsnSetTunnelDstVer13.INSTANCE;
    }

    public OFActionIdCopyTtlIn copyTtlIn() {
        return OFActionIdCopyTtlInVer13.INSTANCE;
    }

    public OFActionIdCopyTtlOut copyTtlOut() {
        return OFActionIdCopyTtlOutVer13.INSTANCE;
    }

    public OFActionIdDecMplsTtl decMplsTtl() {
        return OFActionIdDecMplsTtlVer13.INSTANCE;
    }

    public OFActionIdDecNwTtl decNwTtl() {
        return OFActionIdDecNwTtlVer13.INSTANCE;
    }

    public OFActionIdGroup group() {
        return OFActionIdGroupVer13.INSTANCE;
    }

    public OFActionIdNiciraDecTtl niciraDecTtl() {
        return OFActionIdNiciraDecTtlVer13.INSTANCE;
    }

    public OFActionIdOutput output() {
        return OFActionIdOutputVer13.INSTANCE;
    }

    public OFActionIdPopMpls popMpls() {
        return OFActionIdPopMplsVer13.INSTANCE;
    }

    public OFActionIdPopPbb popPbb() {
        return OFActionIdPopPbbVer13.INSTANCE;
    }

    public OFActionIdPopVlan popVlan() {
        return OFActionIdPopVlanVer13.INSTANCE;
    }

    public OFActionIdPushMpls pushMpls() {
        return OFActionIdPushMplsVer13.INSTANCE;
    }

    public OFActionIdPushPbb pushPbb() {
        return OFActionIdPushPbbVer13.INSTANCE;
    }

    public OFActionIdPushVlan pushVlan() {
        return OFActionIdPushVlanVer13.INSTANCE;
    }

    public OFActionIdSetField setField() {
        return OFActionIdSetFieldVer13.INSTANCE;
    }

    public OFActionIdSetMplsTtl setMplsTtl() {
        return OFActionIdSetMplsTtlVer13.INSTANCE;
    }

    public OFActionIdSetNwTtl setNwTtl() {
        return OFActionIdSetNwTtlVer13.INSTANCE;
    }

    public OFActionIdSetQueue setQueue() {
        return OFActionIdSetQueueVer13.INSTANCE;
    }

    public OFMessageReader<OFActionId> getReader() {
        return OFActionIdVer13.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_13;
    }
}
