SUMMARY = "Bit-Twist: Libpcap-based Ethernet packet generator and editor"
HOMEPAGE = "http://bittwist.sourceforge.net/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://prdownloads.sourceforge.net/bittwist/bittwist-linux-4.7.tar.gz"
SRC_URI[sha256sum] = "4c79b6ef20b1ddfac583654ee5ed7567e9972bd75c3c4828802e116ae945819c"

S = "${WORKDIR}/bittwist-linux-4.7"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/bittwist ${D}${bindir}
    install -m 0755 ${S}/bin/bittwiste ${D}${bindir}
}

# Binaries are pre-compiled
INSANE_SKIP:${PN} += "already-stripped ldflags"
FILES:${PN} += "${bindir}/bittwist ${bindir}/bittwiste"
