// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ServiceBusManagementClient class. */
public interface ServiceBusManagementClient {
    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the NamespacesClient object to access its operations.
     *
     * @return the NamespacesClient object.
     */
    NamespacesClient getNamespaces();

    /**
     * Gets the QueuesClient object to access its operations.
     *
     * @return the QueuesClient object.
     */
    QueuesClient getQueues();

    /**
     * Gets the TopicsClient object to access its operations.
     *
     * @return the TopicsClient object.
     */
    TopicsClient getTopics();

    /**
     * Gets the SubscriptionsClient object to access its operations.
     *
     * @return the SubscriptionsClient object.
     */
    SubscriptionsClient getSubscriptions();
}
