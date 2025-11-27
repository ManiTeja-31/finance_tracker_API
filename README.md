src/main/java/com/financetracker
│
├── FinanceTrackerApplication.java
│
├── config
│     └── SwaggerConfig.java        (optional)
│
├── controller
│     ├── AuthController.java
│     ├── TransactionController.java
│     ├── CategoryController.java
│     └── SummaryController.java
│
├── dto
│     ├── LoginRequest.java
│     ├── RegisterRequest.java
│     ├── TransactionRequest.java
│     ├── TransactionResponse.java
│     ├── SummaryResponse.java
│     └── CategoryRequest.java
│
├── entity
│     ├── User.java
│     ├── Transaction.java
│     └── Category.java
│
├── exception
│     ├── ResourceNotFoundException.java
│     ├── GlobalExceptionHandler.java
│     └── ApiError.java
│
├── repository
│     ├── UserRepository.java
│     ├── TransactionRepository.java
│     └── CategoryRepository.java
│
├── security
│     ├── JwtFilter.java
│     ├── JwtUtil.java
│     ├── CustomUserDetails.java
│     ├── CustomUserDetailsService.java
│     ├── SecurityConfig.java
│     └── PasswordEncoderConfig.java
│
└── service
      ├── AuthService.java
      ├── TransactionService.java
      ├── CategoryService.java
      ├── SummaryService.java
      │
      ├── impl
      │     ├── AuthServiceImpl.java
      │     ├── TransactionServiceImpl.java
      │     ├── CategoryServiceImpl.java
      │     └── SummaryServiceImpl.java
      │
      └── util
            └── DateUtil.java (optional)
