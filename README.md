# Docker

```bash
git clone git@github.com:paw-jan/pjdockers.git
```

# In docker

## Manifest  

```bash
repo init -u https://github.com/paw-jan/pjrxrepomanifests.git -m rpi5-manifest/default.xml
repo sync
```
## Setup RPI5 specifics

```bash
pjrxrpi5/setup_rpi5_env.sh
```

## Build


# 1. wejście do środowiska poky
source poky/oe-init-build-env build



# 2. dodanie Twojej warstwy


bitbake-layers add-layer ../pjrxrpi5
bitbake-layers show-layers



# 3. build
bitbake core-image-full-cmdline