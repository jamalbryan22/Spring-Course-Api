# Spring-Course-Api
#### Rest API for mock online courses using Java Spring


### Run Steps: 
1. Download Clone Repo
2. Naviagate to file in terminal / comand promt
3. Execute command: `mvn clean install`
3. Execute command: `java -jar target/course-api-data-0.0.1-SNAPSHOT.jar`

The server should now be up and running. 

### API calls
*Add a course topic* 
- **POST** http://localhost:8080/topics/
  - JSON Request Body: {
                    id,
                    name,
                    description
                  }
                  
*Get all topics* 
- **GET** http://localhost:8080/topics/
  - Request Body: {                  }  
  
*Get a specific topic* 
- **GET** http://localhost:8080/topics/topicName
  - Request Body: {                  }                  
  
  *Delete a specific topic* 
- **DELETE** http://localhost:8080/topics/topicName
  - Request Body: {                  }                  
