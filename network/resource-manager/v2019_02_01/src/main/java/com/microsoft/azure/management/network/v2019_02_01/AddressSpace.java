/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddressSpace contains an array of IP address ranges that can be used by
 * subnets of the virtual network.
 */
public class AddressSpace {
    /**
     * A list of address blocks reserved for this virtual network in CIDR
     * notation.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /**
     * Get a list of address blocks reserved for this virtual network in CIDR notation.
     *
     * @return the addressPrefixes value
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set a list of address blocks reserved for this virtual network in CIDR notation.
     *
     * @param addressPrefixes the addressPrefixes value to set
     * @return the AddressSpace object itself.
     */
    public AddressSpace withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

}
