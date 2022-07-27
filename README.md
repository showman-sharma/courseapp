# CourseApp
Basic CRUD operations on Oracle DB using JPA/Spring Boot/Gradle

## Use
Use API platforms like Postman to perform CRUD operations using the following commands, in http://localhost:8080/
- GET /courses -> List of all courses
- GET /courses/<courseId> -> Info of specific course
- POST /courses (with new course info in raw json)-> Add new course to list
- PUT /courses (with updated course info in raw json)-> Update course with new info
- DELETE /courses/<courseId> -> Delete course with given courseId"

## Before use
In the file courseapp\src\main\resources\META-INF\persistence.xml, make the relevant changes
  ```
  <property name="javax.persistence.jdbc.url" value="Fill in the URL"/>
  <property name="javax.persistence.jdbc.user" value="Input username"/>
  <property name="javax.persistence.jdbc.password" value="Input Password"/>
```
![Table Structure](https://github.com/showman-sharma/courseapp/blob/master/tableStructure.png)
