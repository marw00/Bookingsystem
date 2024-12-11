package com.example.aufgabe3.model

import java.time.LocalDate

/**
 * Represents a booking entry with arrival and departure dates and a name.
 * @property arrivalDate The arrival date of the booking.
 * @property departureDate The departure date of the booking.
 * @property name The name associated with the booking.
 */
data class BookingEntry(
    val arrivalDate: LocalDate,
    val departureDate: LocalDate,
    val name: String
)

