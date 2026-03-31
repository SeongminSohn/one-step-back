# ONE-STEP — A Platform That Helps Artists Grow Step by Step

<img src="https://github.com/DevNathan/one-step-back/assets/142222091/390822a5-6ad9-4342-af0f-8ad21c37ce92">

> 📌 **Note on This Fork**
>
> This repository reflects my personal contributions to the ONE-STEP team project. **My work on this project ended at commit [`66f45ff`](https://github.com/one-step-back/one-step-back/commit/66f45ff2d99c5c3ddc092903e4065700e79607f1).** The project continues to be maintained by other team member in the [organization repository](https://github.com/one-step-back/one-step-back).

---

## 1. Project Motivation

According to an interview with Seong-Jin Cho, one of the most highly regarded pianists in Korea, there are very limited opportunities for artists to promote themselves outside of competitions — referring to the "limited performance opportunities" in Korea. In many cases, artists rely on recognition gained from competitions to secure contracts with management agencies.

Most artists have very few opportunities to gain exposure, which leads to unstable income. According to the "Artist Status Survey" conducted every three years by the Ministry of Culture, Sports and Tourism, the average monthly income of artists is approximately 1,000,000 KRW, and the income disparity among artists is also very large.

**ONE-STEP** was designed to reduce these limitations in exposure and alleviate the financial challenges faced by artists.

---

## 2. Expected Impact

<img src="https://github.com/DevNathan/one-step-back/assets/142222091/d5259d80-0312-473f-b636-606d94788af0">

1. Encourage continuous creative and performance activities among artists
2. Help alleviate the financial difficulties faced by artists
3. Provide a platform to discover and promote emerging and undiscovered artists
4. Promote cultural activities and contribute to improving the overall cultural level of society

---

## 3. Tech Stack

<img src="https://github.com/DevNathan/one-step-back/assets/142222091/04826042-2a54-4b4b-b4ec-5f69ab731943">
<img src="https://github.com/DevNathan/one-step-back/assets/142222091/d4884c1a-5772-4357-862c-478197a879d3">

### Backend

- **Language:** Java 11 (JDK 11.0.15)
- **Framework:** Spring Boot 2.7.16
- **Template Engine:** Thymeleaf
- **ORM / Persistence:** MyBatis 2.1.0
- **Database:** Oracle DB (ojdbc8, local XE at port 1521)
- **Build Tool:** Gradle
- **Server:** Embedded Tomcat (port 10000)
- **Other Libraries:** Lombok, Gson 2.8.6, Thumbnailator 0.4.8

### Frontend

- **Markup / Styling:** HTML, CSS (custom modules per feature)
- **Scripting:** JavaScript, jQuery, Ajax
- **UI Framework:** Bootstrap (partial)

### External APIs

- **Kakao Developer API** — OAuth 2.0 social login
- **BootPay API** — Payment processing for sponsorships and crowdfunding

### Dev & Collaboration Tools

- IntelliJ IDEA, Visual Studio Code, DBeaver
- Sourcetree, Git, GitHub
- Slack, Discord

---

## 4. ERD

<img src="https://github.com/DevNathan/one-step-back/assets/142222091/c58118ad-0059-44d7-996e-dbddad982cf8">

ErdCloud: https://www.erdcloud.com/d/nW9kiBxhw3HMtfbgE

---

## 5. Key Features

### Artist Discovery & Profiles

- Browse and search for artists across categories
- View artist profiles, posts, and media

### Content & Community

- Artists can publish text posts, video posts, and community discussions
- Users can like, comment, and bookmark content
- Integrated search across all content types

### Monetization

- **Subscriptions** — Users can subscribe to artists for exclusive content
- **Sponsorships** — Direct financial support for artists
- **Crowdfunding** — Artists can create funding campaigns; users can contribute via BootPay

### User Features

- Kakao OAuth social login
- My Page — profile management, subscription history
- My Library — bookmarked posts and videos
- My Artists — followed artists

### Admin / Support

- Inquiry system for user support tickets
- Notification system

---

## 6. Project Structure

```
src/main/java/
└── com/.../
    ├── controller/      # Spring MVC controllers (Main, Member, Artist, Post, Payment, etc.)
    ├── service/         # Business logic (~38 service classes)
    ├── repository/      # DAOs backed by MyBatis mappers
    ├── mapper/          # MyBatis mapper interfaces + XML
    ├── domain/          # VO / DTO / entity classes (~33 models)
    └── config/          # App configuration

src/main/resources/
    ├── application.yml  # DB, file upload, server config
    ├── mapper/          # MyBatis XML mapper files
    └── static/          # CSS, JS, image assets

src/main/resources/templates/   # Thymeleaf HTML templates (~40 pages)
```

---

## 7. Getting Started

### Prerequisites

- Java 11+
- Oracle Database XE (local, port 1521, schema: `hr`)
- Kakao Developer API key (for OAuth)
- BootPay API key (for payments)

### Configuration

Copy `application.yml` and fill in your database credentials and API keys:

```yaml
spring:
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:XE
    username: hr
    password: your_password
```

Create the upload directory:

```bash
mkdir -p C:/onestep/uploadFiles
```

### Run

```bash
./gradlew bootRun
```

The app will be available at `http://localhost:10000`.
