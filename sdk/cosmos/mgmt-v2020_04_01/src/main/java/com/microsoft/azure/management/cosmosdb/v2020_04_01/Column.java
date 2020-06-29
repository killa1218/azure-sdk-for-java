/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB Cassandra table column.
 */
public class Column {
    /**
     * Name of the Cosmos DB Cassandra table column.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Type of the Cosmos DB Cassandra table column.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get name of the Cosmos DB Cassandra table column.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Cosmos DB Cassandra table column.
     *
     * @param name the name value to set
     * @return the Column object itself.
     */
    public Column withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get type of the Cosmos DB Cassandra table column.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the Cosmos DB Cassandra table column.
     *
     * @param type the type value to set
     * @return the Column object itself.
     */
    public Column withType(String type) {
        this.type = type;
        return this;
    }

}
