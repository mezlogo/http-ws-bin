# http-ws-bin

Simple http/websockets service for testing purposes

![CI](https://github.com/mezlogo/http-ws-bin/actions/workflows/build.yml/badge.svg)

## Endpoints
1. `/index.html`: site for a browser
2. `/static/main.js` and `/static/styles.css`: files
3. `/rest/session`: print, clear, fill session
4. `/rest/counter`: print counter for current session
5. `/websocket/echo`: websockets echo endpoints
6. `/rest/timer`: chunked output every second

## tcp/http features:
- compression
- keep-alive
- cookies
- custom headers
- tls

## How to build adn deploy docker image to hub
1. sign in docker client to docker hub: `docker login -u $USERNAME`
2. build an image with version tag: `docker build -t $USERNAME/http-ws-bin:$VERSION .`
3. test container: `docker run --rm -p 8443:8443 $USERNAME/http-ws-bin:$VERSION`
4. publish: `docker push $USERNAME/http-ws-bin:$VERSION`
