/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberKeyType;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>getKey</b>.
 * <p>
 * Gets a Security Key based on the passed key type.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetKeyRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0x6A;

    /**
     * EZSP type is <i>EmberKeyType</i> - Java type is {@link EmberKeyType}
     */
    private EmberKeyType keyType;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspGetKeyRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * EZSP type is <i>EmberKeyType</i> - Java type is {@link EmberKeyType}
     *
     * @return the current keyType as {@link EmberKeyType}
     */
    public EmberKeyType getKeyType() {
        return keyType;
    }

    /**
     *
     * @param keyType the keyType to set as {@link EmberKeyType}
     */
    public void setKeyType(EmberKeyType keyType) {
        this.keyType = keyType;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeEmberKeyType(keyType);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(70);
        builder.append("EzspGetKeyRequest [networkId=");
        builder.append(networkId);
        builder.append(", keyType=");
        builder.append(keyType);
        builder.append(']');
        return builder.toString();
    }
}
