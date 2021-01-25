/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import com.zsmartsystems.zigbee.security.ZigBeeKey;

/**
 * Class to implement the XBee command <b>Set Network Key</b>.
 * <p>
 * AT Command <b>NK</b></p>Set the 128-bit AES network encryption key. This command is
 * write-only and cannot be read. If set to 0 (default), the device selects a random network key.
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeSetNetworkKeyCommand extends XBeeFrame implements XBeeCommand {
    /**
     */
    private Integer frameId;

    /**
     */
    private ZigBeeKey networkKey;

    /**
     *
     * @param frameId the frameId to set as {@link Integer}
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     *
     * @param networkKey the networkKey to set as {@link ZigBeeKey}
     */
    public void setNetworkKey(ZigBeeKey networkKey) {
        this.networkKey = networkKey;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand(0x08);
        serializeInt8(frameId);
        serializeAtCommand("NK");
        serializeZigBeeKey(networkKey);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(384);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("XBeeSetNetworkKeyCommand [frameId=");
        builder.append(frameId);
        builder.append(", networkKey=");
        builder.append(networkKey);
        builder.append(']');
        return builder.toString();
    }
}
