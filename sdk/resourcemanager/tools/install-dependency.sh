#!/bin/bash
mvn clean install -D "checkstyle.skip" -D "maven.javadoc.skip" -D "skipTests" -D "jacoco.skip" -D "spotbugs.skip"