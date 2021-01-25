/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;

import com.zsmartsystems.zigbee.ExtendedPanId;
import com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol.TelegesisDeviceType;

/**
 * Class to implement the Telegesis command <b>Display Network Information</b>.
 * <p>
 * Display Network Information
 * <p>
 * This class provides methods for processing Telegesis AT API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class TelegesisDisplayNetworkInformationCommand extends TelegesisFrame implements TelegesisCommand {
    /**
     * +N= response field
     */
    private TelegesisDeviceType device;

    /**
     * +N= response field
     */
    private Integer channel;

    /**
     * +N= response field
     */
    private Integer power;

    /**
     * +N= response field
     */
    private Integer panId;

    /**
     * +N= response field
     */
    private ExtendedPanId epanId;

    /**
     *
     * @return the device as {@link TelegesisDeviceType}
     */
    public TelegesisDeviceType getDevice() {
        return device;
    }

    /**
     *
     * @return the channel as {@link Integer}
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     *
     * @return the power as {@link Integer}
     */
    public Integer getPower() {
        return power;
    }

    /**
     *
     * @return the panId as {@link Integer}
     */
    public Integer getPanId() {
        return panId;
    }

    /**
     *
     * @return the epanId as {@link ExtendedPanId}
     */
    public ExtendedPanId getEpanId() {
        return epanId;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand("AT+N?");

        return getPayload();
    }

    @Override
    public boolean deserialize(int[] data) {
        // Handle standard status responses (ie. OK / ERROR)
        if (handleIncomingStatus(data)) {
            return true;
        }

        initialiseDeserializer(data);

        // Deserialize the fields for the "+N=" response
        if (testPrompt(data, "+N=")) {
            setDeserializer(3);

            // Deserialize field "device"
            device = deserializeTelegesisDeviceType();
            stepDeserializer();
            if (device!=TelegesisDeviceType.NOPAN) {
                // Deserialize field "channel"
                channel = deserializeInteger();
                stepDeserializer();

                // Deserialize field "power"
                power = deserializeInteger();
                stepDeserializer();

                // Deserialize field "Pan ID"
                panId = deserializeInt16();
                stepDeserializer();

                // Deserialize field "EPan id"
                epanId = deserializeExtendedPanId();
            }
            return false;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(581);
        builder.append("TelegesisDisplayNetworkInformationCommand [device=");
        builder.append(device);
        builder.append(", channel=");
        builder.append(channel);
        builder.append(", power=");
        builder.append(power);
        builder.append(", panId=");
        builder.append(panId);
        builder.append(", epanId=");
        builder.append(epanId);
        if (status != null) {
            builder.append(", status=");
            builder.append(status);
        }
        builder.append(']');
        return builder.toString();
    }
}
