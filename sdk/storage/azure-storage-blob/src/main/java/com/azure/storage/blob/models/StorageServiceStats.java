// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Stats for the storage service.
 */
@JacksonXmlRootElement(localName = "StorageServiceStats")
@Fluent
public final class StorageServiceStats {
    /*
     * The geoReplication property.
     */
    @JsonProperty(value = "GeoReplication")
    private GeoReplication geoReplication;

    /**
     * Get the geoReplication property: The geoReplication property.
     *
     * @return the geoReplication value.
     */
    public GeoReplication getGeoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication property: The geoReplication property.
     *
     * @param geoReplication the geoReplication value to set.
     * @return the StorageServiceStats object itself.
     */
    public StorageServiceStats setGeoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }
}
