// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "system-configured-resources" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class SystemConfiguredResources
constructor(
    var resourceFormat: String? = null,
    var resourceId: Int? = null,
    var resourceInfo: String? = null,
    var resourceName: String? = null,
    var resourceState: ResourceState? = null,
    /** May contain any keyword from [ResourceType]. */
    var resourceType: String? = null
) : AttributeCollection {

    /** Construct an empty [SystemConfiguredResources]. */
    constructor() : this(null, null, null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            resourceFormat?.let { SystemConfiguredResources.resourceFormat.of(it) },
            resourceId?.let { SystemConfiguredResources.resourceId.of(it) },
            resourceInfo?.let { SystemConfiguredResources.resourceInfo.of(it) },
            resourceName?.let { SystemConfiguredResources.resourceName.of(it) },
            resourceState?.let { SystemConfiguredResources.resourceState.of(it) },
            resourceType?.let { SystemConfiguredResources.resourceType.of(it) }
        )

    /** Defines types for each member of [SystemConfiguredResources]. */
    companion object : AttributeCollection.Converter<SystemConfiguredResources> {
        override fun convert(attributes: List<Attribute<*>>): SystemConfiguredResources =
            SystemConfiguredResources(
                extractOne(attributes, resourceFormat),
                extractOne(attributes, resourceId),
                extractOne(attributes, resourceInfo)?.value,
                extractOne(attributes, resourceName)?.value,
                extractOne(attributes, resourceState),
                extractOne(attributes, resourceType)
            )
        override val cls = SystemConfiguredResources::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val resourceFormat = StringType(Tag.mimeMediaType, "resource-format")
        @JvmField val resourceId = IntType("resource-id")
        @JvmField val resourceInfo = TextType("resource-info")
        @JvmField val resourceName = NameType("resource-name")
        /**
         * "resource-state" member type.
         */
        @JvmField val resourceState = ResourceState.Type("resource-state")
        @JvmField val resourceType = KeywordType("resource-type")
    }
    override fun toString() = "SystemConfiguredResources(${attributes.joinToString()})"
}