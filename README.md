# Selenium Java - Part 02: Page Object Model & Utils

---

This project is an example of implementing the **Page Object Model (POM)** design pattern in **Selenium Java** with **TestNG**, along with the addition of **Utils** for reusable actions.  
The test scenario still uses the [OrangeHRM Demo](https://opensource-demo.orangehrmlive.com) as the target application.

---

## Objectives
- Understand and implement the **Page Object Model (POM)** structure for better maintainability.
- Learn how to create **Utils** classes for common reusable methods (e.g., input text, click button).
- Organize code into separate packages: `pages`, `utils`, `tests`, and `base`.
- Run a login test using POM and utility methods.

---

## Tools & Dependencies
- **Java** 21
- **Maven**
- **Selenium Java** 4.x
- **TestNG**
- **ChromeDriver**

---

## How To Clone (Using IntelliJ IDEA)
1. Open **IntelliJ IDEA**.
2. From the main menu, select: File → New → Project from Version Control...
3. Select **Git** from the list.
4. Paste the repository URL: https://github.com/your-username/selenium-java-part-01-basic.git
5. Click **Clone**.
6. Wait for IntelliJ to finish downloading the project and load all dependencies.

## How To Run
1. Make sure you have **Java** and **Maven** installed.
2. In IntelliJ, open this file: src/test/java/com/automation/tests/LoginTest.java
3. Look on the left side of the class name — click the green **Run ▶** icon.
4. IntelliJ will execute the test, and the browser will open automatically.

