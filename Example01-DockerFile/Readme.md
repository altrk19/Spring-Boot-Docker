docker build -t docker .
docker run -p 8010:8010 -d docker
http://172.28.226.97:8010/print