FROM node:20-slim as builder
LABEL authors="cheesecat47"

WORKDIR /app

USER root

COPY package*.json .

RUN npm install

COPY . .

RUN npm run build

CMD ["bash", "-c", "cp -r /app/dist/* /build"]
