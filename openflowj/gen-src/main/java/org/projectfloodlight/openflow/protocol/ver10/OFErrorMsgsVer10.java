// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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


public class OFErrorMsgsVer10 implements OFErrorMsgs {
    public final static OFErrorMsgsVer10 INSTANCE = new OFErrorMsgsVer10();

    private final XidGenerator xidGenerator = XidGenerators.global();



    public OFBadActionErrorMsg.Builder buildBadActionErrorMsg() {
        return new OFBadActionErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFBadRequestErrorMsg.Builder buildBadRequestErrorMsg() {
        return new OFBadRequestErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFFlowModFailedErrorMsg.Builder buildFlowModFailedErrorMsg() {
        return new OFFlowModFailedErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFHelloFailedErrorMsg.Builder buildHelloFailedErrorMsg() {
        return new OFHelloFailedErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFPortModFailedErrorMsg.Builder buildPortModFailedErrorMsg() {
        return new OFPortModFailedErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFQueueOpFailedErrorMsg.Builder buildQueueOpFailedErrorMsg() {
        return new OFQueueOpFailedErrorMsgVer10.Builder().setXid(nextXid());
    }

    public OFBadInstructionErrorMsg.Builder buildBadInstructionErrorMsg() {
        throw new UnsupportedOperationException("OFBadInstructionErrorMsg not supported in version 1.0");
    }

    public OFBadMatchErrorMsg.Builder buildBadMatchErrorMsg() {
        throw new UnsupportedOperationException("OFBadMatchErrorMsg not supported in version 1.0");
    }

    public OFGroupModFailedErrorMsg.Builder buildGroupModFailedErrorMsg() {
        throw new UnsupportedOperationException("OFGroupModFailedErrorMsg not supported in version 1.0");
    }

    public OFSwitchConfigFailedErrorMsg.Builder buildSwitchConfigFailedErrorMsg() {
        throw new UnsupportedOperationException("OFSwitchConfigFailedErrorMsg not supported in version 1.0");
    }

    public OFTableModFailedErrorMsg.Builder buildTableModFailedErrorMsg() {
        throw new UnsupportedOperationException("OFTableModFailedErrorMsg not supported in version 1.0");
    }

    public OFRoleRequestFailedErrorMsg.Builder buildRoleRequestFailedErrorMsg() {
        throw new UnsupportedOperationException("OFRoleRequestFailedErrorMsg not supported in version 1.0");
    }

    public OFBsnError.Builder buildBsnError() {
        throw new UnsupportedOperationException("OFBsnError not supported in version 1.0");
    }

    public OFBsnGentableError.Builder buildBsnGentableError() {
        throw new UnsupportedOperationException("OFBsnGentableError not supported in version 1.0");
    }

    public OFMeterModFailedErrorMsg.Builder buildMeterModFailedErrorMsg() {
        throw new UnsupportedOperationException("OFMeterModFailedErrorMsg not supported in version 1.0");
    }

    public OFTableFeaturesFailedErrorMsg.Builder buildTableFeaturesFailedErrorMsg() {
        throw new UnsupportedOperationException("OFTableFeaturesFailedErrorMsg not supported in version 1.0");
    }

    public OFAsyncConfigFailedErrorMsg.Builder buildAsyncConfigFailedErrorMsg() {
        throw new UnsupportedOperationException("OFAsyncConfigFailedErrorMsg not supported in version 1.0");
    }

    public OFBadPropertyErrorMsg.Builder buildBadPropertyErrorMsg() {
        throw new UnsupportedOperationException("OFBadPropertyErrorMsg not supported in version 1.0");
    }

    public OFBundleFailedErrorMsg.Builder buildBundleFailedErrorMsg() {
        throw new UnsupportedOperationException("OFBundleFailedErrorMsg not supported in version 1.0");
    }

    public OFFlowMonitorFailedErrorMsg.Builder buildFlowMonitorFailedErrorMsg() {
        throw new UnsupportedOperationException("OFFlowMonitorFailedErrorMsg not supported in version 1.0");
    }

    public OFMessageReader<OFErrorMsg> getReader() {
        return OFErrorMsgVer10.READER;
    }

    public long nextXid() {
        return xidGenerator.nextXid();
    }

    public OFVersion getVersion() {
            return OFVersion.OF_10;
    }
}
