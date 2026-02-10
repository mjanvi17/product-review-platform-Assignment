# Credibility-Weighted Product Review Prototype

## Overview

This project is a minimal prototype of a credibility-weighted product review platform.

The goal of this prototype is to demonstrate:

- Clear domain modeling
- Structured review representation
- Credibility-based influence logic
- Clean separation of business logic
- Architectural clarity over feature volume

This implementation focuses on the core innovation:
**Credibility-weighted product scoring based on structured reviews.**

---

## What I Intend to Build (Full Vision)

The complete platform (as defined in the PRD) aims to provide:

- Verified pseudonymous reviewer system
- Reviewer trust score & credibility weighting
- Structured review format (Pros, Cons, Context)
- Product analytics dashboard
- Competitor comparison engine
- Evidence-gated sensitive claims
- Review lifecycle management

The system is designed to transform users into analytical reviewers rather than complaint posters.

---

## What Is Implemented in This Prototype

Due to scope constraints, this prototype implements:

### 1. Core Domain Models
- User
- Product
- Review

### 2. Structured Review Fields
- Pricing Fairness
- Long-Term Value
- Pros & Cons (conceptual structure)
- Use Case

### 3. Credibility-Weighted Scoring Logic

Weighted Score Formula:

Base Rating = (pricingFairness + longTermValue) / 2

Weighted Score =  
Base Rating × User Trust Score × Verification Weight

This demonstrates the concept that:
**Not all reviews should have equal influence.**

### 4. Service Layer Separation

Business logic is implemented inside:
`ReviewService`

Main class only orchestrates execution.

This reflects clean architectural layering.

---

## Architecture Overview

The project follows a simple layered design:

model/
- User
- Product
- Review

service/
- ReviewService (business logic)

main/
- Main (execution entry point)

### Architectural Decisions

- Business logic separated from main method
- Domain-driven object modeling
- Credibility logic encapsulated in service layer
- Extensible structure for future database or API integration

---

## How to Run

1. Open project in Eclipse
2. Navigate to `Main.java`
3. Right click → Run As → Java Application
4. Output will display credibility-weighted score

Example Output:
Credibility Weighted Score: 5.25
