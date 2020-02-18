**Installation Instructions**

`Minimum requirements`

- This project requires JVM 11
- Maven 3 or higher version, if not installed then this can be installed from

    - brew install maven (in Mac OS)
- Either import this project in any IDE e.g. Intellij IDEA or eclipse and go to `src/main/java/PlayerServer.java`
 and run the project.
- To run from terminal go to project directory and run `mvn spring-boot:run`

**Motivation**

I have worked recently with AKKA http, and Spray. Both of these are based on SCALA. Initially I wanted to use one of
these, that can make this project heavy because then this project requires SCALA dependencies as well.

To avoid those and to write a clean code, that doesn't include too much complexity I prefer to with Spring frame work.
Spring doesn't require lots of other libraries to import, that makes project a light weight project. As, I am using
Angular JS for the front end, it helps me to do changes with minimal efforts. 

Angular helped me to load data without reloading the page. It makes code management easy as well with little code bigger
tasks can be performed.

**Limitation**
- I made an assumption that the player list will always have exactly same number of columns.
- Player Id and names are mandatory. If any one of these will be missing it would be hard to get detail data for a
particular player.

