package model;

import java.time.LocalDate;

public class Reviews {

	int rating;
    String comment;
    LocalDate date;
    String reviewerName;
    String reviewerEmail;
    
	public Reviews() {
	
	}

	public Reviews(int rating, String comment, LocalDate date, String reviewerName, String reviewerEmail) {
		this.rating = rating;
		this.comment = comment;
		this.date = date;
		this.reviewerName = reviewerName;
		this.reviewerEmail = reviewerEmail;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public String getReviewerEmail() {
		return reviewerEmail;
	}

	public void setReviewerEmail(String reviewerEmail) {
		this.reviewerEmail = reviewerEmail;
	}

	@Override
	public String toString() {
		return "Reviews [rating=" + rating + ", comment=" + comment + ", date=" + date + ", reviewerName="
				+ reviewerName + ", reviewerEmail=" + reviewerEmail + "]";
	} 
    
}
