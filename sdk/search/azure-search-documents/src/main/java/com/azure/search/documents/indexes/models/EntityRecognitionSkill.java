// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Text analytics entity recognition.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Skills.Text.EntityRecognitionSkill")
@Fluent
public final class EntityRecognitionSkill extends SearchIndexerSkill {
    /*
     * A list of entity categories that should be extracted.
     */
    @JsonProperty(value = "categories")
    private List<EntityCategory> categories;

    /*
     * A value indicating which language code to use. Default is en. Possible
     * values include: 'ar', 'cs', 'zh-Hans', 'zh-Hant', 'da', 'nl', 'en',
     * 'fi', 'fr', 'de', 'el', 'hu', 'it', 'ja', 'ko', 'no', 'pl', 'pt-PT',
     * 'pt-BR', 'ru', 'es', 'sv', 'tr'
     */
    @JsonProperty(value = "defaultLanguageCode")
    private EntityRecognitionSkillLanguage defaultLanguageCode;

    /*
     * Determines whether or not to include entities which are well known but
     * don't conform to a pre-defined type. If this configuration is not set
     * (default), set to null or set to false, entities which don't conform to
     * one of the pre-defined types will not be surfaced.
     */
    @JsonProperty(value = "includeTypelessEntities")
    private Boolean typelessEntitiesIncluded;

    /*
     * A value between 0 and 1 that be used to only include entities whose
     * confidence score is greater than the value specified. If not set
     * (default), or if explicitly set to null, all entities will be included.
     */
    @JsonProperty(value = "minimumPrecision")
    private Double minimumPrecision;

    /**
     * Constructor of {@link SearchIndexerSkill}.
     *
     * @param inputs Inputs of the skills could be a column in the source data set, or the
     * output of an upstream skill.
     * @param outputs The output of a skill is either a field in a search index, or a value
     */
    public EntityRecognitionSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the categories property: A list of entity categories that should be
     * extracted.
     *
     * @return the categories value.
     */
    public List<EntityCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of entity categories that should be
     * extracted.
     *
     * @param categories the categories value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setCategories(List<EntityCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'ar', 'cs',
     * 'zh-Hans', 'zh-Hant', 'da', 'nl', 'en', 'fi', 'fr', 'de', 'el', 'hu',
     * 'it', 'ja', 'ko', 'no', 'pl', 'pt-PT', 'pt-BR', 'ru', 'es', 'sv', 'tr'.
     *
     * @return the defaultLanguageCode value.
     */
    public EntityRecognitionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'ar', 'cs',
     * 'zh-Hans', 'zh-Hant', 'da', 'nl', 'en', 'fi', 'fr', 'de', 'el', 'hu',
     * 'it', 'ja', 'ko', 'no', 'pl', 'pt-PT', 'pt-BR', 'ru', 'es', 'sv', 'tr'.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setDefaultLanguageCode(EntityRecognitionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the includeTypelessEntities property: Determines whether or not to
     * include entities which are well known but don't conform to a pre-defined
     * type. If this configuration is not set (default), set to null or set to
     * false, entities which don't conform to one of the pre-defined types will
     * not be surfaced.
     *
     * @return the includeTypelessEntities value.
     */
    public Boolean areTypelessEntitiesIncluded() {
        return this.typelessEntitiesIncluded;
    }

    /**
     * Set the includeTypelessEntities property: Determines whether or not to
     * include entities which are well known but don't conform to a pre-defined
     * type. If this configuration is not set (default), set to null or set to
     * false, entities which don't conform to one of the pre-defined types will
     * not be surfaced.
     *
     * @param typelessEntitiesIncluded the includeTypelessEntities value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setTypelessEntitiesIncluded(Boolean typelessEntitiesIncluded) {
        this.typelessEntitiesIncluded = typelessEntitiesIncluded;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 that be used
     * to only include entities whose confidence score is greater than the
     * value specified. If not set (default), or if explicitly set to null, all
     * entities will be included.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 that be used
     * to only include entities whose confidence score is greater than the
     * value specified. If not set (default), or if explicitly set to null, all
     * entities will be included.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the EntityRecognitionSkill object itself.
     */
    public EntityRecognitionSkill setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }
}
