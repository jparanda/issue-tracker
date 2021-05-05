#--------------------------------------------#
#Docker commands to create required containers
#--------------------------------------------#

#Step 1: Create the docker network

docker create network mongo-net

# Step 2: Create mongodb container, command:
docker run -d \
--network mongo-net \
-p 27017:27017 \
--name mongo \
-e MONGO_INITDB_ROOT_USERNAME=admin \
-e MONGO_INITDB_ROOT_PASSWORD=admin \
mongo

# Step 3: Create mongo-express container, command:
docker run -d \
--network mongo-net \
-p 8081:8081 \
--name mongo-express \
-e ME_CONFIG_MONGODB_ADMINUSERNAME=admin \
-e ME_CONFIG_MONGODB_ADMINPASSWORD=admin \
mongo-express

# Step 4 : Create issue tracker app image, command:

docker build --no-cache -t issue-tracer-app .

# Step 5 : Create issue tracker container, command:

docker run -d \
--name issue-tracker-app \
-p 8083:8083 \
--network mongo-net \
issue-tracker-app

# Step 6 using docker compose

docker-compose -f issue-tracker.yaml up