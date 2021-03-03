// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for an Microsoft.EventHub.CaptureFileCreated event. */
@Fluent
public final class EventHubCaptureFileCreatedEventData {
    /*
     * The path to the capture file.
     */
    @JsonProperty(value = "fileurl")
    private String fileurl;

    /*
     * The file type of the capture file.
     */
    @JsonProperty(value = "fileType")
    private String fileType;

    /*
     * The shard ID.
     */
    @JsonProperty(value = "partitionId")
    private String partitionId;

    /*
     * The file size.
     */
    @JsonProperty(value = "sizeInBytes")
    private Integer sizeInBytes;

    /*
     * The number of events in the file.
     */
    @JsonProperty(value = "eventCount")
    private Integer eventCount;

    /*
     * The smallest sequence number from the queue.
     */
    @JsonProperty(value = "firstSequenceNumber")
    private Integer firstSequenceNumber;

    /*
     * The last sequence number from the queue.
     */
    @JsonProperty(value = "lastSequenceNumber")
    private Integer lastSequenceNumber;

    /*
     * The first time from the queue.
     */
    @JsonProperty(value = "firstEnqueueTime")
    private OffsetDateTime firstEnqueueTime;

    /*
     * The last time from the queue.
     */
    @JsonProperty(value = "lastEnqueueTime")
    private OffsetDateTime lastEnqueueTime;

    /**
     * Get the fileurl property: The path to the capture file.
     *
     * @return the fileurl value.
     */
    public String getFileurl() {
        return this.fileurl;
    }

    /**
     * Set the fileurl property: The path to the capture file.
     *
     * @param fileurl the fileurl value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setFileurl(String fileurl) {
        this.fileurl = fileurl;
        return this;
    }

    /**
     * Get the fileType property: The file type of the capture file.
     *
     * @return the fileType value.
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * Set the fileType property: The file type of the capture file.
     *
     * @param fileType the fileType value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get the partitionId property: The shard ID.
     *
     * @return the partitionId value.
     */
    public String getPartitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId property: The shard ID.
     *
     * @param partitionId the partitionId value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the sizeInBytes property: The file size.
     *
     * @return the sizeInBytes value.
     */
    public Integer getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes property: The file size.
     *
     * @param sizeInBytes the sizeInBytes value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the eventCount property: The number of events in the file.
     *
     * @return the eventCount value.
     */
    public Integer getEventCount() {
        return this.eventCount;
    }

    /**
     * Set the eventCount property: The number of events in the file.
     *
     * @param eventCount the eventCount value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * Get the firstSequenceNumber property: The smallest sequence number from the queue.
     *
     * @return the firstSequenceNumber value.
     */
    public Integer getFirstSequenceNumber() {
        return this.firstSequenceNumber;
    }

    /**
     * Set the firstSequenceNumber property: The smallest sequence number from the queue.
     *
     * @param firstSequenceNumber the firstSequenceNumber value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setFirstSequenceNumber(Integer firstSequenceNumber) {
        this.firstSequenceNumber = firstSequenceNumber;
        return this;
    }

    /**
     * Get the lastSequenceNumber property: The last sequence number from the queue.
     *
     * @return the lastSequenceNumber value.
     */
    public Integer getLastSequenceNumber() {
        return this.lastSequenceNumber;
    }

    /**
     * Set the lastSequenceNumber property: The last sequence number from the queue.
     *
     * @param lastSequenceNumber the lastSequenceNumber value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setLastSequenceNumber(Integer lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
        return this;
    }

    /**
     * Get the firstEnqueueTime property: The first time from the queue.
     *
     * @return the firstEnqueueTime value.
     */
    public OffsetDateTime getFirstEnqueueTime() {
        return this.firstEnqueueTime;
    }

    /**
     * Set the firstEnqueueTime property: The first time from the queue.
     *
     * @param firstEnqueueTime the firstEnqueueTime value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setFirstEnqueueTime(OffsetDateTime firstEnqueueTime) {
        this.firstEnqueueTime = firstEnqueueTime;
        return this;
    }

    /**
     * Get the lastEnqueueTime property: The last time from the queue.
     *
     * @return the lastEnqueueTime value.
     */
    public OffsetDateTime getLastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /**
     * Set the lastEnqueueTime property: The last time from the queue.
     *
     * @param lastEnqueueTime the lastEnqueueTime value to set.
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData setLastEnqueueTime(OffsetDateTime lastEnqueueTime) {
        this.lastEnqueueTime = lastEnqueueTime;
        return this;
    }
}
