package service;
import java.util.List;
import model.Review;

public class ReviewService {

    public double calculateWeightedScore(List<Review> reviews) {

        if (reviews == null || reviews.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Review r : reviews) {

            double baseRating = r.getBaseRating();

            double verificationWeight;

            switch (r.getUser().getVerificationLevel()) {
                case 1:
                    verificationWeight = 0.8;
                    break;
                case 2:
                    verificationWeight = 1.0;
                    break;
                case 3:
                    verificationWeight = 1.2;
                    break;
                default:
                    verificationWeight = 1.0;
            }

            double weightedScore =
                    baseRating *
                    r.getUser().getTrustScore() *
                    verificationWeight;

            total += weightedScore;
        }

        return total / reviews.size();
    }
}

