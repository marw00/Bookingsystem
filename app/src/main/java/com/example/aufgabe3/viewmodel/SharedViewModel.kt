package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * ViewModel to manage the list of booking entries and handle adding and deleting bookings.
 */
class SharedViewModel : ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    /**
     * Adds a new booking entry to the list.
     * @param bookingEntry The booking entry to add.
     */
    fun addBookingEntry(bookingEntry: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value + bookingEntry
    }

    /**
     * Deletes a booking entry from the list.
     * @param bookingEntry The booking entry to delete.
     */
    fun deleteBookingEntry(bookingEntry: BookingEntry) {
        _bookingsEntries.value = _bookingsEntries.value.filter { it != bookingEntry }
    }
}
