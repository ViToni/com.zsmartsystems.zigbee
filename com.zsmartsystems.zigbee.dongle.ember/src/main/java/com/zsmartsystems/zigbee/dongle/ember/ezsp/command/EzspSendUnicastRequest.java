/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberApsFrame;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberOutgoingMessageType;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>sendUnicast</b>.
 * <p>
 * Sends a unicast message as per the ZigBee specification. The message will arrive at its
 * destination only if there is a known route to the destination node. Setting the
 * ENABLE_ROUTE_DISCOVERY option will cause a route to be discovered if none is known. Setting
 * the FORCE_ROUTE_DISCOVERY option will force route discovery. Routes to end-device
 * children of the local node are always known. Setting the APS_RETRY option will cause the
 * message to be retransmitted until either a matching acknowledgement is received or three
 * transmissions have been made.
 * <p>
 * <b>Note:</b> Using the FORCE_ROUTE_DISCOVERY option will cause the first
 * transmission to be consumed by a route request as part of discovery, so the application
 * payload of this packet will not reach its destination on the first attempt. If you want the
 * packet to reach its destination, the APS_RETRY option must be set so that another attempt is
 * made to transmit the message with its application payload after the route has been
 * constructed.
 * <p>
 * <b>Note:</b> When sending fragmented messages, the stack will only assign a new APS
 * sequence number for the first fragment of the message (i.e., EMBER_APS_OPTION_FRAGMENT is
 * set and the low-order byte of the groupId field in the APS frame is zero). For all subsequent
 * fragments of the same message, the application must set the sequence number field in the APS
 * frame to the sequence number assigned by the stack to the first fragment.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspSendUnicastRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0x34;

    /**
     * Specifies the outgoing message type. Must be one of EMBER_OUTGOING_DIRECT,
     * EMBER_OUTGOING_VIA_ADDRESS_TABLE, or EMBER_OUTGOING_VIA_BINDING.
     * <p>
     * EZSP type is <i>EmberOutgoingMessageType</i> - Java type is {@link EmberOutgoingMessageType}
     */
    private EmberOutgoingMessageType type;

    /**
     * Depending on the type of addressing used, this is either the EmberNodeId of the destination,
     * an index into the address table, or an index into the binding table.
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     */
    private int indexOrDestination;

    /**
     * The APS frame which is to be added to the message.
     * <p>
     * EZSP type is <i>EmberApsFrame</i> - Java type is {@link EmberApsFrame}
     */
    private EmberApsFrame apsFrame;

    /**
     * A value chosen by the Host. This value is used in the ezspMessageSentHandler response to
     * refer to this message.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int messageTag;

    /**
     * Content of the message.
     * <p>
     * EZSP type is <i>uint8_t[]</i> - Java type is {@link int[]}
     */
    private int[] messageContents;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspSendUnicastRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * Specifies the outgoing message type. Must be one of EMBER_OUTGOING_DIRECT,
     * EMBER_OUTGOING_VIA_ADDRESS_TABLE, or EMBER_OUTGOING_VIA_BINDING.
     * <p>
     * EZSP type is <i>EmberOutgoingMessageType</i> - Java type is {@link EmberOutgoingMessageType}
     *
     * @return the current type as {@link EmberOutgoingMessageType}
     */
    public EmberOutgoingMessageType getType() {
        return type;
    }

    /**
     * Specifies the outgoing message type. Must be one of EMBER_OUTGOING_DIRECT,
     * EMBER_OUTGOING_VIA_ADDRESS_TABLE, or EMBER_OUTGOING_VIA_BINDING.
     *
     * @param type the type to set as {@link EmberOutgoingMessageType}
     */
    public void setType(EmberOutgoingMessageType type) {
        this.type = type;
    }

    /**
     * Depending on the type of addressing used, this is either the EmberNodeId of the destination,
     * an index into the address table, or an index into the binding table.
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     *
     * @return the current indexOrDestination as {@link int}
     */
    public int getIndexOrDestination() {
        return indexOrDestination;
    }

    /**
     * Depending on the type of addressing used, this is either the EmberNodeId of the destination,
     * an index into the address table, or an index into the binding table.
     *
     * @param indexOrDestination the indexOrDestination to set as {@link int}
     */
    public void setIndexOrDestination(int indexOrDestination) {
        this.indexOrDestination = indexOrDestination;
    }

    /**
     * The APS frame which is to be added to the message.
     * <p>
     * EZSP type is <i>EmberApsFrame</i> - Java type is {@link EmberApsFrame}
     *
     * @return the current apsFrame as {@link EmberApsFrame}
     */
    public EmberApsFrame getApsFrame() {
        return apsFrame;
    }

    /**
     * The APS frame which is to be added to the message.
     *
     * @param apsFrame the apsFrame to set as {@link EmberApsFrame}
     */
    public void setApsFrame(EmberApsFrame apsFrame) {
        this.apsFrame = apsFrame;
    }

    /**
     * A value chosen by the Host. This value is used in the ezspMessageSentHandler response to
     * refer to this message.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current messageTag as {@link int}
     */
    public int getMessageTag() {
        return messageTag;
    }

    /**
     * A value chosen by the Host. This value is used in the ezspMessageSentHandler response to
     * refer to this message.
     *
     * @param messageTag the messageTag to set as {@link int}
     */
    public void setMessageTag(int messageTag) {
        this.messageTag = messageTag;
    }

    /**
     * Content of the message.
     * <p>
     * EZSP type is <i>uint8_t[]</i> - Java type is {@link int[]}
     *
     * @return the current messageContents as {@link int[]}
     */
    public int[] getMessageContents() {
        return messageContents;
    }

    /**
     * Content of the message.
     *
     * @param messageContents the messageContents to set as {@link int[]}
     */
    public void setMessageContents(int[] messageContents) {
        this.messageContents = messageContents;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeEmberOutgoingMessageType(type);
        serializer.serializeUInt16(indexOrDestination);
        serializer.serializeEmberApsFrame(apsFrame);
        serializer.serializeUInt8(messageTag);
        serializer.serializeUInt8(messageContents.length);
        serializer.serializeUInt8Array(messageContents);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(175);
        builder.append("EzspSendUnicastRequest [type=");
        builder.append(type);
        builder.append(", indexOrDestination=");
        builder.append(indexOrDestination);
        builder.append(", apsFrame=");
        builder.append(apsFrame);
        builder.append(", messageTag=");
        builder.append(String.format("%02X", messageTag));
        builder.append(", messageContents=");
        for (int c = 0; c < messageContents.length; c++) {
            if (c > 0) {
                builder.append(' ');
            }
            builder.append(String.format("%02X", messageContents[c]));
        }
        builder.append(']');
        return builder.toString();
    }
}
