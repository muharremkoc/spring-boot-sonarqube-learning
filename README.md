# spring-boot-sonarqube-learning

# **What is SONARQUBE?**

Sonarqube, by analyzing the project;

- Writing project codes more regularly,

- Identifying and securing the vulnerabilities of the project

providing structure.

**How ​​Does Sonarqube Work**

While Sonarqube deals with external layers such as duplications of the project, determination of unused variables or methods, it provides Tests of functions used in the Project thanks to the browser called SonarScanner.

**Running Sonarqube and Analysis process in Project**

- First we run Sonarqube. (Using with Docker)

![image](https://user-images.githubusercontent.com/80245013/161016734-b95925aa-38f5-45f0-b30d-fff23131d9b6.png)



- Our second step is to create a sonar-project.properties file for ourselves and transfer our project settings.



![image](https://user-images.githubusercontent.com/80245013/161016767-a531ae1a-e371-4bf9-a8dc-fcde676ef0f8.png)


- We ensure that the target folder of our project is updated by mvn clean compile



![image](https://user-images.githubusercontent.com/80245013/161016852-153cae8c-64c5-4cbe-b71b-56bfd871421c.png)

- To our browser "[http://localhost:9000](http://localhost:9000/)"" We access the SonarQube page by typing



![image](https://user-images.githubusercontent.com/80245013/161016895-bf71e0e6-6aae-46d9-8880-67258569c470.png)

- When we access it for the first time, we encounter such a screen.

- If you are accessing for the first time, you will be given a tutorial. Since I have completed the tutorial, I am faced with such a screen.


![image](https://user-images.githubusercontent.com/80245013/161016945-f587d1cf-388a-4be6-a1c7-0fb5883330ff.png)

- Now that we have our token, let's go back to the Terminal.

- mvn sonar:sonar -Dsonar.login=Your token

We begin the process of Analyzing our project by typing.

Finally, after we get the build with the mvn sonar process, we check whether our project is analyzed from the Projects bar.


![image](https://user-images.githubusercontent.com/80245013/161016998-2974f893-47e1-4962-8c9c-e186d8bdec43.png)
