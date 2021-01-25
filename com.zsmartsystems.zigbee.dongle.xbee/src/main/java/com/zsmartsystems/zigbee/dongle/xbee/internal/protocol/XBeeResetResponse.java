/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import com.zsmartsystems.zigbee.dongle.xbee.internal.protocol.CommandStatus;

/**
 * Class to implement the XBee command <b>Reset</b>.
 * <p>
 * AT Command <b>RE</b></p>This command sets all parameters except ZS and KY to their default
 * values. To change ZS and KY, you must explicitly set them. In order for the default parameters
 * to persist through subsequent resets, send a separate WR command after RE. Read-only
 * parameters are not directly affected by RE and reflect the current state of the device.
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeResetResponse extends XBeeFrame implements XBeeResponse {
    /**
     * Response field
     */
    private Integer frameId;

    /**
     * Response field
     */
    private CommandStatus commandStatus;

    /**
     *
     * @return the frameId as {@link Integer}
     */
    public Integer getFrameId() {
        return frameId;
    }

    /**
     *
     * @return the commandStatus as {@link CommandStatus}
     */
    public CommandStatus getCommandStatus() {
        return commandStatus;
    }


    @Override
    public void deserialize(int[] incomingData) {
        initialiseDeserializer(incomingData);

        // Deserialize the fields for the response

        // Deserialize field "Frame ID"
        frameId = deserializeInt8();
        deserializeAtCommand();

        // Deserialize field "Command Status"
        commandStatus = deserializeCommandStatus();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(377);
        builder.append("XBeeResetResponse [frameId=");
        builder.append(frameId);
        builder.append(", commandStatus=");
        builder.append(commandStatus);
        builder.append(']');
        return builder.toString();
    }
}
