/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Telegesis Enumeration <b>TelegesisStatusCode</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum TelegesisStatusCode {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * [0] Everything OK - Success
     */
    SUCCESS(0x0000),

    /**
     * [1] Couldn’t poll Parent because of Timeout
     */
    TIMEOUT(0x0001),

    /**
     * [2] Unknown command
     */
    UNKNOWN_COMMAND(0x0002),

    /**
     * [4] Invalid S-Register
     */
    INVALID_S_REGISTER(0x0004),

    /**
     * [5] Invalid parameter
     */
    INVALID_PARAMETER(0x0005),

    /**
     * [6] Recipient could not be reached
     */
    RECIPIENT_UNREACHABLE(0x0006),

    /**
     * [7] Message was not acknowledged
     */
    MESSAGE_NAK(0x0007),

    /**
     * [8] No sink known
     */
    UNKNOWN_SINK(0x0008),

    /**
     * [9] Address Table entry is in use and cannot be modified
				
     */
    ADDRESS_TABLE_IN_USE(0x0009),

    /**
     * [10] Message could not be sent
     */
    MESSAGE_NOT_SENT(0x000A),

    /**
     * [11] Local node is not sink
     */
    NODE_NOT_SINK(0x000B),

    /**
     * [12] Too many characters
     */
    INPUT_TOO_LONG(0x000C),

    /**
     * [14] Background Scan in Progress (Please wait and try again)
				
     */
    SCAN_IN_PROGRESS(0x000E),

    /**
     * [15] Fatal error during network init
     */
    FATAL_ERROR_DURING_INITIALISATION(0x000F),

    /**
     * [16] Error bootloading
     */
    BOOTLOAD_ERROR(0x0010),

    /**
     * [18] Fatal error initialising the stack
     */
    FATAL_ERROR_DURING_STACK_INIT(0x0012),

    /**
     * [24] Node has run out of Buffers
     */
    NO_BUFFERS(0x0018),

    /**
     * [25] Trying to write read-only register
     */
    ERROR_ERITING_TO_READ_ONLY_REGISTER(0x0019),

    /**
     * [26] Data Mode Refused by Remote Node
     */
    DATA_MODE_REFUSED(0x001A),

    /**
     * [27] Connection Lost in Data Mode
     */
    DATA_MODE_CONNECTION_LOST(0x001B),

    /**
     * [28] Remote node is already in Data Mode
     */
    DATA_MODE_ALREADY_SET(0x001C),

    /**
     * [32] Invalid password
     */
    INVALID_PASSWORD(0x0020),

    /**
     * [37] Cannot form network
     */
    CANNOT_FORM_NETWORK(0x0025),

    /**
     * [39] No network found
     */
    NO_NETWORK_FOUND(0x0027),

    /**
     * [40] Operation cannot be completed if node is part of a PAN
				
     */
    NOT_ALLOWED_WHEN_PAN_JOINED(0x0028),

    /**
     * [44] Error leaving the PAN
     */
    ERROR_LEAVING_PAN(0x002C),

    /**
     * [45] Error scanning for PANs
     */
    ERROR_SCANNING_FOR_PAN(0x002D),

    /**
     * [51] No response from the remote bootloader
     */
    NO_RESPONSE_FROM_BOOTLOADER(0x0033),

    /**
     * [52] Target did not respond during cloning
     */
    NO_RESPONSE_DURING_CLONING(0x0034),

    /**
     * [53] Timeout occurred during xCASTB
     */
    TIMEOUT_DURING_SEND(0x0035),

    /**
     * [57] MAC Transmit Queue is Full
     */
    MAC_QUEUE_FULL(0x0039),

    /**
     * [108] Invalid Binding Index
     */
    INVALID_BINDING_INDEX(0x006C),

    /**
     * [112] Invalid Operation
     */
    INVALID_OPERATION(0x0070),

    /**
     * [114] More than 10 unicast messages were in flight at the
					same time
     */
    TOO_MANY_UNICAST(0x0072),

    /**
     * [116] Message too long
     */
    MESSAGE_TOO_LONG(0x0074),

    /**
     * [128] ZDP Invalid Request Type
     */
    ZDP_INVALID_REQUEST_TYPE(0x0080),

    /**
     * [129] ZDP Device not Found
     */
    ZDP_DEVICE_NOT_FOUND(0x0081),

    /**
     * [130] ZDP Invalid Endpoint
     */
    ZDP_INVALID_ENDPOINT(0x0082),

    /**
     * [131] ZDP Not Active
     */
    ZDP_NOT_ACTIVE(0x0083),

    /**
     * [132] ZDP Not Supported
     */
    ZDP_NOT_SUPPORTED(0x0084),

    /**
     * [133] ZDP Timeout
     */
    ZDP_TIMEOUT(0x0085),

    /**
     * [134] ZDP No Match
     */
    ZDP_NO_MATCH(0x0086),

    /**
     * [135] ZDP Table Full
     */
    ZDP_TABLE_FULL(0x0087),

    /**
     * [136] ZDP No Entry
     */
    ZDP_NO_ENTRY(0x0088),

    /**
     * [137] ZDP No Descriptor
     */
    ZDP_NO_DESCRIPTOR(0x0089),

    /**
     * [145] Operation only possible if connected to a PAN
				
     */
    NOT_CONNECTED_TO_NETWORK(0x0091),

    /**
     * [147] Node is not part of a Network
     */
    NODE_NOT_PART_OF_NETWORK(0x0093),

    /**
     * [148] Cannot join network
     */
    CANNOT_JOIN_NETWORK(0x0094),

    /**
     * [150] Mobile End Device Move to new Parent Failed
				
     */
    MOBILE_DEVICE_MOVE_FAILED(0x0096),

    /**
     * [152] Cannot join ZigBee 2006 Network as Router
     */
    CANNOT_JOIN_AS_ROUTER(0x0098),

    /**
     * [161] More than 8 broadcasts were sent within 8 seconds
				
     */
    TOO_MANY_BROADCASTS(0x00A1),

    /**
     * [171] Trying to join, but no beacons could be heard
				
     */
    NO_BEACONS_HEARD(0x00AB),

    /**
     * [172] Network key was sent in the clear when trying to join
					secured
     */
    NETWORK_KEY_WAS_SENT_CLEAR(0x00AC),

    /**
     * [173] Did not receive Network Key
     */
    NETWORK_KEY_NOT_RECEIVED(0x00AD),

    /**
     * [174] No Link Key received
     */
    NO_LINK_KEY_RECEIVED(0x00AE),

    /**
     * [175] Preconfigured Key Required
     */
    PRECONFIGURED_KEY_REQUIRED(0x00AF),

    /**
     * [197] NWK Already Present
     */
    NWK_ALREADY_PRESENT(0x00C5),

    /**
     * [200] NWK Table Full
     */
    NWK_TABLE_FULL(0x00C8);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, TelegesisStatusCode> codeMapping;

    private int key;

    private TelegesisStatusCode(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, TelegesisStatusCode>();
        for (TelegesisStatusCode s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the type code. Returns null if the code does not exist.
     *
     * @param telegesisStatusCode
     *            the code to lookup
     * @return enumeration value.
     */
    public static TelegesisStatusCode getTelegesisStatusCode(int telegesisStatusCode) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(telegesisStatusCode) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(telegesisStatusCode);
    }

    /**
     * Returns the Telegesis protocol defined value for this enum
     *
     * @return the Telegesis enumeration key
     */
    public int getKey() {
        return key;
    }
}
