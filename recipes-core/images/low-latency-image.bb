SUMMARY = "A low latency image for Intel NUC with Docker and Bittwist"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    kernel-modules \
    docker-moby \
    docker-compose \
    bittwist \
    sv-pcap-generator \
    "

# Add some useful tools for networking tests
IMAGE_INSTALL += " \
    iproute2 \
    ethtool \
    tcpdump \
    iperf3 \
    "

IMAGE_FEATURES += "ssh-server-openssh debug-tweaks"

IMAGE_FSTYPES = "wic.gz wic.bmap"
