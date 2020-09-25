// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CapabilitiesUpdateStatus. */
public final class CapabilitiesUpdateStatus extends ExpandableStringEnum<CapabilitiesUpdateStatus> {
    /** Static value Pending for CapabilitiesUpdateStatus. */
    public static final CapabilitiesUpdateStatus PENDING = fromString("Pending");

    /** Static value InProgress for CapabilitiesUpdateStatus. */
    public static final CapabilitiesUpdateStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Complete for CapabilitiesUpdateStatus. */
    public static final CapabilitiesUpdateStatus COMPLETE = fromString("Complete");

    /** Static value Error for CapabilitiesUpdateStatus. */
    public static final CapabilitiesUpdateStatus ERROR = fromString("Error");

    /**
     * Creates or finds a CapabilitiesUpdateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CapabilitiesUpdateStatus.
     */
    @JsonCreator
    public static CapabilitiesUpdateStatus fromString(String name) {
        return fromString(name, CapabilitiesUpdateStatus.class);
    }

    /** @return known CapabilitiesUpdateStatus values. */
    public static Collection<CapabilitiesUpdateStatus> values() {
        return values(CapabilitiesUpdateStatus.class);
    }
}
