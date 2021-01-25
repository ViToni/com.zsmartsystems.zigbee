/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.telegesis.internal.protocol;

import com.zsmartsystems.zigbee.IeeeAddress;

/**
 * Class to implement the Telegesis command <b>Sleepy Device Announce</b>.
 * <p>
 * A sleepy end device announcing itself
 * <p>
 * This class provides methods for processing Telegesis AT API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class TelegesisSleepyDeviceAnnounceEvent extends TelegesisFrame implements TelegesisEvent {
    /**
     * SED response field
     */
    private IeeeAddress ieeeAddress;

    /**
     * SED response field
     */
    private Integer networkAddress;

    /**
     * SED response field
     */
    private Integer rssi;

    /**
     * SED response field
     */
    private Integer lqi;

    /**
     *
     * @return the ieeeAddress as {@link IeeeAddress}
     */
    public IeeeAddress getIeeeAddress() {
        return ieeeAddress;
    }

    /**
     *
     * @return the networkAddress as {@link Integer}
     */
    public Integer getNetworkAddress() {
        return networkAddress;
    }

    /**
     *
     * @return the rssi as {@link Integer}
     */
    public Integer getRssi() {
        return rssi;
    }

    /**
     *
     * @return the lqi as {@link Integer}
     */
    public Integer getLqi() {
        return lqi;
    }


    @Override
    public void deserialize(int[] data) {
        initialiseDeserializer(data);

        // Deserialize the fields for the "SED" response
        if (testPrompt(data, "SED:")) {
            setDeserializer(4);

            // Deserialize field "Ieee Address"
            ieeeAddress = deserializeIeeeAddress();
            stepDeserializer();

            // Deserialize field "network address"
            networkAddress = deserializeInt16();
            stepDeserializer();

            // Deserialize field "rssi" [optional]
            pushDeserializer();
            rssi = deserializeSInt8();
            if (rssi == null) {
                popDeserializer();
            } else {
                stepDeserializer();
            }

            // Deserialize field "lqi" [optional]
            lqi = deserializeInt8();
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(484);
        builder.append("TelegesisSleepyDeviceAnnounceEvent [ieeeAddress=");
        builder.append(ieeeAddress);
        builder.append(", networkAddress=");
        builder.append(networkAddress);
        builder.append(", rssi=");
        builder.append(rssi);
        builder.append(", lqi=");
        builder.append(lqi);
        builder.append(']');
        return builder.toString();
    }
}
