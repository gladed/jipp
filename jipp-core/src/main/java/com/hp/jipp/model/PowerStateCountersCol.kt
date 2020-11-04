// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "power-state-counters-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PowerStateCountersCol
constructor(
    var hibernateTransitions: Int? = null,
    var onTransitions: Int? = null,
    var standbyTransitions: Int? = null,
    var suspendTransitions: Int? = null
) : AttributeCollection {

    /** Construct an empty [PowerStateCountersCol]. */
    constructor() : this(null, null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>>
        get() = listOfNotNull(
            hibernateTransitions?.let { PowerStateCountersCol.hibernateTransitions.of(it) },
            onTransitions?.let { PowerStateCountersCol.onTransitions.of(it) },
            standbyTransitions?.let { PowerStateCountersCol.standbyTransitions.of(it) },
            suspendTransitions?.let { PowerStateCountersCol.suspendTransitions.of(it) }
        )

    /** Defines types for each member of [PowerStateCountersCol]. */
    companion object : AttributeCollection.Converter<PowerStateCountersCol> {
        override fun convert(attributes: List<Attribute<*>>): PowerStateCountersCol =
            PowerStateCountersCol(
                extractOne(attributes, hibernateTransitions),
                extractOne(attributes, onTransitions),
                extractOne(attributes, standbyTransitions),
                extractOne(attributes, suspendTransitions)
            )
        override val cls = PowerStateCountersCol::class.java
        @Deprecated("Remove this symbol")
        @JvmField val Types = this
        @JvmField val hibernateTransitions = IntType("hibernate-transitions")
        @JvmField val onTransitions = IntType("on-transitions")
        @JvmField val standbyTransitions = IntType("standby-transitions")
        @JvmField val suspendTransitions = IntType("suspend-transitions")
    }
    override fun toString() = "PowerStateCountersCol(${attributes.joinToString()})"
}