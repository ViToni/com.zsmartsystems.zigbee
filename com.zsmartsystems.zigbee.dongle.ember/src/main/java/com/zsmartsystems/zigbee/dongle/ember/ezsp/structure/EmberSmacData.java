/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspDeserializer;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember Structure <b>EmberSmacData</b>.
 * <p>
 * The Shared Message Authentication Code data used in CBKE.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EmberSmacData {

    /**
     * The Shared Message Authentication Code data.
     * <p>
     * EZSP type is <i>uint8_t[16]</i> - Java type is {@link int[]}
     */
    private int[] contents;

    /**
     * Default Constructor
     */
    public EmberSmacData() {
    }

    public EmberSmacData(EzspDeserializer deserializer) {
        deserialize(deserializer);
    }

    /**
     * The Shared Message Authentication Code data.
     * <p>
     * EZSP type is <i>uint8_t[16]</i> - Java type is {@link int[]}
     *
     * @return the current contents as {@link int[]}
     */
    public int[] getContents() {
        return contents;
    }

    /**
     * The Shared Message Authentication Code data.
     *
     * @param contents the contents to set as {@link int[]}
     */
    public void setContents(int[] contents) {
        this.contents = contents;
    }

    /**
     * Serialise the contents of the EZSP structure.
     *
     * @param serializer the {@link EzspSerializer} used to serialize
     */
    public int[] serialize(EzspSerializer serializer) {
        // Serialize the fields
        serializer.serializeUInt8Array(contents);
        return serializer.getPayload();
    }

    /**
     * Deserialise the contents of the EZSP structure.
     *
     * @param deserializer the {@link EzspDeserializer} used to deserialize
     */
    public void deserialize(EzspDeserializer deserializer) {
        // Deserialize the fields
        contents = deserializer.deserializeUInt8Array(16);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(41);
        builder.append("EmberSmacData [contents=");
        builder.append('{');
        if (contents == null) {
            builder.append("null");
        } else {
            for (int cnt = 0; cnt < contents.length; cnt++) {
                if (cnt != 0) {
                    builder.append(' ');
                }
                builder.append(String.format("%02X", contents[cnt]));
            }
        }
        builder.append('}');
        builder.append(']');
        return builder.toString();
    }
}
