docker build -t docker .
docker run -p 8010:8010 -d docker
http://172.28.226.97:8010/print

##Another
docker build -t rest_amqp_gateway:2.5.0.16 -f /root/Projects/wrtc/app/generic_rest_amqp_gw/src/main/deployment/docker/Dockerfile /root/Projects/wrtc/app/generic_rest_amqp_gw/target