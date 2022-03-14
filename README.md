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
