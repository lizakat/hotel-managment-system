package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Booking;
import com.example.hotelmanagementsystem.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public List<Booking> listBookings() {
        return bookingRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long number) {
        bookingRepository.deleteById(number);
    }
}
