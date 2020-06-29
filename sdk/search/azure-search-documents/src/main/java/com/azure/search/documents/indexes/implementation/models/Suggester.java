// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Suggester model. */
@Fluent
public final class Suggester {
    /*
     * The name of the suggester.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A value indicating the capabilities of the suggester.
     */
    @JsonProperty(value = "searchMode", required = true)
    private String searchMode;

    /*
     * The list of field names to which the suggester applies. Each field must
     * be searchable.
     */
    @JsonProperty(value = "sourceFields", required = true)
    private List<String> sourceFields;

    /** Creates an instance of Suggester class. */
    @JsonCreator
    public Suggester(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "searchMode") String searchMode,
            @JsonProperty(value = "sourceFields") List<String> sourceFields) {
        searchMode = "analyzingInfixMatching";
        this.name = name;
        this.searchMode = searchMode;
        this.sourceFields = sourceFields;
    }

    /**
     * Get the name property: The name of the suggester.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the suggester.
     *
     * @param name the name value to set.
     * @return the Suggester object itself.
     */
    /**
     * Get the searchMode property: A value indicating the capabilities of the suggester.
     *
     * @return the searchMode value.
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * Set the searchMode property: A value indicating the capabilities of the suggester.
     *
     * @param searchMode the searchMode value to set.
     * @return the Suggester object itself.
     */
    /**
     * Get the sourceFields property: The list of field names to which the suggester applies. Each field must be
     * searchable.
     *
     * @return the sourceFields value.
     */
    public List<String> getSourceFields() {
        return this.sourceFields;
    }

    /**
     * Set the sourceFields property: The list of field names to which the suggester applies. Each field must be
     * searchable.
     *
     * @param sourceFields the sourceFields value to set.
     * @return the Suggester object itself.
     */
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model Suggester");
        }
        if (getSourceFields() == null) {
            throw new IllegalArgumentException("Missing required property sourceFields in model Suggester");
        }
    }
}
