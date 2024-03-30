package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Booking;
import com.example.hotelmanagementsystem.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/booking")
    public String bookings(Model model) {
        model.addAttribute("bookings", bookingService.listBookings());
        return "booking";
    }

    @PostMapping("/booking/add")
    public String createBooking(Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:/booking";
    }

    @PostMapping("/booking/delete")
    public String deleteBooking(@RequestParam Long number) {
        bookingService.deleteBooking(number);
        return "redirect:/booking";
    }
}
