# restUsingSpringBoot

step to create docker image :
1- mvn clena build

2-docker build -t restusingspringboot .

3-docker run -dp 8080:8080 restusingspringboot

4-curl localhost:8080/health
Up and Running !