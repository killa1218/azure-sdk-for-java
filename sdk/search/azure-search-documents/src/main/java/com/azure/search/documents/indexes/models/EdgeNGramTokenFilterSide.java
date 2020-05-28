// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EdgeNGramTokenFilterSide.
 */
public enum EdgeNGramTokenFilterSide {
    /**
     * Enum value front.
     */
    FRONT("front"),

    /**
     * Enum value back.
     */
    BACK("back");

    /**
     * The actual serialized value for a EdgeNGramTokenFilterSide instance.
     */
    private final String value;

    EdgeNGramTokenFilterSide(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EdgeNGramTokenFilterSide instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EdgeNGramTokenFilterSide object, or null if unable to parse.
     */
    @JsonCreator
    public static EdgeNGramTokenFilterSide fromString(String value) {
        EdgeNGramTokenFilterSide[] items = EdgeNGramTokenFilterSide.values();
        for (EdgeNGramTokenFilterSide item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
