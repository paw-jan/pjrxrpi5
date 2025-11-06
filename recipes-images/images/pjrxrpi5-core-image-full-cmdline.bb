inherit core-image-full-cmdline

# Dodanie pakietów wymaganych do obrazu
IMAGE_INSTALL:append = " \
    networkmanager \
    systemd-serialgetty \
"

# Dodanie cech obrazu (np. SSH server)
IMAGE_FEATURES += " ssh-server-dropbear"
