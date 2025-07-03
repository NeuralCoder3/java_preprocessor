#! /bin/bash

./project_build.sh
java -cp bin App $@
