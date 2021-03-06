/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.frontdoor.v2020_05_01.implementation.FrontendEndpointInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.frontdoor.v2020_05_01.implementation.NetworkManager;

/**
 * Type representing FrontendEndpoint.
 */
public interface FrontendEndpoint extends HasInner<FrontendEndpointInner>, Indexable, Refreshable<FrontendEndpoint>, HasManager<NetworkManager> {
    /**
     * @return the customHttpsConfiguration value.
     */
    CustomHttpsConfiguration customHttpsConfiguration();

    /**
     * @return the customHttpsProvisioningState value.
     */
    CustomHttpsProvisioningState customHttpsProvisioningState();

    /**
     * @return the customHttpsProvisioningSubstate value.
     */
    CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceState value.
     */
    FrontDoorResourceState resourceState();

    /**
     * @return the sessionAffinityEnabledState value.
     */
    SessionAffinityEnabledState sessionAffinityEnabledState();

    /**
     * @return the sessionAffinityTtlSeconds value.
     */
    Integer sessionAffinityTtlSeconds();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the webApplicationFirewallPolicyLink value.
     */
    FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink();

}
