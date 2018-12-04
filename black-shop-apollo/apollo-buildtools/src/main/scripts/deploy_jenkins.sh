#!/bin/bash
set -e
set -u

cd `dirname $0`

if [ $# -lt 1 ];then
	echo "usage: `basename $0` 100003171|100003172|100003173"
	exit 1
fi

valid_app=false
for supported_app in 100003171 100003172 100003173 ;do
	if [ $1 == $supported_app ];then
		valid_app=true
		break;
	fi
done
if [ $valid_app == false ];then	
	echo "$1 is not a supported app id"
	exit 1
else
	echo "Upgrading $1"
fi

APP_BASE_DIR=/opt/ctrip/app
APP_NAME=$1
APP_DIR=$APP_BASE_DIR/$APP_NAME
APP_RELEASE_DIR=$APP_BASE_DIR/apollo-$APP_NAME.releases/`date "+%Y-%m-%d.%H.%M.%S"`
APP_STARTUP_SCRIPT=$APP_DIR/scripts/startup.sh
APP_SHUTDOWN_SCRIPT=$APP_DIR/scripts/shutdown.sh

chmod +x $APP_SHUTDOWN_SCRIPT
if [ -e $APP_STARTUP_SCRIPT ];then
	$APP_SHUTDOWN_SCRIPT
	echo "Sleeping 5s to wait shutting down"
	sleep 5s
fi

mkdir -p $APP_RELEASE_DIR
unzip *.zip -d $APP_RELEASE_DIR

if [ -d $APP_DIR ];then 
	rm -rf $APP_DIR
fi
ln -s $APP_RELEASE_DIR $APP_DIR

chmod +x $APP_STARTUP_SCRIPT
BUILD_ID=dontKillMe $APP_STARTUP_SCRIPT
