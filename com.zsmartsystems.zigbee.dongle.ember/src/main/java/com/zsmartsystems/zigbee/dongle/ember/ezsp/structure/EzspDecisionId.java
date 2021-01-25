/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Ember Enumeration <b>EzspDecisionId</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum EzspDecisionId {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * Send the network key in the clear to all joining and rejoining devices.
     */
    EZSP_ALLOW_JOINS(0x0000),

    /**
     * Send the network key encrypted with the joining or rejoining device's trust center link key.
     * The trust center and any joining or rejoining device are assumed to share a link key, either
     * preconfigured or obtained under a previous policy. This is the default value for the
     * EZSP_TRUST_CENTER_POLICY.
     */
    EZSP_ALLOW_PRECONFIGURED_KEY_JOINS(0x0001),

    /**
     * Send the network key encrypted with the rejoining device's trust center link key. The trust
     * center and any rejoining device are assumed to share a link key, either preconfigured or
     * obtained under a previous policy. No new devices are allowed to join.
     */
    EZSP_ALLOW_REJOINS_ONLY(0x0002),

    /**
     * Reject all unsecured join and rejoin attempts.
     */
    EZSP_DISALLOW_ALL_JOINS_AND_REJOINS(0x0003),

    /**
     * Send the network key in the clear to all joining devices. Rejoining devices are sent the
     * network key encrypted with their trust center link key. The trust center and any rejoining
     * device are assumed to share a link key, either preconfigured or obtained under a previous
     * policy.
     */
    EZSP_ALLOW_JOINS_REJOINS_HAVE_LINK_KEY(0x0004),

    /**
     * Take no action on trust center rejoin attempts.
     */
    EZSP_IGNORE_TRUST_CENTER_REJOINS(0x0005),

    /**
     * Admit joins only if there is an entry in the transient key table. This corresponds to the Base
     * Device Behavior specification where a Trust Center enforces all devices to join with an
     * install code-derived link key.
     */
    EZSP_BDB_JOIN_USES_INSTALL_CODE_KEY(0x0006),

    /**
     * Delay sending the network key to a new joining device.
     */
    EZSP_DEFER_JOINS_REJOINS_HAVE_LINK_KEY(0x0007),

    /**
     * EZSP_BINDING_MODIFICATION_POLICY default decision. Do not allow the local binding table
     * to be changed by remote nodes.
     */
    EZSP_DISALLOW_BINDING_MODIFICATION(0x0010),

    /**
     * EZSP_BINDING_MODIFICATION_POLICY decision. Allow remote nodes to change the local
     * binding table.
     */
    EZSP_ALLOW_BINDING_MODIFICATION(0x0011),

    /**
     * EZSP_BINDING_MODIFICATION_POLICY decision. Allows remote nodes to set local binding
     * entries only if the entries correspond to endpoints defined on the device, and for output
     * clusters bound to those endpoints.
     */
    EZSP_CHECK_BINDING_MODIFICATIONS_ARE_VALID_ENDPOINT_CLUSTERS(0x0012),

    /**
     * EZSP_UNICAST_REPLIES_POLICY default decision. The NCP will automatically send an empty
     * reply (containing no payload) for every unicast received.
     */
    EZSP_HOST_WILL_NOT_SUPPLY_REPLY (0x0020),

    /**
     * EZSP_UNICAST_REPLIES_POLICY decision. The NCP will only send a reply if it receives a
     * sendReply command from the Host.
     */
    EZSP_HOST_WILL_SUPPLY_REPLY(0x0021),

    /**
     * EZSP_POLL_HANDLER_POLICY default decision. Do not inform the Host when a child polls.
     */
    EZSP_POLL_HANDLER_IGNORE(0x0030),

    /**
     * EZSP_POLL_HANDLER_POLICY decision. Generate a pollHandler callback when a child polls.
     */
    EZSP_POLL_HANDLER_CALLBACK(0x0031),

    /**
     * EZSP_MESSAGE_CONTENTS_IN_CALLBACK_POLICY default decision. Include only the message
     * tag in the messageSentHandler callback.
     */
    EZSP_MESSAGE_TAG_ONLY_IN_CALLBACK(0x0040),

    /**
     * EZSP_MESSAGE_CONTENTS_IN_CALLBACK_POLICY decision. Include both the message tag and
     * the message contents in the messageSentHandler callback.
     */
    EZSP_MESSAGE_TAG_AND_CONTENTS_IN_CALLBACK(0x0041),

    /**
     * EZSP_TC_KEY_REQUEST_POLICY decision. When the Trust Center receives a request for a Trust
     * Center link key, it will be ignored.
     */
    EZSP_DENY_TC_KEY_REQUESTS(0x0050),

    /**
     * EZSP_TC_KEY_REQUEST_POLICY decision. When the Trust Center receives a request for a Trust
     * Center link key, it will reply to it with the current key. If not key is currently in the key
     * table for this device, a new key will be generated and sent to the device.
     */
    EZSP_ALLOW_TC_KEY_REQUESTS_AND_SEND_CURRENT_KEY(0x0051),

    /**
     * EZSP_TC_KEY_REQUEST_POLICY decision. When the Trust Center receives a request for a Trust
     * Center link key, it will generate a key to send to the joiner.
     */
    EZSP_ALLOW_TC_KEY_REQUEST_AND_GENERATE_NEW_KEY(0x0052),

    /**
     * EZSP_APP_KEY_REQUEST_POLICY decision. When the Trust Center receives a request for an
     * application link key, it will be ignored.
     */
    EZSP_DENY_APP_KEY_REQUESTS(0x0060),

    /**
     * EZSP_APP_KEY_REQUEST_POLICY decision. When the Trust Center receives a request for an
     * application link key, it will randomly generate a key and send it to both partners.
     */
    EZSP_ALLOW_APP_KEY_REQUESTS(0x0061),

    /**
     * Indicates that packet validate library checks are enabled on the NCP.
     */
    EZSP_PACKET_VALIDATE_LIBRARY_CHECKS_ENABLED(0x0062),

    /**
     * Indicates that packet validate library checks are NOT enabled on the NCP.
     */
    EZSP_PACKET_VALIDATE_LIBRARY_CHECKS_DISABLED(0x0063);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, EzspDecisionId> codeMapping;

    private int key;

    static {
        codeMapping = new HashMap<Integer, EzspDecisionId>();
        for (EzspDecisionId s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    private EzspDecisionId(int key) {
        this.key = key;
    }

    /**
     * Lookup function based on the EmberStatus type code. Returns null if the
     * code does not exist.
     *
     * @param code the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static EzspDecisionId getEzspDecisionId(int code) {
        if (codeMapping.get(code) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(code);
    }

    /**
     * Returns the EZSP protocol defined value for this enumeration.
     *
     * @return the EZSP protocol key
     */
    public int getKey() {
        return key;
    }
}
