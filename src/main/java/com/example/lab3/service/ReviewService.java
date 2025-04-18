package com.example.lab3.service;

import com.example.lab3.entity.Review;
import com.example.lab3.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review updatedReview) {
        Review existingReview = getReviewById(id);
        if (existingReview != null) {
            existingReview.setContent(updatedReview.getContent());
            existingReview.setRating(updatedReview.getRating());
            return reviewRepository.save(existingReview);
        }
        return null;
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
