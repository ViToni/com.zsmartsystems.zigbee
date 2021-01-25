/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberKeyData;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspDeserializer;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;
import java.util.HashSet;
import java.util.Set;

/**
 * Class to implement the Ember Structure <b>EmberInitialSecurityState</b>.
 * <p>
 * The security data used to set the configuration for the stack, or the retrieved
 * configuration currently in use.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EmberInitialSecurityState {

    /**
     * A bitmask indicating the security state used to indicate what the security configuration
     * will be when the device forms or joins the network.
     * <p>
     * EZSP type is <i>EmberInitialSecurityBitmask</i> - Java type is {@link EmberInitialSecurityBitmask}
     * Parameter allows multiple options so implemented as a {@link Set}.
     */
    private Set<EmberInitialSecurityBitmask> bitmask = new HashSet<EmberInitialSecurityBitmask>();

    /**
     * The pre-configured Key data that should be used when forming or joining the network. The
     * security bitmask must be set with the EMBER_HAVE_PRECONFIGURED_KEY bit to indicate that
     * the key contains valid data.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData preconfiguredKey;

    /**
     * The Network Key that should be used by the Trust Center when it forms the network, or the
     * Network Key currently in use by a joined device. The security bitmask must be set with
     * EMBER_HAVE_NETWORK_KEY to indicate that the key contains valid data.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData networkKey;

    /**
     * The sequence number associated with the network key. This is only valid if the
     * EMBER_HAVE_NETWORK_KEY has been set in the security bitmask.
     * <p>
     * EZSP type is <i>uint8_u</i> - Java type is {@link int}
     */
    private int networkKeySequenceNumber;

    /**
     * This is the long address of the trust center on the network that will be joined. It is usually
     * NOT set prior to joining the network and instead it is learned during the joining message
     * exchange. This field is only examined if EMBER_HAVE_TRUST_CENTER_EUI64 is set in the
     * EmberInitialSecurityState::bitmask. Most devices should clear that bit and leave this
     * field alone. This field must be set when using commissioning mode.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress preconfiguredTrustCenterEui64;

    /**
     * Default Constructor
     */
    public EmberInitialSecurityState() {
    }

    public EmberInitialSecurityState(EzspDeserializer deserializer) {
        deserialize(deserializer);
    }

    /**
     * A bitmask indicating the security state used to indicate what the security configuration
     * will be when the device forms or joins the network.
     * <p>
     * EZSP type is <i>EmberInitialSecurityBitmask</i> - Java type is {@link EmberInitialSecurityBitmask}
     *
     * @return the current bitmask as {@link Set} of {@link EmberInitialSecurityBitmask}
     */
    public Set<EmberInitialSecurityBitmask> getBitmask() {
        return bitmask;
    }

    /**
     * A bitmask indicating the security state used to indicate what the security configuration
     * will be when the device forms or joins the network.
     *
     * @param bitmask the bitmask to add to the {@link Set} as {@link EmberInitialSecurityBitmask}
     */
    public void addBitmask(EmberInitialSecurityBitmask bitmask) {
        this.bitmask.add(bitmask);
    }

    /**
     * A bitmask indicating the security state used to indicate what the security configuration
     * will be when the device forms or joins the network.
     *
     * @param bitmask the bitmask to remove to the {@link Set} as {@link EmberInitialSecurityBitmask}
     */
    public void removeBitmask(EmberInitialSecurityBitmask bitmask) {
        this.bitmask.remove(bitmask);
    }

    /**
     * The pre-configured Key data that should be used when forming or joining the network. The
     * security bitmask must be set with the EMBER_HAVE_PRECONFIGURED_KEY bit to indicate that
     * the key contains valid data.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current preconfiguredKey as {@link EmberKeyData}
     */
    public EmberKeyData getPreconfiguredKey() {
        return preconfiguredKey;
    }

    /**
     * The pre-configured Key data that should be used when forming or joining the network. The
     * security bitmask must be set with the EMBER_HAVE_PRECONFIGURED_KEY bit to indicate that
     * the key contains valid data.
     *
     * @param preconfiguredKey the preconfiguredKey to set as {@link EmberKeyData}
     */
    public void setPreconfiguredKey(EmberKeyData preconfiguredKey) {
        this.preconfiguredKey = preconfiguredKey;
    }

    /**
     * The Network Key that should be used by the Trust Center when it forms the network, or the
     * Network Key currently in use by a joined device. The security bitmask must be set with
     * EMBER_HAVE_NETWORK_KEY to indicate that the key contains valid data.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current networkKey as {@link EmberKeyData}
     */
    public EmberKeyData getNetworkKey() {
        return networkKey;
    }

    /**
     * The Network Key that should be used by the Trust Center when it forms the network, or the
     * Network Key currently in use by a joined device. The security bitmask must be set with
     * EMBER_HAVE_NETWORK_KEY to indicate that the key contains valid data.
     *
     * @param networkKey the networkKey to set as {@link EmberKeyData}
     */
    public void setNetworkKey(EmberKeyData networkKey) {
        this.networkKey = networkKey;
    }

    /**
     * The sequence number associated with the network key. This is only valid if the
     * EMBER_HAVE_NETWORK_KEY has been set in the security bitmask.
     * <p>
     * EZSP type is <i>uint8_u</i> - Java type is {@link int}
     *
     * @return the current networkKeySequenceNumber as {@link int}
     */
    public int getNetworkKeySequenceNumber() {
        return networkKeySequenceNumber;
    }

    /**
     * The sequence number associated with the network key. This is only valid if the
     * EMBER_HAVE_NETWORK_KEY has been set in the security bitmask.
     *
     * @param networkKeySequenceNumber the networkKeySequenceNumber to set as {@link int}
     */
    public void setNetworkKeySequenceNumber(int networkKeySequenceNumber) {
        this.networkKeySequenceNumber = networkKeySequenceNumber;
    }

    /**
     * This is the long address of the trust center on the network that will be joined. It is usually
     * NOT set prior to joining the network and instead it is learned during the joining message
     * exchange. This field is only examined if EMBER_HAVE_TRUST_CENTER_EUI64 is set in the
     * EmberInitialSecurityState::bitmask. Most devices should clear that bit and leave this
     * field alone. This field must be set when using commissioning mode.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current preconfiguredTrustCenterEui64 as {@link IeeeAddress}
     */
    public IeeeAddress getPreconfiguredTrustCenterEui64() {
        return preconfiguredTrustCenterEui64;
    }

    /**
     * This is the long address of the trust center on the network that will be joined. It is usually
     * NOT set prior to joining the network and instead it is learned during the joining message
     * exchange. This field is only examined if EMBER_HAVE_TRUST_CENTER_EUI64 is set in the
     * EmberInitialSecurityState::bitmask. Most devices should clear that bit and leave this
     * field alone. This field must be set when using commissioning mode.
     *
     * @param preconfiguredTrustCenterEui64 the preconfiguredTrustCenterEui64 to set as {@link IeeeAddress}
     */
    public void setPreconfiguredTrustCenterEui64(IeeeAddress preconfiguredTrustCenterEui64) {
        this.preconfiguredTrustCenterEui64 = preconfiguredTrustCenterEui64;
    }

    /**
     * Serialise the contents of the EZSP structure.
     *
     * @param serializer the {@link EzspSerializer} used to serialize
     */
    public int[] serialize(EzspSerializer serializer) {
        // Serialize the fields
        serializer.serializeEmberInitialSecurityBitmask(bitmask);
        serializer.serializeEmberKeyData(preconfiguredKey);
        serializer.serializeEmberKeyData(networkKey);
        serializer.serializeUInt8(networkKeySequenceNumber);
        serializer.serializeEmberEui64(preconfiguredTrustCenterEui64);
        return serializer.getPayload();
    }

    /**
     * Deserialise the contents of the EZSP structure.
     *
     * @param deserializer the {@link EzspDeserializer} used to deserialize
     */
    public void deserialize(EzspDeserializer deserializer) {
        // Deserialize the fields
        bitmask = deserializer.deserializeEmberInitialSecurityBitmask();
        preconfiguredKey = deserializer.deserializeEmberKeyData();
        networkKey = deserializer.deserializeEmberKeyData();
        networkKeySequenceNumber = deserializer.deserializeUInt8();
        preconfiguredTrustCenterEui64 = deserializer.deserializeEmberEui64();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(153);
        builder.append("EmberInitialSecurityState [bitmask=");
        builder.append(bitmask);
        builder.append(", preconfiguredKey=");
        builder.append(preconfiguredKey);
        builder.append(", networkKey=");
        builder.append(networkKey);
        builder.append(", networkKeySequenceNumber=");
        builder.append(networkKeySequenceNumber);
        builder.append(", preconfiguredTrustCenterEui64=");
        builder.append(preconfiguredTrustCenterEui64);
        builder.append(']');
        return builder.toString();
    }
}
