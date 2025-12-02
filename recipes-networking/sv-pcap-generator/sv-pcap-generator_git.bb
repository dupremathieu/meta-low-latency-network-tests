LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/seapath/sv-pcap-generator.git;protocol=https;branch=main"

# Use the latest commit from main
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-numpy python3-core"

do_configure() {
}

do_compile() {
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/generate_pcap.py ${D}${bindir}/
    install -m 0755 ${S}/merge_sv_pcap.py ${D}${bindir}/
}

FILES:${PN} += "${bindir}/generate_pcap.py ${bindir}/merge_sv_pcap.py"
