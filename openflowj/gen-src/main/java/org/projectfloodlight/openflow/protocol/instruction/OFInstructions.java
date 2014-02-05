// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol.instruction;

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
import java.util.List;

public interface OFInstructions {
    // Subfactories

    OFInstructionApplyActions.Builder buildApplyActions() throws UnsupportedOperationException;
    OFInstructionApplyActions applyActions(List<OFAction> actions);
    OFInstructionClearActions clearActions();
    OFInstructionGotoTable.Builder buildGotoTable() throws UnsupportedOperationException;
    OFInstructionGotoTable gotoTable(TableId tableId);
    OFInstructionWriteActions.Builder buildWriteActions() throws UnsupportedOperationException;
    OFInstructionWriteActions writeActions(List<OFAction> actions);
    OFInstructionWriteMetadata.Builder buildWriteMetadata() throws UnsupportedOperationException;
    OFInstructionWriteMetadata writeMetadata(U64 metadata, U64 metadataMask);
    OFInstructionBsnArpOffload bsnArpOffload();
    OFInstructionBsnDhcpOffload bsnDhcpOffload();
    OFInstructionBsnDisableSrcMacCheck bsnDisableSrcMacCheck();
    OFInstructionMeter.Builder buildMeter() throws UnsupportedOperationException;
    OFInstructionMeter meter(long meterId);

    OFMessageReader<OFInstruction> getReader();
    OFVersion getVersion();
}
