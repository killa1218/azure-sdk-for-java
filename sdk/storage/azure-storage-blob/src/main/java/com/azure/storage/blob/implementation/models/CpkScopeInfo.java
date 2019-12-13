// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations.
 */
@JacksonXmlRootElement(localName = "cpk-scope-info")
@Fluent
public final class CpkScopeInfo {
    /*
     * Optional. Version 2019-02-02 and later.  Specifies the name of the
     * encryption scope to use to encrypt the data provided in the request. If
     * not specified, encryption is performed with the default account
     * encryption scope.  For more information, see Encryption at Rest for
     * Azure Storage Services.
     */
    @JsonProperty(value = "encryptionScope")
    private String encryptionScope;

    /**
     * Get the encryptionScope property: Optional. Version 2019-02-02 and
     * later.  Specifies the name of the encryption scope to use to encrypt the
     * data provided in the request. If not specified, encryption is performed
     * with the default account encryption scope.  For more information, see
     * Encryption at Rest for Azure Storage Services.
     *
     * @return the encryptionScope value.
     */
    public String getEncryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: Optional. Version 2019-02-02 and
     * later.  Specifies the name of the encryption scope to use to encrypt the
     * data provided in the request. If not specified, encryption is performed
     * with the default account encryption scope.  For more information, see
     * Encryption at Rest for Azure Storage Services.
     *
     * @param encryptionScope the encryptionScope value to set.
     * @return the CpkScopeInfo object itself.
     */
    public CpkScopeInfo setEncryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }
}
