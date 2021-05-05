# **Issue tracker App**

This is a little project to show how we can start working with Docker stuff, Dockerfile, Docker compose.

**Issue tracker app architecture**

This application has a simple architecture, you can see it in the following diagram:

**_Issue tracker System high view_**

![abstract view](https://github.com/jparanda/issue-tracker/blob/master/images/issue_tracler_app_high_view.png?raw=true)

In the following diagram you can see the **_deployment view_**:

![deployment view](https://github.com/jparanda/issue-tracker/blob/master/images/issue_tracer_deployment_view.png?raw=true)

You can follow these instructions in order to use this project (_check main branch_):
* Use the docker compose file named **_issue-tracker-app.yaml_** in order to build the **issue-tracker-app** image and also download the 
both images mongodb and mongo-express from Docker hub and then, run all the containers needed.

* Create a DB named **_issue_db_** on mongoDB using mongo-express (**_http://localhost:8081_**)
* The file create-issue.json has a example to create an **issue** on the DB, use the issue tracker POST endpoint 
  to create it, **_http://localhost:8083/issue-api/v1/issues_**. I recommend you use [postman](https://www.postman.com/downloads/)
  ![deployment view](https://github.com/jparanda/issue-tracker/blob/master/images/postman_create_issue_request.png?raw=true)  
* The file **docker_run_commands.md** has the Docker run commands to create the containers singly. For this approach 
  you need to create a Docker network, the command is **docker network create network_name**. Also this file has other
  useful commands.

Feel free to fork this project to play with it !!
